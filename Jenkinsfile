pipeline {
    agent any

    stages {
        stage('git clone') {
            steps {
                bat 'git clone https://github.com/oaojrocha/unicamp-eng-trab5.git'
            }
        }

        stage('compile') {
            steps {
                bat 'mvn clean'
                bat 'mvn compile'
            }
        }

        stage('test') {
            steps {
                bat 'mvn test'
            }
        }

        stage('package') {
            steps {
                bat 'mvn package'
            }
        }
    }
}
