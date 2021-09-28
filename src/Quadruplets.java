import java.util.ArrayList;
import java.util.List;

public class Quadruplets {

	
	public static List<Integer[]> fourNumberSum(int[] array, int targetSum) {
	    // Write your code here.
		
		 List<Integer[]> result = new ArrayList<Integer[]>();
		 
		 int[] arrayDos = array.clone();
		 int[] arrayTres = array.clone();
		 int[] arrayCuatro = array.clone();
		 
		 
		 for(int i=0; i<array.length;i++) {
			 
			 for(int j=0; i<arrayDos.length;j++) {
				 
				 for(int k=0; i<arrayTres.length;k++) {
					 
					 for(int l=0; i<arrayCuatro.length;l++) {
						 
						 Integer[] quadruplet = new Integer[4];
						 
						 quadruplet[0]=array[i];
						 quadruplet[1]=arrayDos[j];
						 quadruplet[2]=arrayTres[k];
						 quadruplet[3]=arrayCuatro[l];
						 
						 result.add(quadruplet);						 
					 }
				 }
			 }
		}
		 
		for (Integer[] q : result) {
			 
			 int qSumResult = q[0] + q[1] + q[2] + q[3];
			 
			 if(qSumResult != targetSum) {
				 result.remove(q);
			 }
			
		}
		
		return result;
	}

	
}
