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
    
    val formaçãoAndroidDeveloper = ConteudoEducacional("Formação Android Developer", 67, Nivel.INTERMEDIARIO)
    val formaçãoFlutterSpecialist = ConteudoEducacional("Formação Flutter Specialist", 71, Nivel.INTERMEDIARIO)
    val formaçãoGoogleCloudPlatformt = ConteudoEducacional("Formação Google Cloud Platform", 58, Nivel.AVANCADO)
    val formaçãoLinuxFundamentals = ConteudoEducacional("Formação Linux Fundamentals", 23, Nivel.BASICO)
    
    val cleitonFernandes = Usuario("Cleiton Fernandes", "Dio Free", "cleiton.fernandes@gmail.com")
    val jussaraSilva = Usuario("Jussara Silva", "Dio Global", "jussara.silva@gmail.com")
    val genilsonTome = Usuario("Genilson Tome", "Dio Pro", "genilson.tome@gmail.com")
    
    formaçãoAndroidDeveloper.matricular(cleitonFernandes)
    
    
    
    TODO("Analise as classes modeladas para este domínio de aplicação e pense em formas de evoluí-las.")
    TODO("Simule alguns cenários de teste. Para isso, crie alguns objetos usando as classes em questão.")
}