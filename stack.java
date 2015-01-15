public class stack 
{
	public int length;
	public static Node top = null;
		
	public stack()
	{
		top = null;
		length = 0;
	}
	
	public static boolean isEmpty()
	{
		if(top == null)
		  return true;
		else
		{
			return false;
		}
	
	}
	
    public void push(char newItem)
    {
    	Node n = new Node(newItem);
    	
    	if (stack.isEmpty())
    	{
    		top = n;
    		length++;
    	}
    	else
    	{
    		n.setNext(top);
    		top = n;
    		length++;
    	}
    }
    
    public Node pop()
    {
        if(top == null)
        {
        	return null;
        }
    	else if(top.getNext() == null)
    	{
    		Node N = top;
        	top = null;
        	return N;
        }
    	else
    	{
    		Node N = top;
        	top = top.getNext();
        	return N;
    	}
    }
              
    public int peek()
    {
    	return top.getCitem();
    }
    
    public void display()
    {
    	Node p =top;
    	while(p != null)
    	{
    	   System.out.println(p.getItem());
    	   p = p.getNext(); 
    	}
    }

}
