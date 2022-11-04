FROM adoptopenjdk/maven-openjdk11
WORKDIR /app
ADD . /app
CMD  mvn -f APINovemeberTestFramework_1/pom.xml clean test