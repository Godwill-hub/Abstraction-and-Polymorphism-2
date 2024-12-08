import Package1.ObjectBehavior;

public class Type1 implements ObjectBehavior {
    private int attributeValue = 100;
    private String detail1 = "Detail1";

    @Override
    public void performAction() {
        System.out.println("Type1 is performing an action.");
    }
    @Override
    public void haltAction() {
        System.out.println("Type1 has halted the action.");
    }
    @Override
    public int getAttribute() {
        return attributeValue;
    }
    @Override
    public String getType() {
        return "Type1";
    }
    public String getDetail1() {
        return detail1;
    }
    }

