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

//        productView.showProduct();
//        productView.add();
//        productView.showProduct();
//        System.out.println("");
//        productView.sortASC();
//        productView.sortDESC();
//        productView.findProductbyName();
//        productView.updateProduct();
//        productView.showProduct();
//        paymentView.buy();
//        System.out.println(test.existProduct(5));
//        paymentView.option();
        menu.chon();
//        paymentView.showAllIncome();
//        productView.showProductDescription();

    }
}
