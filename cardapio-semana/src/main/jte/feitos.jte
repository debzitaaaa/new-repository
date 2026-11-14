
@import com.example.cardapio.PratoFeito
@import java.time.format.DateTimeFormatter

@param java.util.List<PratoFeito> feitos

@template.layout(
title = "Pratos feitos",
paginaAtiva = "feitos",
content = @`

    <header class="topbar">
        <span>Meu Cardápio / Feitos</span>
    </header>

    <section class="page-heading">
        <h1>Feitos esta semana 🏆</h1>
        <p>Acompanhe as refeições que você já preparou.</p>
    </section>

    <section class="table-card">

        <h2>Refeições concluídas (${feitos.size()})</h2>

        <div class="table-scroll">

            <table>
                <thead>
                <tr>
                    <th>Nome do prato</th>
                    <th>Nota</th>
                    <th>Feito em</th>
                </tr>
                </thead>

                <tbody>

                @for(PratoFeito f : feitos)

                    <tr>
                        <td><strong>${f.getNome()}</strong></td>

                        <td>
                                <span class="stars">
                                    @for(int i = 1; i <= 5; i++)
                                        ${i <= f.getNota() ? "★" : "☆"}
                                    @endfor
                                </span>
                        </td>

                        <td>
                            ${f.getFeitoEm().format(
                                    DateTimeFormatter.ofPattern("dd/MM/yyyy")
                                )}
                        </td>
                    </tr>

                @else

                    <tr>
                        <td colspan="3">
                            Nenhuma refeição concluída ainda.
                        </td>
                    </tr>

                @endfor

                </tbody>
            </table>

        </div>

    </section>

`
)
