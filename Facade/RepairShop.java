package Facade;

/*
 * @author Shyam Makwana
 */

public class RepairShop {
    private RepairGadget iphoneMobileRepairer;
    private RepairGadget andriodMobileRepairer;
    public RepairShop(){
        iphoneMobileRepairer=new IphoneMobileRepairer();
        andriodMobileRepairer=new AndriodMobileRepairer();
    }
    public void repairSmartPhone(IphoneMobile smartPhone){
        iphoneMobileRepairer.repair(smartPhone);
    }
    public void repairDigitalWatch(AndriodMobile digitalWatch){
        andriodMobileRepairer.repair(digitalWatch);
    }
}
