public class WolfTest {
    public static void main(String[] args) {
        Wolf wolf = new Wolf();
        wolf.setSex("самец");
        wolf.setName("Клык");
        wolf.setWeight(50.0);
        wolf.setAge(10);
        wolf.setColor("серый");

        System.out.println("Пол волка: " + wolf.getSex());
        System.out.println("Имя волка: " + wolf.getName());
        System.out.println("Вес волка: " + wolf.getWeight());
        System.out.println("Возраст волка: " + wolf.getAge());
        System.out.println("Окрас волка: " + wolf.getColor());
        wolf.walk();
        wolf.sit();
        wolf.run();
        wolf.howl();
        wolf.hunt();
    }
}
