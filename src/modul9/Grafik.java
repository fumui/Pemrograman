package modul9;

public abstract class Grafik {
    int x, y;
    public abstract void moveTo(int x, int y);
    public abstract void draw();
    public abstract void reset();
}