public class Main {
    public static void main(String[] args) {
        // Задача 1
        System.out.println("Задача 1");
        System.out.println("Типы переменных");
        byte applesQuantity = 127;
        System.out.println("Значение переменной applesQuantity с типом byte равно " + applesQuantity + " штук");
        short pearsQuantity = 500;
        System.out.println("Значение переменной pearsQuantity с типом short равно " + pearsQuantity + " штук");
        int peachesQuantity = 576;
        System.out.println("Значение переменной peachesQuantity с типом int равно " + peachesQuantity + " штук" );
        long peopleQuantity = 8_017_276_841L;
        System.out.println("Значение переменной peopleQuantity с типом long равно " + peopleQuantity + " человек");
        float pi = 3.1415926F;
        System.out.println("Значение переменной pi с типом float равно " + pi);
        double plumsWeight = 6.85;
        System.out.println("Значение переменной plumsWeight с типом double равно " + plumsWeight +" кг");

        // Задача 2
        System.out.println("Задача 2");
        float i = 27.12f;
        long d = 987_678_965_549L;
        double e = 2.786;
        boolean h = false;
        char g = 27897;
        short b = -159;
        int c = 569;
        byte a = 67;

        // Задача 3
        System.out.println("Задача 3");
        short pupilsFirstClass = 23;
        short pupilsSecondClass = 27;
        short pupilsThirdClass = 30;
        int totalPupils = pupilsFirstClass + pupilsSecondClass + pupilsThirdClass;
        short totalQuantityPaper = 480;
        long quantityPerPupil = totalQuantityPaper / totalPupils;
        System.out.println("На каждого ученика рассчитано " + quantityPerPupil + " листов бумаги " );

        // Задача 4
        System.out.println("Задача 4");
        byte perfomanceBottleTwoMinetes = 16;
        byte totalMinutes = 20;
        long quantityTwoMinutesPeriods = totalMinutes / 2;
        long quantityBottle = quantityTwoMinutesPeriods * perfomanceBottleTwoMinetes;
        System.out.println("За " + totalMinutes + " минут машина произвела бутылок " + quantityBottle + " штук ");
        long dayBottlePerfomance = 720 * perfomanceBottleTwoMinetes;
        System.out.println("За сутки машина произвела бутылок " + dayBottlePerfomance + " штук ");
        long threeDayBottlePerfomance = dayBottlePerfomance * 3;
        System.out.println("За 3 дня машина произвела бутылок " + threeDayBottlePerfomance + " штук ");
        long monthBottlePerfomance = dayBottlePerfomance * 30;
        System.out.println("За месяц машина произвела бутылок " + monthBottlePerfomance + " штук ");

        // Задача 5
        System.out.println("Задача 5");
        byte quantityPaintsTinsWhitePerClass = 2;
        byte quantityPaintsTinsBrownPerClass = 4;
        long totalPaintsTins = quantityPaintsTinsWhitePerClass + quantityPaintsTinsBrownPerClass;
        long totalNumberClasses = 120 / totalPaintsTins;
        long totalPaintsTinsWhite = totalNumberClasses * 2;
        long totalPaintsTinsBrown = totalNumberClasses * 4;
        System.out.println("В школе, где " + totalNumberClasses + " классов, нужно " + totalPaintsTinsWhite + " банок белой краски и " + totalPaintsTinsBrown + " банок коричневой краски");

        // Задача 6
        System.out.println("Задача 6");
        short bananasWeight = 80;
        short quantityBananas = 5;
        long totalWeightBananas = quantityBananas * bananasWeight;
        short volumeMilk = 200;
        short mlHundredWeightMilk = 105;
        long totalWeightMilk = volumeMilk / 100 * mlHundredWeightMilk;
        short iceCreamBriquette = 100;
        short quantityIceCreamBriquette = 2;
        long totalWeightIceCream = iceCreamBriquette * quantityIceCreamBriquette;
        short quantityEggs = 4;
        short weightEgg = 70;
        long totalWeightEggs = quantityEggs * weightEgg;
        long sportsBreakfastWeight = totalWeightBananas + totalWeightMilk + totalWeightIceCream + totalWeightEggs;
        System.out.println("Вес спорт-завтрака нашего спортсмена " + sportsBreakfastWeight + " грамм");
        float sportsBreakfastWeightKg = (float) sportsBreakfastWeight / 1000;
        System.out.println("Вес спорт-завтрака нашего спортсмена " + sportsBreakfastWeightKg + " кг");

        // Задача 7
        System.out.println("Задача 7");
        short bodyWeightLoss = 7000;
        short bodyWeightOneLossDay = 250;
        short bodyWeightTwoLossDay = 500;
        byte dayNumber = 2;
        long sumWeights = bodyWeightOneLossDay + bodyWeightTwoLossDay;
        long bodyAverageWeightLoss = sumWeights / dayNumber;
        long periodWeightOneLoss =  bodyWeightLoss / bodyWeightOneLossDay;
        long periodWeightTwoLoss =  bodyWeightLoss / bodyWeightTwoLossDay;
        long averagePeriodWeightLoss = bodyWeightLoss / bodyAverageWeightLoss;
        System.out.println("Чтобы добится нужного результата похудения,нашему спортсмену нужно минимум " + periodWeightOneLoss + " дней");
        System.out.println("Чтобы добится нужного результата похудения,нашему спортсмену нужно максимум " + periodWeightTwoLoss + " дней");
        System.out.println("Чтобы добится нужного результата похудения,нашему спортсмену нужно в среднем " + averagePeriodWeightLoss + " дней");

        // Задача 8
        System.out.println("Задача 8");
        float salaryIncreaseFactor = 1.1f;
        int salaryMasha = 67760;
        double newSalaryMasha = salaryMasha * salaryIncreaseFactor;
        double incomeIncreaseMasha = newSalaryMasha - salaryMasha;
        double increaseIncomePerYearMasha = incomeIncreaseMasha * 12;
        int salaryDenis = 83690;
        double newSalaryDenis = salaryDenis * salaryIncreaseFactor;
        double incomeIncreaseDenis = newSalaryDenis - salaryDenis;
        double increaseIncomePerYearDenis = incomeIncreaseDenis * 12;
        int salaryKristina = 76230;
        double newSalaryKristina = salaryKristina * salaryIncreaseFactor;
        double incomeIncreaseKristina = newSalaryKristina - salaryKristina;
        double increaseIncomePerYearKristina = incomeIncreaseKristina * 12;
        System.out.println("Маша теперь получает " + newSalaryMasha + " рублей. Годовой доход вырос на " + increaseIncomePerYearMasha + " рублей");
        System.out.println("Денис теперь получает " + newSalaryDenis + " рублей. Годовой доход вырос на " + increaseIncomePerYearDenis + " рублей");
        System.out.println("Кристина теперь получает " + newSalaryKristina + " рублей. Годовой доход вырос на " + increaseIncomePerYearKristina + " рублей");
    }
}