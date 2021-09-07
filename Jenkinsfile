pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                git 'https://github.com/yvonndjamen/Hello_World.git'
                bat './mvnw clean compile'
            }
        }
    }
}
