#jpa的支持

##1 添加依赖
      <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-data-jpa</artifactId>
      </dependency>
##2 启动  jpa扫描配置 @EnableJpaRepositories("com.dao")   
##3 dao  继承 extends JpaRepository<User, Long>

##4 entity 实体 需要使用 @Entity 注解 以及，主键注解 @ID @GeneratedValue