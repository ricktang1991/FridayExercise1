package Week1.Classes;

public class Rectangle {
    private int Width;
    private int Height;
    private String Color;

    Rectangle(int w, int h) {
        if (w < 0) {
            this.Width = 1;
        } else {
            this.Width = w;
        }
        if (h < 0) {
            Height = 1;
        } else {
            this.Height = h;
        }
        Color = "Blue";

    }


    Rectangle(int w, int h, String c) {
        if (w < 0) {
            Width = 1;
        } else {
            this.Width = w;
        }
        if (h < 0) {
            Height = 1;
        } else {
            this.Height = h;
        }

        Color = "Blue";

        if (c.length() < 2 || c.length() > 20) {
            System.out.println("Length of Color should between 2 and 20");
        }
        if (c.charAt(0) != c.toUpperCase().charAt(0)) {
            System.out.println("The first character of Color should be capitalized");
        }

    }

    public int getHeight() {
        return Height;
    }

    public int getWidth() {
        return Width;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public void setWidth(int width) {
        Width = width;
    }

    public void setHeight(int height) {
        Height = height;
    }

    void draw() {
        for (int i = 0; i < Height; i++) {
            for (int j = 0; j < Width; j++) {
                System.out.print(Color.charAt(0));
            }
            System.out.println();
        }

    }

}
