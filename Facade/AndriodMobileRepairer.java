package Facade;

/*
 * @author Shyam Makwana
 */

public class AndriodMobileRepairer implements RepairGadget{
    @Override
    public void repair(Gadget gadget) {
        AndriodMobile digitalWatch=(AndriodMobile)gadget;
        System.out.println("Repairing your "+digitalWatch.getClass().getName());
        digitalWatch.setStatus("Working");
        System.out.println("Your "+digitalWatch.getClass().getName()+" now working");
    }
}
