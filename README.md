# microservices - LIST of countries and states
address-service-api is a REST API which supports CRUD operations such as "api/address/createAddress" and "api/address/getAddress" . Port is configured 9002 which can be changed in application.yml
country-service-api is a REST API which supports CRUD operations such as "api/createCountry" and "api/getCountries" . Port is configured 9001 which can be changed in application.yml
service-registry is also a spring boot applicaiton which provide service discovery using the eureka client and server registry. It gives a dashboard which will show the running service
spring-cloud-api-gateway is API gateway built with spring cloud gateway and supports the single point access of addess and country api
