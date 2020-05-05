package maize;

import maize.constants.Constants;
import maize.model.Position;
import maize.service.MaizeService;

public class MaizeOperation {
	
	private static final int maize[][] = MaizeService.getMaize();
	
	public void maizeSearch(MaizeService maizeService) {
		
		Position position = new Position(0, 3);		
		maizeService.pushOnePosition(position);
		
		while (true) {
			int x = maizeService.xPpeek();
			int y = maizeService.yPeek();

			maize[y][x] = 0;

			// down
			if (maizeService.isValid(y + 1, x)) {
				if (maize[y + 1][x] == 2) {
					maizeService.print(Constants.TASK_COMPLETED);
					return;
				} else if (maize[y + 1][x] == 1) {
					maizeService.print(Constants.MOVE_DOWN);
					maizeService.plus_y_cordenates(y, x);
					continue;
				}
			}

			// left
			if (maizeService.isValid(y, x - 1)) {
				if (maize[y][x - 1] == 2) {
					maizeService.print(Constants.TASK_COMPLETED);
					return;
				} else if (maize[y][x - 1] == 1) {
					maizeService.print(Constants.MOVE_LEFT);
					maizeService.minus_x_cordenates(y, x);
					continue;
				}
			}
			// up
			if (maizeService.isValid(y - 1, x)) {
				if (maize[y - 1][x] == 2) {
					maizeService.print(Constants.TASK_COMPLETED);
					return;
				} else if (maize[y - 1][x] == 1) {
					maizeService.print(Constants.MOVE_UP);
					maizeService.minus_y_cordenates(y, x);
					continue;
				}
			}
			// right
			if (maizeService.isValid(y, x + 1)) {
				if (maize[y][x + 1] == 2) {
					maizeService.print(Constants.TASK_COMPLETED);
					return;
				} else if (maize[y][x + 1] == 1) {
					maizeService.print(Constants.MOVE_RIGHT);
					maizeService.plus_x_cordenates(y, x);
					continue;
				}
			}

			maizeService.popping();
		}
	}
	
	

	
}
