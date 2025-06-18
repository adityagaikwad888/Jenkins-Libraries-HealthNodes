// In your shared library
def ClonePublicRepo(String url, String branch) {
    if (isUnix()) {
        sh "git clone -b ${branch} ${url} ."
    } else {
        bat "git clone -b ${branch} ${url} ."
    }
}