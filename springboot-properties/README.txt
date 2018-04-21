<!-- springboot加载配置文件并注入组件的总结 -->
-------------------------- proerties文件和yml文件区别 -----------------------------------
1.properties文件:

	xxxx.xxxx.key=value格式,需要注意文件编码问题;
	
	可通过@ConfigurationProperties和@PropertySource两种方式配置组件;
	
2.yml文件:

	key: value格式,-符号代表多个这样的属性,java组件中用list接收,注意value前面一定要有空格,需要注意文件编码问题;
	
	可通过@ConfigurationProperties和@PropertySource两种方式配置组件;
	
3.application.properties：

	这个文件是项目中config文件夹下优先级最高的配置,有多个配置文件时只会加载它。
	
	而在其中可以spring.profiles.active=dev,prod指定项目运行环境的配置(多个环境，如测试，开发，发布)
	
	这样就可以让spring先加载application.properties再加载项目运行环境的配置