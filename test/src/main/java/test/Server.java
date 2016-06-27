package test;

import Ice.Object;
import test.PrinterI;

public class Server extends Ice.Application {

    public int run(String[] args) {
        //创建名为SimplePrinterAdapter的适配器，       
        Ice.ObjectAdapter adapter = communicator().createObjectAdapter("PrinterAdapter");
        //实例化一个PrinterI对象，为Printer接口创建一个服务对象
        Ice.Object object = (Object) new PrinterI();
        //将服务单元增加到适配器中，并给服务对象指定名称为SimplePrinter，该名称用于唯一确定一个服务单元
        adapter.add(object, Ice.Util.stringToIdentity("SimplePrinter"));
        //激活适配器，这样做的好处是可以等到所有资源就位后再触发
        adapter.activate();
        //让服务在退出之前，一直持续对请求的监听
        communicator().waitForShutdown();
        return 0;
    }
    public static void main(String[] args) {
//        Server app = new Server();
//        System.out.println("服务器已经启动！");
//        System.exit(app.main("Server", args));
        
    	Server app = new Server();  
         String conf = "pserver.cfg";    
         int status = app.main("Server", args,conf);  
         System.exit(status);  
        
    }
}
