public class Main {
    public static void main(String[] args) {
        System.out.println("Задача №1");
        int age = 16;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age+ ", то он совершеннолетний.");
        } else {
            System.out.println("Если возраст человека равен " + age+ ", то он не достиг совершеннолетия, нужно немного подождать.");
        }

        System.out.println("Задача №2");
        int airTemperature = 20;
        if (airTemperature <= 5) {
            System.out.println("На улице " + airTemperature+ " градусов, нужно надеть шапку.");
        }
        if (airTemperature >= 5) {
            System.out.println("На улице " + airTemperature+ " градусов, можно идти без шапки.");
        }

        System.out.println("Задача №3");
        int vehicleSpeed = 15;
        if (vehicleSpeed > 60) {
            System.out.println("Если скорость " + vehicleSpeed+ " придется заплатить штраф за превышение.");
        } else {
            System.out.println("Если скорость " + vehicleSpeed+ " можно ездить спокойно.");
        }

        System.out.println("Задача №4");
        int agePerson = 13;
        if (agePerson < 2) {
            System.out.println();
        } else
            if (agePerson >= 2 && agePerson <= 6) {
               System.out.println("Если возраст человека равен " + agePerson+ ", то ему нужно ходить в детский сад.");
            } else
                if (agePerson >= 7 && agePerson <= 17) {
                    System.out.println("Если возраст человека равен " + agePerson+ ", то ему нужно ходить в школу.");
                  } else
                      if (agePerson >= 7 && agePerson <= 24) {
                         System.out.println("Если возраст человека равен " + agePerson+ ", то его место в университете.");
                      } else
                          if (agePerson > 24) {
                              System.out.println("Если возраст человека равен " + agePerson+ ", то ему пора ходить на работу.");
                          }
        System.out.println("Задача №5");
        int ageChild = 4;
        if (ageChild < 5) {
            System.out.println("Если возраст ребенка равен " + ageChild+ ", то ему нельзя кататься на аттракционе.");
        } else
            if (ageChild >= 5 && ageChild <= 14) {
                System.out.println("Если возраст ребенка равен " + ageChild+ ", то ему можно кататься на аттракционе в сопровождении взрослого.");
            } else
                if (ageChild >= 14) {
                    System.out.println("Если возраст ребенка равен " + ageChild+ ", то ему можно кататься на аттракционе без сопровождения взрослого.");
                }
        System.out.println("Задача №6");
        int CapacityOfOneTrainCar = 62;
        boolean seating = CapacityOfOneTrainCar >= 0 && CapacityOfOneTrainCar <= 60;
        boolean standingPlaces = CapacityOfOneTrainCar > 60 && CapacityOfOneTrainCar <= 102;
        boolean fullness = CapacityOfOneTrainCar >= 102;
        if (seating) {
            System.out.println("В вагоне имеются сидячие места.");
        } else
            if (standingPlaces) {
                System.out.println("В вагоне имеются только стоячие места.");
            } else
                if (fullness) {
                    System.out.println("Вагон заполнен, мест нет.");
                }

        System.out.println("Задача №7");
        int one = 50;
        int two = -15;
        int three = 41;
        if (one > two && one > three) {
            System.out.println("Наибольшее число " + one);
        } else
            if (two > one && two > three) {
                System.out.println("Наибольшее число " + two);
            } else
                if (three > one && three > two) {
                    System.out.println("Наибольшее число " + three);
                }
    }
}