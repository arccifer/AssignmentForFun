package Strings;

public class BasicStrings {

    public String flipConcat(String string1, String string2) {
        return string2+string1;
    }

    public char getChar(String string, int index) {
        return string.charAt(index);
    }

    public String iCantSee(String string) {
        return " ".repeat(string.length());
    }

    public String loudAndClear(String string) {
        return string.toUpperCase();
    }

    public String reverseCase(String string) {
        char[] ca = string.toCharArray();
        for (int i=0; i<ca.length; i++){
            if ((int)(ca[i])>=97 && (int)(ca[i])<=122){
                ca[i] = (char)((int)(ca[i])-32);
            }
            else if ((int)(ca[i])>=65 && (int)(ca[i])<=90){
                ca[i] = (char)((int)(ca[i])+32);
            }
        }
        return new String(ca);
    }

    public String oneAtATime(String string1, String string2) {
        char[] ca = new char[string1.length()+string2.length()];
        for(int i=0;i<string1.length();i++){
            ca[i*2] = string1.charAt(i);
            if(i<string2.length()){
                ca[i*2+1] = string2.charAt(i);
            }
        }
        return new String(ca);
    }
}
