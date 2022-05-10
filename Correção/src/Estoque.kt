import src.item.Item

class Estoque  {
    private val listaItem: ArrayList<Item> = ArrayList()

    fun registrarItem() {
        println("Digite o código do produto: ")
        val codigo = readln().toInt()
        println("Digite o nome do produto: ")
        val nomeItem = readln()
        println("Digite o preco do produto: ")
        val preco = readln().toBigDecimal()
        val item: Item = Item(codigo = codigo, nome = nomeItem, preco = preco)
        listaItem.add(item);
        println("Item registrado com sucesso\n")

        verificarItemRepetido(item)
    }

    fun verificarItemRepetido(item : Item) {
        for (itemLista in listaItem ){
            if (itemLista.codigo == item. codigo){
                println("O item com o codigo = ${item.codigo} ja existe na lista")
            }
        }

    }

    fun listarItens() {
        if (listaItem.isNotEmpty()) {
            println("Não temos nenhum item cadastrado no momento")
        } else {
            println("Atualmente temos os seguintes itens: $listaItem");
        }
    }

    fun darBaixaItem() {
        print("Qual o código do item a dar baixa? ")
        val codigoItemDarBaixa = readln().toInt()
        for (item in listaItem) {
            if (codigoItemDarBaixa == item.codigo ) {
                listaItem.remove(item)
                println("Item removido com sucesso")
                break
            }
        }
    }
}