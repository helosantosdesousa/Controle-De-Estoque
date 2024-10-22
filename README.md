# 🛠️ Sistema de Controle de Estoque

## 📜 Descrição

O **Sistema de Controle de Estoque** é uma aplicação web desenvolvida em Java, utilizando programação orientada a objetos. O sistema é projetado para gerenciar usuários, produtos, clientes e vendas, permitindo um controle eficiente do estoque de produtos. A interface de usuário é construída com formulários HTML, e os dados são armazenados em um banco de dados relacional.

## 🚀 Funcionalidades

### 👤 Cadastro de Usuários
- Apenas o Administrador pode cadastrar novos usuários.
- Escolha de papel (Administrador ou Usuário Comum) durante o cadastro.
- Senhas criptografadas utilizando bcrypt.

### 🔐 Autenticação de Usuários
- Login de usuários cadastrados.
- Redirecionamento baseado no papel do usuário:
  - **Administrador**: Acesso ao dashboard.
  - **Usuário Comum**: Acesso à funcionalidade de vendas.

### 📦 Gerenciamento de Produtos
- Cadastro de novos produtos e atualização de informações existentes.
- Controle de estoque.
- Atributos do produto: id, nome, quantidade em estoque e preço.

### 📉 Controle de Estoque
- Atualização automática do estoque após registro de vendas.
- Impedimento de vendas quando o estoque é insuficiente.

### 🛒 Registro de Vendas
- Usuários comuns podem registrar vendas de múltiplos produtos.
- Detalhes da venda: cliente, produtos vendidos, quantidades e data da venda.
- Verificação do estoque antes de registrar uma venda.

### 📊 Listagem de Vendas
- Administradores podem visualizar o histórico de vendas com detalhes dos produtos vendidos, data e total da venda.

## ✅ Requisitos do Sistema

1. **Cadastramento e Autenticação de Usuários**
   - Apenas administradores têm permissão para cadastrar novos usuários.
   - Login com verificação de papéis.

2. **Gerenciamento de Produtos e Clientes**
   - Cadastro, atualização e controle de estoque de produtos.
   - Cadastro e atualização de dados dos clientes.

3. **Registro e Listagem de Vendas**
   - Permitir o registro de vendas com verificação de estoque.
   - Listar todas as vendas realizadas pelo administrador.

## 🛠️ Requisitos Técnicos

- **Linguagem**: Java (programação orientada a objetos).
- **Interface**: Web, utilizando HTML para formulários.
- **Banco de Dados**: Oracle (ou outro banco relacional).
- **Operações CRUD**: Implementação nas seguintes tabelas:
  - `usuario`: Armazena dados dos usuários.
  - `papel`: Armazena os papéis dos usuários.
  - `produto`: Armazena informações dos produtos.
  - `cliente`: Armazena dados dos clientes.
  - `fornecedor`: Armazena dados dos fornecedores.
  - `venda`: Armazena informações das vendas realizadas.
  - `item_venda`: Detalhes de cada item vendido (produto, quantidade e subtotal).
