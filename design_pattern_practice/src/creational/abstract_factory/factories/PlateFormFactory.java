package creational.abstract_factory.factories;

import creational.abstract_factory.enums.Theme;
import creational.abstract_factory.products.Button;
import creational.abstract_factory.products.Text;

public interface PlateFormFactory {

    public Button getButton();

    public Text getText();

}
