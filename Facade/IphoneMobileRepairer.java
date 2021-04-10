package Facade;

/*
 * @author Shyam Makwana
 */

public class IphoneMobileRepairer implements RepairGadget{
    @Override
    public void repair(Gadget gadget) {
        IphoneMobile smartPhone=(IphoneMobile)gadget;
        System.out.println("Repairing your "+smartPhone.getClass().getName());
        smartPhone.setStatus("Working");
        System.out.println("Your "+smartPhone.getClass().getName()+" now working");
    }
}
