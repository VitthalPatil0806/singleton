//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Calculate obj =  Calculate.getInstance();
        int res = obj.add(1,10);
        System.out.println(res);

        System.out.println(obj.multi(20,89));
        System.out.println(obj.sub(200,34));

    }
}