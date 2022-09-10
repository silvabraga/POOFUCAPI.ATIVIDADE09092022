package br.faculdade;

import java.util.ArrayList;


public class Aluno {

    private String nome;
    private String sobrenome;
    private String matricula;
    private String nomeCurso;
    
    ArrayList<String> disciplinasAprovadas = new ArrayList<String>();
    ArrayList<Double> notas = new ArrayList<Double>();
    ArrayList<String> disciplinasCursando = new ArrayList<String>();
    
    public void addDisciplinaAprovada(String disciplina){
        disciplinasAprovadas.add(disciplina);
    }
    public void addNotas(Double nota){
        notas.add(nota);
    }
    
    public void addDisciplinaCursando(String disciplina){
        disciplinasCursando.add(disciplina);
    }

    public Aluno(String nome, String sobrenome) {
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    public Aluno(String nome, String sobrenome, String matricula, String nomeCurso) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.matricula = matricula;
        this.nomeCurso = nomeCurso;
    }

    public Aluno() {
    }   
    
    
    
    

    public String getNome() {
        return nome;
    }

    public void atualizarNomeAluno(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void atualizarSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void atualizarMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void atualizarNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public ArrayList<String> getDisciplinasAprovadas() {
        return disciplinasAprovadas;
    }

    public void setDisciplinasAprovadas(ArrayList<String> disciplinasAprovadas) {
        this.disciplinasAprovadas = disciplinasAprovadas;
    }

    public ArrayList<Double> getNotas() {
        return notas;
    }

    public void setNotas(ArrayList<Double> notas) {
        this.notas = notas;
    }

    public ArrayList<String> getDisciplinasCursando() {
        return disciplinasCursando;
    }

    public void setDisciplinasCursando(ArrayList<String> disciplinasCursando) {
        this.disciplinasCursando = disciplinasCursando;
    }

    @Override
    public String toString() {
        return "Aluno{" + "nome=" + nome + ", sobrenome=" + sobrenome + ", matricula=" + matricula + ", nomeCurso=" + nomeCurso + '}';
    }
    
    
    
    
    
    public static void main(String[] args) {
        Aluno a = new Aluno();
        a.atualizarMatricula("12118028");
        a.atualizarNomeAluno("Kaio Lima");
        a.atualizarNomeCurso("3º Ano - Ensino médio");
        a.atualizarSobrenome("Santos");   
        a.addNotas(7.0);
        a.addNotas(8.0);
        
        a.addDisciplinaAprovada("Geografia");
        a.addDisciplinaCursando("Espanhol");
        a.addDisciplinaAprovada(a.disciplinasCursando.get(0));
        
        System.out.println(a.toString());
        
        System.out.println("Disciplinas aprovadas: "+a.disciplinasAprovadas.size());
        
        System.out.println("Disciplinas cursando: "+a.disciplinasCursando.size());
        
        int qtdNotas = a.notas.size();
        Double somaNotas = 0.0;
        
        for (Double aux : a.notas) {
            somaNotas += aux;
        }
        
        
        
        System.out.println("Média do aluno: "+(somaNotas/qtdNotas));

    }
    
    
    
}
