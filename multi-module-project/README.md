# create project directory
```
mkdir project
cd project
```
# create top-level POM
```
mvn archetype:generate -Darchetype.interactive=false -batch-mode -DarchetypeGroupId=org.codehaus.mojo.archetypes -DarchetypeArtifactId=pom-root -DarchetypeVersion=RELEASE -DgroupId=mai.linh -DartifactId=project -Dversion=1.0-SNAPSHOT 
```
# create webapp module (front-end)
```
mvn archetype:generate -batch-mode -Darchetype.interactive=false -DarchetypeGroupId=org.codehaus.mojo.archetypes     -DarchetypeArtifactId=webapp-javaee7 -DarchetypeVersion=1.1 -DarchetypeRepository=http://repo.maven.apache.org/maven2 -DgroupId=mai.linh -DartifactId=project-webapp -Dversion=1.0-SNAPSHOT -Dpackage=mai.linh.project.webapp     
```
# create entities module (reusable entities)
```
mvn archetype:generate -batch-mode -Darchetype.interactive=false -DarchetypeGroupId=org.apache.maven.archetypes -DarchetypeArtifactId=maven-archetype-quickstart -DarchetypeVersion=RELEASE -DgroupId=mai.linh -DartifactId=project-entities -Dversion=1.0-SNAPSHOT -Dpackage=mai.linh.project.entities 
```
# create server module (bussiness logic)
```
mvn archetype:generate -batch-mode -Darchetype.interactive=false -DarchetypeGroupId=org.apache.maven.archetypes -DarchetypeArtifactId=maven-archetype-quickstart -DarchetypeVersion=RELEASE -DgroupId=mai.linh -DartifactId=project-server -Dversion=1.0-SNAPSHOT -Dpackage=mai.linh.project.server
```
# create EAR module
```
mvn archetype:generate -batch-mode -Darchetype.interactive=false -DarchetypeGroupId=org.codehaus.mojo.archetypes -DarchetypeArtifactId=ear-javaee7 -DarchetypeVersion=1.0 -DarchetypeRepository=http://repo.maven.apache.org/maven2 -DgroupId=mai.linh -DartifactId=project-ear -Dversion=1.0-SNAPSHOT -Dpackage=mai.linh.project.ear          
```
# manually add EAR dependencies and modules into POM as follows
```xml
	<!--add dependencies manually-->
	<dependencies>
		<dependency>
			<groupId>mai.linh</groupId> 
			<artifactId>project-entities</artifactId>
			<version>${project.version}</version>
			<type>jar</type>
		</dependency>
		<dependency>
			<groupId>mai.linh</groupId> 
			<artifactId>project-server</artifactId>
			<version>${project.version}</version>
			<type>ejb</type>
		</dependency>		
		<dependency>
			<groupId>mai.linh</groupId> 
			<artifactId>project-webapp</artifactId>
			<version>${project.version}</version>
			<type>war</type>
		</dependency>		
	</dependencies>
	
	<plugin>
		<groupId>org.apache.maven.plugins</groupId>
		<artifactId>maven-ear-plugin</artifactId>
		<version>2.8</version>
		<configuration>
			<version>6</version>
			<defaultLibBundleDir>lib</defaultLibBundleDir>
			<!--add modules manually-->
			<finalName>${project.artifactId}</finalName>
			<modules>
				<ejbModule>
					<groupId>mai.linh</groupId>
					<artifactId>project-server</artifactId>
					<bundleFileName>project-server.jar</bundleFileName>
				</ejbModule>
				<jarModule>
					<groupId>mai.linh</groupId>
					<artifactId>project-entities</artifactId>
					<bundleFileName>project-entities.jar</bundleFileName>
				</jarModule>
				<webModule>
					<groupId>mai.linh</groupId>
					<artifactId>project-webapp</artifactId>
					<bundleFileName>project-webapp.war</bundleFileName>
				</webModule>
			</modules>
			<archive>
				<manifest>
					<addDefaultImplementationEntries>true</addDefaultImplementationEntries>
				</manifest>
			</archive>
		</configuration>
	</plugin>
```