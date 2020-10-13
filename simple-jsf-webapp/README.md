# Web Application project

Archetype `maven-archetype-webapp` creates a simple Web Application project.

Archetype homepage: https://maven.apache.org/archetypes/maven-archetype-webapp/

## Generate project

```
mvn archetype:generate -DarchetypeGroupId=org.apache.maven.archetypes -DarchetypeArtifactId=maven-archetype-webapp -DarchetypeVersion=1.4 -DgroupId=com.lini.webapp -DartifactId=simple-jsf-webapp 
```

## Project structure

```
simple-jsf-webapp
│
│   pom.xml
│   README.md
│
└───src
    └───main
        └───webapp
            │   index.jsp
            │
            └───WEB-INF
                    web.xml
```

Add the JSF dependencies to your Maven POM file, /pom.xml, according to which JSF implementation you choose. The Mojarra implementation is shown here:

<repositories>
    <repository>
        <id>maven2-repository.dev.java.net</id>
        <name>Java.net Repository for Maven</name>
        <url>http://download.java.net/maven/2</url>
    </repository>
</repositories>

<dependencies>
    <!-- Option 1: Use if deploying to a Java EE application server (GlassFish, JBoss AS, etc) -->
    <dependency>
        <groupId>javax.faces</groupId>
        <artifactId>jsf-api</artifactId>
        <version>2.0</version>
        <scope>provided</scope>
    </dependency>

    <!-- Option 2: Use if deploying to a servlet container (Tomcat, Jetty, etc) -->
    <!--
    <dependency>
        <groupId>com.sun.faces</groupId>
        <artifactId>jsf-api</artifactId>
        <version>2.0.2</version>
        <scope>runtime</scope>
    </dependency>
    <dependency>
        <groupId>com.sun.faces</groupId>
        <artifactId>jsf-impl</artifactId>
        <version>2.0.2</version>
        <scope>runtime</scope>
    </dependency>
        -->
</dependencies>

<build>
    <plugins>
        <plugin>
            <groupId>org.apache.maven.plugins</groupId>
            <artifactId>maven-compiler-plugin</artifactId>
            <version>2.0.2</version>
            <configuration>
                 <source>1.5</source>
                 <target>1.5</target>
                 <encoding>UTF-8</encoding>
            </configuration>
        </plugin>
    </plugins>
</build>
