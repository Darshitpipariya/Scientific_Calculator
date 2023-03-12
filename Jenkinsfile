pipeline{
    agent any
    environment{
        dockerhub= credentials('dockerhub')
    }
    stages{
        stage('git pull'){
            steps{
                git branch:'master', url:'https://github.com/Darshitpipariya/Scientific_Calculator'
            }
        }
        stage('maven build') {
            steps {
                sh 'mvn clean validate compiler:compile compiler:testCompile test package install'
                // One or more steps need to be included within the steps block.
            }
        }
        stage('Build Docker Image'){
            steps{
                sh 'docker build -t darshitpipariya/scintific_cal:latest .'
            }
        }
        stage('pushing image to dockerhub'){
            steps{
                sh 'echo $dockerhub_PSW | docker login -u $dockerhub_USR --password-stdin'
                sh 'docker push darshitpipariya/scintific_cal:latest '

            }
        }

        stage('Clean Docker Images') {
            steps {
                sh 'docker rmi -f darshitpipariya/scintific_cal:latest'
            }
        }

        stage('Deploy and Run Image using Ansible'){
            steps {
                sh 'export LC_ALL=en_IN.UTF-8'
                ansiblePlaybook becomeUser: null , colorized: true, disableHostKeyChecking: true, installation: 'Ansible', inventory: 'inventory', playbook: 'playbook.yml', sudoUser: null
            }
        }

    }

}