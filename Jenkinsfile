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

stage('Publish Cucumber Report') {
    steps {
        publishHTML([
            reportDir: 'target',
            reportFiles: 'cucumber-report.html',
            reportName: 'Cucumber Report'
        ])
    }
}

stage('Publish Extent Report') {
    steps {
        publishHTML([
            reportDir: 'test-output/SparkReport',
            reportFiles: 'index.html',
            reportName: 'Extent Report'
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
