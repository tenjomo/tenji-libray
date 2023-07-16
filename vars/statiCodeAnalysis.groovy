def call(credentialsId){

    withSonarQubeEnv(credentialsId: credentialsId) {
         'cmd /c mvn clean package sonar:sonar'.execute()
    }
}
