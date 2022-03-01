FROM openjdk:11


COPY . .

#RUN ./gradlew clean build

WORKDIR /build/libs/

#RUN javac Main.java



CMD ["java", "-Dspring.profiles.active=production", "-jar", "CRUDCliente-0.0.1-SNAPSHOT.jar"]