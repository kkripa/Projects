package Classes;

import java.util.ArrayList;

public class ProductDB {
    
    public ArrayList<Product> getProducts()
    {
        ArrayList<Product> p=new ArrayList<Product>();
        Product p1=new Product();
        p1.setProductCode("Electric_1");
        p1.setProductName("Gibson Billy F. Gibbons Les Paul Aged Goldtop");
        p1.setCatalogCategory("Electric Guitar");
        p1.setDescription("The first ground-up revision of Gibson’s stunning original solidbody electric in over 60 years is a masterpiece of style. In addition to its luscious goldtop finish, it features a unique pinstripe design created by Billy himself, which is hand-recreated one at a time by respected hotrod-pinstripe artist Rick Harris and a Gibson artist trained personally by Rick. Sonically and visually, the guitar blows the doors off the venue with a neck profile measured precisely from the Rev’s own Les Paul, ultra-light construction, custom electronics, and a pair of Seymour Duncan Pearly Gates pickups.");
        p1.setPrice(13165.99);
        p1.setImageURL1("images/1_a.jpg");
        p1.setImageURL2("images/1_b.jpg");
        p1.setImageURL3("images/1_c.jpg");
        p1.setImageURL4("images/1_d.jpg");
        p.add(p1);
        
        Product p2=new Product();
        p2.setProductCode("Electric_2");
        p2.setProductName("Gibson Collector's Choice™ #16 1959 Les Paul \"Redeye\"");
        p2.setCatalogCategory("Electric Guitar");
        p2.setDescription("Gibson Custom’s Collector’s Choice™ series is dedicated to re-creating the exact look, feel, tone, and “vibe” of some of the rarest instruments in guitar history.Collector’s Choice™ 16 is the long-time sidekick of Ed King, co-writer of the southern-rock classic “Sweet Home Alabama,” and has been played on countless gigs and recording sessions through Ed’s work with Lynyrd Skynyrd and Strawberry Alarm Clock. When Ed agreed to work with Gibson Custom to recreate his Collector’s Choice Les Paul, the team was taken initially by the beautiful, well-preserved look of the guitar.");
        p2.setPrice(16758.98);
        p2.setImageURL1("images/2_a.jpg");
        p2.setImageURL2("images/2_b.jpg");
        p2.setImageURL3("images/2_c.jpg");
        p2.setImageURL4("images/2_d.jpg");
        p.add(p2);
        
        Product p3=new Product();
        p3.setProductCode("Electric_3");
        p3.setProductName("PRS Private Stock #4577 Paul's Guitar in Burnt Orange Glow ");
        p3.setCatalogCategory("Electric Guitar");
        p3.setDescription("The Private Stock program began in 1996 as a way to bring instruments that Paul envisioned to light outside the normal manufacturing process. PRS's Private Stock program represents the highest quality of materials, the most personally crafted instruments, and the greatest level of customization");
        p3.setPrice(14260.99);
        p3.setImageURL1("images/3_a.jpg");
        p3.setImageURL2("images/3_b.jpg");
        p3.setImageURL3("images/3_c.jpg");
        p3.setImageURL4("images/3_d.jpg");
        p.add(p3);
        
        Product p4=new Product();
        p4.setProductCode("Acoustic_1");
        p4.setProductName("Martin D45 Dreadnought Acoustic");
        p4.setCatalogCategory("Acoustic Guitar");
        p4.setDescription("The D-45 is the most ornately appointed guitar in the Martin line. The D-45 Dreadnought Acoustic Guitar has over 900 individual pieces of abalone inlaid into the bindings of the top, sides, back, and rosette. Large C.F. Martin abalone letters adorn the headstock and abalone hexagon inlays are used as position markers on the bound ebony fingerboard. A solid spruce top and traditional Martin bracing pattern generate legendary tone. Features rich solid rosewood sides and 2-piece back. Includes hardshell case.");
        p4.setPrice(12679.99);
        p4.setImageURL1("images/4_a.jpg");
        p4.setImageURL2("images/4_b.jpg");
        p4.setImageURL3("images/4_c.jpg");
        p4.setImageURL4("images/4_d.jpg");
        p.add(p4);
        
        Product p5=new Product();
        p5.setProductCode("Acoustic_2");
        p5.setProductName("Rainsong Hybrid Series H-WS1000N2 Deep Body Cutaway Acoustic-Electric ");
        p5.setCatalogCategory("Acoustic Guitar");
        p5.setDescription("The RainSong Hybrid acoustic-electric guitar combines carbon fiber with glass fiber construction to achieve the signature RainSong sound and road- tough stability at an attractive price. This glass- and carbon-fiber guitar is wonderfully versatile. Combining the best qualities of large and small-bodied guitars, the RainSong H-WS1000N2 guitar's body shape is suited for a variety of musical situations. ");
        p5.setPrice(14679.99);
        p5.setImageURL1("images/5_a.jpg");
        p5.setImageURL2("images/5_b.jpg");
        p5.setImageURL3("images/5_c.jpg");
        p5.setImageURL4("images/5_d.jpg");
        p.add(p5);
        
        Product p6=new Product();
        p6.setProductCode("Acoustic_3");
        p6.setProductName("Martin 000-28EC Eric Clapton Signature Acoustic ");
        p6.setCatalogCategory("Acoustic Guitar");
        p6.setDescription("The Martin 000-28EC Eric Clapton Signature Acoustic Guitar is handcrafted with a premium East Indian rosewood back and sides and a bookmatched top of select quartersawn Sitka spruce.");
        p6.setPrice(13585.49);
        p6.setImageURL1("images/6_a.jpg");
        p6.setImageURL2("images/6_b.jpg");
        p6.setImageURL3("images/6_c.jpg");
        p6.setImageURL4("images/6_d.jpg");
        p.add(p6);
        
        return p;
    }
    
    public ArrayList<String> getCategory()
    {
        ArrayList<String> Cat=new ArrayList<>();
        String c1="Electric Guitar";
        String c2="Acoustic Guitar";
        Cat.add(c1);
        Cat.add(c2);
        return Cat;
    }
 }
