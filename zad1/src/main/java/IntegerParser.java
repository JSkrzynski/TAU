public class IntegerParser {
    public int convertStringToInt(String str) throws Exception {
        try {
            int result = Integer.parseInt(str);
            return result;
        } catch (NumberFormatException e) {
            throw new Exception("Nima");
        }
    }
}
