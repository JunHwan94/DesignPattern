public class Main {
    public static void main(String[] args){
        Clock clock = new Clock();
        Screen sc1 = new Screen("화면1");
        Screen sc2 = new Screen("화면2");
        clock.attach(sc1);
        clock.attach(sc2);

        int i = 0;
        while(true){
            if(i == 5)
                clock.detach(sc2);
            if(i < 10) {
                clock.tick();
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }else{
                clock.detach(sc1);
            }
            i++;
        }
    }
}