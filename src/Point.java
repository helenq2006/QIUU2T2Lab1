public class Point {

    private int x;

    private int y;

    public Point(int value)
    {
        x = value;
        y = value;

    }

    public Point(int i, int i1)
    {
        x = 0;
        y = 0;
    }

    public int getX()
    {
        return x;
    }

    public int getY()
    {
        return y;
    }

    public void setX(int newX)
    {
        x = newX;
    }

    public void setY(int newY)
    {
        y = newY;
    }

    public int coordinate(int x, int y)
    {
        return x;
        return y;
    }

    public boolean quadrant()
    {
        if (x > 0 && y > 0) {
            System.out.println("I");
        }
        if (x < 0 && y > 0) {
            System.out.println("II");
        }
        if (x < 0 && y < 0) {
            System.out.println("III");
        }
        if (x > 0 && y < 0) {
            System.out.println("IV");
        }
        if (x == 0 && y == 0) {
            System.out.println("origin");
        }

        if (x == 0 && y < 0) {
            System.out.println("on axis");
        }
        if (x == 0 && y > 0) {
            System.out.println("on axis");
        }
        if (x < 0 && y == 0) {
            System.out.println("on axis");
        }
        if (x > 0 && y == 0) {
            System.out.println("on axis");
        }

    }
}
