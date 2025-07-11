import java.util.Scanner;

public class Main {

    private final static Scanner scanner = new Scanner(System.in);
    private final static PetMachine petMachine = new PetMachine();

    public static void main(String[] args) {
        
        var option = -1;

        do {
            System.out.println("");
            System.out.println("***Escolha uma das opções***");
            System.out.println("1- Dar banho no Pet.");
            System.out.println("2- Abastecer a máquina com água.");
            System.out.println("3- Abastecer a máquina com shampoo.");
            System.out.println("4- Verificar água da máquina.");
            System.out.println("5- Verificar shampoo da máquina.");
            System.out.println("6- Verificar se tem Pet no banho.");
            System.out.println("7- Colocar Pet na máquina.");
            System.out.println("8- Retirar Pet da máquina.");
            System.out.println("9- Limpar a máquina.");
            System.out.println("0- Sair");
            System.out.println("");
            option = scanner.nextInt();

            switch (option) {
                case 1: petMachine.takeAShower();
                    break;
                case 2: setWater();
                    break;
                case 3: setShampoo();
                    break;
                case 4: verifyWater();
                    break;
                case 5: verifyShampoo();
                    break;
                case 6: checkIfHasPetInMachine();
                    break;
                case 7: setPetInPetMachine();
                    break;
                case 8: petMachine.removePet();
                    break;
                case 9: petMachine.wash();
                    break;
                case 0: System.exit(0);
                    break;    
                default: System.out.println("Opção inválida.");
                    break;
            }
            
        }while (true);
     
        
    }

    private static void setShampoo(){
        System.out.println("");
        System.out.println("Shampoo adicionado na máquina.");
        petMachine.addShampoo();
    }

     private static void setWater(){
        System.out.println("");
        System.out.println("Água adicionada na máquina.");
        petMachine.addWater();
    }

    private static void verifyWater() { 
        var amout = petMachine.getWater();
        System.out.println("");
        System.out.println("A máquina está no momento com " + amout + " litro(s) de água.");
    }

    private static void verifyShampoo() { 
        var amout = petMachine.getShampoo();
        System.out.println("");
        System.out.println("A máquina está no momento com " + amout + " litro(s) de shampoo.");
    }

    private static void checkIfHasPetInMachine(){
        var hasPet = petMachine.hasPet();
        System.out.println("");
        System.out.println(hasPet ? "Tem Pet na máquina." : "Não tem Pet na máquina.");
    }

    public static void setPetInPetMachine(){
        scanner.nextLine();
        var name = "";
        while (name == null || name.isEmpty()){
            System.out.println("");
            System.out.println("Informe o nome do Pet.");
            name = scanner.nextLine();
        }
                
        var pet = new Pet(name);
        petMachine.setPet(pet);
        System.out.println("");
        System.out.println("O Pet " + pet.getName() + " foi colocado na máquina.");
    }
}
