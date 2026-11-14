package gg.jte.generated.ondemand;
import gg.jte.Content;
@SuppressWarnings("unchecked")
@javax.annotation.processing.Generated("gg.jte.TemplateEngine")
public final class JtelayoutGenerated {
	public static final String JTE_NAME = "layout.jte";
	public static final int[] JTE_LINE_INFO = {1,1,0,0,0,0,0,0,12,12,12,30,30,30,30,30,30,30,30,30,35,35,35,35,35,35,35,35,35,40,40,40,40,40,40,40,40,40,45,45,45,45,45,45,45,45,45,58,58,58,65,0,0,3,4,5,0,0,0};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, String title, String paginaAtiva, Content content) {
		jteOutput.writeContent("\r\n<!DOCTYPE html>\r\n<html lang=\"pt-BR\">\r\n<head>\r\n    <meta charset=\"UTF-8\">\r\n    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n    <title>");
		jteOutput.setContext("title", null);
		jteOutput.writeUserContent(title);
		jteOutput.writeContent(" | Cardápio da Semana</title>\r\n    <link rel=\"stylesheet\" href=\"/css/style.css\">\r\n</head>\r\n\r\n<body>\r\n\r\n<div class=\"app\">\r\n\r\n    <aside class=\"sidebar\">\r\n\r\n        <div class=\"logo\">\r\n            <span>🍳</span>\r\n            <h2>Cardápio da Semana</h2>\r\n        </div>\r\n\r\n        <nav>\r\n\r\n            <a href=\"/\"\r\n              ");
		var __jte_html_attribute_0 = paginaAtiva.equals("inicio") ? "ativo" : "";
		if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_0)) {
			jteOutput.writeContent(" class=\"");
			jteOutput.setContext("a", "class");
			jteOutput.writeUserContent(__jte_html_attribute_0);
			jteOutput.setContext("a", null);
			jteOutput.writeContent("\"");
		}
		jteOutput.writeContent(">\r\n                🏠 Início\r\n            </a>\r\n\r\n            <a href=\"/pratos\"\r\n              ");
		var __jte_html_attribute_1 = paginaAtiva.equals("pratos") ? "ativo" : "";
		if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_1)) {
			jteOutput.writeContent(" class=\"");
			jteOutput.setContext("a", "class");
			jteOutput.writeUserContent(__jte_html_attribute_1);
			jteOutput.setContext("a", null);
			jteOutput.writeContent("\"");
		}
		jteOutput.writeContent(">\r\n                🍽 Meu Cardápio\r\n            </a>\r\n\r\n            <a href=\"/pratos/novo\"\r\n              ");
		var __jte_html_attribute_2 = paginaAtiva.equals("novo") ? "ativo" : "";
		if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_2)) {
			jteOutput.writeContent(" class=\"");
			jteOutput.setContext("a", "class");
			jteOutput.writeUserContent(__jte_html_attribute_2);
			jteOutput.setContext("a", null);
			jteOutput.writeContent("\"");
		}
		jteOutput.writeContent(">\r\n                ➕ Adicionar Prato\r\n            </a>\r\n\r\n            <a href=\"/feitos\"\r\n              ");
		var __jte_html_attribute_3 = paginaAtiva.equals("feitos") ? "ativo" : "";
		if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_3)) {
			jteOutput.writeContent(" class=\"");
			jteOutput.setContext("a", "class");
			jteOutput.writeUserContent(__jte_html_attribute_3);
			jteOutput.setContext("a", null);
			jteOutput.writeContent("\"");
		}
		jteOutput.writeContent(">\r\n                ✅ Feitos\r\n            </a>\r\n\r\n        </nav>\r\n\r\n        <div class=\"sidebar-footer\">\r\n            <span>Projeto Spring Boot + JTE</span>\r\n        </div>\r\n\r\n    </aside>\r\n\r\n    <main class=\"main-content\">\r\n        ");
		jteOutput.setContext("main", null);
		jteOutput.writeUserContent(content);
		jteOutput.writeContent("\r\n    </main>\r\n\r\n</div>\r\n\r\n</body>\r\n</html>\r\n");
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		String title = (String)params.get("title");
		String paginaAtiva = (String)params.get("paginaAtiva");
		Content content = (Content)params.get("content");
		render(jteOutput, jteHtmlInterceptor, title, paginaAtiva, content);
	}
}
