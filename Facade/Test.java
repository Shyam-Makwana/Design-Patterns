package Facade;

/*
 * @author Shyam Makwana
 */

public class Test {
    public static void main(String[] args) {
        RepairShop repairShop=new RepairShop();
        IphoneMobile sp1=new IphoneMobile();
        sp1.setName("Iphone 12 Pro Max");
        sp1.setStatus("Working");
        AndriodMobile dw1=new AndriodMobile();
        dw1.setName("Oneplus 8 Pro");
        dw1.setStatus("Working");
        System.out.println("Using devices");
        System.out.println("Devices' Status:");
        System.out.println(sp1.getName()+" is "+sp1.getStatus());
        System.out.println(dw1.getName()+" is "+dw1.getStatus());
        System.out.println("\nDevices got problem");
        sp1.setStatus("Not Working");
        dw1.setStatus("Not Working");
        System.out.println("Devices' Status:");
        System.out.println(sp1.getName()+" is "+sp1.getStatus());
        System.out.println(dw1.getName()+" is "+dw1.getStatus());
        System.out.println("\nDevices sent for repairing");
        repairShop.repairSmartPhone(sp1);
        repairShop.repairDigitalWatch(dw1);
        System.out.println("\nDevices' Status after repairing");
        System.out.println(sp1.getName()+" is "+sp1.getStatus());
        System.out.println(dw1.getName()+" is "+dw1.getStatus());
    }
}
