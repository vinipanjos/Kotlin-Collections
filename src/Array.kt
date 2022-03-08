

fun main() {
    println("------\tintArrayOf\t------")
    val values = intArrayOf(2, 3, 4, 1, 10, 7)
    values.forEach {
        print("$it ")
    }
    println("\n.......\tOrdenando .......")
    values.sort()
    values.forEach {
        print("$it ")
    }

    println("\n------\tArrayString\t------")
    val nomes = Array(3){""}
    nomes[0] = "Maria"
    nomes[1] = "Jose"
    nomes[2] = "Vinicius"
    for (nome in nomes)
        print("$nome ")

    println("\n.......\tOrdenando .......")
    nomes.sort()
    nomes.forEach {
        print("$it ")
    }
    println("\n.......\tOrdenando arrayOf .......")
    val nomes2 = arrayOf("Maria","Jose","Vinicius")
    nomes2.sort()
    nomes2.forEach {
        print("$it ")
    }

    println("\n------\tDoubleArray\t------")
    val salarios = DoubleArray(3)
    salarios[0] = 25.0
    salarios[1] = 12.0
    salarios[2] = 17.0
    salarios.forEach {
        print("$it ")
    }

    println("\n.......\tModificando elementos .......")
    salarios.forEachIndexed { index, salario ->
        salarios[index] = salario*1.1
    }
    salarios.forEach {
        print("$it ")
    }
    println("\n.......doubleArrayOf .......");
    val salarios2 = doubleArrayOf(25.0,12.0,17.0)
    salarios2.sort()
    for (salario in salarios2)
        print("$salario ")
//operacoes
    println("\n.......operacoes .......");

    println("O maior salario é: ${salarios2.maxOrNull()}")
    println("O menor salario é: ${salarios2.minOrNull()}")
    println("A media salarial é: ${salarios2.average()}")
    println("Mostrar salarios acima de 15: ${salarios2.filter { it>15 }}")
    println("Mostrar a quantidade de salarios q está entre 15 e 30: ${salarios2.count{it in 15.0..30.0}}")
    println("Mostrar um salario q seja igual a 25: ${salarios2.find { it == 25.0 }} ")
    println("Verificando se tem um salario na conta: ${salarios2.any{it == 25.0}}")

    println("------\tmapOf\t------")
    val pair: Pair<String, Double> = Pair("João", 1000.0)
    val map1 = mapOf(pair)

    map1.forEach{ (k, v) -> println("Chave: $k, Valor: $v")}

    val map2 = mapOf("Pedro" to  2000.0, "Maria" to 3000.0)
    map2.forEach{ (k, v) -> println("Chave: $k, Valor: $v")}





}