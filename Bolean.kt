fun main() {
    val nilai = 66
    val A = 90
    val B = 80
    val C = 70
    val D = 60
    val E = 50
    if (nilai > A) {
        println("Nilai Anda A")
    }
    else if (nilai < A && nilai > B){
        println("Nilai Anda B")
    }
    else if (nilai < B && nilai > C) {
        println("Nilai Anda C")
    }
    else if (nilai < C && nilai > D) {
        println("Nilai Anda D")
    }
    else if (nilai < D && nilai > E) {
        println("Nilai Anda E")
    }
    else {
        println("Nilai Anda F")
    }
}
