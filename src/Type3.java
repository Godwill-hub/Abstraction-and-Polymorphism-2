import Package1.ObjectBehavior;

public class Type3 implements ObjectBehavior {
    private int attributeValue = 300;
    private String detail3 = "Detail3";

    @Override
    public void performAction() {
        System.out.println("Type3 is performing an action.");
    }
    @Override
    public void haltAction() {
        System.out.println("Type3 has halted the action.");
    }
    @Override
    public int getAttribute() {
        return attributeValue;
    }
    @Override
    public String getType() {
        return "Type3";
    }
    public String getDetail3() {
        return detail3;
    }
}
