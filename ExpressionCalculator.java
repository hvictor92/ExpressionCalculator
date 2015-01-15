import java.util.Scanner;
import javax.script.ScriptEngineManager;
import javax.script.ScriptEngine;
import javax.script.ScriptException;

public class ExpressionCalculator 
{	
	int mode;
	Scanner kbd = new Scanner(System.in);
	ScriptEngineManager mgr = new ScriptEngineManager();
	ScriptEngine engine = mgr.getEngineByName("JavaScript");
	
	public ExpressionCalculator()
	{
		
	}
	
	public void evaluate() throws ScriptException
	{
		command();
	}
	
	public void command() throws ScriptException
	{
		System.out.println("Please enter 0 to enter a prefix expression, 1 for a postfix expression, 2 to quit");
		mode = kbd.nextInt();
		
		switch(mode)
		{
		    case 0:
		    {//prefix
		    	System.out.println("Please enter your equation");
		    	String eq = kbd.next();
		    	String equation = "";
		    	StringBuilder sb = new StringBuilder();
		    	stack operators= new stack();
		    	queue nums= new queue();
		    	int i = 0;
		    	int j = 0;
		    	int k = 0;
		    	
		    	while(!Character.isDigit(eq.charAt(i)))
		    	{
		    		operators.push(eq.charAt(i));
		    		
		    		i++;
		    		j=i;
		    	}
		    	while(j < eq.length())
		    	{
		    		int toadd = Character.getNumericValue(eq.charAt(j));
		    		nums.enqueue(toadd);
		    		j++;
		    	}
		    	
		    	
		    	while(k <= nums.length+1)
		    	{
		    			    		
		    		if(queue.front != null)
		    		{
		    			int eq1 = (nums.dequeue());
		    			sb.append(eq1);
		    			if(!stack.isEmpty())
		    			{
		    				if(operators.peek() == ')')
		    				{
		    					char eq3 = (operators.pop().getCitem());
		    					sb.append(eq3);
		    				}
		    			}
		    			
		    		}
		    		else
		    		{
		    			break;
		    		}
		    		
		    		
		    		if(stack.top != null)
		    		{ 
		    			char eq2 = (operators.pop().getCitem());
		    			sb.append(eq2);
		    			if(!stack.isEmpty())
		    			{
		    				if(operators.peek() == '(')
		    				{
		    					char eq3 = (operators.pop().getCitem());
		    					sb.append(eq3);
		    				}
		    				
		    			}
		    			k++;
		    		}
		    	}
		    	 equation = sb.toString();
		    	System.out.println(equation + " = " + engine.eval(equation));
		    	command();
		    	
		    }
		    case 1:
		    {//postfix
		    	System.out.println("Please enter your equation");
		    	String eq = kbd.next();
		    	String equation;
		    	StringBuilder sb = new StringBuilder();
		    	stack operators= new stack();
		    	queue nums= new queue();
		    	int i = 0;
		    	int j = 0;
		    	int k = 0;
		    	
		    	while(Character.isDigit(eq.charAt(i)))
		    	{
		    		int toadd = Character.getNumericValue(eq.charAt(i));
		    		nums.enqueue(toadd);
		    		i++;
		    		j=i;
		    	}
		    	while(j < eq.length())
		    	{
		    		operators.push(eq.charAt(j));
		    		j++;
		    	}
		    	
		    	while(k <= nums.length+1)
		    	{
		    			    		
		    		if(queue.front != null)
		    		{
		    			int eq1 = (nums.dequeue());
		    			sb.append(eq1);
		    			if(operators.peek() == ')')
		    			{
		    				char eq3 = (operators.pop().getCitem());
			    			sb.append(eq3);
		    			}
		    		}
		    		else
		    		{
		    			break;
		    		}
		    		
		    		
		    		if(stack.top != null)
		    		{ 
		    			char eq2 = (operators.pop().getCitem());
		    			sb.append(eq2);
		    			if(operators.peek() == '(')
		    			{
		    				char eq3 = (operators.pop().getCitem());
			    			sb.append(eq3);
		    			}
		    			k++;
		    		}
		    		
		    	}
		    	 equation = sb.toString();
		    	System.out.println(equation + " = " + engine.eval(equation));
		    	command();
		    	
		    }
		    case 2:
		    {
		    	break;
		    }
		
		}
	}
	

}
