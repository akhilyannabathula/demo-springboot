### to build docker image `docker build -t fastapi-auth-svc .`
### to run `docker run -d -p 80:80 --name containerName fastapi-auth-svc`
### to run one more `docker run -d -p 8081:80 --name containerName2 fastapi-auth-svc`

### to deploy kubernetes `kubectl apply -f springboot-app-deployment.yaml`

### to run Activemq docker `docker run --detach --name mycontainer -p 61616:61616 -p 8161:8161 --rm apache/activemq-artemis:latest-alpine`