Feature: View Hello World
Scenario: Sucessfull displaying Hello World
Given the HelloWorlsAWS application is runing
When acivating URL "http://helloworldaws-dev.eu-north-1.elasticbeanstalk.com:80/hello"
Then the HelloWorlsAWS application displays "Hello AWS Elastic Beanstalk! From host: ip-172-31-6-15.eu-north-1.compute.internal/172.31.6.15"