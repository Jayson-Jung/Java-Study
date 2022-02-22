package chapter12.generics;

public class ThreeDPrinterTest {

    public static void main(String[] args) {

        ThreeDPrinter<Powder> printer = new ThreeDPrinter<Powder>();
        printer.setMaterial(new Powder());
        Powder powder = printer.getMaterial();
        System.out.println(printer);

        ThreeDPrinter<Plastic> printer2 = new ThreeDPrinter<Plastic>();
        printer2.setMaterial(new Plastic());
        Plastic plastic = printer2.getMaterial();
        System.out.println(printer2);

        printer2.printing();

        /*ThreeDPrinter<Water> printer3 = new ThreeDPrinter<Water>();
        printer3.setMaterial(new Water());
        Water water = printer3.getMaterial();
        System.out.println(printer3);*/

    }
}
