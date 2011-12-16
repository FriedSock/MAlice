package malice.symbols;

public class MemoryLocation implements Storage {
    
    private final String locationName;
    
    public MemoryLocation(String locationName) {
        this.locationName = locationName;
    }

    @Override
    public boolean isRegister() {
        return false;
    }
    
    public String getLocationName() {
        return locationName;
    }
    
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof MemoryLocation)) {
            return false;
        }
        MemoryLocation other = (MemoryLocation) o;
        return locationName.equals(other.locationName);
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 43 * hash + (this.locationName != null ? this.locationName.hashCode() : 0);
        return hash;
    }
    
    @Override
    public String toString() {
        return "[" + locationName + "]";
    }
}