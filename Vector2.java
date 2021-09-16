public class Vector2 {
    private double x;
    private double y;

    ////////////////////////////////CONSTRUCTOR//////////////////////////////////////

    Vector2(double x, double y) {
        this.x = x;
        this.y = y;
    }

    ////////////////////////////////SETTERS///////////////////////////////////

    public void set(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void set(Vector2 v) {
        this.x = v.getX();
        this.y = v.getY();
    }

    public void setX(double x) {
        this.x = x;
    }
    
    public void setY(double y) {
        this.y = y;
    }

    /////////////////////////////////GETTERS///////////////////////////////////

    public double getMag() {
        return Math.sqrt( Math.pow(x,2) + Math.pow(y,2) );
    }

    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }

    ///////////////////////////////////MATH//////////////////////////////////////

    public void add(Vector2 v) {
        this.x += v.x;
        this.y += v.y;
    }

    public void mult(double d) {
        this.x *= d;
        this.y *= d;
    }

    public void mult(Vector2 v) {
        this.x *= v.getX();
        this.y *= v.getY();
    }

    public void div(double d) {
        this.x /= d;
        this.y /= d;
    }

    public void div(Vector2 v) {
        this.x /= v.getX();
        this.y /= v.getY();
    }

    public void multX(double d) {
        this.x *= d;
    }

    public void multY(double d) {
        this.y *= d;
    }

    ////////////////////////////////MISC///////////////////////////////////////////

    public void normalize() {
        this.div(this.getMag());
    }

    public void normalize(double scalar) {
        this.div(this.getMag());
        this.mult(scalar);
    }

    public void limit(double limit) {
        if (this.x > limit) {
            this.setX(limit);
        }
        else if (this.x < -1*limit) {
            this.setX(limit*-1);
        }
        if (this.y > limit) {
            this.setY(limit);
        }
        else if (this.y < -1*limit) {
            this.setY(limit*-1);
        }
    }
}
