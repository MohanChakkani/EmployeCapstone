FROM openjdk:8
EXPOSE 9090
ADD build/libs/EmployeMangamentSystem-0.0.1-SNAPSHOT.jar EmployeMangamentSystem-0.0.1-SNAPSHOT.jar
ENTRYPOINT [ "java","-jar","/EmployeMangamentSystem-0.0.1-SNAPSHOT.jar" ]