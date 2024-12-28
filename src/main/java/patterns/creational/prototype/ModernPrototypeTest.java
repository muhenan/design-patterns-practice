package patterns.creational.prototype;

// all shallow copy
class ModernDocument implements Cloneable {
    private String content;
    private String format;

    public ModernDocument(String content, String format) {
        this.content = content;
        this.format = format;
    }

    @Override
    public ModernDocument clone() {
        try {
            return (ModernDocument) super.clone();
        } catch (CloneNotSupportedException e) {
            return new ModernDocument(this.content, this.format);
        }
    }

    // Another modern approach using copy constructor
    public ModernDocument(ModernDocument other) {
        this.content = other.content;
        this.format = other.format;
    }

    @Override
    public String toString() {
        return "ModernDocument[content=" + content + ", format=" + format + "]";
    }
}

// Test modern approach
class ModernPrototypeTest {
}
