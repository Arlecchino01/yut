public class Yut {
    private boolean[] yuts = new boolean[3];
    private boolean backYut;

    public Yut(){

    }

    public void throwYut(){
        for (int i = 0; i < 3; i++) {
            this.yuts[i] = Math.random() < 0.5;
        }
        backYut = Math.random() < 0.5;
    }

    public void throwCustomYut(){

    }

    



    
}
