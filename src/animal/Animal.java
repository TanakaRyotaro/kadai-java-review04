package animal;

public class Animal {
    private String name;
    private int age;

    //引数なしコンストラクタ
    public Animal() {
    }

    /**
     * @param name
     * @param age
     */
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name セットする name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age セットする age
     */
    public void setAge(int age) {
        this.age = age;
    }
    public void say(){
        System.out.println(name + "です。"+age+"歳です。");
    }
}