
```bash
docker login -u developer -p `oc whoami -t` registry.apps.c3smonkey.ch
```

```bash
./mvnw compile jib:build -Dimage=registry.apps.c3smonkey.ch/myproject/demo
```

```bash
skaffold run
```

see registry console
```
https://registry-console-default.apps.c3smonkey.ch/registry#/images/myproject
```






## Minishift
```bash
./mvnw compile jib:build -Dimage=docker-registry-default.192.168.99.101.nip.io/myproject/demo
```

```bash
oc apply -f k8s/deployment.yaml
```



```bash
oc delete all --all
```