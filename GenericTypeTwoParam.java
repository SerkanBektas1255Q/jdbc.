package Generics;

public class GenericTypeTwoParam<S,U> {

    private S s;
    private U u;

    // parametreli const.

    public GenericTypeTwoParam(S s, U u) {
        this.s = s;
        this.u = u;
    }


    // Getter- Setter


    public S getS() {
        return s;
    }

    public void setS(S s) {
        this.s = s;
    }

    public U getU() {
        return u;
    }

    public void setU(U u) {
        this.u = u;
    }

    // main- method
    public static void main(String[] args) {
        GenericTypeTwoParam<String,Integer> obj1 = new GenericTypeTwoParam<>("Java",1);
        GenericTypeTwoParam<Integer,String> obj2 = new GenericTypeTwoParam<>(1,"SpringBoot");

        System.out.println(obj1.getS());
        System.out.println(obj1.getU());


    }
}
