FROM frolvlad/alpine-oraclejdk8:slim
EXPOSE 9087
ADD cif-detail-1.0.0.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
#ENTRYPOINT exec java $JAVA_OPTS -jar /app.jar