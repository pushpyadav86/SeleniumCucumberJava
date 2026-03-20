pipeline {
    agent any

    tools {
        maven 'MyMaven'
       
    }

    stages {
        stage('Checkout') {
            steps {
                git branch: 'master', url: 'https://github.com/pushpyadav86/SeleniumCucumberJava.git'
            }
        }

        stage('Build and Test') {
            steps {
                bat 'mvn clean test'
            }
        }

        stage('Publish JUnit Report') {
            steps {
                junit 'target/surefire-reports/*.xml'
            }
        }

        stage('Publish Cucumber Report') {
            steps {
                publishHTML(target: [
                    reportDir: 'target',
                    reportFiles: 'cucumber-report.html',
                    reportName: 'Cucumber Report',
                    keepAll: true,
                    alwaysLinkToLastBuild: true,
                    allowMissing: true
                ])
            }
        }
    }

    post {
        always {
            archiveArtifacts artifacts: 'target/**/*.*, test-output/**/*.*, screenshots/**/*.*', allowEmptyArchive: true
        }
        success {
            echo 'Pipeline executed successfully.'
        }
        failure {
            echo 'Pipeline execution failed.'
        }
    }
}
