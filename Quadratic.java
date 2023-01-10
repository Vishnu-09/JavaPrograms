
		{
			root1=(-b+Math.sqrt(d))/(2*a);
			root2=(-b+Math.sqrt(d))/(2*a);
			System.out.println("the roots are real and distinct");
			System.out.format("root1=%.2f and root2=%.2f",root1,root2);
		}
		else if(d==0)
		{
				root1=root2=-b/(2*a);
			System.out.println("the roots are real and equal");
			System.out.format("root1=root2=%.2f:",root1);
		}
		else
		{
						double real = -b/(2*a);
			double imaginary=Math.sqrt(-d)/(2*a);
			System.out.println("the roots are imaginary");
			System.out.format("root1=%.2f+%.2f;,",real,imaginary);
			System.out.format("root1=%.2f-%.2f;,",real,imaginary);
		}
	}

}

