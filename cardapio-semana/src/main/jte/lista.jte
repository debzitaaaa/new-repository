
@import com.example.cardapio.Prato
@import java.time.format.DateTimeFormatter

@param java.util.List<Prato> pratos

@template.layout(
title = "Meu Cardápio",
paginaAtiva = "pratos",
content = @`

    <header class="topbar">
        <span>Meu Cardápio / Planejados</span>
    </header>

    <section class="page-heading heading-flex">
        <div>
            <h1>Meu Cardápio</h1>
            <p>Pratos planejados para sua semana.</p>
        </div>

        <a href="/pratos/novo" class="btn btn-primary">
            + Adicionar prato
        </a>
    </section>

    <section class="table-card">

        <h2>Planejados (${pratos.size()})</h2>

        <div class="table-scroll">

            <table>
                <thead>
                <tr>
                    <th>Nome do prato</th>
                    <th>Tipo</th>
                    <th>Categoria</th>
                    <th>Porções</th>
                    <th>Data planejada</th>
                    <th>Ação</th>
                </tr>
                </thead>

                <tbody>

                @for(Prato p : pratos)

                    <tr>
                        <td><strong>${p.getNome()}</strong></td>
                        <td>${p.getTipo()}</td>
                        <td>${p.getCategoria()}</td>
                        <td>${p.getPorcoes()}</td>

                        <td>
                            ${p.getDataPlanejada().format(
                                    DateTimeFormatter.ofPattern("dd/MM/yyyy")
                                )}
                        </td>

                        <td>
                            <form method="post"
                                  action="/pratos/${p.getId()}/feito">

                                <button type="submit"
                                        class="btn btn-small">
                                    Fiz! ✔
                                </button>

                            </form>
                        </td>
                    </tr>

                @else

                    <tr>
                        <td colspan="6">
                            Nenhum prato ainda.
                            Que tal planejar o jantar de hoje? 🍳
                        </td>
                    </tr>

                @endfor

                </tbody>
            </table>

        </div>

    </section>

`
)
