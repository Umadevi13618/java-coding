package example;

public class Fine_Library {
	int libraryFine(int d1, int m1, int y1, int d2, int m2, int y2) {
		
	int f=0;
	int i=0;
	int diffm=0;
	int diffd=0;
	switch(i){
	case 1:
		if(((d1==d2) && (m1==m2)&&(y1==y2)))
	f=2000;
		break;
	
	case 2:
		if(((m1!=m2)&&(y1!=y2)))
	 f=1000;
		break;
	
	case 3:
		if(((m1!=m2)&&(y1==y2)))
	  diffm=m1-m2;
	f=500*diffm;
	break;
   case 4: 
	   if(((m1==m2)&&(y1==y2)&&(d1>d2)))
	diffd=d1-d2;
	f=15*diffd;
	break;
  
	}
	return f;
	}
	public static void main(String args[])
	{
		Fine_Library fl=new Fine_Library();
		int fine=fl.libraryFine(10, 5, 2000, 10, 5, 2000);
		System.out.println(fine);
	}
}
