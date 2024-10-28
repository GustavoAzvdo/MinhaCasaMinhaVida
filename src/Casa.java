public class Casa {
    private int porta;
    private boolean[] portas;
    private String corCasa;

    public Casa(){
        this.porta = 0;
        this.portas = new boolean[3];
        this.corCasa = "Branco"; //Apenas branco,azul e cinza

    }



    public String setCorCasa(String nC){


        if(nC.equalsIgnoreCase(getCorCasa())){
            System.out.println("CORES IGUAIS! DIGITE UMA COR DIFERENTE!");
        }
        else if(nC.equalsIgnoreCase("azul") || nC.equalsIgnoreCase("branco") || nC.equalsIgnoreCase("cinza")){
            this.corCasa = nC;
            System.out.println("COR ATUALIZADA!");
        }


        return corCasa;
    }
    public String getCorCasa() {
        return corCasa;
    }
    @Override
    public String toString(){
        return String.format("\n\tPORTA 1: %s\n\tPORTA 2: %s\n\tPORTA 3: %s\n\tCOR DA CASA: %s",
                portas[0] ? "ABERTA" : "FECHADA",
                portas[1] ? "ABERTA" : "FECHADA",
                portas[2] ? "ABERTA" : "FECHADA",
                getCorCasa());
    }
    // ========
    // METODOS
    // ========
    public void abrirPorta(int porta){
        if(porta >= 1 && porta <= 3)
            if(portas[porta-1] == false){
                portas[porta-1] = true;
                System.out.println("ABRINDO PORTA " + porta + "...");
            }
            else{
                System.out.println("A PORTA " + porta + " JÁ ESTA ABERTA!");
            }
        else if(porta == 4){
            System.out.println(">> DIGITE UMA PORTA VALIDA!");
        }
        else{
            System.out.println("VOLTANDO...");
        }
    }
    public void fecharPorta (int porta){
        if(porta >= 1 && porta <= 3)
            if(portas[porta-1] == true){
                portas[porta-1] = false;
                System.out.println("FECHANDO PORTA " + porta + "...");
            }
            else{
                System.out.println("A PORTA " + porta + " JÁ ESTA FECHADA!");
            }
        else{
            System.out.println(">> DIGITE UMA PORTA VALIDA!");
        }

    }
    public int quantasPortasEstaoAbertas(){
        int p = 0;
        for(int i = 0; i < portas.length; i++){
          if(portas[i] == true) {
              p++;
          }
        }
       return p;
    }


}

