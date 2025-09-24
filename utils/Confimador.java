/**
 * Pensei em um sistema de busca diferente de liner/binária,
 * na mesma pegada que o 'WHERE' do sql, invés do olhar elemento por elemento
 * em uma lista de respostas O(n), mesmo que binária O(log n)
 * pensei em cria um hashmap (dicionário) e usar a resposta do usuário como id
 * assim diminuido a complexidade pra O(1) no caso médio.
 * a estrutura segue a base
 * "Sim": true, ->
 * "Não": false, ->
 * é necessário normalizar a entrada do usuário antes.
 * OBS: eu criei o sistema, mas mandei a IA adicionar o maximo de variações.
 */
package utils;

import static java.util.Map.entry;
import java.util.Map;

public class Confimador {
    
    public Map<String, Boolean> respostas = Map.ofEntries(
        // RESPOSTAS POSITIVAS (true)
        entry("sim", true),
        entry("s", true),
        entry("si", true),
        entry("sii", true),
        entry("siii", true),
        entry("siiii", true),
        entry("simm", true),
        entry("simmm", true),
        entry("simmmm", true),
        entry("sim!", true),
        entry("sim!!", true),
        entry("sim.", true),
        entry("claro", true),
        entry("claro sim", true),
        entry("claro!", true),
        entry("claro.", true),
        entry("claro que sim", true),
        entry("com certeza", true),
        entry("comcerteza", true),
        entry("com ctz", true),
        entry("ctz", true),
        entry("certeza", true),
        entry("certeza!", true),
        entry("confirmo", true),
        entry("confirmado", true),
        entry("ok", true),
        entry("ok!", true),
        entry("oki", true),
        entry("okey", true),
        entry("beleza", true),
        entry("blz", true),
        entry("belezinha", true),
        entry("beleza!", true),
        entry("perfeito", true),
        entry("perfeito!", true),
        entry("positivo", true),
        entry("positivo!", true),
        entry("true", true),        // Removida a duplicata
        entry("um", true),
        entry("1", true),           
        entry("verdadeiro", true),
        entry("aceito", true),
        entry("aceito!", true),
        entry("👍", true),
        entry("✅", true),
        entry("✔", true),
        entry("👌", true),
        
        // RESPOSTAS NEGATIVAS (false)
        entry("não", false),
        entry("nao", false),
        entry("n", false),
        entry("naao", false),
        entry("naaoo", false),
        entry("nao!", false),
        entry("nao!!", false),
        entry("nao.", false),
        entry("nãoo", false),
        entry("no", false),
        entry("noo", false),
        entry("nooo", false),
        entry("nem", false),
        entry("nem pensar", false),
        entry("de jeito nenhum", false),
        entry("de jeito nenhum!", false),
        entry("de forma alguma", false),
        entry("de forma alguma!", false),
        entry("jamais", false),
        entry("nunca", false),
        entry("nunca!", false),
        entry("discordo", false),
        entry("recuso", false),
        entry("recusado", false),
        entry("negativo", false),
        entry("negativo!", false),
        entry("false", false),
        entry("zero", false),
        entry("0", false),   
        entry("falso", false),
        entry("impossível", false),
        entry("impossivel", false),
        entry("impossivel!", false),
        entry("não mesmo", false),
        entry("nem ferrado", false),
        entry("nem fudendo", false),
        entry("nah", false),
        entry("nop", false),
        entry("naw", false),
        entry("👎", false),
        entry("❌", false),
        entry("✖", false),
        entry("🚫", false)
    );
    
    public boolean foiConfirmado(String entrada_usuario) {
        if (entrada_usuario == null) {
            throw new IllegalArgumentException("Entrada não pode ser null");
        }
        
        String entradaNormalizada = entrada_usuario.toLowerCase().trim();
        
        Boolean resultado = respostas.get(entradaNormalizada);
        
        if (resultado == null) {
            throw new IllegalArgumentException(
                "Entrada não reconhecida: '" + entrada_usuario + "'. " +
                "Use variações de 'sim'/'não'"
            );
        }
        
        return resultado;
    }
}