package paradox

// Adicione as importações necessárias
import arc.util.Log
import mindustry.mod.Mod
import mindustry.world.blocks.defense.Wall 
import mindustry.type.Category 
import mindustry.content.Blocks 
import mindustry.content.Items 
import mindustry.world.meta.BuildVisibility // Necessário para a visibilidade do Tech Tree
import mindustry.type.ItemStack // Necessário para a sintaxe correta de custo

// Definição do Bloco (Criação da instância)
val cheapCopperWall = Wall("cheap-copper-wall") 

class ParadoxMod : Mod(){

    init{
        Log.info("Loaded Paradox Mod constructor.")
        // Código do sapo removido
    }

    override fun loadContent(){
        Log.info("Loading Paradox Mod content (Muro de Cobre Barato).")
        
        // CÓDIGO DO MURO DE COBRE BARATO
        cheapCopperWall.apply {
            // CORRIGIDO: Health agora é Int, não Float.
            health = 180 
            size = 1
            category = Category.defense
            
            // CORRIGIDO: Uso da sintaxe moderna para requisitos/custo (ItemStack.of)
            requirements(Category.defense, ItemStack.of(Items.copper, 5))
            
            // Requisitos de pesquisa (Deve ser chamado APÓS a definição de requirements)
            research(Blocks.copperWall) 
            
            localizedName = "Muro de Cobre Barato"
            description = "Um muro improvisado, barato e frágil. Primeiro bloco Paradox Mod."
        }
    }
}