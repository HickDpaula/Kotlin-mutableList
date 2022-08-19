fun main() {

    while (true) {
        println()

        println("1 - CADASTRAR PRODUTOS")
        println("2 - REMOVER PRODUTOS")
        println("3 - ATUALIZAR PRODUTOS")
        println("4-LISTAR PRODUTOS")
        println("5- SAIR")

        println("OPÇÕES DE 1 A 5 CONFORME EXEMPLO ACIMA: ")

        when (readln().toInt()) {
            1 -> {
                println("Digite o produto para cadastrar: ")
                val produto = readln()
                cadastrarProduto(produto)
                println()
            }

            2 -> {
                println("Digite o nome do produto para remover")
                val produto = readln()
                removeProdutos(produto)
                println()
            }

            3 ->{
                println("Atualizando produtos...")
                println("Digite o nome do novo produto: ")
                val produto = readln()
                produtos.add(produto)

            }

            4 ->{
                println("produtos na sacola: ")
                print(produtos)
            }

              5 -> {
                break
            }
        }

    }

}
