package tag_4;

public class Christmasbaum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 2, 4, 6, 8,...... 30
//				while  for do-while
		int i = 2;
//			while(i<=30) {
//		       System.out.printf("%d ",i);
//			   i+=2;
//			}	
//			 System.out.println("");
//			for (i=2;i<=30;i+=2) {
//				  System.out.printf("%d ",i);
//			}	  
//			 System.out.println("");
//				i=2;
		//
//			do {
//			    System.out.printf("%d ",i);
//			    i+=2;
//			}while(i<=30);	
//			 System.out.println("");
//			 //   20 18 .. 0
//			for(i=20;i>=0;i-=2) {
//				  System.out.printf("%d ",i);
//			}	  
//			 System.out.println("");
//			 //   21 18 15.. 0
//				for(i=21;i>=0;i-=3) {
//					  System.out.printf("%d ",i);
//				}	  
//				 System.out.println("");
//			// 2er Potenzen    2 4 8 16 32.. 2^32 
//			//	0   1
//			//  1   2
//			//  2	4 
//			System.out.println("");
//			long l;
////			for (l=1,i=0;l<5000000000l;i++,l*=2) {
//			for (l=1,i=0;i<=32;i++,l*=2) {	
//						  System.out.printf("%2d %10d%n",i,l);
//			}

//		                         *
//		                        ***	
//		                       *****	
//		                         *
//			                       *
		int krone = 8;
		int stamm = 5;
		int mitte = 60;
		int zeile = 1;
		int breite = 1;
		// krone
		for (zeile = 1; zeile <= krone; zeile++) {
			for (i = 1; i < mitte - zeile; i++)
				System.out.print(" ");
			for (i = 1; i <= breite; i++)
				System.out.print("*");
			System.out.println("");
			breite += 2;
		}
		// Stamm
		for (zeile = 1; zeile <= stamm; zeile++) {
			for (i = 1; i < mitte - 1; i++)
				System.out.print(" ");
			System.out.println("*");
		}
	}
}
