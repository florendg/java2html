plugins {
    java
    antlr
}

repositories {
    mavenCentral()
}

dependencies {
    antlr("org.antlr:antlr4:4.9.2")
    testImplementation("org.junit.jupiter:junit-jupiter:5.8.1")
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(17))
        vendor.set(JvmVendorSpec.ORACLE)
    }
}

tasks.generateGrammarSource {
    arguments = arguments + listOf("-package","dev.vultureweb.java2html.parser")
}

tasks.test {
    useJUnitPlatform()
}