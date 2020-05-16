package dados;

import java.util.Date;

public class Id {
	
		public long id;

		public Id() {
			Date idTime = new Date();
			this.id = idTime.getTime();
		}	
	}
