## Compile and Deploy
```
./gradlew assemble
cf push -f manifest.yml
cf logs reactive-mongodb-demo --recent
```

## Logs
```
Retrieving logs for app reactive-mongodb-demo in org mongodb-demo / space demo as user...

   2019-09-14T11:51:56.65+0200 [API/4] OUT Updated app with guid 1f1168ed-a6a8-4d5d-afa9-2d1058977e54 ({"buildpack"=>"java_buildpack", "disk_quota"=>192, "environment_json"=>"[PRIVATE DATA HIDDEN]", "health_check_http_endpoint"=>"", "health_check_type"=>"port", "instances"=>1, "memory"=>768, "name"=>"reactive-mongodb-demo", "space_guid"=>"3db32637-0c33-4237-b8d9-c940a02d2cbb"})
   2019-09-14T11:51:58.12+0200 [API/1] OUT Uploading bits for app with guid 1f1168ed-a6a8-4d5d-afa9-2d1058977e54
   2019-09-14T11:52:05.25+0200 [CELL/0] OUT Cell 3f3b4042-4d59-417a-a0f9-e957966ffa0a stopping instance 2369aad7-5b80-47d7-5487-0c2a
   2019-09-14T11:52:05.26+0200 [API/4] OUT Updated app with guid 1f1168ed-a6a8-4d5d-afa9-2d1058977e54 ({"state"=>"STOPPED"})
   2019-09-14T11:52:06.34+0200 [API/5] OUT Creating build for app with guid 1f1168ed-a6a8-4d5d-afa9-2d1058977e54
   2019-09-14T11:52:06.60+0200 [API/5] OUT Updated app with guid 1f1168ed-a6a8-4d5d-afa9-2d1058977e54 ({"state"=>"STARTED"})
   2019-09-14T11:52:06.72+0200 [STG/0] OUT Downloading java_buildpack...
   2019-09-14T11:52:06.78+0200 [STG/0] OUT Downloaded java_buildpack
   2019-09-14T11:52:06.78+0200 [STG/0] OUT Cell 2d235443-f902-4200-92bf-c756f7cc9860 creating container for instance 44a567fb-f6bc-4d08-bc11-13ab9b3386db
   2019-09-14T11:52:07.36+0200 [STG/0] OUT Cell 2d235443-f902-4200-92bf-c756f7cc9860 successfully created container for instance 44a567fb-f6bc-4d08-bc11-13ab9b3386db
   2019-09-14T11:52:07.49+0200 [STG/0] OUT Downloading app package...
   2019-09-14T11:52:07.49+0200 [STG/0] OUT Downloading build artifacts cache...
   2019-09-14T11:52:09.91+0200 [STG/0] OUT Downloaded app package (23.1M)
   2019-09-14T11:52:10.41+0200 [CELL/SSHD/0] OUT Exit status 0
   2019-09-14T11:52:11.53+0200 [STG/0] OUT Downloaded build artifacts cache (82.6M)
   2019-09-14T11:52:13.01+0200 [APP/PROC/WEB/0] OUT Exit status 143
   2019-09-14T11:52:13.04+0200 [CELL/0] OUT Cell 3f3b4042-4d59-417a-a0f9-e957966ffa0a destroying container for instance 2369aad7-5b80-47d7-5487-0c2a
   2019-09-14T11:52:13.06+0200 [STG/0] OUT [1m[31m----->[0m[22m [1m[34mJava Buildpack[0m[22m [34mv4.20[0m | https://github.com/cloudfoundry/java-buildpack.git#456ce5e
   2019-09-14T11:52:13.18+0200 [PROXY/0] OUT Exit status 137
   2019-09-14T11:52:13.20+0200 [STG/0] OUT [1m[31m----->[0m[22m Downloading [1m[34mJvmkill Agent[0m[22m [34m1.16.0_RELEASE[0m from https://java-buildpack.cloudfoundry.org/jvmkill/bionic/x86_64/jvmkill-1.16.0-RELEASE.so [3m[32m(found in cache)[0m[23m
   2019-09-14T11:52:13.25+0200 [STG/0] OUT [1m[31m----->[0m[22m Downloading [1m[34mOpen Jdk JRE[0m[22m [34m11.0.4_11[0m from https://java-buildpack.cloudfoundry.org/openjdk/bionic/x86_64/openjdk-jre-11.0.4_11-bionic.tar.gz [3m[32m(found in cache)[0m[23m
   2019-09-14T11:52:13.37+0200 [CELL/0] OUT Cell 3f3b4042-4d59-417a-a0f9-e957966ffa0a successfully destroyed container for instance 2369aad7-5b80-47d7-5487-0c2a
   2019-09-14T11:52:14.43+0200 [STG/0] OUT        Expanding Open Jdk JRE to .java-buildpack/open_jdk_jre [3m[32m(1.1s)[0m[23m
   2019-09-14T11:52:14.43+0200 [STG/0] OUT        JVM DNS caching disabled in lieu of BOSH DNS caching
   2019-09-14T11:52:14.47+0200 [STG/0] OUT [1m[31m----->[0m[22m Downloading [1m[34mOpen JDK Like Memory Calculator[0m[22m [34m3.13.0_RELEASE[0m from https://java-buildpack.cloudfoundry.org/memory-calculator/bionic/x86_64/memory-calculator-3.13.0-RELEASE.tar.gz [3m[32m(found in cache)[0m[23m
   2019-09-14T11:52:14.92+0200 [STG/0] OUT        Loaded Classes: 20899, Threads: 250
   2019-09-14T11:52:14.98+0200 [STG/0] OUT [1m[31m----->[0m[22m Downloading [1m[34mClient Certificate Mapper[0m[22m [34m1.8.0_RELEASE[0m from https://java-buildpack.cloudfoundry.org/client-certificate-mapper/client-certificate-mapper-1.8.0-RELEASE.jar [3m[32m(found in cache)[0m[23m
   2019-09-14T11:52:15.01+0200 [STG/0] OUT [1m[31m----->[0m[22m Downloading [1m[34mContainer Security Provider[0m[22m [34m1.16.0_RELEASE[0m from https://java-buildpack.cloudfoundry.org/container-security-provider/container-security-provider-1.16.0-RELEASE.jar [3m[32m(found in cache)[0m[23m
   2019-09-14T11:52:15.05+0200 [STG/0] OUT [1m[31m----->[0m[22m Downloading [1m[34mSpring Auto Reconfiguration[0m[22m [34m2.7.0_RELEASE[0m from https://java-buildpack.cloudfoundry.org/auto-reconfiguration/auto-reconfiguration-2.7.0-RELEASE.jar [3m[32m(found in cache)[0m[23m
   2019-09-14T11:52:29.21+0200 [STG/0] OUT Exit status 0
   2019-09-14T11:52:29.21+0200 [STG/0] OUT Uploading droplet, build artifacts cache...
   2019-09-14T11:52:29.21+0200 [STG/0] OUT Uploading build artifacts cache...
   2019-09-14T11:52:29.21+0200 [STG/0] OUT Uploading droplet...
   2019-09-14T11:52:30.19+0200 [API/0] OUT Creating droplet for app with guid 1f1168ed-a6a8-4d5d-afa9-2d1058977e54
   2019-09-14T11:52:30.68+0200 [STG/0] OUT Uploaded build artifacts cache (82.6M)
   2019-09-14T11:52:38.55+0200 [STG/0] OUT Uploaded droplet (68M)
   2019-09-14T11:52:38.56+0200 [STG/0] OUT Uploading complete
   2019-09-14T11:52:38.97+0200 [STG/0] OUT Cell 2d235443-f902-4200-92bf-c756f7cc9860 stopping instance 44a567fb-f6bc-4d08-bc11-13ab9b3386db
   2019-09-14T11:52:38.97+0200 [STG/0] OUT Cell 2d235443-f902-4200-92bf-c756f7cc9860 destroying container for instance 44a567fb-f6bc-4d08-bc11-13ab9b3386db
   2019-09-14T11:52:39.41+0200 [CELL/0] OUT Cell 51791a8e-4755-44ec-9425-03b4de561d0b creating container for instance 7559fbc0-db6a-448d-666a-db2f
   2019-09-14T11:52:39.45+0200 [STG/0] OUT Cell 2d235443-f902-4200-92bf-c756f7cc9860 successfully destroyed container for instance 44a567fb-f6bc-4d08-bc11-13ab9b3386db
   2019-09-14T11:52:40.00+0200 [CELL/0] OUT Cell 51791a8e-4755-44ec-9425-03b4de561d0b successfully created container for instance 7559fbc0-db6a-448d-666a-db2f
   2019-09-14T11:52:40.18+0200 [CELL/0] OUT Downloading droplet...
   2019-09-14T11:52:42.69+0200 [CELL/0] OUT Downloaded droplet (68M)
   2019-09-14T11:52:42.69+0200 [CELL/0] OUT Starting health monitoring of container
   2019-09-14T11:52:43.10+0200 [APP/PROC/WEB/0] OUT JVM Memory Configuration: -Xmx135017K -Xss1M -XX:ReservedCodeCacheSize=240M -XX:MaxDirectMemorySize=10M -XX:MaxMetaspaceSize=139414K
   2019-09-14T11:52:44.50+0200 [APP/PROC/WEB/0] OUT   .   ____          _            __ _ _
   2019-09-14T11:52:44.50+0200 [APP/PROC/WEB/0] OUT  /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
   2019-09-14T11:52:44.50+0200 [APP/PROC/WEB/0] OUT ( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
   2019-09-14T11:52:44.50+0200 [APP/PROC/WEB/0] OUT  \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
   2019-09-14T11:52:44.50+0200 [APP/PROC/WEB/0] OUT   '  |____| .__|_| |_|_| |_\__, | / / / /
   2019-09-14T11:52:44.50+0200 [APP/PROC/WEB/0] OUT  =========|_|==============|___/=/_/_/_/
   2019-09-14T11:52:44.50+0200 [APP/PROC/WEB/0] OUT  :: Spring Boot ::             (v2.2.0.M6)
   2019-09-14T11:52:44.66+0200 [APP/PROC/WEB/0] OUT 2019-09-14 09:52:44.665  INFO 13 --- [           main] pertySourceApplicationContextInitializer : 'cloud' property source added
   2019-09-14T11:52:44.66+0200 [APP/PROC/WEB/0] OUT 2019-09-14 09:52:44.669  INFO 13 --- [           main] nfigurationApplicationContextInitializer : Reconfiguration enabled
   2019-09-14T11:52:44.67+0200 [APP/PROC/WEB/0] OUT 2019-09-14 09:52:44.678  INFO 13 --- [           main] c.e.r.ReactiveMongodbDemoApplication     : Starting ReactiveMongodbDemoApplication on 7559fbc0-db6a-448d-666a-db2f with PID 13 (/home/vcap/app/BOOT-INF/classes started by vcap in /home/vcap/app)
   2019-09-14T11:52:44.67+0200 [APP/PROC/WEB/0] OUT 2019-09-14 09:52:44.678  INFO 13 --- [           main] c.e.r.ReactiveMongodbDemoApplication     : The following profiles are active: cloud
   2019-09-14T11:52:45.28+0200 [APP/PROC/WEB/0] OUT 2019-09-14 09:52:45.282  INFO 13 --- [           main] .s.d.r.c.RepositoryConfigurationDelegate : Bootstrapping Spring Data repositories in DEFAULT mode.
   2019-09-14T11:52:45.30+0200 [APP/PROC/WEB/0] OUT 2019-09-14 09:52:45.303  INFO 13 --- [           main] .s.d.r.c.RepositoryConfigurationDelegate : Finished Spring Data repository scanning in 15ms. Found 0 repository interfaces.
   2019-09-14T11:52:45.30+0200 [APP/PROC/WEB/0] OUT 2019-09-14 09:52:45.309  INFO 13 --- [           main] .s.d.r.c.RepositoryConfigurationDelegate : Bootstrapping Spring Data repositories in DEFAULT mode.
   2019-09-14T11:52:45.31+0200 [APP/PROC/WEB/0] OUT 2019-09-14 09:52:45.310  INFO 13 --- [           main] .s.d.r.c.RepositoryConfigurationDelegate : Finished Spring Data repository scanning in 1ms. Found 0 repository interfaces.
   2019-09-14T11:52:45.58+0200 [APP/PROC/WEB/0] OUT 2019-09-14 09:52:45.587  INFO 13 --- [           main] ContainerTrustManagerFactory$PKIXFactory : Adding System Trust Manager
   2019-09-14T11:52:45.58+0200 [APP/PROC/WEB/0] OUT 2019-09-14 09:52:45.588  INFO 13 --- [           main] ContainerTrustManagerFactory$PKIXFactory : Adding TrustManager for /etc/ssl/certs/ca-certificates.crt
   2019-09-14T11:52:45.59+0200 [APP/PROC/WEB/0] OUT 2019-09-14 09:52:45.593  INFO 13 --- [tificates.crt-0] org.cloudfoundry.security.FileWatcher    : Start watching /etc/ssl/certs/ca-certificates.crt
   2019-09-14T11:52:45.77+0200 [APP/PROC/WEB/0] OUT 2019-09-14 09:52:45.773  INFO 13 --- [           main] c.s.FileWatchingX509ExtendedTrustManager : Initialized TrustManager for /etc/ssl/certs/ca-certificates.crt
   2019-09-14T11:52:45.77+0200 [APP/PROC/WEB/0] OUT 2019-09-14 09:52:45.777  INFO 13 --- [           main] oundryContainerKeyManagerFactory$SunX509 : Adding System Key Manager
   2019-09-14T11:52:45.77+0200 [APP/PROC/WEB/0] OUT 2019-09-14 09:52:45.777  INFO 13 --- [           main] oundryContainerKeyManagerFactory$SunX509 : Adding Key Manager for /etc/cf-instance-credentials/instance.key and /etc/cf-instance-credentials/instance.crt
   2019-09-14T11:52:45.78+0200 [APP/PROC/WEB/0] OUT 2019-09-14 09:52:45.779  INFO 13 --- [-instance.crt-0] org.cloudfoundry.security.FileWatcher    : Start watching /etc/cf-instance-credentials/instance.crt
   2019-09-14T11:52:45.78+0200 [APP/PROC/WEB/0] OUT 2019-09-14 09:52:45.780  INFO 13 --- [-instance.key-0] org.cloudfoundry.security.FileWatcher    : Start watching /etc/cf-instance-credentials/instance.key
   2019-09-14T11:52:46.01+0200 [APP/PROC/WEB/0] OUT 2019-09-14 09:52:46.015  INFO 13 --- [           main] o.c.s.FileWatchingX509ExtendedKeyManager : Initialized KeyManager for /etc/cf-instance-credentials/instance.key and /etc/cf-instance-credentials/instance.crt
   2019-09-14T11:52:46.09+0200 [APP/PROC/WEB/0] OUT 2019-09-14 09:52:46.090  INFO 13 --- [           main] org.mongodb.driver.cluster               : Cluster created with settings {hosts=[kubernetes-service-node.service.consul:41456, kubernetes-service-node.service.consul:44062, kubernetes-service-node.service.consul:54415], mode=MULTIPLE, requiredClusterType=REPLICA_SET, serverSelectionTimeout='30000 ms', maxWaitQueueSize=500, requiredReplicaSetName='rs_f2d2f1d8-3eda-4822-b60f-e7af750e234d'}
   2019-09-14T11:52:46.09+0200 [APP/PROC/WEB/0] OUT 2019-09-14 09:52:46.091  INFO 13 --- [           main] org.mongodb.driver.cluster               : Adding discovered server kubernetes-service-node.service.consul:41456 to client view of cluster
   2019-09-14T11:52:46.11+0200 [APP/PROC/WEB/0] OUT 2019-09-14 09:52:46.116  INFO 13 --- [           main] org.mongodb.driver.cluster               : Adding discovered server kubernetes-service-node.service.consul:44062 to client view of cluster
   2019-09-14T11:52:46.11+0200 [APP/PROC/WEB/0] OUT 2019-09-14 09:52:46.118  INFO 13 --- [           main] org.mongodb.driver.cluster               : Adding discovered server kubernetes-service-node.service.consul:54415 to client view of cluster
   2019-09-14T11:52:46.13+0200 [APP/PROC/WEB/0] OUT 2019-09-14 09:52:46.131  INFO 13 --- [           main] o.c.reconfiguration.CloudServiceUtils    : 'mongoDbFactory' bean of type with 'org.springframework.data.mongodb.MongoDbFactory' reconfigured with 'mongodb' bean
   2019-09-14T11:52:46.29+0200 [APP/PROC/WEB/0] OUT 2019-09-14 09:52:46.296  INFO 13 --- [ce.consul:41456] org.mongodb.driver.connection            : Opened connection [connectionId{localValue:2, serverValue:1235466}] to kubernetes-service-node.service.consul:41456
   2019-09-14T11:52:46.29+0200 [APP/PROC/WEB/0] OUT 2019-09-14 09:52:46.296  INFO 13 --- [ce.consul:44062] org.mongodb.driver.connection            : Opened connection [connectionId{localValue:3, serverValue:1514261}] to kubernetes-service-node.service.consul:44062
   2019-09-14T11:52:46.29+0200 [APP/PROC/WEB/0] OUT 2019-09-14 09:52:46.298  INFO 13 --- [ce.consul:54415] org.mongodb.driver.connection            : Opened connection [connectionId{localValue:1, serverValue:1223877}] to kubernetes-service-node.service.consul:54415
   2019-09-14T11:52:46.31+0200 [APP/PROC/WEB/0] OUT 2019-09-14 09:52:46.318  INFO 13 --- [ce.consul:54415] org.mongodb.driver.cluster               : Monitor thread successfully connected to server with description ServerDescription{address=kubernetes-service-node.service.consul:54415, type=REPLICA_SET_SECONDARY, state=CONNECTED, ok=true, version=ServerVersion{versionList=[3, 6, 8]}, minWireVersion=0, maxWireVersion=6, maxDocumentSize=16777216, logicalSessionTimeoutMinutes=30, roundTripTimeNanos=3902239, setName='rs_f2d2f1d8-3eda-4822-b60f-e7af750e234d', canonicalAddress=kubernetes-service-node.service.consul:54415, hosts=[kubernetes-service-node.service.consul:44062, kubernetes-service-node.service.consul:54415, kubernetes-service-node.service.consul:41456], passives=[], arbiters=[], primary='kubernetes-service-node.service.consul:41456', tagSet=TagSet{[]}, electionId=null, setVersion=5, lastWriteDate=Sat Sep 14 09:52:38 UTC 2019, lastUpdateTimeNanos=22686667781278}
   2019-09-14T11:52:46.31+0200 [APP/PROC/WEB/0] OUT 2019-09-14 09:52:46.318  INFO 13 --- [ce.consul:44062] org.mongodb.driver.cluster               : Monitor thread successfully connected to server with description ServerDescription{address=kubernetes-service-node.service.consul:44062, type=REPLICA_SET_SECONDARY, state=CONNECTED, ok=true, version=ServerVersion{versionList=[3, 6, 8]}, minWireVersion=0, maxWireVersion=6, maxDocumentSize=16777216, logicalSessionTimeoutMinutes=30, roundTripTimeNanos=4017317, setName='rs_f2d2f1d8-3eda-4822-b60f-e7af750e234d', canonicalAddress=kubernetes-service-node.service.consul:44062, hosts=[kubernetes-service-node.service.consul:44062, kubernetes-service-node.service.consul:54415, kubernetes-service-node.service.consul:41456], passives=[], arbiters=[], primary='kubernetes-service-node.service.consul:41456', tagSet=TagSet{[]}, electionId=null, setVersion=5, lastWriteDate=Sat Sep 14 09:52:38 UTC 2019, lastUpdateTimeNanos=22686665870794}
   2019-09-14T11:52:46.31+0200 [APP/PROC/WEB/0] OUT 2019-09-14 09:52:46.319  INFO 13 --- [ce.consul:41456] org.mongodb.driver.cluster               : Monitor thread successfully connected to server with description ServerDescription{address=kubernetes-service-node.service.consul:41456, type=REPLICA_SET_PRIMARY, state=CONNECTED, ok=true, version=ServerVersion{versionList=[3, 6, 8]}, minWireVersion=0, maxWireVersion=6, maxDocumentSize=16777216, logicalSessionTimeoutMinutes=30, roundTripTimeNanos=6166192, setName='rs_f2d2f1d8-3eda-4822-b60f-e7af750e234d', canonicalAddress=kubernetes-service-node.service.consul:41456, hosts=[kubernetes-service-node.service.consul:44062, kubernetes-service-node.service.consul:54415, kubernetes-service-node.service.consul:41456], passives=[], arbiters=[], primary='kubernetes-service-node.service.consul:41456', tagSet=TagSet{[]}, electionId=7fffffff0000000000000007, setVersion=5, lastWriteDate=Sat Sep 14 09:52:38 UTC 2019, lastUpdateTimeNanos=22686667648762}
   2019-09-14T11:52:46.32+0200 [APP/PROC/WEB/0] OUT 2019-09-14 09:52:46.320  INFO 13 --- [ce.consul:41456] org.mongodb.driver.cluster               : Setting max election id to 7fffffff0000000000000007 from replica set primary kubernetes-service-node.service.consul:41456
   2019-09-14T11:52:46.32+0200 [APP/PROC/WEB/0] OUT 2019-09-14 09:52:46.320  INFO 13 --- [ce.consul:41456] org.mongodb.driver.cluster               : Setting max set version to 5 from replica set primary kubernetes-service-node.service.consul:41456
   2019-09-14T11:52:46.32+0200 [APP/PROC/WEB/0] OUT 2019-09-14 09:52:46.320  INFO 13 --- [ce.consul:41456] org.mongodb.driver.cluster               : Discovered replica set primary kubernetes-service-node.service.consul:41456
   2019-09-14T11:52:46.42+0200 [APP/PROC/WEB/0] OUT 2019-09-14 09:52:46.425  INFO 13 --- [           main] org.mongodb.driver.cluster               : Cluster created with settings {hosts=[localhost:27017], mode=SINGLE, requiredClusterType=UNKNOWN, serverSelectionTimeout='30000 ms', maxWaitQueueSize=500}
   2019-09-14T11:52:46.50+0200 [APP/PROC/WEB/0] OUT 2019-09-14 09:52:46.507  INFO 13 --- [localhost:27017] org.mongodb.driver.cluster               : Exception in monitor thread while connecting to server localhost:27017
   2019-09-14T11:52:46.50+0200 [APP/PROC/WEB/0] OUT com.mongodb.MongoSocketOpenException: Exception opening socket
   2019-09-14T11:52:46.50+0200 [APP/PROC/WEB/0] OUT 	at com.mongodb.connection.netty.NettyStream$OpenChannelFutureListener.operationComplete(NettyStream.java:410) ~[mongodb-driver-core-3.11.0.jar:na]
   2019-09-14T11:52:46.50+0200 [APP/PROC/WEB/0] OUT 	at com.mongodb.connection.netty.NettyStream$OpenChannelFutureListener.operationComplete(NettyStream.java:385) ~[mongodb-driver-core-3.11.0.jar:na]
   2019-09-14T11:52:46.50+0200 [APP/PROC/WEB/0] OUT 	at io.netty.util.concurrent.DefaultPromise.notifyListener0(DefaultPromise.java:500) ~[netty-common-4.1.39.Final.jar:4.1.39.Final]
   2019-09-14T11:52:46.50+0200 [APP/PROC/WEB/0] OUT 	at io.netty.util.concurrent.DefaultPromise.notifyListeners0(DefaultPromise.java:493) ~[netty-common-4.1.39.Final.jar:4.1.39.Final]
   2019-09-14T11:52:46.50+0200 [APP/PROC/WEB/0] OUT 	at io.netty.util.concurrent.DefaultPromise.notifyListenersNow(DefaultPromise.java:472) ~[netty-common-4.1.39.Final.jar:4.1.39.Final]
   2019-09-14T11:52:46.50+0200 [APP/PROC/WEB/0] OUT 	at io.netty.util.concurrent.DefaultPromise.notifyListeners(DefaultPromise.java:413) ~[netty-common-4.1.39.Final.jar:4.1.39.Final]
   2019-09-14T11:52:46.50+0200 [APP/PROC/WEB/0] OUT 	at io.netty.util.concurrent.DefaultPromise.setValue0(DefaultPromise.java:538) ~[netty-common-4.1.39.Final.jar:4.1.39.Final]
   2019-09-14T11:52:46.50+0200 [APP/PROC/WEB/0] OUT 	at io.netty.util.concurrent.DefaultPromise.setFailure0(DefaultPromise.java:531) ~[netty-common-4.1.39.Final.jar:4.1.39.Final]
   2019-09-14T11:52:46.50+0200 [APP/PROC/WEB/0] OUT 	at io.netty.util.concurrent.DefaultPromise.tryFailure(DefaultPromise.java:111) ~[netty-common-4.1.39.Final.jar:4.1.39.Final]
   2019-09-14T11:52:46.50+0200 [APP/PROC/WEB/0] OUT 	at io.netty.channel.nio.AbstractNioChannel$AbstractNioUnsafe.fulfillConnectPromise(AbstractNioChannel.java:323) ~[netty-transport-4.1.39.Final.jar:4.1.39.Final]
   2019-09-14T11:52:46.50+0200 [APP/PROC/WEB/0] OUT 	at io.netty.channel.nio.AbstractNioChannel$AbstractNioUnsafe.finishConnect(AbstractNioChannel.java:339) ~[netty-transport-4.1.39.Final.jar:4.1.39.Final]
   2019-09-14T11:52:46.50+0200 [APP/PROC/WEB/0] OUT 	at io.netty.channel.nio.NioEventLoop.processSelectedKey(NioEventLoop.java:685) ~[netty-transport-4.1.39.Final.jar:4.1.39.Final]
   2019-09-14T11:52:46.50+0200 [APP/PROC/WEB/0] OUT 	at io.netty.channel.nio.NioEventLoop.processSelectedKeysOptimized(NioEventLoop.java:632) ~[netty-transport-4.1.39.Final.jar:4.1.39.Final]
   2019-09-14T11:52:46.50+0200 [APP/PROC/WEB/0] OUT 	at io.netty.channel.nio.NioEventLoop.processSelectedKeys(NioEventLoop.java:549) ~[netty-transport-4.1.39.Final.jar:4.1.39.Final]
   2019-09-14T11:52:46.50+0200 [APP/PROC/WEB/0] OUT 	at io.netty.channel.nio.NioEventLoop.run(NioEventLoop.java:511) ~[netty-transport-4.1.39.Final.jar:4.1.39.Final]
   2019-09-14T11:52:46.50+0200 [APP/PROC/WEB/0] OUT 	at io.netty.util.concurrent.SingleThreadEventExecutor$5.run(SingleThreadEventExecutor.java:918) ~[netty-common-4.1.39.Final.jar:4.1.39.Final]
   2019-09-14T11:52:46.50+0200 [APP/PROC/WEB/0] OUT 	at io.netty.util.internal.ThreadExecutorMap$2.run(ThreadExecutorMap.java:74) ~[netty-common-4.1.39.Final.jar:4.1.39.Final]
   2019-09-14T11:52:46.50+0200 [APP/PROC/WEB/0] OUT 	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30) ~[netty-common-4.1.39.Final.jar:4.1.39.Final]
   2019-09-14T11:52:46.50+0200 [APP/PROC/WEB/0] OUT 	at java.base/java.lang.Thread.run(Unknown Source) ~[na:na]
   2019-09-14T11:52:46.50+0200 [APP/PROC/WEB/0] OUT Caused by: io.netty.channel.AbstractChannel$AnnotatedConnectException: Connection refused: localhost/127.0.0.1:27017
   2019-09-14T11:52:46.50+0200 [APP/PROC/WEB/0] OUT Caused by: java.net.ConnectException: Connection refused
   2019-09-14T11:52:46.50+0200 [APP/PROC/WEB/0] OUT 	at java.base/sun.nio.ch.SocketChannelImpl.checkConnect(Native Method) ~[na:na]
   2019-09-14T11:52:46.50+0200 [APP/PROC/WEB/0] OUT 	at java.base/sun.nio.ch.SocketChannelImpl.finishConnect(Unknown Source) ~[na:na]
   2019-09-14T11:52:46.50+0200 [APP/PROC/WEB/0] OUT 	at io.netty.channel.socket.nio.NioSocketChannel.doFinishConnect(NioSocketChannel.java:327) ~[netty-transport-4.1.39.Final.jar:4.1.39.Final]
   2019-09-14T11:52:46.50+0200 [APP/PROC/WEB/0] OUT 	at io.netty.channel.nio.AbstractNioChannel$AbstractNioUnsafe.finishConnect(AbstractNioChannel.java:336) ~[netty-transport-4.1.39.Final.jar:4.1.39.Final]
   2019-09-14T11:52:46.50+0200 [APP/PROC/WEB/0] OUT 	at io.netty.channel.nio.NioEventLoop.processSelectedKey(NioEventLoop.java:685) ~[netty-transport-4.1.39.Final.jar:4.1.39.Final]
   2019-09-14T11:52:46.50+0200 [APP/PROC/WEB/0] OUT 	at io.netty.channel.nio.NioEventLoop.processSelectedKeysOptimized(NioEventLoop.java:632) ~[netty-transport-4.1.39.Final.jar:4.1.39.Final]
   2019-09-14T11:52:46.50+0200 [APP/PROC/WEB/0] OUT 	at io.netty.channel.nio.NioEventLoop.processSelectedKeys(NioEventLoop.java:549) ~[netty-transport-4.1.39.Final.jar:4.1.39.Final]
   2019-09-14T11:52:46.50+0200 [APP/PROC/WEB/0] OUT 	at io.netty.channel.nio.NioEventLoop.run(NioEventLoop.java:511) ~[netty-transport-4.1.39.Final.jar:4.1.39.Final]
   2019-09-14T11:52:46.50+0200 [APP/PROC/WEB/0] OUT 	at io.netty.util.concurrent.SingleThreadEventExecutor$5.run(SingleThreadEventExecutor.java:918) ~[netty-common-4.1.39.Final.jar:4.1.39.Final]
   2019-09-14T11:52:46.50+0200 [APP/PROC/WEB/0] OUT 	at io.netty.util.internal.ThreadExecutorMap$2.run(ThreadExecutorMap.java:74) ~[netty-common-4.1.39.Final.jar:4.1.39.Final]
   2019-09-14T11:52:46.50+0200 [APP/PROC/WEB/0] OUT 	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30) ~[netty-common-4.1.39.Final.jar:4.1.39.Final]
   2019-09-14T11:52:46.50+0200 [APP/PROC/WEB/0] OUT 	at java.base/java.lang.Thread.run(Unknown Source) ~[na:na]
   2019-09-14T11:52:46.53+0200 [APP/PROC/WEB/0] OUT 2019-09-14 09:52:46.535  WARN 13 --- [           main] o.s.data.convert.CustomConversions       : Registering converter from class java.time.LocalDateTime to class java.time.Instant as reading converter although it doesn't convert from a store-supported type! You might wanna check you annotation setup at the converter implementation.
   2019-09-14T11:52:46.53+0200 [APP/PROC/WEB/0] OUT 2019-09-14 09:52:46.535  WARN 13 --- [           main] o.s.data.convert.CustomConversions       : Registering converter from class java.time.Instant to class java.time.LocalDateTime as reading converter although it doesn't convert from a store-supported type! You might wanna check you annotation setup at the converter implementation.
   2019-09-14T11:52:46.58+0200 [APP/PROC/WEB/0] OUT 2019-09-14 09:52:46.581  WARN 13 --- [           main] o.s.data.convert.CustomConversions       : Registering converter from class java.time.LocalDateTime to class java.time.Instant as reading converter although it doesn't convert from a store-supported type! You might wanna check you annotation setup at the converter implementation.
   2019-09-14T11:52:46.58+0200 [APP/PROC/WEB/0] OUT 2019-09-14 09:52:46.582  WARN 13 --- [           main] o.s.data.convert.CustomConversions       : Registering converter from class java.time.Instant to class java.time.LocalDateTime as reading converter although it doesn't convert from a store-supported type! You might wanna check you annotation setup at the converter implementation.
   2019-09-14T11:52:47.05+0200 [APP/PROC/WEB/0] OUT 2019-09-14 09:52:47.053  INFO 13 --- [           main] org.mongodb.driver.cluster               : Cluster created with settings {hosts=[localhost:27017], mode=SINGLE, requiredClusterType=UNKNOWN, serverSelectionTimeout='30000 ms', maxWaitQueueSize=500}
   2019-09-14T11:52:47.05+0200 [APP/PROC/WEB/0] OUT 2019-09-14 09:52:47.056  INFO 13 --- [localhost:27017] org.mongodb.driver.cluster               : Exception in monitor thread while connecting to server localhost:27017
   2019-09-14T11:52:47.05+0200 [APP/PROC/WEB/0] OUT com.mongodb.MongoSocketOpenException: Exception opening socket
   2019-09-14T11:52:47.05+0200 [APP/PROC/WEB/0] OUT 	at com.mongodb.internal.connection.SocketStream.open(SocketStream.java:70) ~[mongodb-driver-core-3.11.0.jar:na]
   2019-09-14T11:52:47.05+0200 [APP/PROC/WEB/0] OUT 	at com.mongodb.internal.connection.InternalStreamConnection.open(InternalStreamConnection.java:128) ~[mongodb-driver-core-3.11.0.jar:na]
   2019-09-14T11:52:47.05+0200 [APP/PROC/WEB/0] OUT 	at com.mongodb.internal.connection.DefaultServerMonitor$ServerMonitorRunnable.run(DefaultServerMonitor.java:117) ~[mongodb-driver-core-3.11.0.jar:na]
   2019-09-14T11:52:47.05+0200 [APP/PROC/WEB/0] OUT 	at java.base/java.lang.Thread.run(Unknown Source) ~[na:na]
   2019-09-14T11:52:47.05+0200 [APP/PROC/WEB/0] OUT Caused by: java.net.ConnectException: Connection refused (Connection refused)
   2019-09-14T11:52:47.05+0200 [APP/PROC/WEB/0] OUT 	at java.base/java.net.PlainSocketImpl.socketConnect(Native Method) ~[na:na]
   2019-09-14T11:52:47.05+0200 [APP/PROC/WEB/0] OUT 	at java.base/java.net.AbstractPlainSocketImpl.doConnect(Unknown Source) ~[na:na]
   2019-09-14T11:52:47.05+0200 [APP/PROC/WEB/0] OUT 	at java.base/java.net.AbstractPlainSocketImpl.connectToAddress(Unknown Source) ~[na:na]
   2019-09-14T11:52:47.05+0200 [APP/PROC/WEB/0] OUT 	at java.base/java.net.AbstractPlainSocketImpl.connect(Unknown Source) ~[na:na]
   2019-09-14T11:52:47.05+0200 [APP/PROC/WEB/0] OUT 	at java.base/java.net.SocksSocketImpl.connect(Unknown Source) ~[na:na]
   2019-09-14T11:52:47.05+0200 [APP/PROC/WEB/0] OUT 	at java.base/java.net.Socket.connect(Unknown Source) ~[na:na]
   2019-09-14T11:52:47.05+0200 [APP/PROC/WEB/0] OUT 	at com.mongodb.internal.connection.SocketStreamHelper.initialize(SocketStreamHelper.java:64) ~[mongodb-driver-core-3.11.0.jar:na]
   2019-09-14T11:52:47.05+0200 [APP/PROC/WEB/0] OUT 	at com.mongodb.internal.connection.SocketStream.initializeSocket(SocketStream.java:79) ~[mongodb-driver-core-3.11.0.jar:na]
   2019-09-14T11:52:47.05+0200 [APP/PROC/WEB/0] OUT 	at com.mongodb.internal.connection.SocketStream.open(SocketStream.java:65) ~[mongodb-driver-core-3.11.0.jar:na]
   2019-09-14T11:52:47.05+0200 [APP/PROC/WEB/0] OUT 	... 3 common frames omitted
   2019-09-14T11:52:47.23+0200 [APP/PROC/WEB/0] OUT 2019-09-14 09:52:47.236  INFO 13 --- [           main] o.s.b.web.embedded.netty.NettyWebServer  : Netty started on port(s): 8080
   2019-09-14T11:52:47.23+0200 [APP/PROC/WEB/0] OUT 2019-09-14 09:52:47.239  INFO 13 --- [           main] c.e.r.ReactiveMongodbDemoApplication     : Started ReactiveMongodbDemoApplication in 3.235608851 seconds (JVM running for 4.131)
   2019-09-14T11:52:47.30+0200 [APP/PROC/WEB/0] OUT 2019-09-14 09:52:47.304  INFO 13 --- [           main] org.mongodb.driver.cluster               : No server chosen by com.mongodb.async.client.ClientSessionHelper$1@3030836d from cluster description ClusterDescription{type=UNKNOWN, connectionMode=SINGLE, serverDescriptions=[ServerDescription{address=localhost:27017, type=UNKNOWN, state=CONNECTING, exception={com.mongodb.MongoSocketOpenException: Exception opening socket}, caused by {io.netty.channel.AbstractChannel$AnnotatedConnectException: Connection refused: localhost/127.0.0.1:27017}, caused by {java.net.ConnectException: Connection refused}}]}. Waiting for 30000 ms before timing out
   2019-09-14T11:52:47.43+0200 [CELL/0] OUT Container became healthy
```
