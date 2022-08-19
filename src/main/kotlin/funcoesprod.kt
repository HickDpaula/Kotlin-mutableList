val produtos = mutableListOf<String>()

fun cadastrarProduto (produto: String){
    if (produto != ""){
        produtos.add(produto)
        println("Produto cadastrado!")
    }else{
        println("valor invalido!")
        }
    }

fun removeProdutos (produto:String){
    if (produtos.contains(produto)){
        produtos.remove(produto)
        println("produto $produto removido!!")
    }else{
        println("Não tem esse produto $produto")
    }
}

fun atualizarProdutos(produto: String){
    if(produtos.contains(produto)){
        val posicao = produtos.indexOf(produto)

        print("Digite o novo produto")
        val novoProduto = readln()
        produtos [posicao] = novoProduto
        println("O Produto $produto foi adicionado com sucesso")
    }
}

fun listarProdutos(){
    println("Produtos na sua lista: ")

}

