package creational.abstract_factory.factories;

import creational.abstract_factory.enums.Theme;
import creational.abstract_factory.products.*;

public class MobileFactoryImpl implements PlateFormFactory {

    private Theme theme;

    public MobileFactoryImpl(Theme theme) {
        this.theme = theme;
    }

    @Override
    public Button getButton() {
        if (this.theme == Theme.BLACK){
            return new BlackMobileButton();
        }else {
            return new WhiteMobileButton();
        }
    }

    @Override
    public Text getText() {
        if (this.theme == Theme.BLACK){
            return new BlackMobileText();
        }else {
            return new WhiteMobileText();
        }
    }
}
