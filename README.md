## ServiceLoader usage example

https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/ServiceLoader.html

ServiceLoader has the concept of services and service providers:
- *Service* is a set of interfaces and abstract classes packaged in a jar archive (API library).
- *Service provider* is a set of classes that implements or extends the API, packaged in a distinct jar file (Provider library).

Project structure is following:
- `service-loader-runner`. It's the main project module used for running this example. It has dependency of `service`, and, optionally one or more providers.
- `service`. It's an API library. It has no dependencies.
- `service-provider-home`. It's a Provider library. It has dependency of `service`, because this one is its implementation.
- `service-provider-jim`. It's another Provider library. It also has dependency of `service`.

⚠️ Remember to put `META-INF/services/org.example.service.Service` file with full ServiceProvider class name to resources section for each of your ServiceProvider.

ServiceLoader works this way: it is going to load as many ServiceProviders as you include in the classpath.
Play with it this way: remove one or more providers from `service-load-runner/pom.xml` and rerun `Main.java`.