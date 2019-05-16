### Plugins

LibraryCommonPlugin: Used by lib1 and lib2

LibraryCommonPluginWithExtension: Used by lib3


#### LibraryCommonPlugin

Example use:

```
apply plugin: 'libraryCommonPlugin'

dependencies {
    implementation fileTree(dir: 'libs', include: ['*.jar'])
    implementation 'com.android.support:appcompat-v7:28.0.0'
    testImplementation 'junit:junit:4.12'
    androidTestImplementation 'com.android.support.test:runner:1.0.2'
    androidTestImplementation 'com.android.support.test.espresso:espresso-core:3.0.2'
}
```

#### LibraryCommonPlugin

For simplicity instead of updating the testRunner, I'm updating the versionName


```
apply plugin: "libraryCommonPluginWithExtension"

commonLibrary {
    versionName.set("1.1.2")
}

dependencies {
    implementation fileTree(dir: 'libs', include: ['*.jar'])

    implementation 'com.android.support:appcompat-v7:28.0.0'
    testImplementation 'junit:junit:4.12'
    androidTestImplementation 'com.android.support.test:runner:1.0.2'
    androidTestImplementation 'com.android.support.test.espresso:espresso-core:3.0.2'
}

```

Problem comes when I try to use the value defined in the extension:

```
 is LibraryPlugin -> {
                    val extension = target.extensions.getByType<LibraryExtension>()
                    extension.configure()
                    target.afterEvaluate {
                        extension.defaultConfig.versionName = pluginWithExtension.versionName.get()
                    }
                }
}
```
value is properly fetched but not assigned.

I tried detaching the android library plugin and same result