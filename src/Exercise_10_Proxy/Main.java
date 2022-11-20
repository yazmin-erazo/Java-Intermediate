package Exercise_10_Proxy;

public class Main {
    public static void main(String[] args) {
        Usuario premium = new Usuario(12345, "Premium");
        Usuario free = new Usuario(67890, "Free");
        ProxyDescarga proxy = new ProxyDescarga();

        proxy.descarga(premium, "Sweet child o mine");
        proxy.descarga(free, "Stairway to heaven");
    }
}
