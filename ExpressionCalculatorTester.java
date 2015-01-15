import javax.script.ScriptException;

public class ExpressionCalculatorTester
{

	public static void main(String[] args)
	{
		ExpressionCalculator calc= new ExpressionCalculator();
		try {
			calc.evaluate();
		} catch (ScriptException e) 
		{
			e.printStackTrace();
		}
	}

}
