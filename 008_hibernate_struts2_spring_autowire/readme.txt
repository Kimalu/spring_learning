���Ƚ�struts2��hibernate�ȼ��ɺã�����006_hibernate����struts2�����Ŀ��Ȼ��struts2���ĵ�guides�в��Ҽ���spring�ķ���
����spring�Ĳ��裺
1.����spring�����jar��
2.��web.xml��������������
	<listener>
		<listener-class>org.springframework.web.context.ContextLoaderListener</listener-class>
	</listener>
3.��spring�������ļ�����WEB��INF���ļ����£�����spring����Ҫ��spring�������ļ������κζ������ã����ļ�ֻ����spring���������
4.��struts.xml�����ļ��м�����������
	<constant name="struts.objectFactory" value="org.apache.struts2.spring.StrutsSpringObjectFactory" />
5.struts2-spring-plugin-2.x.x.jar���뵽��Ŀ��
6.�����ѽ�hibernate��һЩ�������������spring�У�����hibernate.cfg.xml����ɾ��