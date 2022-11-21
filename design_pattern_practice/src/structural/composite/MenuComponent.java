package structural.composite;

import java.util.ArrayList;
import java.util.List;

public abstract class MenuComponent {

    final String name;

    final String url;

    final List<MenuComponent> components = new ArrayList<>();

    public MenuComponent(String name, String url) {
        this.name = name;
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public String getUrl() {
        return url;
    }

    @Override
    public abstract String toString();


    public String print(){
        StringBuilder builder = new StringBuilder();

        builder.append("name: ");

        builder.append(name);

        builder.append("\n");

        builder.append("url: ");

        builder.append(url);

        builder.append("\n");

        return builder.toString();
    }


}
