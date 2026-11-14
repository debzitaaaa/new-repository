package gg.jte.generated.ondemand;
import com.example.cardapio.Prato;
import java.time.format.DateTimeFormatter;
@SuppressWarnings("unchecked")
@javax.annotation.processing.Generated("gg.jte.TemplateEngine")
public final class JtelistaGenerated {
	public static final String JTE_NAME = "lista.jte";
	public static final int[] JTE_LINE_INFO = {1,1,2,0,0,0,0,0,0,6,10,10,29,29,29,47,47,47,47,50,50,50,51,51,51,52,52,52,53,53,53,56,58,56,57,58,63,63,63,63,74,74,74,83,83,92,92,92,93,0,0,4,0,0,0};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.List<Prato> pratos) {
		jteOutput.writeContent("\r\n");
		gg.jte.generated.ondemand.JtelayoutGenerated.render(jteOutput, jteHtmlInterceptor, "Meu Cardápio", "pratos", new gg.jte.html.HtmlContent() {
			public void writeTo(gg.jte.html.HtmlTemplateOutput jteOutput) {
				jteOutput.writeContent("\r\n\r\n    <header class=\"topbar\">\r\n        <span>Meu Cardápio / Planejados</span>\r\n    </header>\r\n\r\n    <section class=\"page-heading heading-flex\">\r\n        <div>\r\n            <h1>Meu Cardápio</h1>\r\n            <p>Pratos planejados para sua semana.</p>\r\n        </div>\r\n\r\n        <a href=\"/pratos/novo\" class=\"btn btn-primary\">\r\n            + Adicionar prato\r\n        </a>\r\n    </section>\r\n\r\n    <section class=\"table-card\">\r\n\r\n        <h2>Planejados (");
				jteOutput.setContext("h2", null);
				jteOutput.writeUserContent(pratos.size());
				jteOutput.writeContent(")</h2>\r\n\r\n        <div class=\"table-scroll\">\r\n\r\n            <table>\r\n                <thead>\r\n                <tr>\r\n                    <th>Nome do prato</th>\r\n                    <th>Tipo</th>\r\n                    <th>Categoria</th>\r\n                    <th>Porções</th>\r\n                    <th>Data planejada</th>\r\n                    <th>Ação</th>\r\n                </tr>\r\n                </thead>\r\n\r\n                <tbody>\r\n\r\n                ");
				boolean __jte_for_loop_entered_1 = false;
				for (Prato p : pratos) {
					__jte_for_loop_entered_1 = true;
					jteOutput.writeContent("\r\n\r\n                    <tr>\r\n                        <td><strong>");
					jteOutput.setContext("strong", null);
					jteOutput.writeUserContent(p.getNome());
					jteOutput.writeContent("</strong></td>\r\n                        <td>");
					jteOutput.setContext("td", null);
					jteOutput.writeUserContent(p.getTipo());
					jteOutput.writeContent("</td>\r\n                        <td>");
					jteOutput.setContext("td", null);
					jteOutput.writeUserContent(p.getCategoria());
					jteOutput.writeContent("</td>\r\n                        <td>");
					jteOutput.setContext("td", null);
					jteOutput.writeUserContent(p.getPorcoes());
					jteOutput.writeContent("</td>\r\n\r\n                        <td>\r\n                            ");
					jteOutput.setContext("td", null);
					jteOutput.writeUserContent(p.getDataPlanejada().format(
                                    DateTimeFormatter.ofPattern("dd/MM/yyyy")
                                ));
					jteOutput.writeContent("\r\n                        </td>\r\n\r\n                        <td>\r\n                            <form method=\"post\"\r\n                                  action=\"/pratos/");
					jteOutput.setContext("form", "action");
					jteOutput.writeUserContent(p.getId());
					jteOutput.setContext("form", null);
					jteOutput.writeContent("/feito\">\r\n\r\n                                <button type=\"submit\"\r\n                                        class=\"btn btn-small\">\r\n                                    Fiz! ✔\r\n                                </button>\r\n\r\n                            </form>\r\n                        </td>\r\n                    </tr>\r\n\r\n                ");
				}
				if (!__jte_for_loop_entered_1) {
					jteOutput.writeContent("\r\n\r\n                    <tr>\r\n                        <td colspan=\"6\">\r\n                            Nenhum prato ainda.\r\n                            Que tal planejar o jantar de hoje? 🍳\r\n                        </td>\r\n                    </tr>\r\n\r\n                ");
				}
				jteOutput.writeContent("\r\n\r\n                </tbody>\r\n            </table>\r\n\r\n        </div>\r\n\r\n    </section>\r\n\r\n");
			}
		});
		jteOutput.writeContent("\r\n");
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		java.util.List<Prato> pratos = (java.util.List<Prato>)params.get("pratos");
		render(jteOutput, jteHtmlInterceptor, pratos);
	}
}
