https://maven.apache.org/archetypes/maven-archetype-j2ee-simple/index.html

mvn archetype:generate -DarchetypeGroupId=org.apache.maven.archetypes -DarchetypeArtifactId=maven-archetype-j2ee-simple -DarchetypeVersion=1.4 


simple-jee-ear
│
│   pom.xml
│   README.md
│
├───ear
│   │   pom.xml
│   │
│   └───src
│       ├───main
│       │   └───java
│       └───test
│           └───java
├───ejbs
│   │   pom.xml
│   │
│   └───src
│       ├───main
│       │   ├───java
│       │   └───resources
│       │       └───META-INF
│       │               ejb-jar.xml
│       │
│       └───test
│           └───java
├───primary-source
│   │   pom.xml
│   │
│   └───src
│       ├───main
│       │   └───java
│       └───test
│           └───java
├───projects
│   │   pom.xml
│   │
│   └───logging
│       │   pom.xml
│       │
│       └───src
│           ├───main
│           │   └───java
│           └───test
│               └───java
└───servlets
    │   pom.xml
    │
    └───servlet
        │   pom.xml
        │
        └───src
            ├───main
            │   ├───java
            │   └───webapp
            │       │   index.jsp
            │       │
            │       └───WEB-INF
            │               web.xml
            │
            └───test
                └───java