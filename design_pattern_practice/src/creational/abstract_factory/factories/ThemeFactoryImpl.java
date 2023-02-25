package creational.abstract_factory.factories;

import creational.abstract_factory.enums.Platform;
import creational.abstract_factory.enums.Theme;

public class ThemeFactoryImpl implements ThemFactory{
    @Override
    public PlateFormFactory instance(Theme theme, Platform platform) {
        if (platform == Platform.MOBILE){
            return new  MobileFactoryImpl(theme);
        }else {
            return new DesktopFactoryImpl(theme);
        }
    }
}
