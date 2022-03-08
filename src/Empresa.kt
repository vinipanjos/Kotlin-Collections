fun main() {
    val vinicius = Funcionario("Vinicius", 1000.0, "CLT")
    val luciana = Funcionario("Luciana", 5000.0, "PJ")
    val victor = Funcionario("Victor", 3000.0, "CLT")

    val funcionarios = listOf(vinicius, luciana, victor)
    funcionarios.forEach{println(it)}

    println("Verificar se o Victor trabalha na empresa e mostrar suas informacoes:" +
            "\n${funcionarios.find { it.nome == "Victor"}}");

    println("Mostrar os funcionarios pela ordem de salario: ")
    funcionarios.sortedBy { it.salario  }.forEach {println(it)}

    println("\n.......Agrupando funcionarios por tipo de contratação.......");
    funcionarios
        .groupBy { it.tipoContratacao }
        .forEach{println(it)}





    println("------\tsetOf\t------")
    val funcionarios1 = setOf(vinicius, victor)
    val funcionarios2 = setOf(luciana)
    println("\n.......Unindo os grupos.......")
    val resultUnion = funcionarios1.union(funcionarios2)
    resultUnion.forEach { println(it) }

    println("\n.......Subtraindo algum grupo de outro grupo.......")
    val funcionarios3 = setOf(vinicius, victor, luciana)
    val resultSubtract =  funcionarios3.subtract(funcionarios2)
    resultSubtract.forEach { println(it) }

    println("\n.......Comparando um grupo com o outro e retornando o q tem em comum.......")
    val resultIntercept =  funcionarios3.intersect(funcionarios2)
    resultIntercept.forEach { println(it) }

}





data class Funcionario(
    val nome: String,
    val salario: Double,
    val tipoContratacao: String

) {
    override fun toString(): String =
        """Nome: $nome
            |Salario: $salario
        """.trimMargin()
}