pipelineJob('pipelineJob') {
    definition {
        cps {
            script(readFileFromWorkspace('pipelineJob.groovy'))
            sandbox()
        }
    }
}

pipelineJob('booksApp-docker') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url 'https://github.com/adrianCalventos/spring-bookApiRest-.git'
                    }
                    branch 'master'
                    scriptPath 'Jenkinsfile'
                }
            }
        }
    }
}