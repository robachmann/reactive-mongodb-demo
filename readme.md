## Compile and Deploy
```
./gradlew assemble
cf push -f manifest.yml
cf logs reactive-mongodb-demo --recent
```

## Logs
```
Retrieving logs for app reactive-mongodb-demo in org mongodb-demo / space demo as user...

      2019-09-14T12:05:12.81+0200 [API/0] OUT Updated app with guid 1f1168ed-a6a8-4d5d-afa9-2d1058977e54 ({"buildpack"=>"java_buildpack", "disk_quota"=>192, "environment_json"=>"[PRIVATE DATA HIDDEN]", "health_check_http_endpoint"=>"", "health_check_type"=>"port", "instances"=>1, "memory"=>768, "name"=>"reactive-mongodb-demo", "space_guid"=>"3db32637-0c33-4237-b8d9-c940a02d2cbb"})
      2019-09-14T12:05:16.16+0200 [API/2] OUT Uploading bits for app with guid 1f1168ed-a6a8-4d5d-afa9-2d1058977e54
      2019-09-14T12:05:27.01+0200 [CELL/0] OUT Cell 51791a8e-4755-44ec-9425-03b4de561d0b stopping instance 7559fbc0-db6a-448d-666a-db2f
      2019-09-14T12:05:27.02+0200 [API/0] OUT Updated app with guid 1f1168ed-a6a8-4d5d-afa9-2d1058977e54 ({"state"=>"STOPPED"})
      2019-09-14T12:05:27.81+0200 [API/3] OUT Creating build for app with guid 1f1168ed-a6a8-4d5d-afa9-2d1058977e54
      2019-09-14T12:05:28.17+0200 [API/3] OUT Updated app with guid 1f1168ed-a6a8-4d5d-afa9-2d1058977e54 ({"state"=>"STARTED"})
      2019-09-14T12:05:28.27+0200 [STG/0] OUT Downloading java_buildpack...
      2019-09-14T12:05:28.34+0200 [STG/0] OUT Downloaded java_buildpack
      2019-09-14T12:05:28.34+0200 [STG/0] OUT Cell 51791a8e-4755-44ec-9425-03b4de561d0b creating container for instance 0c3c9b72-b627-4100-973e-4ac6023e7704
      2019-09-14T12:05:28.92+0200 [STG/0] OUT Cell 51791a8e-4755-44ec-9425-03b4de561d0b successfully created container for instance 0c3c9b72-b627-4100-973e-4ac6023e7704
      2019-09-14T12:05:29.07+0200 [STG/0] OUT Downloading app package...
      2019-09-14T12:05:29.07+0200 [STG/0] OUT Downloading build artifacts cache...
      2019-09-14T12:05:30.83+0200 [STG/0] OUT Downloaded app package (23.1M)
      2019-09-14T12:05:31.83+0200 [STG/0] OUT Downloaded build artifacts cache (82.6M)
      2019-09-14T12:05:32.58+0200 [CELL/SSHD/0] OUT Exit status 0
      2019-09-14T12:05:32.99+0200 [APP/PROC/WEB/0] OUT Exit status 143
      2019-09-14T12:05:33.03+0200 [CELL/0] OUT Cell 51791a8e-4755-44ec-9425-03b4de561d0b destroying container for instance 7559fbc0-db6a-448d-666a-db2f
      2019-09-14T12:05:33.19+0200 [PROXY/0] OUT Exit status 137
      2019-09-14T12:05:33.43+0200 [CELL/0] OUT Cell 51791a8e-4755-44ec-9425-03b4de561d0b successfully destroyed container for instance 7559fbc0-db6a-448d-666a-db2f
      2019-09-14T12:05:33.58+0200 [STG/0] OUT [1m[31m----->[0m[22m [1m[34mJava Buildpack[0m[22m [34mv4.20[0m | https://github.com/cloudfoundry/java-buildpack.git#456ce5e
      2019-09-14T12:05:33.74+0200 [STG/0] OUT [1m[31m----->[0m[22m Downloading [1m[34mJvmkill Agent[0m[22m [34m1.16.0_RELEASE[0m from https://java-buildpack.cloudfoundry.org/jvmkill/bionic/x86_64/jvmkill-1.16.0-RELEASE.so [3m[32m(found in cache)[0m[23m
      2019-09-14T12:05:33.79+0200 [STG/0] OUT [1m[31m----->[0m[22m Downloading [1m[34mOpen Jdk JRE[0m[22m [34m11.0.4_11[0m from https://java-buildpack.cloudfoundry.org/openjdk/bionic/x86_64/openjdk-jre-11.0.4_11-bionic.tar.gz [3m[32m(found in cache)[0m[23m
      2019-09-14T12:05:34.96+0200 [STG/0] OUT        Expanding Open Jdk JRE to .java-buildpack/open_jdk_jre [3m[32m(1.1s)[0m[23m
      2019-09-14T12:05:34.96+0200 [STG/0] OUT        JVM DNS caching disabled in lieu of BOSH DNS caching
      2019-09-14T12:05:35.01+0200 [STG/0] OUT [1m[31m----->[0m[22m Downloading [1m[34mOpen JDK Like Memory Calculator[0m[22m [34m3.13.0_RELEASE[0m from https://java-buildpack.cloudfoundry.org/memory-calculator/bionic/x86_64/memory-calculator-3.13.0-RELEASE.tar.gz [3m[32m(found in cache)[0m[23m
      2019-09-14T12:05:35.43+0200 [STG/0] OUT        Loaded Classes: 20899, Threads: 250
      2019-09-14T12:05:35.48+0200 [STG/0] OUT [1m[31m----->[0m[22m Downloading [1m[34mClient Certificate Mapper[0m[22m [34m1.8.0_RELEASE[0m from https://java-buildpack.cloudfoundry.org/client-certificate-mapper/client-certificate-mapper-1.8.0-RELEASE.jar [3m[32m(found in cache)[0m[23m
      2019-09-14T12:05:35.52+0200 [STG/0] OUT [1m[31m----->[0m[22m Downloading [1m[34mContainer Security Provider[0m[22m [34m1.16.0_RELEASE[0m from https://java-buildpack.cloudfoundry.org/container-security-provider/container-security-provider-1.16.0-RELEASE.jar [3m[32m(found in cache)[0m[23m
      2019-09-14T12:05:35.56+0200 [STG/0] OUT [1m[31m----->[0m[22m Downloading [1m[34mSpring Auto Reconfiguration[0m[22m [34m2.7.0_RELEASE[0m from https://java-buildpack.cloudfoundry.org/auto-reconfiguration/auto-reconfiguration-2.7.0-RELEASE.jar [3m[32m(found in cache)[0m[23m
      2019-09-14T12:05:50.23+0200 [STG/0] OUT Exit status 0
      2019-09-14T12:05:50.23+0200 [STG/0] OUT Uploading droplet, build artifacts cache...
      2019-09-14T12:05:50.23+0200 [STG/0] OUT Uploading droplet...
      2019-09-14T12:05:50.24+0200 [STG/0] OUT Uploading build artifacts cache...
      2019-09-14T12:05:51.35+0200 [API/1] OUT Creating droplet for app with guid 1f1168ed-a6a8-4d5d-afa9-2d1058977e54
      2019-09-14T12:05:51.64+0200 [STG/0] OUT Uploaded build artifacts cache (82.6M)
      2019-09-14T12:06:00.57+0200 [STG/0] OUT Uploaded droplet (68M)
      2019-09-14T12:06:00.58+0200 [STG/0] OUT Uploading complete
      2019-09-14T12:06:00.91+0200 [STG/0] OUT Cell 51791a8e-4755-44ec-9425-03b4de561d0b stopping instance 0c3c9b72-b627-4100-973e-4ac6023e7704
      2019-09-14T12:06:00.91+0200 [STG/0] OUT Cell 51791a8e-4755-44ec-9425-03b4de561d0b destroying container for instance 0c3c9b72-b627-4100-973e-4ac6023e7704
      2019-09-14T12:06:01.52+0200 [STG/0] OUT Cell 51791a8e-4755-44ec-9425-03b4de561d0b successfully destroyed container for instance 0c3c9b72-b627-4100-973e-4ac6023e7704
      2019-09-14T12:06:01.53+0200 [CELL/0] OUT Cell d77d0ba6-fcf7-4f9d-bcdd-4b524d5dcf06 creating container for instance 0c27584d-f3ef-46cb-4e18-bd3a
      2019-09-14T12:06:02.12+0200 [CELL/0] OUT Cell d77d0ba6-fcf7-4f9d-bcdd-4b524d5dcf06 successfully created container for instance 0c27584d-f3ef-46cb-4e18-bd3a
      2019-09-14T12:06:02.28+0200 [CELL/0] OUT Downloading droplet...
      2019-09-14T12:06:06.29+0200 [CELL/0] OUT Downloaded droplet (68M)
      2019-09-14T12:06:06.29+0200 [CELL/0] OUT Starting health monitoring of container
      2019-09-14T12:06:06.71+0200 [APP/PROC/WEB/0] OUT JVM Memory Configuration: -Xmx135017K -Xss1M -XX:ReservedCodeCacheSize=240M -XX:MaxDirectMemorySize=10M -XX:MaxMetaspaceSize=139414K
      2019-09-14T12:06:08.11+0200 [APP/PROC/WEB/0] OUT   .   ____          _            __ _ _
      2019-09-14T12:06:08.11+0200 [APP/PROC/WEB/0] OUT  /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
      2019-09-14T12:06:08.11+0200 [APP/PROC/WEB/0] OUT ( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
      2019-09-14T12:06:08.11+0200 [APP/PROC/WEB/0] OUT  \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
      2019-09-14T12:06:08.11+0200 [APP/PROC/WEB/0] OUT   '  |____| .__|_| |_|_| |_\__, | / / / /
      2019-09-14T12:06:08.11+0200 [APP/PROC/WEB/0] OUT  =========|_|==============|___/=/_/_/_/
      2019-09-14T12:06:08.11+0200 [APP/PROC/WEB/0] OUT  :: Spring Boot ::             (v2.2.0.M6)
      2019-09-14T12:06:08.27+0200 [APP/PROC/WEB/0] OUT 2019-09-14 10:06:08.274  INFO 6 --- [           main] pertySourceApplicationContextInitializer : 'cloud' property source added
      2019-09-14T12:06:08.27+0200 [APP/PROC/WEB/0] OUT 2019-09-14 10:06:08.279  INFO 6 --- [           main] nfigurationApplicationContextInitializer : Reconfiguration enabled
      2019-09-14T12:06:08.28+0200 [APP/PROC/WEB/0] OUT 2019-09-14 10:06:08.287  INFO 6 --- [           main] c.e.r.ReactiveMongodbDemoApplication     : Starting ReactiveMongodbDemoApplication on 0c27584d-f3ef-46cb-4e18-bd3a with PID 6 (/home/vcap/app/BOOT-INF/classes started by vcap in /home/vcap/app)
      2019-09-14T12:06:08.28+0200 [APP/PROC/WEB/0] OUT 2019-09-14 10:06:08.288  INFO 6 --- [           main] c.e.r.ReactiveMongodbDemoApplication     : The following profiles are active: cloud
      2019-09-14T12:06:08.81+0200 [APP/PROC/WEB/0] OUT 2019-09-14 10:06:08.810  INFO 6 --- [           main] .s.d.r.c.RepositoryConfigurationDelegate : Bootstrapping Spring Data repositories in DEFAULT mode.
      2019-09-14T12:06:08.82+0200 [APP/PROC/WEB/0] OUT 2019-09-14 10:06:08.828  INFO 6 --- [           main] .s.d.r.c.RepositoryConfigurationDelegate : Finished Spring Data repository scanning in 13ms. Found 0 repository interfaces.
      2019-09-14T12:06:08.83+0200 [APP/PROC/WEB/0] OUT 2019-09-14 10:06:08.834  INFO 6 --- [           main] .s.d.r.c.RepositoryConfigurationDelegate : Bootstrapping Spring Data repositories in DEFAULT mode.
      2019-09-14T12:06:08.83+0200 [APP/PROC/WEB/0] OUT 2019-09-14 10:06:08.835  INFO 6 --- [           main] .s.d.r.c.RepositoryConfigurationDelegate : Finished Spring Data repository scanning in 1ms. Found 0 repository interfaces.
      2019-09-14T12:06:09.10+0200 [APP/PROC/WEB/0] OUT 2019-09-14 10:06:09.106  INFO 6 --- [           main] ContainerTrustManagerFactory$PKIXFactory : Adding System Trust Manager
      2019-09-14T12:06:09.10+0200 [APP/PROC/WEB/0] OUT 2019-09-14 10:06:09.106  INFO 6 --- [           main] ContainerTrustManagerFactory$PKIXFactory : Adding TrustManager for /etc/ssl/certs/ca-certificates.crt
      2019-09-14T12:06:09.11+0200 [APP/PROC/WEB/0] OUT 2019-09-14 10:06:09.111  INFO 6 --- [tificates.crt-0] org.cloudfoundry.security.FileWatcher    : Start watching /etc/ssl/certs/ca-certificates.crt
      2019-09-14T12:06:09.27+0200 [APP/PROC/WEB/0] OUT 2019-09-14 10:06:09.277  INFO 6 --- [           main] c.s.FileWatchingX509ExtendedTrustManager : Initialized TrustManager for /etc/ssl/certs/ca-certificates.crt
      2019-09-14T12:06:09.28+0200 [APP/PROC/WEB/0] OUT 2019-09-14 10:06:09.280  INFO 6 --- [           main] oundryContainerKeyManagerFactory$SunX509 : Adding System Key Manager
      2019-09-14T12:06:09.28+0200 [APP/PROC/WEB/0] OUT 2019-09-14 10:06:09.281  INFO 6 --- [           main] oundryContainerKeyManagerFactory$SunX509 : Adding Key Manager for /etc/cf-instance-credentials/instance.key and /etc/cf-instance-credentials/instance.crt
      2019-09-14T12:06:09.28+0200 [APP/PROC/WEB/0] OUT 2019-09-14 10:06:09.283  INFO 6 --- [-instance.crt-0] org.cloudfoundry.security.FileWatcher    : Start watching /etc/cf-instance-credentials/instance.crt
      2019-09-14T12:06:09.28+0200 [APP/PROC/WEB/0] OUT 2019-09-14 10:06:09.283  INFO 6 --- [-instance.key-0] org.cloudfoundry.security.FileWatcher    : Start watching /etc/cf-instance-credentials/instance.key
      2019-09-14T12:06:09.48+0200 [APP/PROC/WEB/0] OUT 2019-09-14 10:06:09.481  INFO 6 --- [           main] o.c.s.FileWatchingX509ExtendedKeyManager : Initialized KeyManager for /etc/cf-instance-credentials/instance.key and /etc/cf-instance-credentials/instance.crt
      2019-09-14T12:06:09.56+0200 [APP/PROC/WEB/0] OUT 2019-09-14 10:06:09.560  INFO 6 --- [           main] org.mongodb.driver.cluster               : Cluster created with settings {hosts=[kubernetes-service-node.service.consul:41456, kubernetes-service-node.service.consul:44062, kubernetes-service-node.service.consul:54415], mode=MULTIPLE, requiredClusterType=REPLICA_SET, serverSelectionTimeout='30000 ms', maxWaitQueueSize=500, requiredReplicaSetName='rs_f2d2f1d8-3eda-4822-b60f-e7af750e234d'}
      2019-09-14T12:06:09.56+0200 [APP/PROC/WEB/0] OUT 2019-09-14 10:06:09.561  INFO 6 --- [           main] org.mongodb.driver.cluster               : Adding discovered server kubernetes-service-node.service.consul:41456 to client view of cluster
      2019-09-14T12:06:09.58+0200 [APP/PROC/WEB/0] OUT 2019-09-14 10:06:09.586  INFO 6 --- [           main] org.mongodb.driver.cluster               : Adding discovered server kubernetes-service-node.service.consul:44062 to client view of cluster
      2019-09-14T12:06:09.58+0200 [APP/PROC/WEB/0] OUT 2019-09-14 10:06:09.588  INFO 6 --- [           main] org.mongodb.driver.cluster               : Adding discovered server kubernetes-service-node.service.consul:54415 to client view of cluster
      2019-09-14T12:06:09.60+0200 [APP/PROC/WEB/0] OUT 2019-09-14 10:06:09.602  INFO 6 --- [           main] o.c.reconfiguration.CloudServiceUtils    : 'mongoDbFactory' bean of type with 'org.springframework.data.mongodb.MongoDbFactory' reconfigured with 'mongodb' bean
      2019-09-14T12:06:09.66+0200 [APP/PROC/WEB/0] OUT 2019-09-14 10:06:09.668  INFO 6 --- [ce.consul:54415] org.mongodb.driver.connection            : Opened connection [connectionId{localValue:1, serverValue:1224452}] to kubernetes-service-node.service.consul:54415
      2019-09-14T12:06:09.67+0200 [APP/PROC/WEB/0] OUT 2019-09-14 10:06:09.670  INFO 6 --- [ce.consul:41456] org.mongodb.driver.connection            : Opened connection [connectionId{localValue:2, serverValue:1236045}] to kubernetes-service-node.service.consul:41456
      2019-09-14T12:06:09.67+0200 [APP/PROC/WEB/0] OUT 2019-09-14 10:06:09.672  INFO 6 --- [ce.consul:44062] org.mongodb.driver.connection            : Opened connection [connectionId{localValue:3, serverValue:1514997}] to kubernetes-service-node.service.consul:44062
      2019-09-14T12:06:09.69+0200 [APP/PROC/WEB/0] OUT 2019-09-14 10:06:09.690  INFO 6 --- [ce.consul:41456] org.mongodb.driver.cluster               : Monitor thread successfully connected to server with description ServerDescription{address=kubernetes-service-node.service.consul:41456, type=REPLICA_SET_PRIMARY, state=CONNECTED, ok=true, version=ServerVersion{versionList=[3, 6, 8]}, minWireVersion=0, maxWireVersion=6, maxDocumentSize=16777216, logicalSessionTimeoutMinutes=30, roundTripTimeNanos=6205806, setName='rs_f2d2f1d8-3eda-4822-b60f-e7af750e234d', canonicalAddress=kubernetes-service-node.service.consul:41456, hosts=[kubernetes-service-node.service.consul:44062, kubernetes-service-node.service.consul:54415, kubernetes-service-node.service.consul:41456], passives=[], arbiters=[], primary='kubernetes-service-node.service.consul:41456', tagSet=TagSet{[]}, electionId=7fffffff0000000000000007, setVersion=5, lastWriteDate=Sat Sep 14 10:06:02 UTC 2019, lastUpdateTimeNanos=105488039241337}
      2019-09-14T12:06:09.69+0200 [APP/PROC/WEB/0] OUT 2019-09-14 10:06:09.690  INFO 6 --- [ce.consul:54415] org.mongodb.driver.cluster               : Monitor thread successfully connected to server with description ServerDescription{address=kubernetes-service-node.service.consul:54415, type=REPLICA_SET_SECONDARY, state=CONNECTED, ok=true, version=ServerVersion{versionList=[3, 6, 8]}, minWireVersion=0, maxWireVersion=6, maxDocumentSize=16777216, logicalSessionTimeoutMinutes=30, roundTripTimeNanos=10356990, setName='rs_f2d2f1d8-3eda-4822-b60f-e7af750e234d', canonicalAddress=kubernetes-service-node.service.consul:54415, hosts=[kubernetes-service-node.service.consul:44062, kubernetes-service-node.service.consul:54415, kubernetes-service-node.service.consul:41456], passives=[], arbiters=[], primary='kubernetes-service-node.service.consul:41456', tagSet=TagSet{[]}, electionId=null, setVersion=5, lastWriteDate=Sat Sep 14 10:06:02 UTC 2019, lastUpdateTimeNanos=105488040864447}
      2019-09-14T12:06:09.69+0200 [APP/PROC/WEB/0] OUT 2019-09-14 10:06:09.690  INFO 6 --- [ce.consul:44062] org.mongodb.driver.cluster               : Monitor thread successfully connected to server with description ServerDescription{address=kubernetes-service-node.service.consul:44062, type=REPLICA_SET_SECONDARY, state=CONNECTED, ok=true, version=ServerVersion{versionList=[3, 6, 8]}, minWireVersion=0, maxWireVersion=6, maxDocumentSize=16777216, logicalSessionTimeoutMinutes=30, roundTripTimeNanos=6735796, setName='rs_f2d2f1d8-3eda-4822-b60f-e7af750e234d', canonicalAddress=kubernetes-service-node.service.consul:44062, hosts=[kubernetes-service-node.service.consul:44062, kubernetes-service-node.service.consul:54415, kubernetes-service-node.service.consul:41456], passives=[], arbiters=[], primary='kubernetes-service-node.service.consul:41456', tagSet=TagSet{[]}, electionId=null, setVersion=5, lastWriteDate=Sat Sep 14 10:06:02 UTC 2019, lastUpdateTimeNanos=105488040759677}
      2019-09-14T12:06:09.69+0200 [APP/PROC/WEB/0] OUT 2019-09-14 10:06:09.692  INFO 6 --- [ce.consul:41456] org.mongodb.driver.cluster               : Setting max election id to 7fffffff0000000000000007 from replica set primary kubernetes-service-node.service.consul:41456
      2019-09-14T12:06:09.69+0200 [APP/PROC/WEB/0] OUT 2019-09-14 10:06:09.692  INFO 6 --- [ce.consul:41456] org.mongodb.driver.cluster               : Setting max set version to 5 from replica set primary kubernetes-service-node.service.consul:41456
      2019-09-14T12:06:09.69+0200 [APP/PROC/WEB/0] OUT 2019-09-14 10:06:09.693  INFO 6 --- [ce.consul:41456] org.mongodb.driver.cluster               : Discovered replica set primary kubernetes-service-node.service.consul:41456
      2019-09-14T12:06:09.88+0200 [APP/PROC/WEB/0] OUT 2019-09-14 10:06:09.883  WARN 6 --- [           main] o.s.data.convert.CustomConversions       : Registering converter from class java.time.LocalDateTime to class java.time.Instant as reading converter although it doesn't convert from a store-supported type! You might wanna check you annotation setup at the converter implementation.
      2019-09-14T12:06:09.88+0200 [APP/PROC/WEB/0] OUT 2019-09-14 10:06:09.884  WARN 6 --- [           main] o.s.data.convert.CustomConversions       : Registering converter from class java.time.Instant to class java.time.LocalDateTime as reading converter although it doesn't convert from a store-supported type! You might wanna check you annotation setup at the converter implementation.
      2019-09-14T12:06:09.92+0200 [APP/PROC/WEB/0] OUT 2019-09-14 10:06:09.922  WARN 6 --- [           main] o.s.data.convert.CustomConversions       : Registering converter from class java.time.LocalDateTime to class java.time.Instant as reading converter although it doesn't convert from a store-supported type! You might wanna check you annotation setup at the converter implementation.
      2019-09-14T12:06:09.92+0200 [APP/PROC/WEB/0] OUT 2019-09-14 10:06:09.922  WARN 6 --- [           main] o.s.data.convert.CustomConversions       : Registering converter from class java.time.Instant to class java.time.LocalDateTime as reading converter although it doesn't convert from a store-supported type! You might wanna check you annotation setup at the converter implementation.
      2019-09-14T12:06:10.55+0200 [APP/PROC/WEB/0] OUT 2019-09-14 10:06:10.552  INFO 6 --- [           main] org.mongodb.driver.cluster               : Cluster created with settings {hosts=[localhost:27017], mode=SINGLE, requiredClusterType=UNKNOWN, serverSelectionTimeout='30000 ms', maxWaitQueueSize=500}
      2019-09-14T12:06:10.56+0200 [APP/PROC/WEB/0] OUT 2019-09-14 10:06:10.559  INFO 6 --- [localhost:27017] org.mongodb.driver.cluster               : Exception in monitor thread while connecting to server localhost:27017
      2019-09-14T12:06:10.56+0200 [APP/PROC/WEB/0] OUT com.mongodb.MongoSocketOpenException: Exception opening socket
      2019-09-14T12:06:10.56+0200 [APP/PROC/WEB/0] OUT 	at com.mongodb.internal.connection.SocketStream.open(SocketStream.java:70) ~[mongodb-driver-core-3.11.0.jar:na]
      2019-09-14T12:06:10.56+0200 [APP/PROC/WEB/0] OUT 	at com.mongodb.internal.connection.InternalStreamConnection.open(InternalStreamConnection.java:128) ~[mongodb-driver-core-3.11.0.jar:na]
      2019-09-14T12:06:10.56+0200 [APP/PROC/WEB/0] OUT 	at com.mongodb.internal.connection.DefaultServerMonitor$ServerMonitorRunnable.run(DefaultServerMonitor.java:117) ~[mongodb-driver-core-3.11.0.jar:na]
      2019-09-14T12:06:10.56+0200 [APP/PROC/WEB/0] OUT 	at java.base/java.lang.Thread.run(Unknown Source) ~[na:na]
      2019-09-14T12:06:10.56+0200 [APP/PROC/WEB/0] OUT Caused by: java.net.ConnectException: Connection refused (Connection refused)
      2019-09-14T12:06:10.56+0200 [APP/PROC/WEB/0] OUT 	at java.base/java.net.PlainSocketImpl.socketConnect(Native Method) ~[na:na]
      2019-09-14T12:06:10.56+0200 [APP/PROC/WEB/0] OUT 	at java.base/java.net.AbstractPlainSocketImpl.doConnect(Unknown Source) ~[na:na]
      2019-09-14T12:06:10.56+0200 [APP/PROC/WEB/0] OUT 	at java.base/java.net.AbstractPlainSocketImpl.connectToAddress(Unknown Source) ~[na:na]
      2019-09-14T12:06:10.56+0200 [APP/PROC/WEB/0] OUT 	at java.base/java.net.AbstractPlainSocketImpl.connect(Unknown Source) ~[na:na]
      2019-09-14T12:06:10.56+0200 [APP/PROC/WEB/0] OUT 	at java.base/java.net.SocksSocketImpl.connect(Unknown Source) ~[na:na]
      2019-09-14T12:06:10.56+0200 [APP/PROC/WEB/0] OUT 	at java.base/java.net.Socket.connect(Unknown Source) ~[na:na]
      2019-09-14T12:06:10.56+0200 [APP/PROC/WEB/0] OUT 	at com.mongodb.internal.connection.SocketStreamHelper.initialize(SocketStreamHelper.java:64) ~[mongodb-driver-core-3.11.0.jar:na]
      2019-09-14T12:06:10.56+0200 [APP/PROC/WEB/0] OUT 	at com.mongodb.internal.connection.SocketStream.initializeSocket(SocketStream.java:79) ~[mongodb-driver-core-3.11.0.jar:na]
      2019-09-14T12:06:10.56+0200 [APP/PROC/WEB/0] OUT 	at com.mongodb.internal.connection.SocketStream.open(SocketStream.java:65) ~[mongodb-driver-core-3.11.0.jar:na]
      2019-09-14T12:06:10.56+0200 [APP/PROC/WEB/0] OUT 	... 3 common frames omitted
      2019-09-14T12:06:10.65+0200 [APP/PROC/WEB/0] OUT 2019-09-14 10:06:10.655  INFO 6 --- [           main] org.mongodb.driver.cluster               : Cluster created with settings {hosts=[localhost:27017], mode=SINGLE, requiredClusterType=UNKNOWN, serverSelectionTimeout='30000 ms', maxWaitQueueSize=500}
      2019-09-14T12:06:10.73+0200 [APP/PROC/WEB/0] OUT 2019-09-14 10:06:10.730  INFO 6 --- [localhost:27017] org.mongodb.driver.cluster               : Exception in monitor thread while connecting to server localhost:27017
      2019-09-14T12:06:10.73+0200 [APP/PROC/WEB/0] OUT com.mongodb.MongoSocketOpenException: Exception opening socket
      2019-09-14T12:06:10.73+0200 [APP/PROC/WEB/0] OUT 	at com.mongodb.connection.netty.NettyStream$OpenChannelFutureListener.operationComplete(NettyStream.java:410) ~[mongodb-driver-core-3.11.0.jar:na]
      2019-09-14T12:06:10.73+0200 [APP/PROC/WEB/0] OUT 	at com.mongodb.connection.netty.NettyStream$OpenChannelFutureListener.operationComplete(NettyStream.java:385) ~[mongodb-driver-core-3.11.0.jar:na]
      2019-09-14T12:06:10.73+0200 [APP/PROC/WEB/0] OUT 	at io.netty.util.concurrent.DefaultPromise.notifyListener0(DefaultPromise.java:500) ~[netty-common-4.1.39.Final.jar:4.1.39.Final]
      2019-09-14T12:06:10.73+0200 [APP/PROC/WEB/0] OUT 	at io.netty.util.concurrent.DefaultPromise.notifyListeners0(DefaultPromise.java:493) ~[netty-common-4.1.39.Final.jar:4.1.39.Final]
      2019-09-14T12:06:10.73+0200 [APP/PROC/WEB/0] OUT 	at io.netty.util.concurrent.DefaultPromise.notifyListenersNow(DefaultPromise.java:472) ~[netty-common-4.1.39.Final.jar:4.1.39.Final]
      2019-09-14T12:06:10.73+0200 [APP/PROC/WEB/0] OUT 	at io.netty.util.concurrent.DefaultPromise.notifyListeners(DefaultPromise.java:413) ~[netty-common-4.1.39.Final.jar:4.1.39.Final]
      2019-09-14T12:06:10.73+0200 [APP/PROC/WEB/0] OUT 	at io.netty.util.concurrent.DefaultPromise.setValue0(DefaultPromise.java:538) ~[netty-common-4.1.39.Final.jar:4.1.39.Final]
      2019-09-14T12:06:10.73+0200 [APP/PROC/WEB/0] OUT 	at io.netty.util.concurrent.DefaultPromise.setFailure0(DefaultPromise.java:531) ~[netty-common-4.1.39.Final.jar:4.1.39.Final]
      2019-09-14T12:06:10.73+0200 [APP/PROC/WEB/0] OUT 	at io.netty.util.concurrent.DefaultPromise.tryFailure(DefaultPromise.java:111) ~[netty-common-4.1.39.Final.jar:4.1.39.Final]
      2019-09-14T12:06:10.73+0200 [APP/PROC/WEB/0] OUT 	at io.netty.channel.nio.AbstractNioChannel$AbstractNioUnsafe.fulfillConnectPromise(AbstractNioChannel.java:323) ~[netty-transport-4.1.39.Final.jar:4.1.39.Final]
      2019-09-14T12:06:10.73+0200 [APP/PROC/WEB/0] OUT 	at io.netty.channel.nio.AbstractNioChannel$AbstractNioUnsafe.finishConnect(AbstractNioChannel.java:339) ~[netty-transport-4.1.39.Final.jar:4.1.39.Final]
      2019-09-14T12:06:10.73+0200 [APP/PROC/WEB/0] OUT 	at io.netty.channel.nio.NioEventLoop.processSelectedKey(NioEventLoop.java:685) ~[netty-transport-4.1.39.Final.jar:4.1.39.Final]
      2019-09-14T12:06:10.73+0200 [APP/PROC/WEB/0] OUT 	at io.netty.channel.nio.NioEventLoop.processSelectedKeysOptimized(NioEventLoop.java:632) ~[netty-transport-4.1.39.Final.jar:4.1.39.Final]
      2019-09-14T12:06:10.73+0200 [APP/PROC/WEB/0] OUT 	at io.netty.channel.nio.NioEventLoop.processSelectedKeys(NioEventLoop.java:549) ~[netty-transport-4.1.39.Final.jar:4.1.39.Final]
      2019-09-14T12:06:10.73+0200 [APP/PROC/WEB/0] OUT 	at io.netty.channel.nio.NioEventLoop.run(NioEventLoop.java:511) ~[netty-transport-4.1.39.Final.jar:4.1.39.Final]
      2019-09-14T12:06:10.73+0200 [APP/PROC/WEB/0] OUT 	at io.netty.util.concurrent.SingleThreadEventExecutor$5.run(SingleThreadEventExecutor.java:918) ~[netty-common-4.1.39.Final.jar:4.1.39.Final]
      2019-09-14T12:06:10.73+0200 [APP/PROC/WEB/0] OUT 	at io.netty.util.internal.ThreadExecutorMap$2.run(ThreadExecutorMap.java:74) ~[netty-common-4.1.39.Final.jar:4.1.39.Final]
      2019-09-14T12:06:10.73+0200 [APP/PROC/WEB/0] OUT 	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30) ~[netty-common-4.1.39.Final.jar:4.1.39.Final]
      2019-09-14T12:06:10.73+0200 [APP/PROC/WEB/0] OUT 	at java.base/java.lang.Thread.run(Unknown Source) ~[na:na]
      2019-09-14T12:06:10.73+0200 [APP/PROC/WEB/0] OUT Caused by: io.netty.channel.AbstractChannel$AnnotatedConnectException: Connection refused: localhost/127.0.0.1:27017
      2019-09-14T12:06:10.73+0200 [APP/PROC/WEB/0] OUT Caused by: java.net.ConnectException: Connection refused
      2019-09-14T12:06:10.73+0200 [APP/PROC/WEB/0] OUT 	at java.base/sun.nio.ch.SocketChannelImpl.checkConnect(Native Method) ~[na:na]
      2019-09-14T12:06:10.73+0200 [APP/PROC/WEB/0] OUT 	at java.base/sun.nio.ch.SocketChannelImpl.finishConnect(Unknown Source) ~[na:na]
      2019-09-14T12:06:10.73+0200 [APP/PROC/WEB/0] OUT 	at io.netty.channel.socket.nio.NioSocketChannel.doFinishConnect(NioSocketChannel.java:327) ~[netty-transport-4.1.39.Final.jar:4.1.39.Final]
      2019-09-14T12:06:10.73+0200 [APP/PROC/WEB/0] OUT 	at io.netty.channel.nio.AbstractNioChannel$AbstractNioUnsafe.finishConnect(AbstractNioChannel.java:336) ~[netty-transport-4.1.39.Final.jar:4.1.39.Final]
      2019-09-14T12:06:10.73+0200 [APP/PROC/WEB/0] OUT 	at io.netty.channel.nio.NioEventLoop.processSelectedKey(NioEventLoop.java:685) ~[netty-transport-4.1.39.Final.jar:4.1.39.Final]
      2019-09-14T12:06:10.73+0200 [APP/PROC/WEB/0] OUT 	at io.netty.channel.nio.NioEventLoop.processSelectedKeysOptimized(NioEventLoop.java:632) ~[netty-transport-4.1.39.Final.jar:4.1.39.Final]
      2019-09-14T12:06:10.73+0200 [APP/PROC/WEB/0] OUT 	at io.netty.channel.nio.NioEventLoop.processSelectedKeys(NioEventLoop.java:549) ~[netty-transport-4.1.39.Final.jar:4.1.39.Final]
      2019-09-14T12:06:10.73+0200 [APP/PROC/WEB/0] OUT 	at io.netty.channel.nio.NioEventLoop.run(NioEventLoop.java:511) ~[netty-transport-4.1.39.Final.jar:4.1.39.Final]
      2019-09-14T12:06:10.73+0200 [APP/PROC/WEB/0] OUT 	at io.netty.util.concurrent.SingleThreadEventExecutor$5.run(SingleThreadEventExecutor.java:918) ~[netty-common-4.1.39.Final.jar:4.1.39.Final]
      2019-09-14T12:06:10.73+0200 [APP/PROC/WEB/0] OUT 	at io.netty.util.internal.ThreadExecutorMap$2.run(ThreadExecutorMap.java:74) ~[netty-common-4.1.39.Final.jar:4.1.39.Final]
      2019-09-14T12:06:10.73+0200 [APP/PROC/WEB/0] OUT 	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30) ~[netty-common-4.1.39.Final.jar:4.1.39.Final]
      2019-09-14T12:06:10.73+0200 [APP/PROC/WEB/0] OUT 	at java.base/java.lang.Thread.run(Unknown Source) ~[na:na]
      2019-09-14T12:06:10.85+0200 [APP/PROC/WEB/0] OUT 2019-09-14 10:06:10.858  INFO 6 --- [           main] o.s.b.web.embedded.netty.NettyWebServer  : Netty started on port(s): 8080
      2019-09-14T12:06:10.86+0200 [APP/PROC/WEB/0] OUT 2019-09-14 10:06:10.861  INFO 6 --- [           main] c.e.r.ReactiveMongodbDemoApplication     : Started ReactiveMongodbDemoApplication in 3.274715366 seconds (JVM running for 4.138)
      2019-09-14T12:06:10.97+0200 [APP/PROC/WEB/0] OUT 2019-09-14 10:06:10.979  INFO 6 --- [           main] org.mongodb.driver.connection            : Opened connection [connectionId{localValue:6, serverValue:1236046}] to kubernetes-service-node.service.consul:41456
      2019-09-14T12:06:10.99+0200 [APP/PROC/WEB/0] OUT 2019-09-14 10:06:10.996  INFO 6 --- [           main] c.e.r.StartupTimeInserter                : added object={datetime=2019-09-14T10:06:10.862139Z, _id=5d7cbb92dd4c25241dfb6ded}
```
