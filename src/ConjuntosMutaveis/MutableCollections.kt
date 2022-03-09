import ConjuntosImutaveis.Funcionario

fun main() {
    val vinicius = Funcionario("Vinicius", 1000.0, "CLT")
    val luciana = Funcionario("Luciana", 5000.0, "PJ")
    val victor = Funcionario("Victor", 3000.0, "CLT")

    println("---------mutableListOf---------")

    val funcionariosList = mutableListOf(vinicius, luciana)
    funcionariosList.forEach{println(it)}

    println(".......Adicionando na lista.......")
    funcionariosList.add(victor)
    funcionariosList.forEach{println(it)}

    println(".......Removendo da lista.......")
    funcionariosList.remove(vinicius)
    funcionariosList.forEach{println(it)}

    println("---------mutableSetOf---------")
    val funcionariosSet = mutableSetOf(vinicius)
    funcionariosSet.forEach { println(it) }

    println(".......Adicionando na lista.......")
    funcionariosSet.add(victor)
    funcionariosSet.add(luciana)
    funcionariosSet.forEach{println(it)}

    println(".......Removendo da lista.......")
    funcionariosSet.remove(victor)
    funcionariosSet.forEach{println(it)}

}