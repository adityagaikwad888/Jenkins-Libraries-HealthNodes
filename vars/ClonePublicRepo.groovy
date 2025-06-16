def call(String repoUrl, String targetBranch) {
    // sh "git clone -b ${targetBranch} --single-branch ${repoUrl} ."
    git url: repoUrl, branch: targetBranch
}