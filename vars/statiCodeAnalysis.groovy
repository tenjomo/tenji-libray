def call(credentialsId){

    withSonarQubeEnv(credentialsId: credentialsId) {
         bat 'cmd /c mvn clean package sonar:sonar'.execute()
    }
}
