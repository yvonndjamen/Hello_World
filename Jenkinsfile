pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                git 'https://github.com/yvonndjamen/Hello_World.git'
                bat './mvnw clean compile'
            }
        }
        stage('Test') {
            steps {
                bat './mvnw test'
            }
            post {
                always {
                    junit '**/target/surefire-reports/TEST-*.xml'
                }
            }
        }
        stage('Publish'){
            steps {
                bat './mvnw package'
            }
            post {
                success {
                    archiveArtifacts 'target/*.jar'
                }
            }
        }
    }
}
