**<h2>Java (Vanilla / CLI Projects)</h2>**

###

Its objective is to create Java projects with a suitable folder structure and support for building with Maven or Gradle. 

---

**<h2>Necessary Tools </h2>**

###

- `Maven`;
- `JUnit`;
- `Checkstyle` ou `SpotBugs`.

###

**<h2>Example of `pom.xml`</h2>**

###
```xml
<project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 
         http://maven.apache.org/xsd/maven-4.0.0.xsd">
  <modelVersion>4.0.0</modelVersion>

  <groupId>com.example</groupId>
  <artifactId>java-template</artifactId>
  <version>1.0-SNAPSHOT</version>

  <dependencies>
    <dependency>
      <groupId>org.junit.jupiter</groupId>
      <artifactId>junit-jupiter</artifactId>
      <version>5.9.2</version>
      <scope>test</scope>
    </dependency>
  </dependencies>

  <build>
    <plugins>
      <plugin>
        <groupId>org.apache.maven.plugins</groupId>
        <artifactId>maven-compiler-plugin</artifactId>
        <version>3.10.1</version>
        <configuration>
          <source>17</source>
          <target>17</target>
        </configuration>
      </plugin>
    </plugins>
  </build>
</project>
```

###

**<h2>Hey, dev! Are you ready?</h2>**

###

- `CI/CD` - GitHub `Actions`;
- Linters and formatters ;
- Automation tests.

###



