FROM openjdk:8
EXPOSE 9090
ADD build/libs/EmployeeManagementSystem-0.0.1-SNAPSHOT.jar  EmployeeManagementSystem-0.0.1-SNAPSHOT.jar
ENTRYPOINT [ "java","-jar","/EmployeeManagementSystem-0.0.1-SNAPSHOT.jar" ]