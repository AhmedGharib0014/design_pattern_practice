package structural.composite;

public class Menu extends MenuComponent{


    public Menu(String name, String url) {
        super(name, url);
    }



    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();

        builder.append(print());

        for (MenuComponent menuComponent : components){
            builder.append(menuComponent);
        }

        return builder.toString();
    }

    public MenuComponent add(MenuComponent menuComponent){
        components.add(menuComponent);
        return menuComponent;
    }

    public MenuComponent remove(MenuComponent menuComponent){
        components.remove(menuComponent);
        return menuComponent;
    }

}
