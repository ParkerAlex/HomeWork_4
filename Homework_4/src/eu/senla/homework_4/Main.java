package eu.senla.homework_4;



public class Main {
	
	public static void main(String[] args) {
		
		final String ABC = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String symbolABC = "";
		int randomABC;
		 
///////////////////////////////////////////PART-1/////////////////////////		 
	String matrix[][] = new String [10][10];

	 for(int i = 0; i < matrix.length; i++){
		 for(int j = 0; j < matrix.length; j++){
			 	 
			 if (j % 3 == 0) {
				 matrix[i][j] = String.valueOf((double) (Math.random() * matrix.length)).substring(0,6);	 
			 }else {
				    for(int counter = 0; counter < 6; counter++){
					  randomABC = (int)(Math.random() * ABC.length());
					  symbolABC += ABC.charAt(randomABC);
				 } 
				 
				 matrix[i][j] = symbolABC;
				 symbolABC = "";
			 }
		 
		 }
     }
	 
	 System.out.println("MATRIX SIZE 10x10:");
	 for(int i = 0; i < matrix.length; i++){
		 for(int j = 0; j < matrix.length; j++){
			 
			 System.out.print("     " + matrix[i][j] + " ");
		 }
		 System.out.println();
     }
	 System.out.println();
	 
///////////////////////////////////////////PART-2/////////////////////////	 
	 String[] diagonalMain = new String [matrix.length]; 
     int x = 0;
     
	 
	   for(int i = 0; i < matrix.length; i++){
		  
		   diagonalMain[i] =  matrix[i][i];
					  		      
			System.out.print("DIAGONAL ¹1: " + diagonalMain[i] + " ");
		 }
	   System.out.println();
	   
	   String[] diagonalSide = new String [matrix.length]; 
	     int y = 0;
			       
	   for(int i = 0; i < matrix.length; i++){
			 
		   diagonalSide[i] =  matrix[i][matrix.length - i - 1];
			System.out.print("DIAGONAL ¹2: " + diagonalSide[i] + " ");
		 }
	   System.out.println();
	   System.out.println();
	   
	   System.out.println(diagonalSide == diagonalMain);
	   
	   if(diagonalMain == diagonalSide) {
		   System.out.println("DIAGONALI RAVNI");
	   }else {
		   System.out.println("DIAGONALI NERAVNI");
	   }
	   System.out.println();
	   
	   int z = diagonalMain.length + diagonalSide.length;
 
	   String[] diagonal = new String [z];
	   
	   System.arraycopy (diagonalMain, 0, diagonal, 0, diagonalMain.length);
	   System.arraycopy (diagonalSide, 0, diagonal, diagonalMain.length, diagonalSide.length);
	   
	   for(int xy = 0; xy < z; xy++){
		  
		   System.out.print(diagonal[xy] + " ");
		 }
	   System.out.println();
	   System.out.println();
	   
///////////////////////////////////////////PART-3/////////////////////////	 
	   Character str = 0;
	   String numberOnly = "";  
	   
	   
	  
	  	   for(int xy = 0; xy < z; xy++){
		       str = diagonal[xy].charAt(0);
		       
		      
		       
		       if (Character.isLetter(str) == true) {
		    	   StringBuffer strBuffer = new StringBuffer(diagonal[xy]);
		    	   String sb = strBuffer.substring(1,4);

		    	   System.out.print(sb + ", ");  
		    	  
		       }	       
	  	   }
	  	 System.out.println();
		   System.out.println();

///////////////////////////////////////////PART-4,5/////////////////////////	 
	  	String number = "";
	  	double[] numberArray = new double [20];
	  	
	  	   for(int xy = 0; xy < z; xy++){
		       str = diagonal[xy].charAt(0);
		       if (Character.isDigit(str) == true) {
		    	   
		    	     number = diagonal[xy];
		    	     double dNumber = Double.parseDouble(number);  
		    	     double result;
		    	     
		    	    if (dNumber > 1.7) {
		    	    	numberArray[xy] = Math.ceil(dNumber);
		    	    }else {
		    	    	numberArray[xy] = Math.floor(dNumber);
		    	    }
		    	    System.out.print(numberArray[xy]  + "_");
		       }
		      
	  	   }
	  	   
//	  	 String[] numberArray = new String [number.length()];
//	  	for(int w = 0; w < w; w++){
//	  		numberArray[w] = 
//	  	}
  
	}
	     	
}