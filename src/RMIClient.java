import java.rmi.Naming;
import java.util.Scanner;

public class RMIClient {
    public static void main(String[] args) {
        try {
            IAuthenticationService authService = (IAuthenticationService) Naming.lookup("rmi://localhost/AuthenticationService");

            Scanner scanner = new Scanner(System.in);
            System.out.print("���̵� �Է��ϼ���: ");
            String userId = scanner.nextLine();

            System.out.print("��й�ȣ�� �Է��ϼ���: ");
            char[] password = scanner.nextLine().toCharArray();

            // �α��� �õ�
            boolean loginResult = authService.authenticate(userId, password);

            if (loginResult) {
                System.out.println("�α��ο� �����Ͽ����ϴ�.");
            } else {
                System.out.println("�α��ο� �����Ͽ����ϴ�.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
