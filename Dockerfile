FROM maven:latest
WORKDIR home/apiframework
ADD src  home/apiframework/src
ADD /test-output/index.html  home/apiframework/test-output/index.html
ADD pom.xml  home/apiframework/pom.xml
ADD testng.xml  home/apiframework/testng.xml
ENTRYPOINT mvn clean test
