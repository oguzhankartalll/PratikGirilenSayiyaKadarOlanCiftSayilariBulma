import java.util.Scanner;
public class Main {
	public static void main(String[] args)
	{
		int j = 1;
		int user;

		Scanner sc = new Scanner(System.in);


		System.out.print("Sayı Girin:");
		user = sc.nextInt();

		while (j <= user)
		{
			j = j + 1;

			if (j % 2 == 0)
			{
				System.out.println(j);
			}
		}
	}
}