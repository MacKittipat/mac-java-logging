# Java-Logging

* SLF4J serves as a simple facade or abstraction for various logging frameworks such as logback and log4j.

## Run mac-logback-logstash 

1. Start docker container below

    ```
    docker network create mac-net
    
    docker run -d -p 9200:9200 --network mac-net -e "discovery.type=single-node" --name elasticsearch docker.elastic.co/elasticsearch/elasticsearch:6.4.0
    
    docker run -d -v /home/mac/projects/mac-java-logging/mac-logback-logstash/logstash-pipeline/:/usr/share/logstash/pipeline/ -v /home/mac/projects/mac-java-logging/mac-logback-logstash/logs/:/var/log/mac-logback-logstash/logs/ --network mac-net --name logstash docker.elastic.co/logstash/logstash:6.4.0
    
    docker run -d -p 5601:5601 --network mac-net --name kibana docker.elastic.co/kibana/kibana:6.4.0
    ```
    
2. Run mac-logback-logstash

## Reference 
* https://www.marcobehler.com/guides/a-guide-to-logging-in-java
* https://stackify.com/slf4j-java/
