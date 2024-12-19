package project.shapeofyou;

public class sphere  extends  shape{
    sphere(int tom , int bom){
        super(tom, bom);
    }
    public double Area(){
        return 4* Math.PI*this.dim1 * this.dim1;
    }
}
