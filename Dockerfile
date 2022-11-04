FROM maven:latest
WORKDIR /app
ADD . /app
CMD  mvn -f APINovemeberTestFramework_1/pom.xml clean test