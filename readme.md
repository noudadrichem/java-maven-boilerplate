# Maven boilerpalte

## Java
run: `sh start.sh`

build: `sh build.sh`


## Angular
go to 'frontend' (cd)

install: `npm install`

run: `npm start`

build: `npm run build`


## Oracle DB
link:https://hub.docker.com/r/wnameless/oracle-xe-11g-r2

`docker run -d -p 49161:1521 -e ORACLE_ALLOW_REMOTE=true wnameless/oracle-xe-11g-r2`

```
hostname: localhost
port: 49161
sid: xe
username: system
password: oracle
```
