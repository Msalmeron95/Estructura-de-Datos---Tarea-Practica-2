fun main() {
    val cadenas = Array<String?>(5) { null }

    for (i in cadenas.indices) {
        print("Ingresa la cadena ${i + 1}: ")
        cadenas[i] = readLine()
    }

    println("Las cadenas ingresadas son:")
    for (cadena in cadenas) {
        println(cadena)
    }
}