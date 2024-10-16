<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Form de cadastro Cliente</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
 <!-- Barra de navegaÃ§Ã£o simples -->
    <nav class="navbar navbar-expand-lg navbar-light bg-light">
        <div class="container-fluid">
            <a class="navbar-brand" href="#">Gerenciamento</a>
            <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarNav">
                <ul class="navbar-nav ms-auto">
                    <li class="nav-item">
                        <a class="nav-link" href="/estoque/admin/dashboard.jsp">Voltar ao Dashboard</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="/logout">Sair</a>
                    </li>
                </ul>
            </div>
        </div>
    </nav>

    <!-- ConteÃºdo principal -->
    <div class="container mt-5">
        <h2 class="text-center">Cadastrar Cliente</h2>

        <!-- FormulÃ¡rio de Cadastro de cliente -->
        <form action="../cadastroCliente" method="post" class="mt-4">
            <!-- Nome do UsuÃ¡rio -->
            <div class="mb-3">
                <label for="nome" class="form-label">Nome do Cliente</label>
                <input type="text" class="form-control" id="nome" name="nome" required>
            </div>

            <!-- E-mail do UsuÃ¡rio -->
            <div class="mb-3">
                <label for="cpf" class="form-label">CPF do Cliente</label>
                <input type="text" class="form-control" id="cpf" name="cpf" required>
            </div>

            <!-- Senha do UsuÃ¡rio -->
            <!--  <div class="mb-3">
                <label for="senha" class="form-label">Senha</label>
                <input type="password" class="form-control" id="senha" name="senha" required>
            </div>
            -->

            

            <!-- BotÃ£o de Cadastro -->
            <button type="submit" class="btn btn-primary">Cadastrar Cliente</button>
        </form>
    </div>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>