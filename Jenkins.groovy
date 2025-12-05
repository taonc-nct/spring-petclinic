podTemplate(containers: [
    containerTemplate(
        name: 'maven',
        image: 'maven:3.9.6-eclipse-temurin-17', 
        command: 'sleep', 
        ttyEnabled: 'true',
        args: '30d'
        ),
    containerTemplate(
        name: 'python', 
        image: 'python:latest', 
        command: 'sleep', 
        args: '30d')
  ]) {
    node('POD_LABEL') {
        stage('Get a Maven project') {
            // git 'https://github.com/spring-projects/spring-petclinic.git'
            container('maven') {
                stage('Build a Maven project') {
                    sh '''
                    echo "maven build"
                    '''
                }
            }
        }


    }
}