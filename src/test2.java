import java.util.Scanner;

public class test2 {
	
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Scanner sc = new Scanner(System.in);
		System.out.print("��������ʽ��\n");
		String reader = sc.nextLine();
		String oprator[] = reader.split("[+]");
		char x = 'x';
		derivative(reader,x);

	}
	//���ǵ�һ���޸�
}
