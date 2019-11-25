package com.brunoyam.unit_3_2.tasks;

import com.brunoyam.unit_3_2.generics.BrunoMath;
import com.brunoyam.unit_3_2.generics.Price;

public class Level1 implements Task{

    public void run() {
        Integer[] intArray = {10, 20, 30, 40, 50, 60};
        Double[] doubleArray = {1.10, 1.20, 1.30, 1.40, 1.50, 1.60};

        /*
        Используя денерик измените метод max() класса com.brunoyam.unit_3_2.generics.BrunoMath так,
        чтобы он мог обрабатывать массивы любых типов, расширяющих (являющихся наследниками) класс Number.
        При этом метод должен всегда возвращать значение типа double.
         */
        double maxInt = BrunoMath.max(intArray);
        double maxDouble = BrunoMath.max(doubleArray);

        /*
        Используя денерик измените метод sum() класса com.brunoyam.unit_3_2.generics.BrunoMath так,
        чтобы он мог обрабатывать массивы любых типов, расширяющих (являющихся наследниками) класс Number.
        При этом метод должен всегда возвращать значение типа double.
         */
        double intSum = BrunoMath.sum(intArray);
        double doublesSum = BrunoMath.sum(doubleArray);

        /*
        Используя денерик измените метод avg() класса com.brunoyam.unit_3_2.generics.BrunoMath так,
        чтобы он мог обрабатывать массивы любых типов, расширяющих (являющихся наследниками) класс Number.
        При этом метод должен всегда возвращать значение типа double.
         */
        double avgInt = BrunoMath.avg(intArray);
        double avgDouble = BrunoMath.avg(doubleArray);

        /*
        Класс com.brunoyam.unit_3_2.generics.Price представляет цену товара. У него есть два поля: артикул и цена.
        Сейчас мы можем вводить цену только в целых числах. Изспольуя дженерик делайте класс обобщенным так, чтобы
        цену можно было задавать и в целых и в дробных числах.

        Измение объявление переменных intPriceList и doublePriceList ниже так, чтобы первая содержала массив цен в целых
        числах, а вторая - массив дробных цен.
         */
        Price[] intPriceList = new Price[2];
        intPriceList[0] = new Price("bread", 80);
        intPriceList[1] = new Price("beaf", 400);

        Price[] doublePriceList = new Price[2];
        doublePriceList[0] = new Price("bread", 79.99);
        doublePriceList[1] = new Price("beaf", 399.99);

    }

}
