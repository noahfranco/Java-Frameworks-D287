package com.example.demo.bootstrap;

import com.example.demo.domain.OutsourcedPart;
import com.example.demo.domain.Part;
import com.example.demo.domain.Product;
import com.example.demo.repositories.OutsourcedPartRepository;
import com.example.demo.repositories.PartRepository;
import com.example.demo.repositories.ProductRepository;
import com.example.demo.service.OutsourcedPartService;
import com.example.demo.service.OutsourcedPartServiceImpl;
import com.example.demo.service.ProductService;
import com.example.demo.service.ProductServiceImpl;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

/**
 *
 *
 *
 *
 */
@Component
public class BootStrapData implements CommandLineRunner {

    private final PartRepository partRepository;
    private final ProductRepository productRepository;

    private final OutsourcedPartRepository outsourcedPartRepository;

    public BootStrapData(PartRepository partRepository, ProductRepository productRepository, OutsourcedPartRepository outsourcedPartRepository) {
        this.partRepository = partRepository;
        this.productRepository = productRepository;
        this.outsourcedPartRepository=outsourcedPartRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        List<OutsourcedPart> outsourcedParts =(List<OutsourcedPart>) outsourcedPartRepository.findAll();
        for(OutsourcedPart part:outsourcedParts){
            System.out.println(part.getName()+" "+part.getCompanyName());
        }

        // Noah's Computer Shop Data
        long productsCount = productRepository.count();
        long partsCount = partRepository.count();

        if (productsCount == 0 && partsCount == 0) {
            // Products
            Product appleIMac = new Product("Apple iMac",2499.00,200);
            productRepository.save(appleIMac);
            Product dellDesktop = new Product("Dell XPS Desktop",799.00,100);
            productRepository.save(dellDesktop);
            Product hpDesktop = new Product("HP Pavilion Desktop",400.00,500);
            productRepository.save(hpDesktop);
            Product thinkPadLaptop = new Product("Lenovo ThinkPad X1 Carbon",2500.00,50);
            productRepository.save(thinkPadLaptop);
            Product microsoftSurfaceLaptop = new Product("Microsoft Surface Laptop",999.00,15);
            productRepository.save(microsoftSurfaceLaptop);

            // Parts
            OutsourcedPart applePart = new OutsourcedPart();
            applePart.setCompanyName("Apple");
            applePart.setName("Power Adapter");
            applePart.setInv(15);
            applePart.setPrice(150.00);
            applePart.setId(100L);
            applePart.setMinInv(1);
            applePart.setMaxInv(100);
            outsourcedPartRepository.save(applePart);

            OutsourcedPart dellPart = new OutsourcedPart();
            dellPart.setCompanyName("Dell");
            dellPart.setName("Cooling Fan");
            dellPart.setInv(100);
            dellPart.setPrice(250.00);
            dellPart.setId(200L);
            dellPart.setMinInv(1);
            dellPart.setMaxInv(200);
            outsourcedPartRepository.save(dellPart);

            OutsourcedPart hpPart = new OutsourcedPart();
            hpPart.setCompanyName("Hp");
            hpPart.setName("Monitor");
            hpPart.setInv(231);
            hpPart.setPrice(350.00);
            hpPart.setId(300L);
            hpPart.setMinInv(1);
            hpPart.setMaxInv(300);
            outsourcedPartRepository.save(hpPart);

            OutsourcedPart logitechPart = new OutsourcedPart();
            logitechPart.setCompanyName("Logitech");
            logitechPart.setName("MK270 Wireless Keyboard");
            logitechPart.setInv(387);
            logitechPart.setPrice(38.00);
            logitechPart.setId(400L);
            logitechPart.setMinInv(1);
            logitechPart.setMaxInv(400);
            outsourcedPartRepository.save(logitechPart);

            OutsourcedPart nvidiaPart = new OutsourcedPart();
            nvidiaPart.setCompanyName("Nvidia");
            nvidiaPart.setName("GeForce RTX 4080 Super");
            nvidiaPart.setInv(421);
            nvidiaPart.setPrice(1299.00);
            nvidiaPart.setId(400L);
            nvidiaPart.setMinInv(1);
            nvidiaPart.setMaxInv(500);
            outsourcedPartRepository.save(nvidiaPart);
        }


        System.out.println("Started in Bootstrap");
        System.out.println("Number of Products"+productRepository.count());
        System.out.println(productRepository.findAll());
        System.out.println("Number of Parts"+partRepository.count());
        System.out.println(partRepository.findAll());

    }
}
