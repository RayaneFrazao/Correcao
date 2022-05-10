package src.menu

import Estoque
import kotlin.system.exitProcess

class Menu {
    fun menuPrincipal(estoque: Estoque) {

        println("O que deseja fazer?")
        println("1 - Cadastrar novo item")
        println("2 - Ver lista de itens disponíveis para compra")
        println("3 - Dar baixa em um item")
        println("4 - Sair do programa")

        //TODO:deixar sem o try/catch para avaliar se a galera percebe que dá problema de entrada de dado se for string
        val opcao = try {
            readln().toInt()
        } catch (e : Exception){
            -1
        }

        when (opcao) {
            1 -> {
                estoque.registrarItem()
                this.menuPrincipal(estoque)
            }
            2 -> {
                estoque.listarItens()
                this.menuPrincipal(estoque)
            }
            3 -> {
                estoque.darBaixaItem()
                this.menuPrincipal(estoque)
            }

            4 -> exitProcess(10)
            else -> {
                println("Opção inválida, tente novamente")
                menuPrincipal(estoque);
            }
        }
    }
}