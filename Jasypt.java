import java.util.Scanner;
import org.jasypt.util.text.BasicTextEncryptor;
public class Jasypt {
    public static void main(String[] args) {
        String key, pwd, str3;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("�п�JKEY�G");
        key = scanner.nextLine();
		System.out.println("�п�J�s�u�K�X");
		pwd = scanner.nextLine();
		
		BasicTextEncryptor textEncryptor = new BasicTextEncryptor();
		textEncryptor.setPassword(key);
		String newPwd = textEncryptor.encrypt(pwd);
		
		System.out.println("�[�K��K�X�r�ꬰ�G\n" + newPwd);
        
        System.out.println("---------�ѱK��r��---------");
        
        BasicTextEncryptor textEncryptor2 = new BasicTextEncryptor();
		textEncryptor2.setPassword(key);
		String oldPwd = textEncryptor2.decrypt(newPwd);
		System.out.println(oldPwd);
        
        
        
	}
}	