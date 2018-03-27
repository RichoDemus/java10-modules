FROM maven:3.5.3-jdk-10-slim as builder
RUN mkdir src
COPY . src/
WORKDIR src
RUN mvn verify
RUN mkdir jars
RUN cp core/target/core.jar jars
RUN cp main/target/main.jar jars

FROM openjdk:10-jre
RUN mkdir app
WORKDIR app
COPY --from=builder /src/jars .

CMD ["java","--module-path","core.jar:main.jar","-m","main/com.richodemus.main.Main"]
