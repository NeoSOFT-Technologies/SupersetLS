## RUN THE CONTAINERS - SLS-Docker

1. Run SAAS docker-compose. This project is dependent on SAAS for storing data in Solr. SAAS - https://github.com/NeoSOFT-Technologies/search-as-service/tree/main/docker

2. Solr - http://localhost:8983/solr/

3. Create a collection in Solr with the name - applicationLogs

4. Change the volume in "docker-compose.yml" (Inside SLS-Docker) in "solr-logstash-superset-container" to point towards the directory where your aplication is storing the logs.
> Default - "../sample-spring-boot-logs-generating-application/logs/"

5. Run SLS-Docker using - docker-compose up

6. SupeSet - http://localhost:8088/

7. Click "Add Database" in SuperSet & add the below connection URL to connect Solr & SuperSet
>solr://solr1-container:8983/solr/applicationLogs

8. Remove default keyword from database name (Replace ID [1 in this case] with the new chart ID)
http://localhost:8088/tablemodelview/edit/1

9. Create Charts & Dashboards using SuperSet
