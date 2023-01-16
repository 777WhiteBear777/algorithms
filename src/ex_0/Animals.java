package ex_0;

public class Animals {

    private int id;

    public Animals() {
    }

    public Animals(int id) {
        this.id = id;
    }

    public void eat(){
        System.out.println("Animal is eating...");
    }

    @Override
    public String toString() {
        return "id = " + id;
    }
}
