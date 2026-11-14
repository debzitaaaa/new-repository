package gg.jte.generated.ondemand;
@SuppressWarnings("unchecked")
@javax.annotation.processing.Generated("gg.jte.TemplateEngine")
public final class JteindexGenerated {
	public static final String JTE_NAME = "index.jte";
	public static final int[] JTE_LINE_INFO = {1,0,0,0,0,0,0,4,8,8,45,45,45,51,51,51,71,71,71,72,0,0,1,2,0,0,0};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, int total, int feitos) {
		jteOutput.writeContent("\r\n");
		gg.jte.generated.ondemand.JtelayoutGenerated.render(jteOutput, jteHtmlInterceptor, "Início", "inicio", new gg.jte.html.HtmlContent() {
			public void writeTo(gg.jte.html.HtmlTemplateOutput jteOutput) {
				jteOutput.writeContent("\r\n\r\n    <header class=\"topbar\">\r\n        <span>Minha cozinha / Início</span>\r\n        <span>🍳 Cardápio da Semana</span>\r\n    </header>\r\n\r\n    <section class=\"welcome\">\r\n        <div>\r\n            <span class=\"tag\">BEM-VINDO(A)</span>\r\n            <h1>Bem-vindo(a) à sua cozinha!</h1>\r\n\r\n            <p>\r\n                Planeje as refeições da semana e marque\r\n                o que já saiu do fogão.\r\n            </p>\r\n\r\n            <div class=\"actions\">\r\n                <a href=\"/pratos\" class=\"btn btn-primary\">\r\n                    Ver meu cardápio →\r\n                </a>\r\n\r\n                <a href=\"/pratos/novo\" class=\"btn btn-light\">\r\n                    + Novo prato\r\n                </a>\r\n            </div>\r\n        </div>\r\n\r\n        <div class=\"welcome-icon\">\r\n            🍲\r\n        </div>\r\n    </section>\r\n\r\n    <section class=\"stats\">\r\n\r\n        <div class=\"stat-card\">\r\n            <span>🍽</span>\r\n            <h3>");
				jteOutput.setContext("h3", null);
				jteOutput.writeUserContent(total);
				jteOutput.writeContent("</h3>\r\n            <p>Pratos planejados</p>\r\n        </div>\r\n\r\n        <div class=\"stat-card\">\r\n            <span>✅</span>\r\n            <h3>");
				jteOutput.setContext("h3", null);
				jteOutput.writeUserContent(feitos);
				jteOutput.writeContent("</h3>\r\n            <p>Pratos feitos</p>\r\n        </div>\r\n\r\n        <div class=\"stat-card\">\r\n            <span>🏆</span>\r\n            <h3>Semana</h3>\r\n            <p>Continue cozinhando!</p>\r\n        </div>\r\n\r\n    </section>\r\n\r\n    <section class=\"info-card\">\r\n        <h2>Organize sua semana!</h2>\r\n        <p>\r\n            Cadastre seus pratos, organize suas refeições\r\n            e acompanhe tudo o que já preparou.\r\n        </p>\r\n    </section>\r\n\r\n");
			}
		});
		jteOutput.writeContent("\r\n");
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		int total = (int)params.get("total");
		int feitos = (int)params.get("feitos");
		render(jteOutput, jteHtmlInterceptor, total, feitos);
	}
}
