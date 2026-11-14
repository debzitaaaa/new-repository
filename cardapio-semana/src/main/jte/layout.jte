
@import gg.jte.Content

@param String title
@param String paginaAtiva
@param Content content

<!DOCTYPE html>
<html lang="pt-BR">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>${title} | Cardápio da Semana</title>
    <link rel="stylesheet" href="/css/style.css">
</head>

<body>

<div class="app">

    <aside class="sidebar">

        <div class="logo">
            <span>🍳</span>
            <h2>Cardápio da Semana</h2>
        </div>

        <nav>

            <a href="/"
               class="${paginaAtiva.equals("inicio") ? "ativo" : ""}">
                🏠 Início
            </a>

            <a href="/pratos"
               class="${paginaAtiva.equals("pratos") ? "ativo" : ""}">
                🍽 Meu Cardápio
            </a>

            <a href="/pratos/novo"
               class="${paginaAtiva.equals("novo") ? "ativo" : ""}">
                ➕ Adicionar Prato
            </a>

            <a href="/feitos"
               class="${paginaAtiva.equals("feitos") ? "ativo" : ""}">
                ✅ Feitos
            </a>

        </nav>

        <div class="sidebar-footer">
            <span>Projeto Spring Boot + JTE</span>
        </div>

    </aside>

    <main class="main-content">
        ${content}
    </main>

</div>

</body>
</html>
