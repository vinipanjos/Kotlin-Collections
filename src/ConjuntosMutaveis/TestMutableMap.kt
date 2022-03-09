package ConjuntosMutaveis

import ConjuntosImutaveis.Funcionario

fun main() {
    val vinicius = Funcionario("Vinicius", 1000.0, "CLT")
    val luciana = Funcionario("Luciana", 5000.0, "PJ")
    val victor = Funcionario("Victor", 3000.0, "CLT")
    val repositorio = Repositorio<Funcionario>()

    repositorio.create(vinicius.nome, vinicius)
    repositorio.create(luciana.nome, luciana)
    repositorio.create(victor.nome, victor)

    println(repositorio.findById(vinicius.nome))

    println("Mostrar todos os funcionarios:")
    repositorio.findAll().forEach { println(it) }
    
    println("Removendo funcionario:")
    repositorio.remove(vinicius.nome)
    repositorio.findAll().forEach { println(it) }
}