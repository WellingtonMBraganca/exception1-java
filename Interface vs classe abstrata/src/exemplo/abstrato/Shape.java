package exemplo.abstrato;

import exemplo.Color;

public abstract class Shape implements intShape{
    private exemplo.Color color;

    public Shape(exemplo.Color color) {
        this.color = color;
    }

    public exemplo.Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
