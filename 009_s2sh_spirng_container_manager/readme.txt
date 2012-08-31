首先将struts2和hibernate先集成好，就像006_hibernate——struts2这个项目，然后到struts2的文档guides中查找集成spring的方法
集成spring的步骤：
1.拷入spring的相关jar包
2.在web.xml中增加如下配置
	<listener>
		<listener-class>org.springframework.web.context.ContextLoaderListener</listener-class>
	</listener>
3.将spring的配置文件放入WEB—INF的文件夹下，集成spring不需要在spring的配置文件中做任何多余配置，该文件只负责spring的相关配置
4.在struts.xml配置文件中加入如下配置
	<constant name="struts.objectFactory" value="org.apache.struts2.spring.StrutsSpringObjectFactory" />
5.struts2-spring-plugin-2.x.x.jar拷入到项目中
6.由于已将hibernate的一些相关配置配置在spring中，所以hibernate.cfg.xml可以删掉