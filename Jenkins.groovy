podTemplate(
    agentContainer: 'maven',
    agentInjection: true,
    containers: [
        containerTemplate(name: 'maven', image: 'maven:3.9.9-eclipse-temurin-17'),
        containerTemplate(name: 'golang', image: 'golang:1.16.5', command: 'sleep', args: '99d')
  ]) {
    node('kubeagent') {
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