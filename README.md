# Jardim Verde - Sistema de Jardinagem

## Descrição do Projeto

O Sistema Jardim Verde é uma aplicação Java desenvolvida para gerenciar informações de clientes, jardins e serviços de jardinagem. Através de uma interface gráfica simples (utilizando `JOptionPane`), o sistema permite:

* **Cadastrar Clientes:** Armazenar informações básicas dos clientes como nome, endereço, telefone, email e CPF.
* **Cadastrar Jardins:** Registrar detalhes dos jardins dos clientes, incluindo o CPF do cliente associado, largura, comprimento e tipos de plantas. O sistema calcula automaticamente a área e classifica o tamanho do jardim (Pequeno ou Grande).
* **Registrar Serviços:** Permite registrar os serviços prestados aos clientes, selecionando o tipo de serviço (com valores predefinidos) e aplicando descontos com base na quantidade de serviços já contratados pelo cliente.
* **Listar Dados:** Exibe listas de todos os clientes, jardins e serviços cadastrados.
* **Estatísticas:** Apresenta estatísticas sobre as áreas dos jardins cadastrados, incluindo média, mediana, moda, maior área, menor área e a quantidade de jardins por tamanho (Pequeno/Grande).
* **Salvar e Carregar Dados:** Persiste os dados cadastrados em arquivos de texto (`clientes.txt`, `jardins.txt`, `servicos.txt`) e os carrega ao iniciar o sistema, garantindo a persistência das informações entre as sessões.

## Funcionalidades

* **Cadastro:**
    * Cadastro de clientes com informações de contato.
    * Cadastro de jardins com dimensões e tipo de plantas.
    * Registro de serviços prestados com seleção de tipo e aplicação de descontos.
* **Listagem:**
    * Listagem completa de clientes cadastrados.
    * Listagem completa de jardins cadastrados, exibindo detalhes como área e tamanho.
    * Listagem completa de serviços registrados, mostrando detalhes do serviço e cliente associado.
* **Estatísticas dos Jardins:**
    * Cálculo e exibição da média das áreas dos jardins.
    * Cálculo e exibição da mediana das áreas dos jardins.
    * Identificação e exibição da moda das áreas dos jardins.
    * Identificação da maior e menor área entre os jardins.
    * Contagem e exibição da quantidade de jardins classificados como Pequenos (≤ 100m²) e Grandes (> 100m²).
* **Persistência de Dados:**
    * Salva os dados de clientes, jardins e serviços em arquivos de texto ao sair ou explicitamente através da opção no menu.
    * Carrega automaticamente os dados dos arquivos ao iniciar o sistema.
* **Interface Simples:**
    * Interface de usuário baseada em caixas de diálogo (`JOptionPane`) para facilitar a interação.

## Como Executar o Projeto

1.  **Pré-requisitos:**
    * Java Development Kit (JDK) instalado no seu sistema.
2.  **Compilação:**
    * Salve os arquivos `.java` (SistemaJardinagem.java, Cliente.java, Jardim.java, Servico.java) em um mesmo diretório.
    * Abra um terminal ou prompt de comando, navegue até o diretório onde os arquivos foram salvos e execute o comando:
        ```bash
        javac *.java
        ```
    * Isso irá gerar os arquivos `.class` correspondentes.
3.  **Execução:**
    * No mesmo terminal ou prompt de comando, execute o comando:
        ```bash
        java SistemaJardinagem
        ```
    * O sistema será iniciado, e o menu principal será exibido através de uma caixa de diálogo.

## Estrutura do Código

O projeto é composto pelas seguintes classes:

* `SistemaJardinagem.java`: Classe principal que contém o método `main`, exibe o menu principal e coordena as operações do sistema.
* `Cliente.java`: Classe que representa um cliente, com atributos como nome, endereço, telefone, email e CPF. Possui métodos para representação em string e para salvar/carregar dados de arquivo.
* `Jardim.java`: Classe que representa um jardim, com atributos como CPF do cliente, largura, comprimento e tipo de plantas. Contém métodos para calcular a área, determinar o tamanho (Pequeno/Grande), representação em string e para salvar/carregar dados de arquivo, além dos métodos para cálculos estatísticos (moda, mediana, máximo, mínimo).
* `Servico.java`: Classe que representa um serviço de jardinagem, com atributos como CPF do cliente, tipo de serviço, data e desconto aplicado. Utiliza um enum `TipoServico` para definir os tipos de serviços e seus valores. Possui métodos para representação em string e para salvar/carregar dados de arquivo.

## Persistência de Dados

Os dados são armazenados em arquivos de texto simples:

* `clientes.txt`: Armazena os dados dos clientes, com os campos separados por ponto e vírgula (;).
* `jardins.txt`: Armazena os dados dos jardins, com os campos separados por ponto e vírgula (;).
* `servicos.txt`: Armazena os dados dos serviços, com os campos separados por ponto e vírgula (;).

O sistema carrega esses arquivos ao iniciar e salva as alterações ao sair ou quando a opção "Salvar Dados" é selecionada.

## Próximos Passos e Melhorias

* Implementar uma interface gráfica mais elaborada utilizando Swing ou JavaFX.
* Adicionar funcionalidades para editar e remover clientes, jardins e serviços.
* Implementar filtros e buscas nas listagens.
* Gerar relatórios mais detalhados sobre os serviços e clientes.
* Melhorar o tratamento de erros e validação de entrada de dados.
* Considerar o uso de um banco de dados para persistência de dados em vez de arquivos de texto.

## Autor

[Lucas dos santos / SENAI]