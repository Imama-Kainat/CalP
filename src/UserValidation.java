public class UserValidation {
    public void validateUser(String username, String password, String email) throws Exception {
        // Check for duplicate username (this is a placeholder; implement your own logic)
        if (isUsernameTaken(username)) {
            throw new Exception("Username is already taken.");
        }
        
        // Email validation
        if (!email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$")) {
            throw new Exception("Invalid email format.");
        }
        
        // Previous validation logic
        // Validate username length
        if (username.length() < 5 || username.length() > 15) {
            throw new Exception("Username must be between 5 and 15 characters.");
        }
        
        // Validate password for special characters
        if (!password.matches(".*[!@#$%^&*()_+].*")) {
            throw new Exception("Password must contain at least one special character.");
        }
        
        // Additional registration logic can be added here
    }
    
    private boolean isUsernameTaken(String username) {
        // Logic to check if the username exists in the database
        return false; // Placeholder
    }
}
