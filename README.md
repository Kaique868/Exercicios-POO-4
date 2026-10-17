# Respostas
## Questão 1
a) **Verdadeira.**

Explicação: Os construtores não são membros herdáveis (como métodos normais ou atributos). Cada classe deve ter seus próprios construtores, embora uma subclasse possa (e geralmente deva) chamar o construtor da superclasse usando a palavra-chave apropriada (como ``super()`` em Java) para inicializar os atributos herdados.

b) **Falsa.**

Explicação: Um relacionamento "é um" (is-a) é implementado por meio de herança (ex: um Cachorro é um Animal). O relacionamento que é implementado através de atributos ou referências de outras classes (onde uma classe "possui" outra) é chamado de relacionamento "tem um" (has-a), conhecido como associação, composição ou agregação.

c) **Falsa.**

Explicação: Quando uma subclasse redefine um método da superclasse utilizando exatamente a mesma assinatura, diz-se que ela está sobrepondo (ou overriding) o método, e não sobrecarregando (overloading). A sobrecarga ocorre quando você cria vários métodos na mesma classe com o mesmo nome, mas com assinaturas (parâmetros) diferentes.

## Questão 2
O debate envolve o equilíbrio entre encapsulamento estrito (private) e extensibilidade controlada (protected) em hierarquias de herança.

1.Acesso private (Máximo Encapsulamento)
Vantagens:

- Oculta o estado interno, exigindo que alterações passem por métodos de validação (getters/setters), o que preserva as regras de negócio.

- Promove baixo acoplamento, permitindo modificar a estrutura interna da superclasse sem afetar as subclasses.

2.Acesso protected (Extensão Controlada)
Vantagens:

- Reconhece o acoplamento natural da herança (white-box), facilitando a colaboração profunda entre classes.

- Reduz códigos repetitivos (boilerplate) e viabiliza padrões de projeto como o Template Method (onde subclasses preenchem ganchos ou etapas de um algoritmo).

**Conclusão**

Para manter um design limpo e flexível, a prática recomendada é manter todos os atributos estritamente private e reservar o acesso protected apenas para métodos projetados para serem estendidos por subclasses.

## Questão 3
**Como Funciona**
- Ordem de execução: O construtor da superclasse é executado antes do construtor da subclasse (de cima para baixo na hierarquia).

- Chamada Implícita: Se omitida, o compilador insere automaticamente o construtor padrão (super()) na primeira linha da subclasse.

- Chamada Explícita: Obrigatória quando a superclasse não tem um construtor padrão e exige parâmetros (super(args)).

**Por que é Obrigatório?**
- Integridade do Estado: Garante que os atributos herdados da superclasse sejam inicializados corretamente, evitando dados nulos ou inválidos.

- Dependência Estrutural: Como a subclasse se apoia na superclasse, a base precisa estar completamente construída e funcional antes que os detalhes específicos da subclasse sejam aplicados.
