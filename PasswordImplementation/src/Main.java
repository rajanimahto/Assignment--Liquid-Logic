import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        int flag = 0;
        String data = DataReader.readFileAsString(
                "C:\\Users\\rmahto\\Documents\\passwords list.txt");
        // System.out.println(data);

        String[] individualConditionals_passwords = data.split("\n");
        //System.out.println("individual_passwords::" +individual_passwords);
        for (int i = 0; i < individualConditionals_passwords.length; i++) {
            //System.out.println("individual_passwords::" + individualConditionals_passwords[i]);
            String[] required_count = individualConditionals_passwords[i].split(":");
            //System.out.println("required_count::" + required_count[0] + required_count[1]);

            String[] counter = (required_count[0].split(" "));
            String token=counter[1];
            //System.out.println("token::" + counter[1]);
            String[] counts = (counter[0].split("-"));
            String minimumCount = counts[0];
            String maximumCount = counts[1];
            String password = required_count[1];
            System.out.println("minimumCount::" + minimumCount + " maxcount::" + maximumCount + " password::" + password);
            if (password.contains(token)
                    && countLettersInPass(password, token.charAt(0)) < Integer.valueOf(minimumCount)
                    && countLettersInPass(password, token.charAt(0)) < Integer.valueOf(maximumCount)) {
                System.out.println("Password is valid::");
                flag++;
            }
        }
        System.out.println("Number of Valid Passwords:" + flag);
    }

    public static int countLettersInPass(String password, char token) {
        int count = 0;

        for (int i = 0; i < password.length(); i++) {
            if (password.charAt(i) == token) {
                count++;
            }
        }
        return count;
    }
}