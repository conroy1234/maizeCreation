package maize;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.jupiter.api.Test;

import maize.model.Position;
import maize.service.MaizeService;

class MaizeApplicationTest {
	
	int x =0;
	int y =0;
	
	Position position = new Position(0, 3);
	MaizeService maizeService = new MaizeService();
	
	@Before
	public void setUp() {
		maizeService.pushOnePosition(position);
		this. x = maizeService.xPpeek();
		this. y = maizeService.yPeek();
	}
	
	
	@Test
	void when_minus_x_cordenate() {
		if(maizeService.isValid(y + 1, x)) {
		MaizeOperation opperation = new MaizeOperation();		
		opperation.maizeSearch(maizeService);
		assertNotNull(maizeService.minus_x_cordenates(0, 4));
		assertEquals(maizeService.minus_x_cordenates(0, 4),3);
		}
	}
	

}
