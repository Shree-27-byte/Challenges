package corejava;
public class Datatypes11 {
    public static void main(String[] args) {
        int num = 10;
        Integer obj = Integer.valueOf(num);
        int n = obj.intValue();
        System.out.println("Integer value: " + n);
        double d = 12.5;
        Double dobj = Double.valueOf(d);
        System.out.println("Double value: " + dobj);
    }
}
