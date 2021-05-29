import java.util.*;

public class LoopAndIterator {
  public static void main(String[] args) {
    int[] numbers = {1, 2, 3, 4, 5837739, 2147483647};
    System.out.println(Arrays.toString(numbers));
    try {
      numbers[6] = 4;
    } catch (Exception e) {
      System.out.println("Даже не думайте, так это не работает, это массив " +
              "только на " + numbers.length + " элементов");
    }


    Calendaric oneMonth = Calendaric.июнь;
    Calendaric[] months = Calendaric.values();
    System.out.println(Arrays.toString(months));
    switch (oneMonth) {
      case декабрь:
      case январь:
      case февраль:
        System.out.println("Холодновато, часто морозно");
        break;
      case март:
      case апрель:
      case май:
        System.out.println("Веснааа... все зеленеет. Скоро совсем тепло будет.");
        break;
      case июнь:
      case июль:
      case август:
        System.out.println("Жара! Солнце светит! все на речку...");
        break;
      case сентябрь:
      case октябрь:
      case ноябрь:
        System.out.println("Осень.");
        break;
      default:
        System.out.println("Нет у нас такого месяца");
    }


    List l = new ArrayList<String>();
    l.add(Arrays.toString(months));
    l.add(Integer.toString(numbers[0]));
    System.out.println(l);
    System.out.println(l.contains("1"));
    // 1й список из списков из строк, а 2й список из списков из строк и чисел
    String[] strings1 = {"str001", "str002", "str003"};
    List sublist1 = Arrays.asList(strings1);
    List list = new ArrayList<>();
    list.add(sublist1);

    String[] strings2 = {"str004", "str005", "str006"};
    List sublist2 = Arrays.asList(strings2);
    list.add(sublist2);

    String[] strings3 = {"str007", "str008", "str009"};
    List sublist3 = Arrays.asList(strings3);
    list.add(sublist3);

    List second = new ArrayList<>();
    List sub1 = new ArrayList<>();
    sub1.add("string");
    sub1.add(34727562);
    sub1.add("string");
    sub1.add(883722);
    second.add(sub1);
    List sub2 = new ArrayList<>();
    sub2.add(1.3452);
    sub2.add("string");
    sub2.add(877537);
    sub2.add("string");
    second.add(sub2);

    List allLists = new ArrayList<>();
    allLists.add(list);
    allLists.add(second);

    System.out.println(allLists);


    HashMap<String, String> weekDays = new HashMap<String, String>();

    weekDays.put("понедельник", "17 мая");
    weekDays.put("вторник", "18 мая");
    weekDays.put("среда", "19 мая");
    weekDays.put("четверг", "20 мая");
    System.out.println(weekDays);
    System.out.println(weekDays.keySet());
    System.out.println(weekDays.values());
    System.out.println(weekDays.size());


    FizzBuzz();


    String[] myList = {"яблоко", "банан", "хрюк", "вишня", "брюква", "карамелька", "пина колада"};
    Iterator<String> it = Arrays.stream(myList).iterator();
    while (it.hasNext()) {
      String value = it.next();
      System.out.println(value.length() + " - " + value);
    }
  }

  public static void FizzBuzz() {
    for (int i = 1; i <= 100; i++) {
      if (i == 30 || i == 60) {
        System.out.println("Пропускаем" + " " + Integer.toString(i));
        continue;
      }
      if (i % 3 == 0 & i % 5 == 0) {
        System.out.println("FizzBuzz" + " " + Integer.toString(i));
      } else if (i % 3 == 0) {
        System.out.println("Fizz" + " " + Integer.toString(i));
      } else if (i % 5 == 0) {
        System.out.println("Buzz" + " " + Integer.toString(i));
      }
    }
  }

  enum Calendaric {
    январь, февраль, март, апрель, май, июнь,
    июль, август, сентябрь, октябрь, ноябрь, декабрь;

  }
}
