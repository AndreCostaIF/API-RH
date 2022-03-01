FROM openjdk:11


COPY . .

#RUN ./gradlew clean build

WORKDIR /build/libs/

#RUN javac Main.java

CMD ["java", "-jar", "CRUDCliente-0.0.1-SNAPSHOT.jar"]