fun main() {

    e1(1)
    e1(5)

    e2(10)
    e2(7)

    e3("verde")
    e3("azul")

    e4("admin")
    e4("root")

    e5()
    e6()

    e7(arrayOf("Ana", "Luis", "Carlos"))
    e8(arrayOf(10, 20, 30))
}

// 1
fun e1(n: Int) {
    when (n) {
        1 -> println("Lunes")
        2 -> println("Martes")
        3 -> println("Miércoles")
        else -> println("Día inválido")
    }
}

// 2
fun e2(c: Int) {
    when (c) {
        10 -> println("Excelente")
        9 -> println("Muy bien")
        8 -> println("Bien")
        else -> println("Reprobado")
    }
}

// 3
fun e3(s: String) {
    when (s) {
        "rojo" -> println("Alto")
        "amarillo" -> println("Precaución")
        "verde" -> println("Avanza")
        else -> println("Color inválido")
    }
}

// 4
fun e4(r: String) {
    when (r) {
        "admin" -> println("Acceso total")
        "user" -> println("Acceso limitado")
        "invitado" -> println("Solo lectura")
        else -> println("Rol desconocido")
    }
}

// 5
fun e5() {
    for (i in 1..5) {
        println(i)
    }
}

// 6
fun e6() {
    for (i in 1..3) {
        println("Hola Kotlin")
    }
}

// 7
fun e7(a: Array<String>) {
    for (x in a) {
        println(x)
    }
}

// 8
fun e8(b: Array<Int>) {
    for (i in 0 until b.size) {
        println("Índice $i")
    }
}
