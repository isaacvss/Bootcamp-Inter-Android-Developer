fun main(args: Array<String>) {
    //continue o codigo

    //entrada de uma unica linha
    val(H, P) = readLine()!!.split(" ")

    val media: Double = H.toDouble() / P.toDouble()
    println(String.format("%.2f", media));
}