import com.google.gson.Gson;
import user.User;

public class Main {
    public static void main(String[] args) {
        Gson gson = new Gson();
        String s = "{name: Ivan, lastName: Mukanov }";
        User user = gson.fromJson(s, User.class);
        System.out.println(gson.toJson(user));
    }
}