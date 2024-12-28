package patterns.creational.prototype;

// Prototype interface
interface Prototype {
    Prototype clone();
}

// Concrete prototype
class Document implements Prototype {
    private String content;
    private String format;

    public Document(String content, String format) {
        this.content = content;
        this.format = format;
    }

    /**
     * clone function
     * */
    @Override
    public Document clone() {
        return new Document(this.content, this.format);
    }

    @Override
    public String toString() {
        return "Document[content=" + content + ", format=" + format + "]";
    }
}

// Client code
class PrototypeTest {
    public static void main(String[] args) {
        Document original = new Document("Hello", "PDF");
        Document cloned = original.clone();

        System.out.println("Original: " + original);
        System.out.println("Cloned: " + cloned);
    }
}