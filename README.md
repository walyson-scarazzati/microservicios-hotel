**First project from Curso de microservicios con Spring Boot y Spring Cloud - La Tecnología Avanza - Udemy**
https://www.udemy.com/course/curso-de-microservicios-con-spring-boot-y-spring-cloud

**Second project:** https://github.com/walyson-scarazzati/microserviciosProductOrder/tree/master

**Third project:** https://github.com/walyson-scarazzati/producto-service-cqrs.git 

![image](https://github.com/user-attachments/assets/6c3d220c-f2f4-4574-bf10-1afbde539821)

<h1>Running docker container</h1>

-  Run docker ```docker-compose up -d``` to create mysql 8.0, postgres, mongodb

![image](https://github.com/user-attachments/assets/31e168b2-f977-45da-bcc6-b8e65ca11ce2)

<h1>Technologies</h1>
<ul>
  <li>Spring Boot</li>
  <li>Microservices</li>
  <li>RestTemplate</li>
  <li>OpenFeign</li>
  <li>Load Balancer</li>
  <li>Eureka Server and Client</li>
  <li>Spring Config Server</li>
  <li>Circuit Breaker with Resilience4j</li>
  <li>API Gateway</li>
  <li>JWT for authentication</li>
  <li>Database Postgres,MySQL, Mongo</li>
</ul>

<h1>Running the Services</h1>
<ul>
  <li>Start the Registry Service: Run the RegistryServiceApplication.</li>
  <li>Start the API Gateway: Run the ApiGatewayApplication.</li>
  <li>Start the Config Server: Run the ConfigServerApplication.</li>
  <li>Start the Auth Service: Run the AuthServiceApplication.</li>
  <li>Start Calificacion, Hotel, and Usuario Services: Run each service's main application class.</li>
</ul>

![image](https://github.com/user-attachments/assets/3977ad36-c1b9-459a-a605-5865c564af64)

<h1>Testing with Postman</h1>
Se usuário non es administrador no es possível crear usuário:
1-crear usuario

 ![image](https://github.com/user-attachments/assets/cde9027f-5a3e-465f-868d-9c2bdd495641)
 
2-hacer login:
![image](https://github.com/user-attachments/assets/16126d2d-6f53-4827-a7a4-0707deb2fd36)

 
3-Quando pega o token para tentar crear:
![image](https://github.com/user-attachments/assets/e21e9075-685e-40bb-9571-70ed53d03e23)

 
4-Alora se usuário es admin:
![image](https://github.com/user-attachments/assets/388895f8-f709-43a5-a266-984d52092c51)

 
5-Pero otro usuário pode hacer otras consultas:
![image](https://github.com/user-attachments/assets/a8736365-8ba8-4723-89b5-29e11ce5fcd0)


