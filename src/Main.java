import java.util.Arrays;
import java.util.stream.Stream;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String letter = "Р";
        Stream<String> FilteredFoodName = Stream.of("Хлопья", "Овощи", "Фрукты", "Мясо", "Рыба", "Растения");
        FilteredFoodName.filter(n -> n.contains(letter))
                .forEach(System.out::println);

        Stream<Person> personStream = Stream.of(
                new Person("Иван", 30),
                new Person("Олег", 31),
                new Person("Артем", 19),
                new Person("Даня", 20),
                new Person("Антон", 37),
                new Person("Вася", 62),
                new Person("Виктор", 53),
                new Person("Дима", 24),
                new Person("Семен", 21)
        );

        personStream
                .filter(n -> n.age > 30)
                .forEach(System.out::println);

    }
}