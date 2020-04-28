
public class baitap4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int[] a = {9,3,8,7,3,9,4,2};
    double tong=0;
    for(int x:a) {
    	if(x % 2 ==1) {
    		tong+=x;
    	}
    }
    System.out.println("Tong:" + " " + tong);
	}

}
