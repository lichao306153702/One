#       **注意**
####    实现热部署问题，两种方式
#####1：springloaded 方式
    maven 插件 添加springloaded依赖， 注意如果Maven 下载不下来jar ,可以先放在 
     上边 依赖里面进行下载jar ，然后再把配置放在 插件的依赖里面  貌似只能发加载  页面
#####
                <plugin>
                    <groupId>org.springframework.boot</groupId>
                    <artifactId>spring-boot-maven-plugin</artifactId>
                    <dependencies>
                        <dependency>
                            <groupId>org.springframework</groupId>
                            <artifactId>springloaded</artifactId>
                            <version>1.2.6.RELEASE</version>
                            <scope>provided</scope>
                        </dependency>
                    </dependencies>
                </plugin>
##### 2: spring-boot-devtools 方式
       idea 的配置 设置以下两项（第一项如已设置直接设置第二项）
    
      　　1） “File” -> “Settings” -> “Build,Execution,Deplyment” -> “Compiler”，选中打勾 “Build project automatically” 。
      
      　　2） 组合键：“Shift+Ctrl+Alt+/” ，选择 “Registry” ，选中打勾 “compiler.automake.allow.when.app.running” 。
       再去pom 文件修改配置
       添加依赖
         <dependency>
               <groupId>org.springframework.boot</groupId>
               <artifactId>spring-boot-devtools</artifactId>
               <optional>true</optional>
           </dependency>
###### 
    需要修改 idea 的配置  如2  的设置
    但是 如果 不添加依赖的话  只能刷新页面    添加依赖之后  会重启代码  热部署
     
##swagger2 的使用
两种方式
### 1  ：tomcat 的方式，，将依赖添加到pom.xml文件
然后将项目 打成 war包，用外在的tomcat 方式启动，，然后 访问 http://localhost:port/项目名/swagger-ui.html
### 2  :内置的tomcat 的方式启动，将swagger 整合到 springboot里面   需要设置映射Mapping到swagger-ui.html这个静态资源文件
##
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/js/**").addResourceLocations("classpath:/static/js/");
        registry.addResourceHandler("swagger-ui.html")
                .addResourceLocations("classpath:/META-INF/resources/");
        registry.addResourceHandler("/webjars/**")
                .addResourceLocations("classpath:/META-INF/resources/webjars/");
    }  
####
    说明   addResourceHandler 设置映射路径  addResourceLocations 设置实际资源路径