pipeline {
  agent any
  tools{
    jdk "JAVA_HOME"
  }
  stages
    {
    stage('Clean') {
      steps {
        bat 'mvn clean'
      }
    }
    stage('Compile') {
      steps {
        bat 'mvn compile'
      }
    }
    stage('Test') {
      steps {
        bat 'mvn test'
      }
    }
  }
}