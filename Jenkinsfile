node{
    PATH = "C:\\Program Files\\Git\\usr\\bin;C:\\Program Files\\Git\\bin"
    
    stage('Checkout SCM'){
        git 'https://github.com/ambujojha2019/course-api'
    }
    stage('Compile -Packges'){
        
       def mvnHome= tool name: 'maven', type: 'maven'
        sh "${mvnHome}/bin/mvn clean package"
    }
}
