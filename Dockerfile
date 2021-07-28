FROM  adoptopenjdk/openjdk15
COPY ./build/libs/helloworldaws.jar ./
ENTRYPOINT ["java"]
CMD ["-jar", "/helloworldaws.jar"]
EXPOSE 5000