package creational.abstract_factory.factories;

import creational.abstract_factory.enums.Platform;
import creational.abstract_factory.enums.Theme;

public interface ThemFactory {

   public PlateFormFactory instance(Theme theme, Platform platform);

}
