# Workshop Spring Boot + Docker

## Build image from Dockerfile
```
$docker image build -t demo:1.0 .
$docker image ls

$docker container run -d -p 9999:8080 demo:1.0
```

## In Play with Docker (PWD)
```
$git clone hhttps://github.com/up1/workshop-spring-docker-k8s-202305.git
$cd workshop-spring-docker-k8s-202305/hello
$docker image build -t demo:1.0 .
$docker image ls

$docker container run -d -p 9999:8080 demo:1.0
```

Test API :: http://localhost:9999/hello/somkiat


## Build image with Multi-stage build
```
$docker image build -t demo:2.0 -f Dockerfile_multi_stage  .
$docker image ls
```

## Build image from JAR file
```
$mvnw package
$docker image build -t demo:3.0 -f Dockerfile_jar .
```

## Build with GraalVM support
```
// build binary
$mvnw -Pnative native:compile

// Build image
$mvnw -Pnative spring-boot:build-image
```
