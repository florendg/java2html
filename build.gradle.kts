plugins {
    java
    antlr
}

repositories {
    mavenCentral()
}

sourceSets {
    main {
        java {
            srcDir("$buildDir/generated-src/main/java")
        }
    }
}

dependencies {
    antlr("org.antlr:antlr4:4.9.2")
    testImplementation("org.junit.jupiter:junit-jupiter:5.8.1")
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(17))
    }
}

tasks.generateGrammarSource {
    outputDirectory = file("$buildDir/generated-src/main/java/dev/vultureweb/java2html/parser")
    arguments = arguments + listOf("-package","dev.vultureweb.java2html.parser")
}

tasks.test {
    useJUnitPlatform()
}