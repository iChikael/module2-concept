import product.services.ProductService;
import product.views.Menu;
import product.views.PaymentView;
import product.views.ProductView;

public class Main {
    public static void main(String[] args) {
        ProductView productView = new ProductView();
        PaymentView paymentView = new PaymentView();
        ProductService test = new ProductService();
        Menu menu= new Menu();


        menu.chon();


    }
}
