FROM maven:latest
WORKDIR home/apiframework
COPY src  home/apiframework/src
COPY /test-output/index.html  home/apiframework/test-output/index.html
COPY pom.xml  home/apiframework/pom.xml
COPY testng.xml  home/apiframework/testng.xml
ENTRYPOINT mvn clean test
