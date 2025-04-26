FROM java:8

EXPOSE 9090

ADD target/aws-bean-jar.jar aws-bean-jar.jar

ENTRYPOINT ["java","-jar","aws-bean-jar.jar"]
