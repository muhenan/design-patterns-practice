package patterns.structural.adapter;

// Adaptee Interface - 旧接口
interface OldPaymentSystem {
    void processPayment(String customerName, double amount);
}

// Concrete Adaptee - 旧接口的实现
class LegacyPaymentProcessor implements OldPaymentSystem {
    @Override
    public void processPayment(String customerName, double amount) {
        System.out.println("Processing payment for " + customerName + " with amount $" + amount + " using LegacyPaymentProcessor.");
    }
}

// Target Interface - 新接口
interface NewPaymentGateway {
    void pay(String userId, double totalAmount);
}

// Adapter Class - 适配器类（新接口的实现）
class PaymentAdapter implements NewPaymentGateway {
    private OldPaymentSystem oldPaymentSystem;

    // 构造方法接受旧接口的实现
    public PaymentAdapter(OldPaymentSystem oldPaymentSystem) {
        this.oldPaymentSystem = oldPaymentSystem;
    }

    @Override
    public void pay(String userId, double totalAmount) {
        System.out.println("Adapter converting NewPaymentGateway request to OldPaymentSystem.");
        // 假设 userId 等价于 customerName
        oldPaymentSystem.processPayment(userId, totalAmount);
    }
}

// Client - 客户端代码
public class AdapterExample {
    public static void main(String[] args) {
        // 使用旧接口的实现
        OldPaymentSystem legacyProcessor = new LegacyPaymentProcessor();

        // 用适配器适配为新接口
        NewPaymentGateway paymentGateway = new PaymentAdapter(legacyProcessor);

        // 客户端使用新接口
        System.out.println("Client making payment using NewPaymentGateway:");
        paymentGateway.pay("JohnDoe123", 150.75);
    }
}


