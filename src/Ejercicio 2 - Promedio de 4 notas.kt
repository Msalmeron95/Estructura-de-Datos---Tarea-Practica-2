fun main() {
    val notas = DoubleArray(4)
    var suma = 0.0

    for (i in notas.indices) {
        try {
            print("Ingresa la nota ${i + 1}: ")
            notas[i] = readLine()?.toDouble() ?: 0.0
            suma += notas[i]
        } catch (e: NumberFormatException) {
            println("Entrada no válida. Por favor, ingresa un número válido.")
            return
        }
    }

    val promedio = suma / notas.size
    println("El promedio de las notas es: $promedio")
}