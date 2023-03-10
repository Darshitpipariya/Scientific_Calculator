pipeline{
    agent any
    stages{
        stage('git pull'){
            steps{
                git branch:'master', url:'https://github.com/Darshitpipariya/Scientific_Calculator'
            }
        }
        stage('maven build') {
            steps {
                sh 'mvn clean validate compiler:compile compiler:testCompile test package'
                // One or more steps need to be included within the steps block.
            }
        }
        stage('Build Docker Image'){
            steps{
                sh 'docker build -t darshitpipariya/scintific_cal:1.0 .'
            }
        }

    }

}