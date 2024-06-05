public class Calculate {
    private static Calculate calc;
    private Calculate(){

    }
    public static Calculate getInstance(){
        calc = new Calculate();
        return calc;
    }

    public int add(int a, int b){
        return a+b;
    }

    public int sub(int a, int c){
        return a-c;
    }

    public int multi(int x, int y){
        return x*y;
    }

    public int div(int a, int b){
        return a/b;
    }
}
