import java.util.HashSet;
import java.util.PriorityQueue;

public class AZ {
public static void main(String[] args) {
	int[] arr={6,1,1,9,2,3,3,4,5,6,6,7};
	PriorityQueue<Integer> hs=new PriorityQueue<Integer>();
	for (int i = 0; i < arr.length; i++) {
		hs.add(arr[i]);
		}
	for (Integer integer : hs) {
		System.out.print(integer+" ");
		}
	}
}