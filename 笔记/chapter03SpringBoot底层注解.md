# 一、组件注册

## ①@Configuration

## ②@Bean、@Component相关

## ③@Import

## ④@Conditional

```
Spring高级注解的笔记中有讲解。略
```

# 二、配置文件的数据绑定

## ①解释

```
读取properties配置文件中的数据，加载到Bean对象中就是配置绑定
```



## ②@ConfigurationProperties

![](ConfigurationProperties的用法.jpg)

![](ConfigurationProperties的用法1.jpg)

```
注意：Person需要交给Spring容器管理
```



## ③@EnableConfigurationProperties(xx.class)

![](EnableConfigurationProperties的用法1.jpg)

![](EnableConfigurationProperties的用法2.jpg)

```
有些时候我们需要使用的对象并没有源码，而是第三方组件，它只有一个ConfigurationProperties注解，没有@Component。并不在容器中，
这个时候我们需要把它交给容器管理就要用到@EnableConfigurationProperties注解

注意：@EnableConfigurationProperties只能用在配置类上

```

