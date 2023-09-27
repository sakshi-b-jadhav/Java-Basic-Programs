import java.util.Scanner;

public class BikeModelInfoSimple {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Available Bike Models:");
        System.out.println("1. Honda CB500F");
        System.out.println("2. Kawasaki Ninja 400");
        System.out.println("3. Yamaha YZF-R6");
        
        System.out.print("Enter the model number: ");
        int selectedModel = scanner.nextInt();

        String modelInfo;

        switch (selectedModel) {
            case 1:
              modelInfo = "Model Information:\nHonda CB500F - Details about this model...";
                break;
            case 2:
			 modelInfo = "Model Information:\nKawasaki Ninja 400 - Details about this model...";
			 break;
			 
            case 3:
                
				modelInfo = "Model Information:\nYamaha YZF-R6 - Details about this model...";
                break;
				
              default:
			    modelInfo = "Invalid model number.";
			  
            }

        System.out.println(modelInfo);
    }
}