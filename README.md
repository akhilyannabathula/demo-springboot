### to build docker image `docker build -t fastapi-auth-svc .`
### to run `docker run -d -p 80:80 --name containerName fastapi-auth-svc`
### to run one more `docker run -d -p 8081:80 --name containerName2 fastapi-auth-svc`

### to deploy kubernetes `kubectl apply -f springboot-app-deployment.yaml`