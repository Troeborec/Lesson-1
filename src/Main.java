    public class Main {
    public static void main(String[] args) {
        var timeWork = 640;
        var oneEmployee = 8;
        var allEmployee = timeWork / oneEmployee;
        System.out.println("Всего работников в компании " + allEmployee + " человек");
        var allpeople = allEmployee + 94;
        System.out.println(allpeople);
        var needhours = timeWork / allpeople;
        System.out.println(needhours);
        System.out.println("Если в компании работает " + allpeople + " человека, то всего " + needhours + " часов работы может быть поделено между сотрудниками");

    }
}