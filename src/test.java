import java.io.StringReader;
import java.util.ArrayList;
import java.util.Scanner;
//�ڶ����޸�

//B1�޸�
//	c4	�޸�
public class test {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Scanner sc = new Scanner(System.in);
		System.out.print("��������ʽ��\n");
		String reader = sc.nextLine();
		String oprator[] = reader.split("[+]");
		char x = 'x';
		derivative(reader,x);

	}
	public static String ddx(String s,char x){
		int couter = 0, flag = 0;
		for (int i = 0; i < s.length(); i++) {
	           char  temp =  s.charAt(i);
	           if(temp == x){
	        	   couter++;
	        	   flag = 1;
	           }
	        }
		if(flag==1)
		{
			s = s.replaceFirst(String.valueOf(x), Integer.toString(couter));
		}
		else
		{
			s = "";
		}
		return s;
	}
	public static void derivative(String reader,char x)
	{

		reader = reader.replaceAll("-", "~-");
		reader = reader.replaceAll("[+]", "~+");
		String oprator[] = reader.split("~");
		String output = "";
		for(String s: oprator) {
			   s = ddx(s,x);
			   if(s == null || s.length() <= 0)
				   {
					   continue;
				   }
			   else
				   {
				   output = output+s;
				   }
			   }

		if(output.charAt(0)=='+')
		{
			output = output.replaceFirst("[+]", "");
		}
		System.out.print("��"+x+"�󵼺�Ľ��Ϊ��\n");
		System.out.print(output);
		
	
	}
}
