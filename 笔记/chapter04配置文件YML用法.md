



# 一、基本语法

- k的冒号与v之间需要有空格
- 大小写敏感
- 使用缩减表示层级关系，缩进只能用空格，不能用tab。缩进的空格数不重要，只要相同层级的元素左对齐即可
- #表示注释
- 字符串无需加引号，如果加了会被当做值的一部分而不会被转义
- 注意：properties与yml同时存在，properties优先生效

# 二、数据格式

## ①表示单个值字面量

```
💌：即boolean，string，int....

🧡：k: v

注意：string类型值可以加单引号，双引号，或者不加。

😙：单引号：会将\n转义字符当作字符串输出
😙：双引号：会将\n转义字符当作换行符输出
助记：与Java一样，Java字符串中的\n是换行符
```



## ②表示对象，map，set，Object，hash

```
🤍行内写法：k: {k1:v1,k2:v2}

🤍k:
	k1: v1
	k2: v2
```



## ③表示数组，list，queue

```
😑行内写法：k: [v1,v2,v3]

😑k:
	- v1
	- v2
	- v3
```



## ④例子

```java
@Component
@ConfigurationProperties(prefix = "person")
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Person {
    private String username;
    private Boolean boss;
    private Date birth;
    private Integer age;
    private Pet pet;
    private String[] interfaces;
    private List<String> animal;
    private Map<String,Object> score;
    private Set<Double> salaries;
    private Map<String,List<Pet>> allPets;
}



@Data
@ToString
public class Pet {
    private String petName;
    private int age;
}

```



```yml
person:
 username: Yuno
 boss: false
 birth: 2020/12/04
 age: 18
 pet:
  petName: 大黄
  age: 4
 interfaces:
  - i1
  - i2
  - i3
 animal: [a1,a2,a3]
 score:
  one: 1
  two: 2
 salaries: [2.4,43.5,5345.4]
 allPets:
   list1:
     - petName: 大黄4
       age: 2
     - petName: 大黄5
       age: 12
   list2:
     - {petName: 小黄,age: 2}
     - {petName: 小黄3,age: 2}

```

# 三、配置处理器

```xml
SpringBoot提供的类在yml文件中都有提示，如果需要自定义的类也有提示就要使用配置处理器。导入依赖，重启服务器，配置处理器生效


//配置处理器的依赖
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-configuration-processor</artifactId>
    <optional>true</optional>
</dependency>


//因为配置处理器与业务无关，所以开发完成后建议删除该依赖或者使用打包的排除法不加载该依赖，避免启动时加载不需要的无用类
<plugin>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-maven-plugin</artifactId>
    <configuration>
        <excludes>
            <exclude>
                <groupId>org.springframework.boot</groupId>
                <artifactId>spring-boot-configuration-processor</artifactId>
            </exclude>
        </excludes>
    </configuration>
</plugin>

SpringBoot2.5之后不用写，自动排除


```

