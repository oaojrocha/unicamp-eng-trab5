pipeline {
    agent any

    stages {
        stage('Clonar Repositório') {
            steps {
                git 'https://github.com/oaojrocha/unicamp-eng-trab5.git'
            }
        }

        stage('Construir') {
            steps {
                sh 'mvn clean package'
                sh 'mvn intall'
            }
        }

        stage('Testar') {
            steps {
                sh 'mvn test'
            }
        }

        stage('Implantar') {
            steps {
                sh 'mvn deploy'
            }
        }
    }
}
