grails.project.work.dir = "target"

grails.project.dependency.resolver = "maven"
grails.project.dependency.resolution = {
    inherits "global"
    log "warn"
    repositories {
        grailsCentral()
        mavenLocal()
        mavenCentral()
    }

    plugins {

        build(":release:3.1.2", ":rest-client-builder:2.1.1") {
            export = false
        }

        compile "org.grails.plugins:asset-pipeline:2.9.1"

        runtime ":redis:1.6.5"
        runtime ":jquery:1.11.1"
    }
}
