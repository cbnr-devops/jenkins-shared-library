def call(String path) {
    sh "terraform -chdir=${path} fmt -check -recursive"
}