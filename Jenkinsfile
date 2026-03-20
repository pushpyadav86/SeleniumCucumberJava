pipeline {
    agent any

    tools {
        maven 'MyMaven'
    }

    parameters {
        choice(name: 'BROWSER', choices: ['chrome', 'firefox', 'edge'], description: 'Choose browser')
    }

    stages {
        stage('Checkout') {
            steps {
                git branch: 'master', url: 'https://github.com/pushpyadav86/SeleniumCucumberJava.git'
            }
        }

        stage('Build and Test') {
            steps {
                bat "mvn clean test -Dbrowser=${params.BROWSER}"
            }
        }
    }

    post {
        always {
            junit 'target/surefire-reports/*.xml'

            publishHTML(target: [
                reportDir: 'target',
                reportFiles: 'cucumber-report.html',
                reportName: 'Cucumber Report',
                keepAll: true,
                alwaysLinkToLastBuild: true,
                allowMissing: true
            ])

            publishHTML(target: [
                reportDir: 'test-output/SparkReport',
                reportFiles: 'index.html',
                reportName: 'Extent Report',
                keepAll: true,
                alwaysLinkToLastBuild: true,
                allowMissing: true
            ])

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
