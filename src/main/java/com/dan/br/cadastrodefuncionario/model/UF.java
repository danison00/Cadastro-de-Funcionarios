package com.dan.br.cadastrodefuncionario.model;

public enum UF {

    AC("AC", "Acre"),
    AL("AL", "Alagoas"),
    AM("AM", "Amazonas"),
    AP("AP", "Amapá"),
    BA("BA", "Bahia"),
    CE("CE", "Ceará"),
    DF("DF", "Distrito Federal"),
    ES("ES", "Espírito Santo"),
    GO("GO", "Goiás"),
    MA("MA", "Maranhão"),
    MG("MG", "Minas Gerais"),
    MS("MS", "Mato Grosso do Sul"),
    MT("MT", "Mato Grosso"),
    PA("PA", "Pará"),
    PB("PB", "Paraíba"),
    PE("PE", "Pernambuco"),
    PI("PI", "Piauí"),
    PR("PR", "Paraná"),
    RJ("RJ", "Rio de Janeiro"),
    RN("RN", "Rio Grande do Norte"),
    RO("RO", "Rondônia"),
    RR("RR", "Roraima"),
    RS("RS", "Rio Grande do Sul"),
    SC("SC", "Santa Catarina"),
    SE("SE", "Sergipe"),
    SP("SP", "São Paulo"),
    TO("TO", "Tocantins");

    private final String sigla;
    private final String nome;
   
    private UF(String sigla, String nome) {
        this.sigla = sigla;
        this.nome = nome;
    }
    public String getSigla() {
        return sigla;
    }
    public String getNome() {
        return nome;
    }

    



}
