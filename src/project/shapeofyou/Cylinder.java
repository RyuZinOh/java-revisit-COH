package project.shapeofyou;
public class Cylinder extends  shape {
    Cylinder(int a, int x){
        super(a, x);
    }
    public double Area(){
        return 2*Math.PI*this.dim1*(this.dim2 +this.dim2);
    }
}
