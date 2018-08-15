package project;

public class AllowedOrigins {

    public enum Origins {
        HEROKU_TEST("https://reallyawesomeapp.herokuapp.com/"),
        LOCALHOST_3000("http://localhost:3000"),
        HEROKU_DEPLOY("https://frontend-drive.herokuapp.com"),
        DEPLOY("https://drive-game.me"),
        RAW_NEW_DEPLOY("http://46.101.103.150");

        private String origin;

        Origins(String origin) {
            this.origin = origin;
        }

        public static String[] toStringArray() {
            final String[] result = new String[Origins.values().length];
            int counter = 0;
            for (Origins i : values()) {
                result[counter++] = i.origin;
            }
            return result;
        }
    }
}
