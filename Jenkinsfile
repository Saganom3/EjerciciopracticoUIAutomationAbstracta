pipeline {
  agent any
  tools {
    gradle "Gradle"
  }
  stages {
    stage('Eliminar workspace') {
      steps {
        deleteDir()
      }
    }

    stage('Clonar repositorio') {
      steps {
        // Get some code from a GitHub repository
        git 'https://github.com/Saganom3/EjerciciopracticoUIAutomationAbstracta.git'

      }
    }

    stage('Compilar y ejecutar pruebas') {
      steps {
        // Run Gradle on a Windows agent.
        bat "./gradlew clean build test --rerun-tasks"
      }
    }
    stage('Generar reporte Cucumber') {
      steps {
        cucumber '**/*.json'
      }
      post {
        always {
          publishHTML([allowMissing: false,
            alwaysLinkToLastBuild: true,
            keepAll: true,
            reportDir: 'test-output/HtmlReport/',
            reportFiles: 'ExtentHtml.html',
            reportName: 'Cucumber Report'
          ])
        }
      }
    }
  }
}
