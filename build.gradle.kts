import com.properties.AndroidMessage
import com.properties.AndroidMessageExtension

allprojects {
    repositories {
        jcenter()
        google()
        mavenCentral()
    }
}


val extension = project.extensions.create("android", AndroidMessageExtension::class)

tasks.register<AndroidMessage>("what") {
    what.set("hiissisi")
}

configure<AndroidMessageExtension> {
    message.set("Rules!!!")
}