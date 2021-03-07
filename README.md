1. 在Foo的构造器中对注入的Bar使用@Lazy注解。
2. 使用Setter注入替换构造器注入。
3. 在Foo中使用@PostContruct来设置依赖关系。