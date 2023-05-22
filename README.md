# Workshop :: Develop Microservices with Spring Boot
* Docker
* Kubernetes

## Working with Docker compose
1. Create file `docker-compose.yml`

2. Build image 
```
$docker compose build
```

3. Run container
```
$docker compose up -d
$docker-compose ps
```

4. Remove all containers
```
$docker compose down
```


## Working with Docker Swarm

Create a cluster
```
$docker swarm init

$docker node ls
```

Deploy 
```
$docker stack deploy --compose-file docker-compose-deploy.yml dev

$docker stack ls
$docker service ls
```
