class User {
    private String password;
    public void setPassword(String password) {
        if(password.length() >= 8) {
            this.password = password;
            System.out.println("Password updated.");
        } else {
            System.out.println("Password must be at least 8 characters.");
        }
    }
    public String getPassword() { return password; }
}

public class SetterValidation {
    public static void main(String[] args) {
        User user = new User();
        user.setPassword("123");
        user.setPassword("securePassword123");
    }
}
