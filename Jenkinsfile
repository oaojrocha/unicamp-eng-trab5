pipeline {
    agent any

    stages {
        stage('build') {
            steps {
                bat 'mvn clean install'
            }
        }

        stage('test') {
            steps {
                bat 'mvn test'
            }
        }

        stage('deploy') {
            steps {
                bat 'mvn deploy'
            }
        }
    }
}
