package org.zkoss.theme.atlantic;

import org.zkoss.zk.ui.WebApp;
import org.zkoss.zk.ui.WebApps;
import org.zkoss.zk.ui.util.WebAppInit;
import org.zkoss.zkmax.theme.ResponsiveThemeRegistry;
import org.zkoss.zul.theme.Themes;

public class AtlanticThemeWebAppInit implements WebAppInit {

	/*package*/ static final String ATLANTIC_NAME = "atlantic";
	/*package*/ static final String ATLANTIC_DISPLAY = "Atlantic";
	/*package*/ static final int ATLANTIC_PRIORITY = 1000;

	public void init(WebApp wapp) throws Exception {
		wapp.getConfiguration().addThemeURIHandler(new AtlanticThemeURIHandler());
		Themes.register(ATLANTIC_NAME, ATLANTIC_DISPLAY, ATLANTIC_PRIORITY);
		if ("EE".equals(WebApps.getEdition())) {
			Themes.register(ResponsiveThemeRegistry.TABLET_PREFIX + ATLANTIC_NAME, ATLANTIC_DISPLAY, ATLANTIC_PRIORITY);
		}
	}
}
