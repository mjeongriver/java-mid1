package enumeration.ref1;

public class ClassGrade {

    public static final ClassGrade BASIC = new ClassGrade(10); //x001
    public static final ClassGrade GOLD = new ClassGrade(20); //x002
    public static final ClassGrade DIAMOND = new ClassGrade(30);

    private final int dicountPercent;

    private ClassGrade(int dicountPercent) {
        this.dicountPercent = dicountPercent;
    }

    public int getDicountPercent() {
        return dicountPercent;
    }
}
