package gg.jte.generated.ondemand;
import com.example.cardapio.PratoFeito;
import java.time.format.DateTimeFormatter;
@SuppressWarnings("unchecked")
@javax.annotation.processing.Generated("gg.jte.TemplateEngine")
public final class JtefeitosGenerated {
	public static final String JTE_NAME = "feitos.jte";
	public static final int[] JTE_LINE_INFO = {1,1,2,0,0,0,0,0,0,6,10,10,23,23,23,38,38,38,38,41,41,41,45,45,46,46,46,47,47,52,54,52,53,54,58,58,58,66,66,75,75,75,76,0,0,4,0,0,0};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.List<PratoFeito> feitos) {
		jteOutput.writeContent("\r\n");
		gg.jte.generated.ondemand.JtelayoutGenerated.render(jteOutput, jteHtmlInterceptor, "Pratos feitos", "feitos", new gg.jte.html.HtmlContent() {
			public void writeTo(gg.jte.html.HtmlTemplateOutput jteOutput) {
				jteOutput.writeContent("\r\n\r\n    <header class=\"topbar\">\r\n        <span>Meu Cardápio / Feitos</span>\r\n    </header>\r\n\r\n    <section class=\"page-heading\">\r\n        <h1>Feitos esta semana 🏆</h1>\r\n        <p>Acompanhe as refeições que você já preparou.</p>\r\n    </section>\r\n\r\n    <section class=\"table-card\">\r\n\r\n        <h2>Refeições concluídas (");
				jteOutput.setContext("h2", null);
				jteOutput.writeUserContent(feitos.size());
				jteOutput.writeContent(")</h2>\r\n\r\n        <div class=\"table-scroll\">\r\n\r\n            <table>\r\n                <thead>\r\n                <tr>\r\n                    <th>Nome do prato</th>\r\n                    <th>Nota</th>\r\n                    <th>Feito em</th>\r\n                </tr>\r\n                </thead>\r\n\r\n                <tbody>\r\n\r\n                ");
				boolean __jte_for_loop_entered_1 = false;
				for (PratoFeito f : feitos) {
					__jte_for_loop_entered_1 = true;
					jteOutput.writeContent("\r\n\r\n                    <tr>\r\n                        <td><strong>");
					jteOutput.setContext("strong", null);
					jteOutput.writeUserContent(f.getNome());
					jteOutput.writeContent("</strong></td>\r\n\r\n                        <td>\r\n                                <span class=\"stars\">\r\n                                    ");
					for (int i = 1; i <= 5; i++) {
						jteOutput.writeContent("\r\n                                        ");
						jteOutput.setContext("span", null);
						jteOutput.writeUserContent(i <= f.getNota() ? "★" : "☆");
						jteOutput.writeContent("\r\n                                    ");
					}
					jteOutput.writeContent("\r\n                                </span>\r\n                        </td>\r\n\r\n                        <td>\r\n                            ");
					jteOutput.setContext("td", null);
					jteOutput.writeUserContent(f.getFeitoEm().format(
                                    DateTimeFormatter.ofPattern("dd/MM/yyyy")
                                ));
					jteOutput.writeContent("\r\n                        </td>\r\n                    </tr>\r\n\r\n                ");
				}
				if (!__jte_for_loop_entered_1) {
					jteOutput.writeContent("\r\n\r\n                    <tr>\r\n                        <td colspan=\"3\">\r\n                            Nenhuma refeição concluída ainda.\r\n                        </td>\r\n                    </tr>\r\n\r\n                ");
				}
				jteOutput.writeContent("\r\n\r\n                </tbody>\r\n            </table>\r\n\r\n        </div>\r\n\r\n    </section>\r\n\r\n");
			}
		});
		jteOutput.writeContent("\r\n");
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		java.util.List<PratoFeito> feitos = (java.util.List<PratoFeito>)params.get("feitos");
		render(jteOutput, jteHtmlInterceptor, feitos);
	}
}
