//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        bmiServise calculate = new bmiServise();
        double imt = calculate.counting(98, 1.87);
        System.out.println((int) imt);
    }
}