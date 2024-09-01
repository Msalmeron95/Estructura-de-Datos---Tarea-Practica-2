fun main() {
    val numeros = IntArray(4)
    var mayor = Int.MIN_VALUE

    for (i in numeros.indices) {
        try {
            print("Ingresa el número ${i + 1}: ")
            numeros[i] = readLine()?.toInt() ?: 0
            if (numeros[i] > mayor) {
                mayor = numeros[i]
            }
        } catch (e: NumberFormatException) {
            println("Entrada no válida. Por favor, ingresa un número entero.")
            return
        }
    }

    println("El número mayor es: $mayor")
}
