package project.shapeofyou;

public class Square extends  shape{
    Square(int d1){
        super(d1, -1);
        //-1 mean doesnt exist
    }
    public int Area(){
        return this.dim1 * this.dim1;
    }
}
