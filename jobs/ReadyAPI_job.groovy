
multibranchPipelineJob("ReadyAPI_001") {
    branchSources {
        git {
            remote('/c/gitEnvironment/JenkinsPipelines/ReadyAPI')
            includes('*')
        }
    }
    orphanedItemStrategy {
        discardOldItems {
            numToKeep(20)
        }
    }
}
