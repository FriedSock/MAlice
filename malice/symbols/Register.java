package malice.symbols;

public class Register implements Storage {
    
    public static final Register NONE = new Register("NONE");
    public static final Register eax = new Register("eax");
    public static final Register ebx = new Register("ebx");
    public static final Register ecx = new Register("ecx");
    public static final Register edx = new Register("edx");
    public static final Register esi = new Register("esi");
    public static final Register edi = new Register("edi");
    public static final Register ebp = new Register("ebp");
    public static final Register esp = new Register("esp");
    private static final Register[] VALUES = {eax, ebx, ecx, edx, esi, edi, ebp, esp};
    
    private final String name;
    
    private Register(String name) {
        this.name = name;
    }

    public static Register[] values() {
        return VALUES;
    }
    
    @Override
    public boolean isRegister() {
        return true;
    }

    @Override
    public String toString() {
        return name;
    }
}