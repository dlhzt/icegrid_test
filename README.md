# icegrid_test
by boco zt

在网上找到的一个icegrid测试工程，备份到此，方便后面跟踪和记忆。
icegrid总体初步感想 
1、搭建icegrid环境，A 注册中心，执行注册命令icegridregistry --Ice.Config=registry.cfg   
2 启动节点配置，icegridnode --Ice.Config=node1.cfg
3 部署节点服务 ，icegridadmin --Ice.Config=node1.cfg 进入node1管理界面。application add app.xml   或  application update app.xml
其中app.xml说明了节点需要运行的程序类型、位置、发布的ice接口类等信息
4 icegridgui是一个图形化界面
