package com.netcracker;

import com.netcracker.config.SpringConfig;
import com.netcracker.service.IBookService;
import com.netcracker.service.ICustService;
import com.netcracker.service.IPurchaseService;
import com.netcracker.service.IShopService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;


public class Main {
    private static void task2(ICustService service,IBookService service1,IPurchaseService service2){
        System.out.println("------------- Task Two ---------------");
        System.out.println(service1.getAllTitle());
        System.out.println(service1.getAllCost());
        System.out.println(service.getAllDistrict());
        System.out.println(service2.getAllMonths());
    }
    private static void task3(ICustService service,IShopService service1){
        System.out.println(service.getCustomersNizegorodkogoD());
        System.out.println(service1.shopsSormAndSovetDist());
    }
    private static void task4(IPurchaseService service){
        System.out.println("--------------- Task Four --------------");
        System.out.println(service.getInfo());
        System.out.println(service.getDetailInfo());
    }

    public static void main(String[] args) {
        AbstractApplicationContext context
                = new AnnotationConfigApplicationContext(SpringConfig.class);

        ICustService service =
                (ICustService) context.getBean("custService");
        IBookService service1 =
                (IBookService) context.getBean("bookService");
        IShopService service2 =
                (IShopService) context.getBean("shopService");
        IPurchaseService service3 =
                (IPurchaseService) context.getBean("purchaseService");

        System.out.println(service.findById(2));
        System.out.println(service3.findById(1));
        task2(service,service1,service3);
        task3(service,service2);
        task4(service3);
        System.out.println(service3.getBigPurchases());

    }
}
