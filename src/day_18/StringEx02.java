/*
 * # ���ڿ� [��]
 * . ���ڿ� �񱳴� equals() �޼��带 ���� Ȯ���� �� �ִ�.
 */
package day_18;

import java.util.Scanner;

public class StringEx02 {
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		
		String name = "ȫ�浿";
		
		System.out.println("�̸��� �Է��ϼ���: ");
		String myName = sc.next();
		
		if(name==myName)
		{
			System.out.println("== ������: ��ġ");
		}
		else
		{
			System.out.println("== ������: ����ġ");
		}
		
		if(name.equals(myName))
		{
			System.out.println("equals() �޼���: ��ġ");
		}
		else
		{
			System.out.println("equals() �޼���: ����ġ");
		}
	}
}
