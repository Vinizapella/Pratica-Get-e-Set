# Atividade: Conceitos de Encapsulamento, Getters e Setters em Java

Este repositório documenta os exercícios e conceitos chave da aula sobre **Encapsulamento**, um dos pilares fundamentais da Programação Orientada a Objetos (POO) com Java.

## 📚 Principais Conceitos Vistos

### Encapsulamento
É o princípio de proteger os dados de um objeto contra o acesso direto e não autorizado. Ele garante que os atributos de uma classe só possam ser lidos ou modificados através de métodos específicos, conhecidos como `getters` e `setters`. Isso aumenta a segurança, a flexibilidade e a manutenção do código.

### Método `get` (Getter)
Um método público que tem como finalidade **retornar o valor** de um atributo privado. Ele permite que o mundo exterior "leia" o valor do atributo sem poder alterá-lo diretamente.

### Método `set` (Setter)
Um método público que serve para **modificar o valor** de um atributo privado. É aqui que podemos adicionar regras de negócio e validações para garantir a integridade dos dados antes que eles sejam alterados.

---

## 💻 Exemplo de Código

Abaixo, um exemplo prático que demonstra a implementação e o uso de `getters` e `setters` em uma classe `Pessoa`.

```java
public class Pessoa {
    // Atributos privados
    private String nome;
    private int idade;

    // Método Getter para o nome
    public String getNome() {
        return nome;
    }

    // Método Setter para o nome
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Método Getter para a idade
    public int getIdade() {
        return idade;
    }

    // Método Setter para a idade com validação
    public void setIdade(int idade) {
        if (idade > 0) { // Garante que a idade seja um valor válido
            this.idade = idade;
        } else {
            System.out.println("Idade inválida.");
        }
    }

    public static void main(String[] args) {
        // Criando um objeto da classe Pessoa
        Pessoa pessoa = new Pessoa();

        // Usando os métodos set para definir valores
        pessoa.setNome("João");
        pessoa.setIdade(25);

        // Usando os métodos get para acessar os valores
        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Idade: " + pessoa.getIdade());
    }
}
```

### Explicação do Código
* **Atributos Privados:** `nome` e `idade` são declarados como `private`, o que impede o acesso direto de fora da classe `Pessoa`.
* **Métodos get e set:** Fornecem um acesso controlado a esses atributos, permitindo a leitura com `getNome()`/`getIdade()` e a escrita controlada com `setNome()`/`setIdade()`.

### Conclusão
O uso de getters e setters é uma boa prática essencial em Java para construir classes robustas, seguras e de fácil manutenção, respeitando o princípio do encapsulamento.

---

## 🚀 Atividades Propostas
O objetivo é criar as classes a seguir, aplicando os conceitos de atributos privados, getters e setters, e depois instanciar objetos para demonstrar seu funcionamento.

1.  **Classe `Pessoa`:** Atributos `nome` e `idade`.
2.  **Classe `Carro`:** Atributos `marca`, `modelo` e `ano`.
3.  **Classe `Livro`:** Atributos `titulo`, `autor` e `anoDePublicacao`.
4.  **Classe `Aluno`:** Atributos `nome`, `matricula` e `notaFinal`.
5.  **Classe `Produto`:** Atributos `nome` e `preco`.
6.  **Classe `Roda`:** 4 atributos à sua escolha (ex: `aro`, `marca`, `material`, `largura`).
7.  **Classe `Animal`:** Atributos `nome`, `raca` e `idade`.
8.  **Classe `Endereco`:** Atributos `rua`, `numero` e `cidade`.
9.  **Classe `ContaBancaria`:** Atributos `numeroDaConta` e `saldo`.
10. **Classe `Funcionario`:** Atributos `nome`, `salario` e `cargo`.
11. **Classe `Produto` (variação):** Atributos `nome`, `descricao` e `quantidadeEstoque`.
12. **Classe `Emprestimo`:** Atributos `valor`, `dataDeEmprestimo` e `numeroDeParcelas`.

---

<p align="center">
  &copy; 2025 - Atividade de Técnicas de Programação
</p>

