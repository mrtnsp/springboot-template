# springboot-template

Spring Boot with JDK 11

## docker image creation
each build creates a a docker image with the tags ${version} and latest-snapshot 

run the docker image with

    docker run examples/spring-boot-java11-template:latest-snapshot 

## Profiles

the profile release is used to tag a docker file as latest instead of latest-snapshot.
