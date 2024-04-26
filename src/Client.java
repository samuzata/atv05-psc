public class Client {
    private String CPF, name;

    public Client(){
        // bd simulator
        this.CPF = "111.222.333-44";
        this.name = "AnaMuel";
    }

    public Boolean validateIfClientExists(String CPF){
        if(CPF.equals(this.CPF)){
            return true;
        }
        return false;
    }

    public void createClient(String CPF, String name){
        this.CPF = CPF;
        this.name = name;
    }

    public void login(){
        System.out.println("Olá" + this.name + " vocé está logado na conta: " + this.CPF);
    }
}