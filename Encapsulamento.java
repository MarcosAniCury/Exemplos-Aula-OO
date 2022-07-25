public class Encapsulamento {
    public static void main (String args[]) {
        Box box = new Box(20, 50);
        box.setLength(40);
        box.setSize(10);
        System.out.println(box.getSize());
        System.out.println(box.getLength());
    }
}

class Box {
    private int size;
    private int length;

    public Box(int size, int length) {
        this.size = size;
        this.length = length;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}
