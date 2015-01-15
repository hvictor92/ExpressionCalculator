public class queue 
{
	protected static Node front;
	private Node back;
	public int length =0;
	
	public queue ()
	 {
		front = null;
		back = null;
     }
	
	public void enqueue(int num)
	{
	    Node n = new Node(num);	
		if(front == null)
		{
			front = n;
			length++;
		}
		else if(back == null && front != null)
		{
			front.setNext(n);
			back = n;
			length++;
		}
		else
		{
			back.setNext(n);
			back = n;
			length++;
			
		}
	}
	
	public int dequeue() 
	  {
		  if (front != null)
	  	  {
	  		//System.out.println("Queue is empty");
	      }
		      Node a = front;
			  front = front.getNext();
			  return a.getItem(); 
	  }

	public boolean isEmpty() {
		if(front == null)
			return true;
		else
			return false;
	}
	  
	

}
