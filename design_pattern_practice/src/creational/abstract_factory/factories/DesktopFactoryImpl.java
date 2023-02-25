package creational.abstract_factory.factories;

import creational.abstract_factory.enums.Theme;
import creational.abstract_factory.products.*;

public class DesktopFactoryImpl implements PlateFormFactory {


    private Theme theme;

    public DesktopFactoryImpl(Theme theme) {
        this.theme = theme;
    }

    @Override
    public Button getButton() {
        if (theme == Theme.BLACK){
            return new BlackDesktopButton();
        }else {
            return new WhiteDesktopButton();
        }
    }

    @Override
    public Text getText() {
        if (theme == Theme.BLACK){
            return new BlackDesktopText();
        }else {
            return new WhiteDesktopTex();
        }
    }
}
