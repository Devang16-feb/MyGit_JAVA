import java.util.Scanner;
class Test
{
	int MAX = 1000;
	int top = 0;
	int a[] = new int[MAX];
	
	boolean isEmpty()
	{
		return (top<0);
	}
	void push(int x)
    {
        if (top >= (MAX - 1)) 
        {
            System.out.println("Stack Overflow");
        }
        else 
        {
            a[++top] = x;
        }
    }
	int pop()
    {
        if (top < 0) 
        {
            System.out.println("Stack Underflow");
            return 0;
        }
        else 
        {
            int x = a[top--];
            return x;
        }
    }
	int peek()
	{
		if(top < 0 )
		{
			System.out.println("stack is underflow");
			return 0;
		}
		else
		{
			int x=a[top];
		    return x;
		}
	}
	void print()
    {
    for(int i = top;i>0;i--)
    {
      System.out.print(" "+ a[i]);
    }
  }
  
}
public class methods 
{
    public static void main(String[] args) 
	{
		try (Scanner sc = new Scanner(System.in)) {
            Test p= new Test();
            System.out.print("set a size:");
            int n=sc.nextInt();
            for(int i=0 ; i < n ; i++) //enter 1 2 3 4 5 
            {
            	p.push(sc.nextInt());
            }
            System.out.println("top element:"+p.peek());
            System.out.println("stack is empty "+p.isEmpty());
            System.out.println("elements present in stack:");
            p.print();
            System.out.println();
            p.pop();
            System.out.println("elements present in stack after popping:");
            p.print();
        }
	}
}
