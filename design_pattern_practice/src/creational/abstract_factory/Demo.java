package creational.abstract_factory;

import creational.abstract_factory.enums.Platform;
import creational.abstract_factory.enums.Theme;
import creational.abstract_factory.factories.PlateFormFactory;
import creational.abstract_factory.factories.ThemFactory;
import creational.abstract_factory.factories.ThemeFactoryImpl;

public class Demo {
    public static void main(String[] args) {

        ThemFactory themFactory = new ThemeFactoryImpl();

        PlateFormFactory plateFormFactory = themFactory.instance(Theme.BLACK, Platform.MOBILE);

        System.out.println(plateFormFactory.getButton().getClass().getName());
        System.out.println(plateFormFactory.getText().getClass().getName());


        PlateFormFactory plateFormFactory2 = themFactory.instance(Theme.white, Platform.MOBILE);

        System.out.println(plateFormFactory2.getButton().getClass().getName());
        System.out.println(plateFormFactory2.getText().getClass().getName());


    }
}
