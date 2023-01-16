package ex_0;

public class Race<T> {
    private T speed;

    public Race(T speed) {
        this.speed = speed;
    }

    public T getSpeed() {
        return speed;
    }

}
