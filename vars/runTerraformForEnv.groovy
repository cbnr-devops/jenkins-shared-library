def call(String cloud, String env, Closure action) {
    def basePath = "terraform/${cloud}/envs"

    switch(env) {
        case 'dev':
            action("${basePath}/dev")
            break

        case 'staging':
            action("${basePath}/staging")
            break

        case 'all':
            action("${basePath}/dev")
            action("${basePath}/staging")
            break

        default:
            error("Unsupported ENV: ${env}")
    }
}