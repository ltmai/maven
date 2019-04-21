https://maven.apache.org/archetypes/maven-archetype-webapp/

mvn archetype:generate -DarchetypeGroupId=org.apache.maven.archetypes -DarchetypeArtifactId=maven-archetype-webapp -DarchetypeVersion=1.4 -DgroupId=com.lini.webapp -DartifactId=simple-jsf-webapp 


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