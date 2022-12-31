enum class Nivel { BASICO, INTERMEDIARIO, AVANCADO }

data class Usuario (val nome: String, val matricula: String, val email: String)
   
data class ConteudoEducacional(var nome: String, val duracao: Int = 60, val nivel: Nivel)

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>, val nivel: Nivel) {

    val inscritos = mutableListOf<Usuario>()
    
    fun imprimirAlunosMatriculados(){
        println("Alunos matriculados na $nome")
        for(inscrito in inscritos){
            println(inscrito.nome)
        }
    }
    
    fun matricular(usuario: Usuario) {
        inscritos.add(usuario)
    }
    
    fun imprimirConteudoEducacional(){
        println("$nome")
        for (conteudo in conteudos ){
            println("${conteudo.nome} - ${conteudo.duracao} - ${conteudo.nivel}")
        }
        println("--------------------")
    }
        
    
}

fun main() {
    
    val kotlinOO = ConteudoEducacional("Kotlin: Orientação a Objetos", 20, Nivel.BASICO)
    val kotlinRecursosdaLinguagem = ConteudoEducacional("Kotlin: Recursos da linguagem", 10, Nivel.BASICO)
        
    val listkotlinIntroducao = mutableListOf<ConteudoEducacional>()
    listkotlinIntroducao.add(kotlinOO)
    listkotlinIntroducao.add(kotlinRecursosdaLinguagem)
       
    val formacaoKotlinIntroducao = Formacao("Formação Kotlin Básico", listkotlinIntroducao, Nivel.BASICO)
    
    
    val kotlinCriandoUmAPP = ConteudoEducacional("Kotlin: Criando um APP", 10, Nivel.INTERMEDIARIO)
    val kotlinPersonalizeOSeuApp = ConteudoEducacional("Kotlin: Personalize o seu APP", 10, Nivel.INTERMEDIARIO)
    val kotlinPersistenciaDeDadosComRoom = ConteudoEducacional("Kotlin: Persistência de dados com o ROOM", 12, Nivel.INTERMEDIARIO)
    val kotlinComunicacaoComWebAPI = ConteudoEducacional("Kotlin: Comunicação com Web API", 18, Nivel.INTERMEDIARIO)
    
    val listKotlinIntermediario = mutableListOf<ConteudoEducacional>()
    listKotlinIntermediario.add(kotlinCriandoUmAPP)
    listKotlinIntermediario.add(kotlinPersonalizeOSeuApp)
    listKotlinIntermediario.add(kotlinPersistenciaDeDadosComRoom)
    listKotlinIntermediario.add(kotlinComunicacaoComWebAPI)
    
    val formacaoKotlinIntermediario = Formacao("Formação Kotlin Intermediario", listKotlinIntermediario, Nivel.INTERMEDIARIO)
    
    val kotlinAPIREST = ConteudoEducacional("API REST com Kotlin e Spring BOOT", 30, Nivel.AVANCADO)
    val kotlinESpring = ConteudoEducacional("Kotlin e Srping: Segurança e Infraestrutura", 20, Nivel.AVANCADO)
    
    val listKotlinAvancado = mutableListOf<ConteudoEducacional>()
    listKotlinAvancado.add(kotlinAPIREST)
    listKotlinAvancado.add(kotlinESpring)
    
    val formacaoKotlinAvancado = Formacao("Formação Kotlin Avançado", listKotlinAvancado, Nivel.AVANCADO)
               
    
    val cleitonFernandes = Usuario("Cleiton Fernandes", "Dio Free", "cleiton.fernandes@gmail.com")
    val jussaraSilva = Usuario("Jussara Silva", "Dio Global", "jussara.silva@gmail.com")
    val genilsonTome = Usuario("Genilson Tome", "Dio Pro", "genilson.tome@gmail.com")
    
    
    
    formacaoKotlinIntroducao.matricular(cleitonFernandes)
    formacaoKotlinIntermediario.matricular(jussaraSilva)
    formacaoKotlinIntroducao.matricular(genilsonTome)
    formacaoKotlinIntermediario.matricular(genilsonTome)
    formacaoKotlinAvancado.matricular(genilsonTome)
    
    println(formacaoKotlinIntroducao.imprimirConteudoEducacional())
    println(formacaoKotlinIntermediario.imprimirConteudoEducacional())
    println(formacaoKotlinAvancado.imprimirConteudoEducacional())
    
    println(formacaoKotlinIntroducao.imprimirAlunosMatriculados())
    println(formacaoKotlinIntermediario.imprimirAlunosMatriculados())
    println(formacaoKotlinAvancado.imprimirAlunosMatriculados())
}