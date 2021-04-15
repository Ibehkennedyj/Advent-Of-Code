FROM gradle:jre15 AS build
WORKDIR /
COPY . /
RUN gradle build

FROM openjdk:15-alpine
COPY --from=build /build/libs/*.jar /
COPY /src/main/resources/ /src/main/resources/
CMD java -jar *.jar