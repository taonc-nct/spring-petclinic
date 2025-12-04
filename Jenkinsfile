pipeline {
  agent any
  stages {
    stage('Stage 1') {
      steps {
        echo 'Hello world!'
      }
    }
    stage('Run external Groovy') {
            steps {
                script {
                    def groovyScript = load 'Jenkins.groovy'
                    groovyScript.runGroovy()
                }
            }
        }
  }
}