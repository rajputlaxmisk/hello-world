package xplore_java;

public class CertificateDemo 
{
	static Certificate[] getEvenPositionCertificate(Certificate c[])
	{
		int l=c.length;
		int num=0;
		if(l%2==0)
		{
			 num=l/2;
		}
		else
		{
			num=l/2+1;
		}
		Certificate res[]=new Certificate[num];
		int index=0;
		for(int i=0;i<l;i++) 
		{
			if(i%2==0)
			{
				res[index]=c[i];
				index++;
			}
		}
		return res;
		
	}
	static Certificate[] sorted(Certificate ci[])
	{
		int l=ci.length;
		//Certificate cc=new Certificate[l];
		for(int i=0;i<l;i++)
		{
			for(int j=i+1;j<l;j++)
			{
				if((ci[i].getTitle()).compareTo(ci[j].getTitle())>0)
				{
					Certificate temp=ci[i];
					ci[i]=ci[j];
					ci[j]=temp;
				}
			}
		}
		return ci;
	}
public static void main (String arg[])
{
	
	Certificate c[]=new Certificate[5];
	
	c[0]=new Certificate(1,"hell","wojj",98);
	c[1]=new Certificate(2,"jhjj","hjh",53);
	c[2]=new Certificate(3,"njkj","bhk",96);
	c[3]=new Certificate(4,"jgj","vgg",95);
	c[4]=new Certificate(6,"bvh","fgghj",12);
	
	//Certificate ans[]=getEvenPositionCertificate(c);
	Certificate ans[]=sorted(c);
	System.out.println(ans.length);
	for(Certificate cust:ans)
	{
		System.out.println(cust.getRank()+" "+cust.getTitle()+""+cust.getId());
	}
	
}
}
