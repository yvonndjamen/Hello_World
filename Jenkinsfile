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
        stage('Package'){
            steps {
                bat './mvnw package'
            }
        }
        stage('Run'){
            steps {
                dir("target/"){
                    bat 'set NUMBER=5'
                    bat 'java -jar HelloWorld-1.0-SNAPSHOT.jar'
                }
            }
            post {
                success {
                    archiveArtifacts 'outputFiles/skf003a/*.*'
                }
            }
        }
    }
}
