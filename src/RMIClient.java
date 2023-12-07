import java.rmi.Naming;
import java.util.Scanner;

public class RMIClient {
    public static void main(String[] args) {
        try {
            IAuthenticationService authService = (IAuthenticationService) Naming.lookup("rmi://localhost/AuthenticationService");

            Scanner scanner = new Scanner(System.in);
            System.out.print("아이디를 입력하세요: ");
            String userId = scanner.nextLine();

            System.out.print("비밀번호를 입력하세요: ");
            char[] password = scanner.nextLine().toCharArray();

            // 로그인 시도
            boolean loginResult = authService.authenticate(userId, password);

            if (loginResult) {
                System.out.println("로그인에 성공하였습니다.");
            } else {
                System.out.println("로그인에 실패하였습니다.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
