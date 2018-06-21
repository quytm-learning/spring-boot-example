# Spring Boot introduction

## Environments

- Java
- Maven
- Intellij

## Build a simple Application use Spring Boot

Đầu tiên, bắt đầu với một một ứng dụng đơn giản sử dụng Spring Boot

### Create new project

Bước đầu tiên là tạo một Maven project

Thêm vào trong đó parent cho nó

```
    <parent>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-parent</artifactId>
        <version>1.5.4.RELEASE</version>
    </parent>
```

Tiếp theo là dependences:

```
    <dependencies>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-web</artifactId>
        </dependency>
    </dependencies>
```

Với ứng dụng đơn giản thì bấy nhiêu thôi đây là đủ rồi.

### MainApp

Cần có một class làm MainApp để bootstrap ứng dụng.

Trong bước này, ta tạo một class sử dụng Annotation là `@SpringBootApplication`

Trong `main()` của nó cần có run ứng dụng lên

```
@SpringBootApplication
public class MyApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyApplication.class, args);
    }

}
```

Run main, ứng dụng đã chạy mặc định với cổng `8080`

```
// log khi chạy app
...
2018-06-21 14:56:47.312  INFO 4984 --- [           main] s.b.c.e.t.TomcatEmbeddedServletContainer : Tomcat started on port(s): 8080 (http)
2018-06-21 14:56:47.315  INFO 4984 --- [           main] com.higgs.tmq.MyApplication              : Started MyApplication in 1.857 seconds (JVM running for 2.46)
...
```


## REST Controller

Với simple app trước đó, trình duyệt báo lỗi thiếu /error

Trong phần này ta sẽ tạo ra Controller để điều hướng các request url

Cần tạo ra một class, đánh dấu nó với annotation `@RestController`

Sử dụng `@RequestMapping` để định mapping request url tới method mình xử lý

```
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String sayHi() {
        return "Hi";
    }

}
```


## How Spring MVC works

Trước tiên, ta cần hiểu được mô hình MVC là gì đã

...

## Business Service

Controller như trước đó chỉ có trách nhiệm nhận các request được mapping tới
chứ nó không xử lý logic, cần phải tạo ra Service để xử lý các business
trong ứng dụng.

```
@Service
public class TopicService {

    public List<Topic> getAllTopics() {
        return this.mockTopics;
    }

}
```

## `application.properties` file

Various properties can be specified inside your application.properties file,
inside your application.yml file, or as command line switches.
This appendix provides a list of common Spring Boot properties and
references to the underlying classes that consume them.

Nó định nghĩa một số properties trong Spring Boot

Link tham khảo: [application.properties in Spring Boot](https://docs.spring.io/spring-boot/docs/current/reference/html/common-application-properties.html)


