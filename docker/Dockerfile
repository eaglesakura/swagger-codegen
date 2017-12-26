FROM ubuntu:16.04
MAINTAINER @eaglesakura

ENV _JAVA_OPTIONS="-Dfile.encoding=UTF-8" \
    JAVA_HOME="/usr/lib/jvm/java-8-openjdk-amd64/" \
    PATH="/root/tools/groovy-2.4.9/bin:/root/tools/go/bin:/root/tools/gopath/bin:$PATH" \
    GOROOT="/root/tools/go" \
    GOPATH="/root/tools/gopath" \
    GOBIN="/root/tools/gopath/bin"

RUN  dpkg --add-architecture i386 \
  && apt-get update \
  && apt-get install -y wget unzip eclipse \
  && mkdir $HOME/tools \
  && cd $HOME/tools \
  && wget https://dl.bintray.com/groovy/maven/apache-groovy-binary-2.4.9.zip -O groovy.zip \
  && unzip groovy.zip \
  && mkdir $HOME/tools/gopath \
  && mkdir $HOME/tools/gopath/bin \
  && wget https://storage.googleapis.com/golang/go1.8.linux-amd64.tar.gz -O $HOME/golang.temp.tar.gz \
  && tar xovfz "$HOME/golang.temp.tar.gz" -C "$HOME/tools/" > /dev/null \
  && rm $HOME/golang.temp.tar.gz


# build maven cache
RUN  echo '@GrabResolver(name = "eaglesakura", root = "https://dl.bintray.com/eaglesakura/maven/")' > /root/sync.groovy \
  && echo "@Grab(\"com.eaglesakura:lightweight-swagger-codegen:${SWAGGER_CODEGEN_VERSION}\")" >> /root/sync.groovy \
  && echo 'import java.lang.Object' >> /root/sync.groovy \
  && echo 'println "sync maven"' >> /root/sync.groovy \
  && groovy /root/sync.groovy \
  && rm /root/sync.groovy

# add scripts
ADD eclipse.prefs /root
ADD java-formatter.sh /root
ADD generate.groovy /usr/local/bin
RUN chmod +x /root/java-formatter.sh