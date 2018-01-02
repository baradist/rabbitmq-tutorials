In order not install RabbitMQ I use a docker container. By the following command:
docker run -d --hostname my-rabbit --name rabbit -p 5672:5672 rabbitmq:3-alpine