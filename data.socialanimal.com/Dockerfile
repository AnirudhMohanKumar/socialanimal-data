FROM tomcat
MAINTAINER anirudhmkumar@gmail.com

ENV CATALINA_HOME /usr/local/tomcat
WORKDIR $CATALINA_HOME

ADD ./target/*.war $CATALINA_HOME/webapps/

EXPOSE 8080
CMD ["catalina.sh", "run"]