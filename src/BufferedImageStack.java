import java.awt.image.BufferedImage;
import java.util.EmptyStackException;

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
	
	public BufferedImage pop()
	{
		if (size == 0)
		{
			throw new EmptyStackException();
		}
		BufferedImage temp = arr[size - 1];
		size--;
		arr[size - 1] = null;
		return temp;
		
	}
	
	public BufferedImage get(int index)
	{
		if (index > size)
		{
			throw new IndexOutOfBoundsException("ERROR");
		}
		return arr[index];
	}
	
	public int getSize()
	{
		return size;
	}
	
	public int getArraySize()
	{
		return arr.length;
	}
	
}