
Scientific Calculator: A DevOps-Centric Mini-Project
This repository demonstrates a complete CI/CD pipeline for a Java-based Scientific Calculator application. The project integrates automated testing, containerization, and configuration management to achieve seamless deployment.

🚀 Project Overview
The application provides a command-line interface for common scientific calculations, including Square Root, Factorial, Natural Logarithm, and Power functions. The core of this project is the automated lifecycle, which ensures that every code change is validated and deployed without manual intervention.

🛠 Tech Stack
Language: Java (JDK 17+)

Build Tool: Maven

Testing: JUnit 4

CI/CD Orchestration: Jenkins

Containerization: Docker

Configuration Management: Ansible

VCS: Git & GitHub

🏗 Pipeline Architecture
Continuous Integration (CI):

Triggered via GitHub Webhooks (exposed via Ngrok for local Jenkins).

Maven compiles the source and executes unit tests.

Docker builds a new image from the Dockerfile.

Image is pushed to Docker Hub with the tag mt2025008/calculator:v1.

Continuous Deployment (CD):

Jenkins triggers an Ansible playbook (deployment.yml).

Ansible pulls the latest image and manages the container lifecycle on the target host.

