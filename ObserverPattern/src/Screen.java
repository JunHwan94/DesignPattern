public class Screen implements Observer<MyTime> {
    private String name;

    public Screen(String name){
        this.name = name;
    }

    @Override
    public void update(MyTime time) {
        System.out.println(name + " shows : " + time.toString());
    }
}
