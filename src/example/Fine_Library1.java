package example;

public class Fine_Library1 {
		int libraryFine(int d1, int m1, int y1, int d2, int m2, int y2) 
		{
		  int f = 2;
		  int diffm=0;
		  int diffd=0;
			if(((m1==m2) &&(d1==d2))&&(y1>=y2))
			{
				f=0;
		   // System.out.println(f);
			}
			
			else
			if(((m1!=m2)&&(y1!=y2))&&(d1!=d2))
			{
			
		    f=10000;
			}
		
			else
			if(((m1!=m2)&&(y1==y2))&&(d1==d2))
			{
		     diffm=m1-m2;
		    f=500*diffm;
			}
			else
		   if(((m1==m2)&&(y1==y2)&&(d1>d2)))
		   {
		     diffd=d1-d2;
		     f=15*diffd;
		   }return f;
		}
		public static void main(String args[])
		{
			Fine_Library1 fl=new Fine_Library1();
			int fine=fl.libraryFine(20, 7, 2001, 20, 7, 2000);
			System.out.println(fine);
		}
	}


