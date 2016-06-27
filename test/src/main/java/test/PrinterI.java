package test;

public class PrinterI extends Demo._PrinterDisp {
    public String printString(String s, Ice.Current current) {
        System.out.println(s);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "¥Ú”°ÕÍ≥…";
    }
}