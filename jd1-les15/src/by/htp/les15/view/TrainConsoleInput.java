package by.htp.les15.view;

import java.util.ArrayList;
import java.util.List;

import by.htp.les15.bean.Date;
import by.htp.les15.bean.Train;

public class TrainConsoleInput {

	public List<Train> create() {
		List<Train> trains = new ArrayList<Train>();
		
		Train tr = new Train(123, "Minsk", new Date(2020,2,12,12,12));
		trains.add(tr);
		
		tr = new Train(455, "Moskva", new Date(2020,2,12,12,12));
		trains.add(tr);
		
		tr = new Train(12, "Moskva", new Date(2020,2,12,12,12));
		trains.add(tr);
		
		tr = new Train(346, "Moskva", new Date(2020,2,12,12,12));
		trains.add(tr);
		
		tr = new Train(498, "Moskva", new Date(2020,2,12,12,12));
		trains.add(tr);
		
		return trains;
		
	}

}
