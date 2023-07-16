def call(){
    print "cmd /c mmvn -B -DskipTests clean package".execute().text
}
