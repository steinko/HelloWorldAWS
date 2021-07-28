Feature: View Hello World
Scenario: Sucessfull displaying Hello World
Given the HelloWorlsAWS application is runing
When acivating URL "http://helloworlddocker-env.eba-y2u4u3mw.eu-north-1.elasticbeanstalk.com/hello"
Then the HelloWorlsAWS application displays "Hello AWS Elastic Beanstalk! From host: 642ae638cad3/172.17.0.2"