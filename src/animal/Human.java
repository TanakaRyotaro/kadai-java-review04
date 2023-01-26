package animal;

public class Human extends Animal implements Thinkable {
    //フィールド
    private String shumi;

    public Human() {
        super();
    }

    /**
     * @param name
     * @param age
     */
    public Human(String name, int age, String shumi) {
        super(name, age);
        this.shumi=shumi;
    }

    public String getShumi() {
        return shumi;
    }

    public void setShumi(String shumi) {
        this.shumi = shumi;
    }

    @Override
    public void think() {
        System.out.println("私は"+shumi+"について考えています。");
    }
}