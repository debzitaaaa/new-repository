
@param int total
@param int feitos

@template.layout(
title = "Início",
paginaAtiva = "inicio",
content = @`

    <header class="topbar">
        <span>Minha cozinha / Início</span>
        <span>🍳 Cardápio da Semana</span>
    </header>

    <section class="welcome">
        <div>
            <span class="tag">BEM-VINDO(A)</span>
            <h1>Bem-vindo(a) à sua cozinha!</h1>

            <p>
                Planeje as refeições da semana e marque
                o que já saiu do fogão.
            </p>

            <div class="actions">
                <a href="/pratos" class="btn btn-primary">
                    Ver meu cardápio →
                </a>

                <a href="/pratos/novo" class="btn btn-light">
                    + Novo prato
                </a>
            </div>
        </div>

        <div class="welcome-icon">
            🍲
        </div>
    </section>

    <section class="stats">

        <div class="stat-card">
            <span>🍽</span>
            <h3>${total}</h3>
            <p>Pratos planejados</p>
        </div>

        <div class="stat-card">
            <span>✅</span>
            <h3>${feitos}</h3>
            <p>Pratos feitos</p>
        </div>

        <div class="stat-card">
            <span>🏆</span>
            <h3>Semana</h3>
            <p>Continue cozinhando!</p>
        </div>

    </section>

    <section class="info-card">
        <h2>Organize sua semana!</h2>
        <p>
            Cadastre seus pratos, organize suas refeições
            e acompanhe tudo o que já preparou.
        </p>
    </section>

`
)
