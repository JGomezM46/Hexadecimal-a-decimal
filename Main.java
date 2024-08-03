public class Main {
    public static void main(String[] args) {
        String hexadecimal = "AB";
        long decimal = Integer.parseInt(hexadecimal, 16);
        System.out.printf("El hexadecimal %s es %d en hexadecimal usando Integer.parseInt\n", hexadecimal, decimal);
        decimal = hexadecimalADecimal(hexadecimal);
        System.out.printf("El hexadecimal %s es %d en hexadecimal usando forma propia\n", hexadecimal, decimal);
    }

    public static int caracterHexadecimalADecimal(char caracter) {
        switch (caracter) {
            case 'A':
                return 10;
            case 'B':
                return 11;
            case 'C':
                return 12;
            case 'D':
                return 13;
            case 'E':
                return 14;
            case 'F':
                return 15;
            default:
                return Integer.parseInt(String.valueOf(caracter));
        }
    }

    public static long hexadecimalADecimal(String hexadecimal) {
        long decimal = 0;
        int potencia = 0;
        for (int x = hexadecimal.length() - 1; x >= 0; x--) {
            int valor = caracterHexadecimalADecimal(hexadecimal.charAt(x));
            long elevado = (long) Math.pow(16, potencia) * valor;
            decimal += elevado;
            potencia++;
        }
        return decimal;
    }
}