FROM ubuntu:20.04

RUN apt-get update \
  && apt-get install -y wget \
  && rm -rf /var/lib/apt/lists/*

RUN apt-get update

RUN apt-get -y install nano

RUN apt install ruby -y

RUN gem install rsolr -v 1.1.2

RUN wget "https://artifacts.elastic.co/downloads/logstash/logstash-8.0.1-linux-x86_64.tar.gz"

RUN tar -xvzf logstash-8.0.1-linux-x86_64.tar.gz

RUN ./logstash-8.0.1/bin/logstash-plugin install logstash-output-solr_http

RUN rm -rf ./logstash-8.0.1/vendor/bundle/jruby/2.5.0/gems/logstash-output-solr_http-3.0.5/lib/logstash/outputs/solr_http.rb

ADD solr_http.rb ./logstash-8.0.1/vendor/bundle/jruby/2.5.0/gems/logstash-output-solr_http-3.0.5/lib/logstash/outputs/

RUN mkdir APPLICATION-LOG

ADD logstash_solr.conf ./logstash-8.0.1/bin/

CMD ["./logstash-8.0.1/bin/logstash","-f","./logstash-8.0.1/bin/logstash_solr.conf"]






