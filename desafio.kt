enum class Nivel { BASICO, INTERMEDIARIO, AVANCADO }

data class Usuario (val nomeAluno: String, val matriculaAluno: String, val email: String)
   
data class ConteudoEducacional(var nome: String, val duracao: Int = 60, val nivel: Nivel)

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()
    
    fun matricular(usuario: Usuario) {
        inscritos.add(Usuario)
    }
    
    fun imprimirConteudoEducacional(){
        for (i in conteudos){
            println("${i.nome} - ${i.duracao}")
        }
    }
}

fun main() {
    
    TODO("Analise as classes modeladas para este domínio de aplicação e pense em formas de evoluí-las.")
    TODO("Simule alguns cenários de teste. Para isso, crie alguns objetos usando as classes em questão.")
}