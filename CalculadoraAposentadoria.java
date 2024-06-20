public class CalculadoraAposentadoria {
    private int idade;
    private char sexo; 
    private int anosContribuicao;
    
    public CalculadoraAposentadoria(int idade, char sexo, int anosContribuicao) {
        this.idade = idade;
        this.sexo = sexo;
        this.anosContribuicao = anosContribuicao;
    }
    
    public String verificarAposentadoria() {
        int idadeAposentadoria = 0;
        int anosFaltantes = 0;
        
        if (sexo == 'M') { 
            if (idade >= 65) {
                return "Você tem idade para aposentar.";
            } else {
                idadeAposentadoria = 65;
                anosFaltantes = idadeAposentadoria - idade;
            }
            
            if (anosContribuicao >= 35) {
                return "Você tem tempo de contribuição.";
            } else {
                anosFaltantes = Math.max(anosFaltantes, 35 - anosContribuicao);
            }
        } else if (sexo == 'F') { // Mulheres
            if (idade >= 62) {
                return "Você tem idade para aposentar.";
            } else {
                idadeAposentadoria = 62;
                anosFaltantes = idadeAposentadoria - idade;
            }
            
            if (anosContribuicao >= 30) {
                return "tem tempo de contribuição.";
            } else {
                anosFaltantes = Math.max(anosFaltantes, 30 - anosContribuicao);
            }
        } else {
            return "inválido. Use 'M' para homem e 'F' para mulher.";
        }
        
        return "Faltam " + anosFaltantes + " anos para poder se aposentar.";
    }
    
     public void imprimirResultado() {
        System.out.println(verificarAposentadoria());
    }
    
    
    public static void main(String[] args) {
      


      
      /////////// // // Exemplo /////////////////////
        CalculadoraAposentadoria calc1 = new CalculadoraAposentadoria(60, 'M', 30);
        calc1.imprimirResultado();
        
        CalculadoraAposentadoria calc2 = new CalculadoraAposentadoria(62, 'F', 25);
        calc2.imprimirResultado();
        
        CalculadoraAposentadoria calc3 = new CalculadoraAposentadoria(70, 'M', 40);
        calc3.imprimirResultado();
        
        CalculadoraAposentadoria calc4 = new CalculadoraAposentadoria(55, 'F', 20);
        calc4.imprimirResultado();
        
        //// Testando sexo inválido////
        CalculadoraAposentadoria calc5 = new CalculadoraAposentadoria(65, 'X', 30);
        calc5.imprimirResultado();
    }
}
