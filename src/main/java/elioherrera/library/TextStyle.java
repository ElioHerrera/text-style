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
        BLACK("0"), NEGRO("0"),
        RED("1"), ROJO("1"),
        GREEN("2"), VERDE("2"),
        YELLOW("3"), AMARILLO("3"),
        BLUE("4"), AZUL("4"),
        MAGENTA("5"),
        CYAN("6"), CIAN("6"),
        WHITE("7"), BLANCO("7"),
        GREY("8"), GRIS("8"),

        HIGH_RED("9"), ROJO_INTENSO("9"),
        HIGH_GREEN("10"), VERDE_INTENSO("10"),
        HIGH_YELLOW("11"), AMARILLO_INTENSO("11"),
        HIGH_BLUE("12"), AZUL_INTENSO("12"),
        HIGH_MAGENTA("13"), MAGENTA_INTENSO("13"),
        HIGH_CYAN("14"), CIAN_INTENSO("14"),
        HIGH_WHITE("15"), BLANCO_INTENSO("15"),





         
        ORANGE("208"), NARANJA("208"),
        PINK("218"), ROSA("218"),
        PURPLE("129"), PURPURA("129"),
        BROWN("94"), MARRON("94"),
        VIOLET("93"), VIOLETA("93"),
        INDIGO("75"),
        GOLD("220"), DORADO("220");

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
        NORMAL("0"),
        BOLD("1"), NEGRITA("1"),
        ITALIC("3"), CURSIVA("3"),
        UNDERLINED("4"), SUBRAYADO("4"),

        BLINK("5"), PARPADEO("5"),
        REVERSE("7"), INVERTIDO("7"),
        HIDDEN("8"), OCULTO("8"),

        STRIKETHROUGH("9"), TACHADO("9"),
        DOUBLE_UNDERLINED("21"), SUBRAYADO_DOBLE("21");


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
        BRIGHT("9"), BRILLANTE("9"),
        BACKGROUND("4"), FONDO("4"),
        BRIGHT_BACKGROUND("10"), FONDO_BRILLANTE("10");

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