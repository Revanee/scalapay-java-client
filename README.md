# scalapay-java-client

Java Client for the [Scalapay](https://www.scalapay.com/it) API

## Getting started

Create a `ScalaPayConnector` instance using an API URL and KEY (Snadbox credentials are provided in `ScalaPayConstants.java`)
```java
ScalaPayConnector connector = new ScalaPayConnector("https://some.scalapay.api.com", "YOUR_API_KEY");
```

Create a Request using its builder
```java
OrderRequest orderRequest = OrderRequest.builder()
      ...
      .merchantReference("merchantOrder-1234")
      ...
      .build();
```

Execute the request using the appropriate method in the connector
```java
OrderResponse orderResponse = connector.createOrder(orderRequest);
```


## Official documentation

Check out the official documentation to understand the API

[API Reference](https://developers.scalapay.com/reference)

[Docs](https://developers.scalapay.com/docs)
