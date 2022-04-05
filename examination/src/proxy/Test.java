package proxy;

public class Test {
    public static void main(String[] args){
        UserService userService = ProxyUnit.getProxy(new UserServiceImpl());
        System.out.println(userService.login("admin", "1234"));
        System.out.println(userService.deleteUsers());
        userService.selectUsers();
    }
}
