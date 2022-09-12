# AzureEventHubDemo
AzureEventHubDemo
I have completed the task assigned :-
Create a API from springboot and connect with Azure EventHub , then try to publish and subscribe message from the same -  Avinash and Rajiv

I have created EventHub Namespace & event hub along with storage account in AZURE CLOUD

and have created a spring boot application using Azure SDK which has a Producer which will submit a message to AZURE EventHub and has deployed the application to Azure Container Instance ( below - URL )

http://eventhub.d0ftbhenbcdah2bb.eastus.azurecontainer.io:8080/messages?message=Testing%20aci%20eventhub%20on%20Azure%20Cloud


Try
 calling this POST method URL using postman, it will return a string which has been published as message to eventhub.


We have a consumer in application using reactor framework which consumes the message
 from EventHub and logs it to Console.


@Note :- ( If you need the code , send me your personal email id )


Thanks
Rajiv Sinha

https://docs.microsoft.com/en-us/azure/developer/java/spring-framework/configure-spring-cloud-stream-binder-java-app-azure-event-hub
