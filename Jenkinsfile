pipeline{
    agent any
    tools{
        jdk 'JDK_11'
    }
    stages{
        stage('Build'){
            steps{
                echo 'Hello World'
                bat 'java --version'
                bat 'mvn clean compile'
            }
        }
    }
}