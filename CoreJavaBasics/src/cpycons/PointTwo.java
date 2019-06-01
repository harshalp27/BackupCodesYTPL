package cpycons;

public class PointTwo extends PointOne{

	private Integer z;
	
	 public PointTwo(PointTwo point){
        super(point); //Call Super class constructor here
        this.z = point.z;
    }
}
