package malice.symbols;

public class Register implements Storage {
    
    public static final Register NONE = new Register("NONE");
    public static final Register rax = new Register("rax");
    public static final Register rbx = new Register("rbx");
    public static final Register rcx = new Register("rcx");
    public static final Register rdx = new Register("rdx");
    public static final Register rsi = new Register("rsi");
    public static final Register rdi = new Register("rdi");
    public static final Register rbp = new Register("rbp");
    public static final Register rsp = new Register("rsp");
    private static final Register[] VALUES = {rax, rbx, rcx, rdx, rsi, rdi, rbp, rsp};
    
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
    public boolean equals(Object o) {
        if (!(o instanceof Register)) {
            return false;
        }
        Register other = (Register) o;
        return name.equals(other.name);
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + (this.name != null ? this.name.hashCode() : 0);
        return hash;
    }
    
    @Override
    public String toString() {
        return name;
    }
}