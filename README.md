# flink-achieve

[![License](https://img.shields.io/badge/License-MIT-green.svg?style=flat&logo=github)](https://www.mit-license.org)
[![OracleJDK](https://img.shields.io/badge/OracleJDK-17.0.4-success.svg?style=flat&logo=data:image/svg+xml;base64,PHN2ZyB4bWxucz0iaHR0cDovL3d3dy53My5vcmcvMjAwMC9zdmciIHdpZHRoPSI2NCIgaGVpZ2h0PSI2NCIgdmlld0JveD0iMCAwIDMyIDMyIj48cGF0aCBkPSJNMTEuNjIyIDI0Ljc0cy0xLjIzLjc0OC44NTUuOTYyYzIuNTEuMzIgMy44NDcuMjY3IDYuNjI1LS4yNjdhMTAuMDIgMTAuMDIgMCAwIDAgMS43NjMuODU1Yy02LjI1IDIuNjcyLTE0LjE2LS4xNi05LjI0NC0xLjU1em0tLjgtMy40NzNzLTEuMzM2IDEuMDE1Ljc0OCAxLjIzYzIuNzI1LjI2NyA0Ljg2Mi4zMiA4LjU1LS40MjdhMy4yNiAzLjI2IDAgMCAwIDEuMjgyLjgwMWMtNy41MzQgMi4yNDQtMTUuOTc2LjIxNC0xMC41OC0xLjYwM3ptMTQuNzQ3IDYuMDlzLjkwOC43NDgtMS4wMTUgMS4zMzZjLTMuNTggMS4wNy0xNS4wMTQgMS4zOS0xOC4yMiAwLTEuMTIyLS40OCAxLjAxNS0xLjE3NSAxLjctMS4yODIuNjk1LS4xNiAxLjA3LS4xNiAxLjA3LS4xNi0xLjIzLS44NTUtOC4xNzUgMS43NjMtMy41MjYgMi41MSAxMi43NyAyLjA4NCAyMy4yOTYtLjkwOCAxOS45ODMtMi40MDR6TTEyLjIgMTcuNjMzcy01LjgyNCAxLjM5LTIuMDg0IDEuODdjMS42MDMuMjE0IDQuNzU1LjE2IDcuNjk0LS4wNTMgMi40MDQtLjIxNCA0LjgxLS42NCA0LjgxLS42NHMtLjg1NS4zNzQtMS40NDMuNzQ4Yy01LjkzIDEuNTUtMTcuMzEyLjg1NS0xNC4wNTItLjc0OCAyLjc3OC0xLjMzNiA1LjA3Ni0xLjE3NSA1LjA3Ni0xLjE3NXptMTAuNDIgNS44MjRjNS45ODQtMy4xIDMuMjA2LTYuMDkgMS4yODItNS43MTctLjQ4LjEwNy0uNjk1LjIxNC0uNjk1LjIxNHMuMTYtLjMyLjUzNC0uNDI3YzMuNzk0LTEuMzM2IDYuNzg2IDQuMDA3LTEuMjMgNi4wOSAwIDAgLjA1My0uMDUzLjEwNy0uMTZ6bS05LjgzIDguNDQyYzUuNzcuMzc0IDE0LjU4Ny0uMjE0IDE0LjgtMi45NCAwIDAtLjQyNyAxLjA3LTQuNzU1IDEuODctNC45MTYuOTA4LTExLjAwNy44LTE0LjU4Ny4yMTQgMCAwIC43NDguNjQgNC41NDIuODU1eiIgZmlsbD0iIzRlNzg5NiIvPjxwYXRoIGQ9Ik0xOC45OTYuMDAxczMuMzEzIDMuMzY2LTMuMTUyIDguNDQyYy01LjE4MyA0LjExNC0xLjE3NSA2LjQ2NSAwIDkuMTM3LTMuMDQ2LTIuNzI1LTUuMjM2LTUuMTMtMy43NC03LjM3M0MxNC4yOTQgNi44OTMgMjAuMzMyIDUuMyAxOC45OTYuMDAxem0tMS43IDE1LjMzNWMxLjU1IDEuNzYzLS40MjcgMy4zNjYtLjQyNyAzLjM2NnMzLjk1NC0yLjAzIDIuMTM3LTQuNTQyYy0xLjY1Ni0yLjQwNC0yLjk0LTMuNTggNC4wMDctNy41ODcgMCAwLTEwLjk1MyAyLjcyNS01LjcxNyA4Ljc2M3oiIGZpbGw9IiNmNTgyMTkiLz48L3N2Zz4=)](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html)
[![JUnit](https://img.shields.io/badge/JUnit-5.8.2-success.svg?style=flat&logo=junit5)](https://junit.org/junit5/docs/current/user-guide)
[![Gradle](https://img.shields.io/badge/Gradle-7.4.2-success.svg?style=flat&logo=gradle)](https://docs.gradle.org/7.2/userguide/installation.html)
[![Release](https://img.shields.io/badge/Release-0.2.0-informational.svg)](https://github.com/aaric/flink-achieve/releases)

> Flink Learning.

## 1 Sample

|No.|Version|Sample|Remark|
|:---:|:---:|-----|-----|
|1|`0.1.0-SNAPSHOT`|[`BatchTextTests`](src/test/java/com/sample/flink/BatchTextTests.java)|*批处理*|
|2|`0.1.0-SNAPSHOT`|[`BoundedStreamTextTests`](src/test/java/com/sample/flink/BoundedStreamTextTests.java)|*有界流处理*|
|3|`0.1.0-SNAPSHOT`|[`StreamTextTests`](src/test/java/com/sample/flink/StreamTextTests.java)|*无界流处理，Socket Serve：`nc -lk 7777`*|

## 2 Install

### 2.1 Download

```bash
curl -o flink-1.13.6-bin-scala_2.12.tgz https://dlcdn.apache.org/flink/flink-1.13.6/flink-1.13.6-bin-scala_2.12.tgz
tar -zxvf flink-1.13.6-bin-scala_2.12.tgz -C /opt/
cd /opt/flink-1.13.6/
```

### 2.2 Start up

#### Single node

```bash
cat > /opt/flink-1.13.6/conf/masters <<-'EOF'
localhost:8081
EOF

cat > /opt/flink-1.13.6/conf/workers <<-'EOF'
localhost
EOF

# https://localhost:8081
/opt/flink-1.13.6/bin/start-cluster.sh
```

#### Cluster nodes

|No.|Hostname|IP|Role|Remark|
|:---:|:---:|:---:|:---:|----|
|1|`centos-v7-s1`|`172.16.0.1`|`Master`||
|2|`centos-v7-s2`|`172.16.0.2`|`Worker`||
|3|`centos-v7-s3`|`172.16.0.3`|`Worker`||

```bash
cat >> /etc/hosts <<-'EOF'

# flink nodes
172.16.0.1 centos-v7-s1
172.16.0.2 centos-v7-s2
172.16.0.3 centos-v7-s3
EOF

cat > /opt/flink-1.13.6/conf/masters <<-'EOF'
centos-v7-s1:8081
EOF

cat > /opt/flink-1.13.6/conf/workers <<-'EOF'
centos-v7-s1
centos-v7-s2
centos-v7-s3
EOF

/opt/flink-1.13.6/bin/start-cluster.sh
```
