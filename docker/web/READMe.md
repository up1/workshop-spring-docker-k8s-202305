## Docker volume
```
$docker image pull nginx:1.23.4 
$docker container run -d -p 9999:80 nginx:1.23.4
```

Access
```
$curl localhost:9999
```

Create demo.html
```
<h1>Hello my new page !!!</h1>
```

Create container with volume
```
$docker container run -d -p 9998:80 -v $(pwd)/demo.html:/usr/share/nginx/html/demo.html nginx:1.23.4
```

Access
```
$curl localhost:9998/demo.html
```