
```bash
docker login -u developer -p `oc whoami -t` registry.apps.c3smonkey.ch
```

```bash
skaffold run
```

```bash
for i in {1..50}; do http https://demo.apps.c3smonkey.ch/alive ; done
```





```bash
./mvnw compile jib:build -Dimage=registry.apps.c3smonkey.ch/myproject/demo
```

see registry console
```
https://registry-console-default.apps.c3smonkey.ch/registry#/images/myproject
```



## Minishift
```bash
docker login -u developer -p `oc whoami -t` docker-registry-default.192.168.99.101.nip.io
```

```bash
skaffold run -p minikube
```

```bash
for i in {1..50}; do http https://demo-myproject.192.168.99.101.nip.io/alive --verify=no ; done
```




```bash
./mvnw compile jib:build -Dimage=docker-registry-default.192.168.99.101.nip.io/myproject/demo
```

```bash
oc apply -f k8s/minishift-deployment.yaml
```



```bash
oc delete all --all
```



```bash
docker login -u <user> -p `oc whoami -t` registry.osp-appl-preprod.hel.kko.ch
skaffold run -p osp
```







# Kustomize
```bash
kustomize build k8s/deployment > k8s/service.yaml
```


