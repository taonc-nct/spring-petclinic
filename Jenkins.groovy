podTemplate(
    agentContainer: 'maven',
    agentInjection: true,
    containers: [
        containerTemplate(name: 'maven', image: 'maven:3.9.9-eclipse-temurin-17', command: 'cat', ttyEnabled: true),
        containerTemplate(name: 'golang', image: 'golang:1.16.5', command: 'sleep', args: '99d', ttyEnabled: true)
    ]
) {
    node('kubeagent') {
        container('maven') {
            sh 'echo maven ok'
        }
        container('golang') {
            sh 'echo golang ok'
        }
    }
}
