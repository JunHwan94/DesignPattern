import java.util.*;

public class Clock implements Subject<MyTime>{ // 구체적인 변경 감시 대상 데이터
    private List<Observer> observers;
    private MyTime time;

    public Clock(){
        observers = new ArrayList<>();
    }

    public void tick(){
        this.time = new MyTime();
        notifyObservers(time);
    }

    public MyTime getTime() {
        return time;
    }

    @Override
    public void attach(Observer<MyTime> observer) {
        observers.add(observer);
    }

    @Override
    public void detach(Observer<MyTime> observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(MyTime time) {
        observers.forEach(observer -> observer.update(time));
    }
}