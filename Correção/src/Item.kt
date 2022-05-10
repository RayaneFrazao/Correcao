package src.item

import java.math.BigDecimal

class Item(val codigo: Int, private val nome: String, private val preco: BigDecimal) {

    override fun toString(): String {
        return "código: $codigo | nome: $nome | preço(R$) $preco";
    }
}