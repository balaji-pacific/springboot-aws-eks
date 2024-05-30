FROM --platform=linux/x86-64 openjdk:17-oracle
ADD target/springboot-eks.jar springboot-eks.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","springboot-eks.jar"]