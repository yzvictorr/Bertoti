# Atividade 1 
É uma obra essencial que explora os fundamentos do desenvolvimento de software. 
O autor discute diversas metodologias de desenvolvimento, abordando práticas de gestão de projetos e a relevância da qualidade e da manutenção de software.
Com uma linguagem acessível e bem estruturada, o livro serve tanto para aqueles que estão começando na área quanto para profissionais experientes. 
Sommerville enfatiza a importância de se adaptar às rápidas transformações tecnológicas, oferecendo insights valiosos para a criação de sistemas eficientes e duradouros. 
É uma referência indispensável para quem busca se aprofundar na engenharia de software.

# Atividade 2
1-Consistência vs. Desempenho:
O protocolo de consistência estrita, como o "ACID" (Atomicidade, Consistência, Isolamento e Durabilidade), pode diminuir o desempenho,
pois as operações de leitura e gravação precisam ser sincronizadas em todos os nós. Se for priorizado o desempenho, por exemplo,
usando um modelo eventual de consistência, a consistência dos dados pode ser temporariamente comprometida, mas as transações se tornam mais rápidas.

2-Latência vs. Consumo de Recursos:
Se for dada prioridade à portabilidade, a aplicação pode ser desenvolvida usando uma linguagem ou framework multiplataforma, como Java ou Electron.
Isso pode resultar em um desempenho inferior, pois a aplicação pode não tirar proveito das otimizações específicas de cada sistema operacional.
Se o desempenho for mais importante, pode-se optar por desenvolver versões específicas para cada plataforma, o que aumenta o esforço de manutenção,
mas permite melhor otimização e desempenho.

3-Escalabilidade Vertical vs. Escalabilidade Horizontal:
A escalabilidade vertical envolve melhorar o hardware de um único servidor (aumentando a capacidade do servidor existente), o que pode ser mais simples
de implementar e requer menos alteração na arquitetura. No entanto, ela tem limites e pode se tornar mais cara. Já a escalabilidade horizontal,
que envolve adicionar mais servidores ou instâncias para distribuir a carga, oferece mais flexibilidade e pode escalar indefinidamente,
mas é mais complexa e exige uma gestão mais sofisticada.

# Atividade 3

Passo 1: Criação da classe Produto

public class Produto {
    private String codigo;
    private String nome;

    // Construtor
    public Produto(String codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }

    // Getters e Setters
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String toString() {
        return "Produto [codigo=" + codigo + ", nome=" + nome + "]";
    }
}

Passo 2: Criação da classe ProdutoRepository

import java.util.HashMap;
import java.util.Map;

public class ProdutoRepository {
    private Map<String, Produto> produtos = new HashMap<>();

    // Adiciona um produto no repositório
    public void adicionarProduto(Produto produto) {
        produtos.put(produto.getCodigo(), produto);
    }

    // Busca um produto pelo código
    public Produto buscarProdutoPorCodigo(String codigo) {
        return produtos.get(codigo);
    }
}

Passo 3: Criação da classe ProdutoService

public class ProdutoService {
    private ProdutoRepository produtoRepository;

    // Construtor
    public ProdutoService(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    // Método para buscar produto pelo código
    public Produto buscarProduto(String codigo) {
        Produto produto = produtoRepository.buscarProdutoPorCodigo(codigo);
        if (produto == null) {
            throw new ProdutoNaoEncontradoException("Produto com código " + codigo + " não encontrado.");
        }
        return produto;
    }
}

Passo 4: Criação da exceção ProdutoNaoEncontradoException

public class ProdutoNaoEncontradoException extends RuntimeException {
    public ProdutoNaoEncontradoException(String mensagem) {
        super(mensagem);
    }
}

Passo 5: Criação dos testes unitários com JUnit

<dependencies>
    <dependency>
        <groupId>org.junit.jupiter</groupId>
        <artifactId>junit-jupiter-api</artifactId>
        <version>5.8.2</version>
        <scope>test</scope>
    </dependency>
    <dependency>
        <groupId>org.junit.jupiter</groupId>
        <artifactId>junit-jupiter-engine</artifactId>
        <version>5.8.2</version>
        <scope>test</scope>
    </dependency>
</dependencies>

# Atividade 4
