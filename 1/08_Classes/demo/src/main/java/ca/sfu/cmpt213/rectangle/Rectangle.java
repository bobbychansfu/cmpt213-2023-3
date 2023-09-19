package ca.sfu.cmpt213.rectangle;

public class Rectangle {
    private double length;
    private double width;

    public Rectangle(double l, double w){
        length = l;
        width = w;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double area() {
        return this.length * this.width;
    }

    @Override
    public String toString() {
        return getClass().getName() + " Rectangle " + "length: " + this.length +
                "width: " + this.width;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        long temp;
        temp = Double.doubleToLongBits(length);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(width);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Rectangle otherRectangle = (Rectangle) obj;
        return this.area() == otherRectangle.area();
    }

    public Rectangle copy() {
        Rectangle copyObj = new Rectangle(this.length, this.width);
        return copyObj; // returns the addr of new Rect
    }
    
}
