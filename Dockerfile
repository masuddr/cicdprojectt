FROM openjdk:17
EXPOSE 8080
ADD target/msd-github-actions.jar msd-github-actions.jar
ENTRYPOINT ["java","-jar","/msd-github-actions.jar"]