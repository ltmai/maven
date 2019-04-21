https://mvnrepository.com/artifact/org.wildfly.archetype/wildfly-javaee7-webapp-ear-blank-archetype/8.2.0.Final

<!-- https://mvnrepository.com/artifact/org.wildfly.archetype/wildfly-javaee7-webapp-ear-blank-archetype -->
<dependency>
    <groupId>org.wildfly.archetype</groupId>
    <artifactId>wildfly-javaee7-webapp-ear-blank-archetype</artifactId>
    <version>8.2.0.Final</version>
</dependency>


mvn archetype:generate -DarchetypeGroupId=org.wildfly.archetype -DarchetypeArtifactId=wildfly-javaee7-webapp-ear-blank-archetype -DarchetypeVersion=8.2.0.Final 

wildfly-jee7-ear
│ 
│   pom.xml
│   README.md
│
├───wildfly-jee7-ear-test-ear
│   │   pom.xml
│   │   README.txt
│   │
│   └───src
│       └───main
│           └───application
│               └───META-INF
│                       wildfly-jee7-ear-test-ds.xml
│
├───wildfly-jee7-ear-test-ejb
│   │   pom.xml
│   │
│   └───src
│       ├───main
│       │   ├───java
│       │   └───resources
│       │       └───META-INF
│       │               beans.xml
│       │               persistence.xml
│       │
│       └───test
│           ├───java
│           └───resources
│               │   arquillian.xml
│               │   test-ds.xml
│               │
│               └───META-INF
│                       test-persistence.xml
│
└───wildfly-jee7-ear-test-web
    │   pom.xml
    │
    └───src
        ├───main
        │   ├───java
        │   ├───resources
        │   └───webapp
        │       ├───resources
        │       └───WEB-INF
        │               beans.xml
        │               faces-config.xml
        │
        └───test
            ├───java
            └───resources