FROM gradle:jre15 AS build
WORKDIR /
COPY . /
RUN gradle build

FROM openjdk:15-alpine
COPY --from=build /build/libs/*.jar /
COPY /src/main/resources/ /res/
CMD java -jar *.jar