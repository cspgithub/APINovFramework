FROM maven:latest
COPY src  home/apiframework/src
COPY /test-output/index.html  home/apiframework/test-output/index.html
COPY pom.xml  home/apiframework/pom.xml
COPY testng.xml  home/apiframework/testng.xml
WORKDIR home/apiframework
ENTRYPOINT mvn clean test
