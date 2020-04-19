node{
    stage('Checkout SCM'){
        git 'https://github.com/ambujojha2019/course-api'
    }
    stage('Compile -Packges'){
        
       def mvnHome= tool name: 'maven', type: 'maven'
        sh "${mvnHome}/bin/mvn package"
    }
}
