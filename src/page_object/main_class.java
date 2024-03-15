package page_object;

public class main_class {
    public static void main(String[] args) {

        driver_setup o = new driver_setup();
        signin_page a = new signin_page();
        a.username();
        login_page b = new login_page();
        b.login();
        main_page c = new main_page();
        c.coupons_click();
        coupons_page d = new coupons_page();
        d.electronics();

    }
}
