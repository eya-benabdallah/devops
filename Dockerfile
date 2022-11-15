<<<<<<< HEAD
FROM openjdk:8-jdk-alpine
EXPOSE 8089
COPY target/achat-1.0.jar achat-1.0.jar
ENTRYPOINT ["java","-jar","achat-1.0.jar"]
=======
FROM openjdk:8-jdk-alpine
EXPOSE 8089
COPY target/achat-1.0.jar achat-1.0.jar
ENTRYPOINT ["java","-jar","achat-1.0.jar"]
>>>>>>> a87fe732ca75c802dc5010d4ecc900a1d294f601
