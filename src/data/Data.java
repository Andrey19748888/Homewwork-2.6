package data;

public class Data {

    private static final String BIG_LENGTH = "Длина логина дольен быть от 1 до 20 символов";
    private static final String INCORRECT_SYMBOL = "Password должен содержать в себе только латинские буквы, цифры и знак подчеркивания";
    private static final String PASSWORDS_DOES_NOT_MATCH = "Пароль не совпадает";

    public static boolean checkPassword( String login, String password, String confirmPassword) throws Exception{
        if (login.length() > 0 & login.length() < 21) {
            char[] chars;
            chars = password.toCharArray();
            for (char c : chars) {
                if (c != '_' && !(c >= 'A' && c <= 'Z') && !( c >= 'a' && c <= 'z') && !( c >= '0' && c <= '9')) {
                    throw new WrongPasswordException(INCORRECT_SYMBOL);
                }
            }
            if (confirmPassword.equals(password)) {
                return true;
            } else {
                throw new WrongPasswordException(PASSWORDS_DOES_NOT_MATCH);
            }
        } else {
            throw new WrongLoginException(BIG_LENGTH);
        }
    }
}
