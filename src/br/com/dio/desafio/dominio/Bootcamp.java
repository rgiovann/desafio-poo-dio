package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Bootcamp {
    private String nome;
    private String descricao;
    private final LocalDate dataInicial = LocalDate.now();
    private final LocalDate dataFinal = this.dataInicial.plusDays(45);
    private Set<Dev> devsInscritos = new HashSet<>();
    private Set<Conteudo> conteudos = new LinkedHashSet<>();

    public String getNome()
	{
	    return this.nome;
	}

    public void setNome(String nome)
	{
	    this.nome = nome;
	}

    public String getDescricao()
	{
	    return this.descricao;
	}

    public void setDescricao(String descricao)
	{
	    this.descricao = descricao;
	}

    public LocalDate getDataInicial()
	{
	    return this.dataInicial;
	}

    public LocalDate getDataFinal()
	{
	    return this.dataFinal;
	}

    public Set<Dev> getDevsInscritos()
	{
	    return this.devsInscritos;
	}

    public void setDevsInscritos(Set<Dev> devsInscritos)
	{
	    this.devsInscritos = devsInscritos;
	}

    public Set<Conteudo> getConteudos()
	{
	    return this.conteudos;
	}

    public void setConteudos(Set<Conteudo> conteudos)
	{
	    this.conteudos = conteudos;
	}

    // não há necessidade de fazer hashcode e equals de TODOS os campos
    // usando "nome" como diferenciador pois não pode haver 2 bootcamps com o
    // mesmo id (nome)

    @Override
    public int hashCode()
	{
	    return Objects.hash(this.nome);
	}

    @Override
    public boolean equals(Object obj)
	{
	    if (this == obj)
		{
		    return true;
		}
	    if (obj == null)
		{
		    return false;
		}
	    if (this.getClass() != obj.getClass())
		{
		    return false;
		}
	    Bootcamp other = (Bootcamp) obj;
	    return Objects.equals(this.nome, other.nome);
	}

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Bootcamp bootcamp = (Bootcamp) o;
//        return Objects.equals(nome, bootcamp.nome) && Objects.equals(descricao, bootcamp.descricao) && Objects.equals(dataInicial, bootcamp.dataInicial) && Objects.equals(dataFinal, bootcamp.dataFinal) && Objects.equals(devsInscritos, bootcamp.devsInscritos) && Objects.equals(conteudos, bootcamp.conteudos);
//    }

//    @Override
//    public int hashCode() {
//        return Objects.hash(nome, descricao, dataInicial, dataFinal, devsInscritos, conteudos);
//    }
}
