package test;

import Ice.Object;
import test.PrinterI;

public class Server extends Ice.Application {

    public int run(String[] args) {
        //������ΪSimplePrinterAdapter����������       
        Ice.ObjectAdapter adapter = communicator().createObjectAdapter("PrinterAdapter");
        //ʵ����һ��PrinterI����ΪPrinter�ӿڴ���һ���������
        Ice.Object object = (Object) new PrinterI();
        //������Ԫ���ӵ��������У������������ָ������ΪSimplePrinter������������Ψһȷ��һ������Ԫ
        adapter.add(object, Ice.Util.stringToIdentity("SimplePrinter"));
        //�������������������ĺô��ǿ��Եȵ�������Դ��λ���ٴ���
        adapter.activate();
        //�÷������˳�֮ǰ��һֱ����������ļ���
        communicator().waitForShutdown();
        return 0;
    }
    public static void main(String[] args) {
//        Server app = new Server();
//        System.out.println("�������Ѿ�������");
//        System.exit(app.main("Server", args));
        
    	Server app = new Server();  
         String conf = "pserver.cfg";    
         int status = app.main("Server", args,conf);  
         System.exit(status);  
        
    }
}
