package paradox

import arc.util.Log
import mindustry.mod.Mod
// Importações necessárias para criar o bloco:
import mindustry.world.blocks.defense.Wall 
import mindustry.type.Category 
import mindustry.content.Blocks 
import mindustry.content.Items 

// Definição do Bloco (Criação da instância)
val cheapCopperWall = Wall("cheap-copper-wall") 

class ParadoxMod : Mod(){

    init{
        // Limpando o código do sapo para evitar o pop-up, se desejar.
        Log.info("Loaded ParadoxMod constructor.")
    }

    override fun loadContent(){
        Log.info("Loading Paradox Mod content (Muro de Cobre Barato).")
        
        // CÓDIGO DO MURO DE COBRE BARATO (Injeção de Conteúdo)
        cheapCopperWall.apply {
            health = 180f // Reduzido em comparação ao Vanilla (320)
            size = 1
            category = Category.defense
            research(Blocks.copperWall) // Pesquisado após o bloco vanilla
            
            // Requisitos: APENAS 5 Cobre (Vanilla: 6)
            requirements(Category.defense, with(Items.copper, 5))
            
            localizedName = "Muro de Cobre Barato"
            description = "Um muro improvisado, barato e frágil. Primeiro bloco Paradox Mod."
        }
    }
}