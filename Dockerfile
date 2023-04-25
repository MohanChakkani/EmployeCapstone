FROM openjdk:8
EXPOSE 9090
ADD build/libs/EmployeManagementSystem-0.0.1-SNAPSHOT.jar  EmployeManagementSystem-0.0.1-SNAPSHOT.jar
ENTRYPOINT [ "java","-jar","/EmployeManagementSystem-0.0.1-SNAPSHOT.jar" ]