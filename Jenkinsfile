pipeline {
    agent any

    tools {
        maven 'MyMaven'
    }

    parameters {
        choice(name: 'BROWSER', choices: ['chrome', 'firefox', 'edge'], description: 'Select browser')
    }

    stages {
        stage('Checkout') {
            steps {
                git branch: 'master',
                    url: 'https://github.com/pushpyadav86/SeleniumCucumberJava.git'
            }
        }

        stage('Build and Test') {
            steps {
                bat "mvn clean test -Dbrowser=${params.BROWSER}"
            }
        }

        stage('Publish JUnit Report') {
            steps {
                junit 'target/surefire-reports/*.xml'
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
