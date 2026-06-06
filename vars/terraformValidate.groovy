def call(String path) {
    sh """
        terraform -chdir=${path} init -backend=false
        terraform -chdir=${path} validate
    """
}