FROM maven:3.8-openjdk-16

WORKDIR app

COPY pom.xml /app/pom.xml

RUN ["mvn", "verify", "clean"]

COPY src /app/src

EXPOSE 8080

RUN ["mvn", "install"]

CMD ["mvn", "spring-boot:run"]