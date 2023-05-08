FROM openjdk
WORKDIR target
ADD target/. .
EXPOSE 8080
