package elioherrera.library;

public class TextStyle {

    private static final String PREFIX = "\033[";
    private static final String SUFFIX = "m";
    public static final String RESET = PREFIX + "0" + SUFFIX;

    private final Color color;
    private final Style style;
    private final Effect effect;

    public TextStyle(Color color, Style style, Effect effect) {
        this.color = color;
        this.style = style;
        this.effect = effect;
    }

    @Override
    public String toString() {
        return PREFIX + style + ";" + effect + color + SUFFIX;
    }

    public enum Color {
        BLACK("0"), // NEGRO
        RED("1"), // ROJO
        GREEN("2"), // VERDE
        YELLOW("3"), // AMARILLO
        BLUE("4"), // BLUE
        MAGENTA("5"), // MAGENTA
        CYAN("6"), // CIAN
        WHITE("7"); // BLANCO

        private final String code;

        Color(String code) {
            this.code = code;
        }

        @Override
        public String toString() {
            return code;
        }
    }

    public enum Style {
        NORMAL("0"), // NORMAL
        BOLD("1"), // NEGRITA
        ITALIC("3"), // CURSIVA
        UNDERLINED("4"); // SUBRAYADO

        private final String code;

        Style(String code) {
            this.code = code;
        }

        @Override
        public String toString() {
            return code;
        }
    }

    public enum Effect {
        NORMAL("3"), //NORMAL
        BRIGHT("9"), //BRILLANTE
        BACKGROUND("4"), //FONDO
        BRIGHT_BACKGROUND("10"); //FONDO BRILLANTE

        private final String code;

        Effect(String code) {
            this.code = code;
        }

        @Override
        public String toString() {
            return code;
        }
    }
}