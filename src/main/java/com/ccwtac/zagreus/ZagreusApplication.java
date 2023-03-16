package com.ccwtac.zagreus;

import com.ccwtac.zagreus.model.Product;
import com.ccwtac.zagreus.service.ProductService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class ZagreusApplication {

  public static void main(String[] args) {
    SpringApplication.run(ZagreusApplication.class, args);
  }

  @Bean
  CommandLineRunner runner(ProductService productService) {
    return args -> {
      productService.save(new Product(1L, "Holster Shirt for Concealed Carry - Crew Neck, Black", 300.00, "src/main/resources/static/products/crew_neck_black.png", crewVNeckDescription()));
      productService.save(new Product(2L, "Holster Shirt for Concealed Carry - Crew Neck, White", 200.00, "src/main/resources/static/products/crew_neck_white.png", crewVNeckDescription()));
      productService.save(new Product(3L, "Holster Shirt for Concealed Carry - V-Neck, Black", 100.00, "src/main/resources/static/products/v_neck_black.png", crewVNeckDescription()));
      productService.save(new Product(4L, "Holster Shirt for Concealed Carry - V-Neck, White", 5.00, "src/main/resources/static/products/v_neck_white.png", crewVNeckDescription()));
      productService.save(new Product(5L, "Holster Tank Top for Concealed Carry, White", 29.74, "src/main/resources/static/products/tank_top_white.png", tankTopDescription()));
      productService.save(new Product(6L, "Holster Tank Top for Concealed Carry, Black", 29.74, "src/main/resources/static/products/tank_top_black.png", tankTopDescription()));
      productService.save(new Product(7L, "IWB Suede Leather Revolver Holster", 18.74, null, revolverHolsterDescription()));
      productService.save(new Product(8L, "Black Ops Tactical Leg Holster", 29.74, null, legHolsterDescription()));
      productService.save(new Product(9L, "Hidden Holster Under-the-Desk Gun Mount", 24.74, null, gunMountDescription()));
      productService.save(new Product(10L, "Deep Concealment Fully-Adjustable Shoulder Holster", 19.74, null, shoulderHolsterDescription()));
      productService.save(new Product(11L, "FieldSafe (TM) Tactical Poly Pouch", 13.74, null, shoulderHolsterDescription()));
      productService.save(new Product(12L, "Universal Velcro Holsters for Gun Safe", 34.74, null, shoulderHolsterDescription()));
    };
  }

  List<String> crewVNeckDescription() {
    ArrayList<String> descriptions = new ArrayList<>();
    descriptions.add("Our exclusive ULTRA COMFORTABLE Holster Shirt for Concealed Carry features compression fit with ambidextrous right and left draw gun and mag pockets, and a lightweight all-season moisture-wicking fabric designed to keep your body cool and dry year-round.");
    descriptions.add("Sewn with special FLAT SEAMS to eliminate friction and chafing, and DUAL CUSHIONS for all-day comfort when you carry!");
    descriptions.add("Makes an excellent WORKOUT SHIRT that will carry your personal gear hands free!");
    descriptions.add("EXTRA DEEP right and left holster pockets with Velcro closures carry concealed weapons safely and securely.");
    descriptions.add("Holds up to 2 handguns, with extra space so you can also stow magazines, speed loaders, phone, mp3 player, small electronics, LVAD and other medical gear or accessories!");
    return descriptions;
  }

  List<String> gunMountDescription() {
    ArrayList<String> descriptions = new ArrayList<>();
    descriptions.add("Safely Mounts a Hand Gun Almost Anywhere.");
    descriptions.add("Holds Nearly Any Size Pistol, Revolver, Spare Magazine, Stun Gun, Taser, Extra Ammo, Flashlight or Knife for Quick Access, Black");
    descriptions.add("MOUNT ON ANY FLAT SURFACE - Universal 8.5\" x 11\" holder is the size of a regular piece of paper, and mounts under desk, shelf, table, or just about any HORIZONTAL surface. Also mounts on almost any VERTICAL surface or furniture - walls, inside closet, back of door, cabinet, camper wall, bed, headboard, night stand, dresser, file cabinet - use your imagination!");
    descriptions.add("TOP QUALITY and EASY INSTALLATION - Lightweight and tough synthetic mounting plate features military grade elastic holster with metal grommets. Needs NO BRACKET or rack!");
    descriptions.add("Includes four (4) screws for fast and easy install, or you can use heavy duty Velcro strips or mounting tape (not included) if you would prefer!");
    descriptions.add("FITS MOST HANDGUNS - Expandable pocket holds all models of small subcompact, compact, up to full size handguns and revolvers.");
    descriptions.add("WORKS WITH OTHER GEAR TOO - Made of high quality, heavy duty materials for ultimate safety, security, and a lifetime of dependable service, this holster can be used to safely and securely mount your essential personal protection gear right where you need it. Great for QUICK ACCESS to a spare magazine, stun gun, taser, extra ammo, flashlight, tactical case, knife, or just about any other small item!");
    return descriptions;
  }

  List<String> gunSafeHolster() {
    ArrayList<String> descriptions = new ArrayList<>();
    descriptions.add("Universal Heavy Duty Pistol Revolver and Accessories Storage Organizer - Mounts Inside Safe Door");
    descriptions.add("ULTRA STRONG AND SAFE - CCW Tactical's heavy duty gun safe holsters feature super strong hook & loop (Velcro TM) surface, which allows you to hang handguns, magazines, and accessories on the carpet hidden inside your gun safe door for protection and concealment.");
    descriptions.add("NO MORE WORRIES about safety, while ensuring fast and easy access when you need it most!");
    descriptions.add("DURABLE AND HIGH QUALITY - Strong and lightweight, our top quality gun safe holsters are soft but retain their shape and attach securely to hold all sizes of pistols and revolvers and keep them from being dropped or damaged!");
    descriptions.add("CONVENIENT AND CLEAN INSTALL - Simply press the Velcro side of the holster to the carpeted surface of your safe door, insert your gun, and your installation is complete! Photos show them mounted on the door of a Fort Knox safe. It's that easy!");
    descriptions.add("FITS YOUR GUNS - Mount nearly any gun, compatible with small subcompact and compact handguns and mags, up to full size pistols and revolvers.");
    return descriptions;
  }

  List<String> legHolsterDescription() {
    ArrayList<String> descriptions = new ArrayList<>();
    descriptions.add("Wrap Around Thigh Design for Men and Women with Fully Adjustable and Removable Belt Hanger Strap.");
    descriptions.add("FITS YOU AND YOUR GEAR - Features a fully adjustable wrap-around high thigh universal design for men and women of all builds, and a weapon retention system and spare mag pouch that both EXPAND AND RECONFIGURE TO FIT and securely hold nearly all medium to large frame revolvers and pistols, including full size guns equipped with laser, flashlight mount or other attachments");
    descriptions.add("ULTIMATE PERFORMANCE AND FLEXIBILITY - Made of high quality heavy duty materials for ultimate safety, security, and a lifetime of dependable service, this holster can be configured in dozens of ways to suit the specific needs and carrying style of both men and women. The belt drop hanger strap and quick-release buckle clip are fully adjustable and REMOVABLE too!");
    descriptions.add("ULTRA COMFORTABLE - Made of top quality, durable, yet lightweight and breathable materials that move with you and keep you cool.");
    descriptions.add("Special rubberized NON SLIP FIBERS in the thigh straps grip gently to make sure the holster stays securely in place, even in a quick draw situation!");
    descriptions.add("COMPLETELY ADJUSTABLE - From the extra magazine pouch, the removable belt drop hanger strap and the adjustable quick release buckle clips, to the snap and Velcro hook and loop thumb break security straps, EVERYTHING is fully customizable to you, your handgun, and your specific needs. Works well with all of your molle gear too.");
    descriptions.add("Choose right or left handed configuration - or get one for each leg!");
    return descriptions;
  }
  List<String> revolverHolsterDescription() {
    ArrayList<String> descriptions = new ArrayList<>();
    descriptions.add("Hand crafted from genuine suede leather, the IWB inside waistband revolver holster from CCW Tactical features a heavy duty steel belt clip for ULTIMATE PERFORMANCE AND COMFORT, safety and security.");
    descriptions.add("GENUINE SUEDE exterior is soft to the touch and ultra comfortable, adapts to the contours of your hip, body and gun, yet remains sturdy while providing excellent padding and maximum durability for a lifetime of dependable service!");
    descriptions.add("FITS YOUR REVOLVER. Hand made to fit most j-frame handguns, single or double action, including mini and snub nose, with any length barrel, such as the Ruger LCR, Smith and Wesson Body Guard, Taurus, Charter and most 357 magnum and 38 Special Guns designed for concealed carry. Choose RH right hand or LH left hand draw to suit your shooting style and position!");
    descriptions.add("MUCH BETTER THAN FLIMSY NYLON. Hand made with relentless attention to quality and detail, the form-fitted leather is thick and sturdy, better than other materials for effective concealment and smooth, lightning quick draw. Assures a lifetime of dependable access while protecting your revolver from perspiration and conforming to your body for soft touch comfort when you carry concealed!");
    descriptions.add("PERFECT FOR THE LADIES TOO! The versatile clip makes it easy to concealed carry a LadySmith or other small revolver in your purse, handbag, backpack, gear bag, or even a large clutch - for ultimate peace of mind!");
    return descriptions;
  }

  List<String> shoulderHolsterDescription() {
    ArrayList<String> descriptions = new ArrayList<>();
    descriptions.add("Underarm Gun Holster for Men and Women");
    descriptions.add("ULTRA COMFORTABLE Fully adjustable deep concealment shoulder holster uses special lightweight breathable military-grade elastic designed to keep your body cool.");
    descriptions.add("Sewn with special FLAT SEAMS to eliminate friction for all-day comfort when you carry, and protect your gun from perspiration without restricting movement!");
    descriptions.add("Adjusts to any body type, distributes weight to shoulders and back.");
    descriptions.add("EXTRA SAFE AND SECURE Deep right hand or left hand draw holster pocket (choose based on your shooting hand) with adjustable retention strap featuring Velcro hook and loop closure carries your concealed weapon safely and securely.");
    descriptions.add("EXCELLENT CONCEALMENT Expandable holster provides comfortable support, holding your gun snugly to your body, obscuring your pistol or revolver profile under your clothing.");
    descriptions.add("QUICK DRAW Designed for comfort and speed, whether worn over or under your shirt, t-shirt, pullover, or other clothing. NO MORE NEED to wear a jacket in hot weather just to conceal your firearm! Works well in vertical position and even while sitting!");
    descriptions.add("FITS MOST FIREARMS - Expandable pocket with adjustable thumb break holds all models of small subcompact, compact, up to full size handguns and j-frame revolvers.");
    descriptions.add("PLEASE NOTE: This is a cross-draw holster. The RH Draw holster has the pocket under the left arm, and the LH Draw holster has the pocket under the right arm.");
    return descriptions;
  }
  List<String> tankTopDescription() {
    ArrayList<String> descriptions = new ArrayList<>();
    descriptions.add("Our exclusive ULTRA COMFORTABLE tank top holster shirt uses a special lightweight all-season moisture-wicking fabric designed to keep you cool and dry year-round.");
    descriptions.add("Sewn with special FLAT SEAMS to eliminate friction and chafing for all-day comfort when you carry!");
    descriptions.add("Makes an excellent WORKOUT SHIRT that will carry your personal gear hands-free without restricting movement!");
    descriptions.add("Ambidextrous right and left hand draw holster pockets feature SILENT DRAW safety straps to carry concealed weapons safely and securely.");
    descriptions.add("Specially-designed pockets firmly hold up to 2 subcompact, compact, or full size handguns.");
    descriptions.add("Also can stow up to 2 magazines, speed loaders, phone, mp3 player, small electronics, LVAD and other medical gear or accessories!");
    return descriptions;
  }
}