package Homework_1;

public class course {
    private static final String[] Depts ={"Computer Science","Chemistry","Physics","Mathematics","Botany","Zoology"};
    private static final String[] Codes = {"CS","CHEM","PHYS","MATH","BTNY","ZOO"};
    private String name;
    private int number;
    private int credits;
    private String code;
    public course(){}
    public course(String code,String name, int number, int credits){
        this.code = code;
        this.name = name;
        this.number = number;
        this.credits = credits;
    }

    public static int findIndex(String[] a, String target) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == (target)) {
                return i;
            }
        }
        return -1;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
    public static String[] getDepts(){
        return Depts;
    }
    public static String deptToCode(String dept){

        return Codes[findIndex(Depts,dept)];

    }
    public static String codeToDept(String code){
        return Depts[findIndex(Codes,code)];
    }
    public static String[] getCodes(){
        return Codes;
    }
    public String toString(){
        return codeToDept(code)+" "+number+": "+name+", worth "+credits+" credits";
    }





}
