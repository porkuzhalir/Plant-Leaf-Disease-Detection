import java.util.Scanner;

public class PlantIdentification {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Plant Name:");
        String plant = sc.nextLine();

        if (plant.equalsIgnoreCase("Neem")) {

            System.out.println("\nPlant Identification Result");
            System.out.println("---------------------------");

            System.out.println("\nPlant Name: Neem");

            System.out.println("\nBasic Information:");
            System.out.println("This plant is good for humans and widely used for medicinal purposes.");

            System.out.println("\nProducts Made From This Plant:");
            System.out.println("Neem oil, herbal medicine, toothpaste, skin care products.");

            System.out.println("\nAgricultural Information:");
            System.out.println("Best Location to Grow: Tropical and semi-tropical regions with warm climate.");

            System.out.println("\nGrowth Details:");
            System.out.println("Growth Height: Up to 20-25 feet");
            System.out.println("Growth Rate: Medium growth rate");

            System.out.println("\nWater Requirement:");
            System.out.println("Can grow with less water but grows better with moderate rainfall.");

            System.out.println("\nInsects Attraction:");
            System.out.println("May attract aphids and caterpillars.");

            System.out.println("\nInsects That Can Damage the Plant:");
            System.out.println("Leaf miner insects and scale insects can damage the leaves.");

            System.out.println("\nMarket Information:");
            System.out.println("Market Value: Approximately ₹70 – ₹100 per kg (varies by market demand)");

            System.out.println("\nPlant Protection:");
            System.out.println("Use neem oil spray or organic pesticides to protect the plant.");

            System.out.println("\nBenefits for Humans:");
            System.out.println("Used for medicine, skin treatment, agriculture pesticides, and herbal products.");
        }
            else if (plant.equalsIgnoreCase("Tulsi")) {

            System.out.println("\n🍃 Plant Identification Result");
            System.out.println("-------------------------------------");

            System.out.println("\nPlant Name: Tulsi");
            System.out.println("Scientific Name: Ocimum tenuiflorum");
            System.out.println("Family: Lamiaceae");

            System.out.println("\nBasic Information:");
            System.out.println("Tulsi is a sacred medicinal plant widely used in Ayurveda.");

            System.out.println("\nProducts Made From This Plant:");
            System.out.println("- Herbal tea");
            System.out.println("- Ayurvedic medicine");
            System.out.println("- Immunity boosters");

            System.out.println("\nBenefits for Humans:");
            System.out.println("- Improves immunity");
            System.out.println("- Helps treat cold and cough");

            System.out.println("\nGrowth Details:");
            System.out.println("Growth Height: 1 – 3 feet");
            System.out.println("Growth Rate: Fast growth");

            System.out.println("\nPests & Protection:");
            System.out.println("Insects Attraction: Aphids, whiteflies, and spider mites.");
            System.out.println("Insects That Damage the Plant: Leaf-eating caterpillars and aphids.");
            System.out.println("Plant Protection: Use neem oil spray or organic pesticides.");

            System.out.println("\nMarket Information:");
            System.out.println("Market Value: Approximately ₹40 – ₹80 per kg.");
            System.out.println("Market Demand: High demand in Ayurvedic medicine and herbal industries.");
                
        }
        else if (plant.equalsIgnoreCase("Aloe Vera")) {

    System.out.println("\n🥬 Plant Identification Result");
    System.out.println("-------------------------------------");

    System.out.println("\n🌿Plant Name: Aloe Vera");
    System.out.println("Scientific Name: Aloe barbadensis miller");
    System.out.println("Family: Asphodelaceae");

    System.out.println("\nBasic Information:");
    System.out.println("Aloe Vera is a succulent plant known for its medicinal and skin healing properties.");

    System.out.println("\nProducts Made From This Plant:");
    System.out.println("- Aloe vera gel");
    System.out.println("- Skin care products");
    System.out.println("- Herbal medicine");
    System.out.println("- Health drinks");

    System.out.println("\nBenefits for Humans:");
    System.out.println("- Helps treat burns and skin irritation");
    System.out.println("- Used in cosmetics and herbal medicine");

    System.out.println("\nAgricultural Information:");
    System.out.println("Best Location to Grow: Warm tropical and dry regions");
    System.out.println("Soil Type: Sandy and well-drained soil");
    System.out.println("Planting Season: Spring or summer");

    System.out.println("\nGrowth Details:");
    System.out.println("Growth Height: 1 – 2 feet");
    System.out.println("Growth Rate: Medium growth rate");
    System.out.println("Lifespan: Perennial plant");

    System.out.println("\nPests & Protection:");
    System.out.println("Insects Attraction: Mealybugs and aphids");
    System.out.println("Insects That Damage the Plant: Scale insects and mites");
    System.out.println("Plant Protection: Use neem oil spray or organic pesticides");

    System.out.println("\nMarket Information:");
    System.out.println("Market Value: Approximately ₹50 – ₹120 per kg");
    System.out.println("Market Demand: High demand in cosmetic and herbal industries");
}
else if (plant.equalsIgnoreCase("Rose")) {

    System.out.println("\n🌹 Plant Identification Result");
    System.out.println("-------------------------------------");

    System.out.println("\nPlant Name: Rose");
    System.out.println("Scientific Name: Rosa");
    System.out.println("Family: Rosaceae");

    System.out.println("\nBasic Information:");
    System.out.println("Rose is a flowering plant widely used for decoration, perfumes, and cosmetics.");

    System.out.println("\nProducts Made From This Plant:");
    System.out.println("- Rose oil");
    System.out.println("- Perfumes");
    System.out.println("- Rose water");
    System.out.println("- Decorative flowers");

    System.out.println("\nBenefits for Humans:");
    System.out.println("- Used in perfumes and cosmetics");
    System.out.println("- Used in decorations and celebrations");

    System.out.println("\nAgricultural Information:");
    System.out.println("Best Location to Grow: Temperate and subtropical regions");
    System.out.println("Soil Type: Fertile well-drained soil");
    System.out.println("Planting Season: Winter or early spring");

    System.out.println("\nGrowth Details:");
    System.out.println("Growth Height: 3 – 6 feet");
    System.out.println("Growth Rate: Medium growth rate");
    System.out.println("Lifespan: Perennial flowering plant");

    
    System.out.println("\nPests & Protection:");
    System.out.println("Insects Attraction: Aphids and beetles");
    System.out.println("Insects That Damage the Plant: Spider mites and thrips");
    System.out.println("Plant Protection: Use organic pesticide or neem oil spray");

    System.out.println("\nMarket Information:");
    System.out.println("Market Value: Approximately ₹200 – ₹400 per bunch");
    System.out.println("Market Demand: High demand in flower markets and perfume industry");
}
        else {
            System.out.println("Plant data not available.");
        }

        sc.close();
    }
}
