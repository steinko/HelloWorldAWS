FROM  adoptopenjdk/openjdk15
COPY ./build/libs/helloworldaws.jar  /app/helloworldaws.jar
WORKDIR /app
ENTRYPOINT ["java"]
CMD ["-jar", "helloworldaws.jar "
EXPOSE 8080