public class UserValidation {
    public void validateUser(String username, String password) throws Exception {
        // Validate username length
        if (username.length() < 5 || username.length() > 15) {
            throw new Exception("Username must be between 5 and 15 characters.");
        }
        
        // Validate password for special characters
        if (!password.matches(".*[!@#$%^&*()_+].*")) {
            throw new Exception("Password must contain at least one special character.");
        }
        
        // Additional validation logic can be added here
    }
}
