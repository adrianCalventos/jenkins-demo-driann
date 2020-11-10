pipelineJob('pipelineJob') {
    definition {
        cps {
            script(readFileFromWorkspace('pipelineJob.groovy'))
            sandbox()
        }
    }
}

pipelineJob('booksApi-job') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url 'https://github.com/adrianCalventos/spring-bookApiRest-.git'
                    }
                    branch 'master'
                }
            }
        }
    }
}