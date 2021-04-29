import org.gradle.api.Project

fun Project.withPluginWhenEvaluated(plugin: String, action: Project.() -> Unit) {
    pluginManager.withPlugin(plugin) { whenEvaluated(action) }
}

// `afterEvaluate` does nothing when the project is already in executed state, so we need a special check for this case.
fun <T> Project.whenEvaluated(action: Project.() -> T) {
    if (state.executed) {
        action()
    } else {
        afterEvaluate { action() }
    }
}
