package main.java.Abstract;

public class ChildDepartment extends Department{


    @Override
    public void getDepartmenSize() {
        System.out.print("Hello Abstract.Department ");
    }


    public static void main(String[] args) {
        ChildDepartment c = new ChildDepartment();
        c.getDepartmenSize();




    }
}


