def ClonePublicRepo(String repoUrl, String targetBranch) {
    // sh "git clone -b ${targetBranch} --single-branch ${repoUrl} ."
    git url: repoUrl, branch: targetBranch, changelog: false
}

def ClonePrivateRepo(String repoUrl, String targetBranch, String credentialsId) {
    // sh "git clone -b ${targetBranch} --single-branch ${repoUrl} ."
    git url: repoUrl, branch: targetBranch, credentialsId: credentialsId, changelog: false
}

