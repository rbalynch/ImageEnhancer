import java.awt.image.BufferedImage;

//Riley Lynch
//Amar Nangia
//Period 4


public class BufferedImageStack
{
	BufferedImage[] arr;
	int size;
	
	public BufferedImageStack()
	{
		size = 0;
		arr = new BufferedImage[2];
	}
	
	public void push(BufferedImage someB)
	{
		if(size == arr.length)
		{
			BufferedImage[] arr2 = new BufferedImage[size * 2];
			for(int i = 0; i < arr.length; i ++)
			{
				arr2[i] = arr[i]; 
			}
			arr2[size] = someB; 
			arr = arr2;
			size ++; 
			

		}
		else
		{
			arr[size] = someB;
			size ++; 

		}
	}
	
	public boolean isEmpty()
	{
		if(size == 0)
		{
			return true; 
		}
		return false; 
	}
}