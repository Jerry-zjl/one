package xm.zjl.enumtest;

public enum Size {
	
	SMALL{

		@Override
		public String viewName() {
			// TODO Auto-generated method stub
			return "很小";
		}

		@Override
		public int value() {
			// TODO Auto-generated method stub
			return 0;
		}
		
	},
	BIG{

		@Override
		public String viewName() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public int value() {
			// TODO Auto-generated method stub
			return 1;
		}
		
	};
	
	public abstract String viewName();
	
	public abstract int value();
}
