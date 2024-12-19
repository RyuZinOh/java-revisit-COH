package project.shapeofyou;

public class REctangle extends shape{
    REctangle(int d1, int d2){
        super(d1, d2);
    }
    public int Area(){
        return this.dim1 * this.dim2;
    }
}
