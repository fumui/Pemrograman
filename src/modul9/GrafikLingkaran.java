package modul9;

import java.util.ArrayList;

public class GrafikLingkaran extends Grafik{
    ArrayList<Object> data;
    @Override
    public void moveTo(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void draw() {
        System.out.println("gambar di sini");
    }

    @Override
    public void reset() {
        this.data = new ArrayList<Object>();
    }
}
