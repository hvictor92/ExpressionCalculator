public class Node 
{
	private int item;
	private char citem;
	private Node next;
	
	public Node(int newItem)
	{
		item = newItem;
	}
	
	public Node(char newItem)
	{
		citem = newItem;
	}
    public Node(int newItem, Node nextNode)
    {
    	item = newItem;
    	next = nextNode;
    }
    
    public void setItem(int newItem)
    {
    	item = newItem;
    }
    public void setItem(char newItem)
    {
    	citem = newItem;
    }
    
    public void setNext(Node nextNode)
    {
    	next = nextNode;
    }
    
    
    public int getItem()
    {
    	return item;
    }
    
    public char getCitem()
    {
    	return citem;
    }
    
    public Node getNext()
    {
    	return next;
    }
}
