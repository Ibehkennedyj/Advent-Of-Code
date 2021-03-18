FROM gradle:jre15 AS build
WORKDIR /
COPY . /
RUN gradle build

FROM openjdk:8-jre
EXPOSE 8080
WORKDIR /app
COPY --from=build /build/libs/*.jar .
CMD java -jar *.jar