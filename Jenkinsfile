pipeline {
    agent any

    tools {
        maven 'MAVEN_HOME'
    }

    environment {
        IMAGE_NAME = "manojjaiswal108/sl_mydemo_image"
    }

    stages {

        stage('Clone Repository by Hitesh') {
            steps {
                git 'https://github.com/ManojJaiswal108/SL-MAVEN-8-FEB-BACTH.git'
            }
        }

        stage('Build Maven Project') {
            steps {
                sh 'mvn clean package'
            }
        }

        stage('Build Docker Image') {
            steps {
                sh 'docker build -t $IMAGE_NAME:$BUILD_NUMBER .'
            }
        }

        stage('DockerHub Login') {
            steps {
                withCredentials([usernamePassword(
                    credentialsId: 'dockerhub-creds',
                    usernameVariable: 'DOCKER_USER',
                    passwordVariable: 'DOCKER_PASS'
                )]) {

                    sh 'echo $DOCKER_PASS | docker login -u $DOCKER_USER --password-stdin'
                }
            }
        }

        stage('Push Docker Image') {
            steps {
                sh 'docker push $IMAGE_NAME:$BUILD_NUMBER'
            }
        }
    }
}
