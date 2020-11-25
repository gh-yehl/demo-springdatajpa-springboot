
Demo Project - Integrate Spring Boot JPA and Alibaba Druid

1 - Integrate Ali-Druid
    1) 依赖
            <!-- https://mvnrepository.com/artifact/com.alibaba/druid-spring-boot-starter -->
            <dependency>
                <groupId>com.alibaba</groupId>
                <artifactId>druid-spring-boot-starter</artifactId>
                <version>1.1.16</version>
            </dependency>
    2) 配置
        a: DruidConfig.Java
        b: Properties file
        
2 - Spring Boot JPA
    1) 依赖
            <dependency>
                <groupId>org.springframework.boot</groupId>
                <artifactId>spring-boot-starter</artifactId>
            </dependency>
    
            <dependency>
                <groupId>org.springframework.boot</groupId>
                <artifactId>spring-boot-starter-web</artifactId>
            </dependency>
    
            <dependency>
                <groupId>org.springframework.boot</groupId>
                <artifactId>spring-boot-starter-data-jpa</artifactId>
            </dependency>
    
            <!-- using my sql DB -->
            <dependency>
                <groupId>mysql</groupId>
                <artifactId>mysql-connector-java</artifactId>
                <version>8.0.17</version>
            </dependency>
    2) 配置
        a: Create Entity Object - ORM 
        b: Create Repository <b>Interface</b> extending JpaRepository
        c: Create Service, which @Autowired Repository Interface for fetching data
        d: Create Controller @RestController annotation, which @Autowired Service
    
