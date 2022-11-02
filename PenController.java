public class PenController {
    PenMVC pen;
    PenView penView;

    PenController() {
        pen = null;
        penView = null;
    }

    void setPen(PenMVC pen) {
        this.pen = pen;
    }

    void setPenView(PenView penView) {
        this.penView = penView;
    }

    public void setPenName(String name) {
        pen.setName(name);
    }

    public void setPenBrand(String brand) {
        pen.setBrand(brand);
    }

    public void setPenPrice(double price) {
        pen.setPrice(price);
    }

    public void setPenColor(String color){
        pen.setColor(color);
}
    int sellPen(int quantity)
    {
        if(PenMVC.quantity>= quantity) {
            PenMVC.quantity -= quantity;
            return -1;
        }
        else {
            return PenMVC.quantity;
        }
        }
        void updateView(){
        penView.PenDetails(pen.getName(), pen.getBrand(), pen.getPrice(), pen.getColor());
    }
}
