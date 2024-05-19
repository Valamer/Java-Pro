public class Main   {
    public static void main(String[] args) {

        try {
            int result = ArrayValueCalculator.doCalc(new String[][]{
                    {"123", "123", "111", "22"}, {"35", "62", "234", "84"}, {"67", "45", "56", "86"}});
            System.out.println(result);
        } catch (ArraySizeException | ArrayDataException exception) {
            System.out.println(exception.getMessage());
        }

        try {
            int result = ArrayValueCalculator.doCalc(new String[][]{
                    {"123", ":';k", "111", "22"}, {"35", "62", "234", "84"},
                    {"67", "45", "56", "86"}, {"24", "13", "23", "64"}});
            System.out.println(result);
        } catch (ArraySizeException | ArrayDataException exception) {
            System.out.println(exception.getMessage());
        }

        try {
            int result = ArrayValueCalculator.doCalc(new String[][]{
                    {"123", "123", "111", "22"}, {"35", "62", "234", "84"},
                    {"67", "45", "56", "86"}, {"24", "13", "23", "64"}});
            System.out.println(result);
        } catch (ArraySizeException | ArrayDataException exception) {
            System.out.println(exception.getMessage());
        }
    }
}
