import java.util.Scanner;
import org.jasypt.util.text.BasicTextEncryptor;
public class Jasypt {
    public static void main(String[] args) {
        String key, pwd, str3;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("請輸入KEY：");
        key = scanner.nextLine();
		System.out.println("請輸入連線密碼");
		pwd = scanner.nextLine();
		
		BasicTextEncryptor textEncryptor = new BasicTextEncryptor();
		textEncryptor.setPassword(key);
		String newPwd = textEncryptor.encrypt(pwd);
		
		System.out.println("加密後密碼字串為：\n" + newPwd);
        
        System.out.println("---------解密後字串---------");
        
        BasicTextEncryptor textEncryptor2 = new BasicTextEncryptor();
		textEncryptor2.setPassword(key);
		String oldPwd = textEncryptor2.decrypt(newPwd);
		System.out.println(oldPwd);
        
        
        
	}
}	