
@template.layout(
title = "Novo prato",
paginaAtiva = "novo",
content = @`

    <header class="topbar">
        <span>Meu Cardápio / Novo prato</span>
    </header>

    <section class="page-heading">
        <h1>Novo prato</h1>
        <p>Preencha as informações para planejar sua refeição.</p>
    </section>

    <div class="form-layout">

        <form method="post" action="/pratos" class="form-card">

            <label>Nome do prato *</label>
            <input
                    type="text"
                    name="nome"
                    placeholder="Ex: Lasanha à Bolonhesa"
                    required>

            <div class="form-row">

                <div>
                    <label>Tipo *</label>

                    <select name="tipo" required>
                        <option value="Almoço">Almoço</option>
                        <option value="Jantar">Jantar</option>
                    </select>
                </div>

                <div>
                    <label>Porções *</label>

                    <input
                            type="number"
                            name="porcoes"
                            min="1"
                            value="4"
                            required>
                </div>

            </div>

            <label>Categoria *</label>

            <select name="categoria" required>
                <option value="Massa">Massa</option>
                <option value="Salada">Salada</option>
                <option value="Carne">Carne</option>
                <option value="Vegano">Vegano</option>
                <option value="Sobremesa">Sobremesa</option>
            </select>

            <label>Data planejada *</label>

            <input
                    type="date"
                    name="dataPlanejada"
                    required>

            <label>Observação (opcional)</label>

            <textarea
                    name="observacao"
                    placeholder="Ex: levar a sobremesa na festa de sábado">
            </textarea>

            <div class="actions">
                <button type="submit" class="btn btn-primary">
                    Salvar prato
                </button>

                <a href="/pratos" class="btn btn-light">
                    Cancelar
                </a>
            </div>

        </form>

        <aside class="summary-card">
            <span>👀</span>
            <h2>Resumo do prato</h2>
            <p>Preencha os campos para cadastrar seu prato.</p>
            <div class="summary-decoration">🍽️</div>
        </aside>

    </div>

`
)
