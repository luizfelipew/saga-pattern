FROM azul/zulu-openjdk-alpine:17
COPY build/libs/*.jar app.jar
EXPOSE 8090
ENTRYPOINT ["java", "-jar", "app.jar"]