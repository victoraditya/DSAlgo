package designpattern.openclose;

import java.util.List;
import java.util.stream.Stream;

public class OCPPrac {

    public static void main(String[] args) {
        Product1 p1 = new Product1("p1",Color1.Red,Size1.Large);
        Product1 p2 = new Product1("p2",Color1.Green,Size1.Medium);
        Product1 p3 = new Product1("p3",Color1.Red,Size1.Small);

        List<Product1> products = List.of(p1, p2, p3);
        ProductFilter1 pf = new ProductFilter1();
        pf.filterByColor(products,Color1.Red).forEach(e->System.out.println(e.name));



    }
}

enum Color1{
    Red,
    Green,
    Blue
}

enum Size1{
    Small,
    Medium,
    Large
}

class Product1{
    public String name;
    public Color1 color;
    public Size1 size;

    public  Product1(String name,Color1 colors,Size1 sizes){
        this.name=name;
        this.color=colors;
        this.size=sizes;
    }
}

class ProductFilter1{
    public Stream<Product1> filterByColor(List<Product1> products, Color1 color){
        return products.stream().filter(p->p.color==color);


    }
}

