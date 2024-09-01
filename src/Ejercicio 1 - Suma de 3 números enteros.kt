fun main() {
    val numeros = IntArray(3)
    var suma = 0

    for (i in numeros.indices) {
        try {
            print("Ingresa el número ${i + 1}: ")
            numeros[i] = readLine()?.toInt() ?: 0
            suma += numeros[i]
        } catch (e: NumberFormatException) {
            println("Entrada no válida. Por favor, ingresa un número entero.")
            return
        }
    }

    println("La suma de los números es: $suma")
}