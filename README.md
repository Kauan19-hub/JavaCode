# Java (Vanilla / CLI Projects)

###

Tem como objetivo, criar projetos em Java com estrutura de pastas propícias e suporte a build com Maven ou Gradle.

###

**<h2>📁 Estrutura de Diretórios</h2>**

###
```css
java-template/
│
├── src/
│   ├── main/
│   │   └── java/
│   │       └── com/
│   │           └── example/
│   │               └── App.java
│   └── test/
│       └── java/
│           └── com/
│               └── example/
│                   └── AppTest.java
│
├── pom.xml
├── .gitignore
└── README.md
```

###

**<h2>✅ Ferramentas Necessárias</h2>**

###

- `Maven`;
- `JUnit`;
- `Checkstyle` ou `SpotBugs`.

###

**<h2>💡 Exemplo de `pom.xml`</h2>**

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

**<h2>📦 E aí, dev! Você está pronto?</h2**

###

- `CI/CD` - GitHub `Actions`;
- Linters e formatadores;
- Estrutura modular para evolução;
- Testes automáticos.

###



