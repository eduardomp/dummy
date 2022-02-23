# Dummy app with datadog APM container agent

Just a test app created using Spring Boot and java 8 to test datadog container agent.

## App endpoint to stress CPU/Memory and collect some metrics

GET http://localhost:8080/dummy -> returns a String with Fibonacci sequence

```shell
curl -X GET http://localhost:8080/dummy
```

# Docker compose with datadog APM container agent

To test using docker-compose follow the steps:

1. install docker https://docs.docker.com/get-docker/
2. install docker-compose https://docs.docker.com/compose/install/
3. Create a datadog account https://www.datadoghq.com/ 
4. Create a api key and change lines 14 and 15 of file [docker-compose.yml](docker-compose.yml) 
5. run the docker-compose command:
```shell
docker-compose up
```

6. Access your datadog account, see the "events" section and search for the dashboard link (or create a new dashboard).
7. Access the app endpoint: http://localhost:8080/dummy 
8. Refresh the page to stress the application and see the metrics collected in datadog dashboard


