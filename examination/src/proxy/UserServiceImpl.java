package proxy;

public class UserServiceImpl implements UserService {
    @Override
    public String login(String loginName, String passWord) {
        try {
            Thread.sleep(500);
            if ("admin".equals(loginName) && "1234".equals(passWord)) {
                return "Success";
            }
            return "Login Fail";
        } catch (Exception e) {
            e.printStackTrace();
        }

        return "false";
    }

    @Override
    public void selectUsers() {
        long startTimer = System.currentTimeMillis();

    }

    @Override
    public boolean deleteUsers() {
        return false;
    }
}
