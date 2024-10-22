<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Dashboard usuário</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">

</head>
<body>
<!-- Barra de navegaÃ§Ã£o simples -->
    <nav class="navbar navbar-expand-lg navbar-light bg-light">
        <div class="container-fluid">
        <h2>Bem vindo, <%=session.getAttribute("nome")%></h2>
            <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarNav">
                <ul class="navbar-nav ms-auto">
                    <li class="nav-item">
                        <a class="nav-link" href="../logout">Sair</a>
                    </li>
                </ul>
            </div>
        </div>
    </nav>
    
     <!-- ConteÃºdo Principal do Dashboard -->
    <div class="container mt-4">
        <h2 class="text-center">Bem-vindo ao Painel de Vendas </h2>
        <p class="text-center">Registre vendas</p>

        <!-- Cards com as funcionalidades do administrador -->
        <div class="row mt-5">
            <!-- Cadastrar UsuÃ¡rio -->
            <div class="col-md-4">
                <div class="card text-center">
                    <div class="card-body">
                        <h5 class="card-title">Registrar venda</h5>
                        <p class="card-text">Registre vendas no sistema</p>
                        <a href="/estoque/usuario/formCadastroUsuario.jsp" class="btn btn-primary">Cadastrar</a>
                    </div>
                </div>
            </div>

            

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>