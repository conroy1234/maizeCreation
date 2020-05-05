package maize;

import maize.service.MaizeService;

public class MaizeApplication {

	public static void main(String[] args) {
		new MaizeOperation().maizeSearch(new MaizeService());

	}

}
