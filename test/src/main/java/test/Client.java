package test;


public class Client extends Ice.Application {
    
    public int run(String[] args) {
        //��ȡPrinter��Զ�̴�������ʹ�õ�stringToProxy��ʽ
        Ice.ObjectPrx base = communicator().stringToProxy("SimplePrinter");
        //ͨ��checkedCast����ת������ȡPrinter�ӿڵ�Զ�̣���ͬʱ�����ݴ�������ƻ�ȡ�ķ���Ԫ�Ƿ�Printer�Ĵ���ӿڣ���������򷵻�null����
        Demo.PrinterPrx printer = Demo.PrinterPrxHelper.checkedCast(base);
        if (printer == null) throw new Error("Invalid proxy");
        //��Hello World��������ˣ��÷���˴�ӡ��������Ϊ����������ջ��ڷ������ִ��
        for(int i = 0;i<10;i++){
            String ret = printer.printString("Hello World!����");
            System.out.println(ret);
        }
        return 0;
    }

    public static void main(String[] args) {
        Client app = new Client();
        System.exit(app.main("Server", args,"client.conf"));
    }
}
