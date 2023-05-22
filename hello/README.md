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
