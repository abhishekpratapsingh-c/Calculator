pipeline {
    agent any

    tools {
        maven 'Maven 3.x'
    }

    stages {
        stage('Checkout') {
            steps {

                git branch: 'main',
                    credentialsId: 'github-auth',
                    url: 'https://github.com/abhishekpratapsingh-c/Calculator.git'
            }
        }

        stage('Build & Test') {
            steps {
                sh 'mvn clean package'
            }
        }

        stage('Build Docker Image') {
            steps {
                sh 'docker build -t mt2025008/calculator:v1 .'
            }
        }

        stage('Push Docker Images') {
            steps {
                withCredentials([usernamePassword(credentialsId: 'docker-hub-creds', passwordVariable: 'DOCKER_PASS', usernameVariable: 'DOCKER_USER')]) {
                    sh "echo ${DOCKER_PASS} | docker login -u ${DOCKER_USER} --password-stdin"
                    sh 'docker push mt2025008/calculator:v1'
                }
            }
        }

        stage('Run Ansible Playbook') {
            steps {
                sh 'ansible-playbook deployment.yml'
            }
        }
    }

    post {
        always {
            script {
                def buildStatus = currentBuild.result ?: 'SUCCESS'

                mail to: 'abhishekpratap218@gmail.com',
                     subject: "Jenkins CI/CD Alert: Build #${env.BUILD_NUMBER} is ${buildStatus}",
                     body: """
                        The Jenkins pipeline for Calculator_CI has completed.

                        Project Name: ${env.JOB_NAME}
                        Build Number: ${env.BUILD_NUMBER}
                        Final Status: ${buildStatus}

                        Check the full console output here: ${env.BUILD_URL}
                     """
            }
        }
    }
}