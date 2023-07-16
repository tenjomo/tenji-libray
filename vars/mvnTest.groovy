def call(){
    def result = bat( label: '', returnStdout: true, script: 'maven test'  )
                
        echo result 
}
