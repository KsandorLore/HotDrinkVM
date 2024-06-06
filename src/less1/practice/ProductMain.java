package less1.practice;

import java.time.LocalDate;
import java.util.List;
import less1.practice.impl.BottleOfWater;
import less1.practice.impl.EPackage;
import less1.practice.impl.HotDrink;
import less1.practice.impl.HotDrinkVM;
import less1.practice.impl.WaterVendingMachine;

public class ProductMain {

    public static void main(String[] args) {
        Product bottle1 = new BottleOfWater("Родники", 55, LocalDate.of(2024, 5, 1));

        Product bottle2 = new BottleOfWater("Родники Газированная", 55, LocalDate.of(2024, 5, 1),
                true, EPackage.GLASS.getMaterial(), 0.5F);

        Product hotDrink1 = new HotDrink("tea", 0.5F, 80);
        Product hotDrink2 = new HotDrink("coffe", 0.5F, 90);

        VendingMachine vm = new WaterVendingMachine();

        VendingMachine vm1 = new HotDrinkVM();

        System.out.println(vm.getProducts());

        //vm.addProducts(List.of(bottle1, bottle1, bottle1, bottle2, bottle2, bottle2));

        vm1.addProducts(List.of(hotDrink1, hotDrink1, hotDrink1, hotDrink2, hotDrink2, hotDrink2));

        System.out.println(vm.getProducts());

        vm.getProduct("Родники");

        System.out.println(vm1.getProducts());
    }
}
