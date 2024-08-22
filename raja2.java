interface cebil1
{
	public static final int cebil = 5;

	public int rai(double amount);

}

cebil1 implements hdfc
{
	@Override
	public int rai(double amount)
	{
		int cebil1 = 6;
		if(cebil1 > = cebil)
		{
			double rai1 = (amount * cebil1)/100;
			System.out.println(rai1);
		}
		else
		{
			System.out.println("Cebil is not acceptable for loan");

			return 0;
		}

public class customer
{
	public static void main(String[] args)
	{
		hdfc h = new hdfc();
		h.rai(30000);

		cebil1 c = new hdfc();
		c.rai(4000);



