FROM anapsix/alpine-java

ADD ./target/journal-service.jar /app/

CMD ["java", "-Xmx200m", "-jar", "/app/journal-service.jar"]

EXPOSE 8081