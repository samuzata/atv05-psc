import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu CPF-> ");
        String CPF = scanner.nextLine();

        Client client = new Client();

        if(!client.validateIfClientExists(CPF)){
            System.out.println("Seu cadastro não foi encontrado, digite seus dados-> ");
            System.out.println("Digite seu nome-> ");
            String name = scanner.nextLine();

            client.createClient(CPF, name);
        }

        System.out.println("Você está logado!");

        Order order = new Order();
        Item dogItem = new Item("BRINQUEDO DE CACHORRO", (float) 10.00);
        Item catItem = new Item("BRINQUEDO DE GATO", (float) 100.00);

        System.out.println("O senhorito deseja adicionar um brinquedo de gato ou cachorro? respostas: [gato] [cachorro] [n]");
        String toyAnswer = scanner.nextLine();

        if(toyAnswer.equals("gato")){
            order.addItemToCart(catItem);
        }else if(toyAnswer.equals("cachorro")){
            order.addItemToCart(dogItem);
        }else if(toyAnswer.equals("n")){
            System.out.println("FIM DO PROGRAMA!");
            return;
        }

        System.out.println("O senhorito possui uma unidade de desconto? y/n ");
        String Answer = scanner.nextLine();

        boolean hasDiscount = false;

        if(Answer.equals("y")){
            hasDiscount = true;
        }else if(!Answer.equals("n")){
            System.out.println("NÃO ENTENDI SUA RESPOSTA TENTE NOVAMENTE");
        }

        if(hasDiscount){
            System.out.println("Diga-me pobre lascado, qual o valor do seu desconto:");
            Float discountValue = scanner.nextFloat();
            order.addDiscountToOrder(discountValue);
        }

        
        System.out.println("Ai o valor total da conta é... " + order.getTotalPrice());
    }
}
