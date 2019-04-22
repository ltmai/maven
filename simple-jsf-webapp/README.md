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