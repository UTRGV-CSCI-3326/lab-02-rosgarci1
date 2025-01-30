public class MixMatch {
    public static void main(String[] args) {
        //declare 8 different types of variables
        String ranWord = "Cloud";
        char letter = 'v';
        short sNum = -3;
        int iNum = 1;
        long lNum = 98;
        float fNum = 4.25f;
        double dNum = 8.79521864;
        boolean isTrue = false;

        // print out multiple variables at once using '+'
        System.out.println(ranWord + ": String <- any amount of characters contained in quotation marks. " + letter + ": Char <- a single character stored in single quotes. " + sNum + ": Short <- two's complement integer between -32,768 - 32,767. " + iNum + ": Integer <- stores whole number between -2,147,483,648 - 2,147,483,647. " + lNum + ": Long <- whole number between -9,223,372,036,854,775,808 - 9,223,372,036,854,775,807. " + fNum + ": Float <- a decimal stores 6-7 digits. " + dNum + ": Double <- stores decimal numbers 14-15 digits. " + isTrue + ": Boolean <- holds true or false for conditional testing. ");
    }
}