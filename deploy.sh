mvn clean
mvn compile
mvn war:war
./glassfish5/bin/asadmin undeploy /WebServiceGlass-1.0-SNAPSHOT
./glassfish5/bin/asadmin deploy target/WebServiceGlass-1.0-SNAPSHOT.war
