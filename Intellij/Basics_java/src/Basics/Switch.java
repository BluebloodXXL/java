class Switch {
	public static void main(String[] args) {

		double grade = 95.5;

		switch ((int)grade / 10) {

		case 10:
		case 9:
		case 8:
			System.out.println("GRADE A+ Marks " +grade);
			break;
		case 7:
			System.out.println("GRADE A  Marks " +grade);
			break;
		case 6:
			System.out.println("GRADE A- Marks " +grade);
			break;
		case 5:
			System.out.println("GRADE B  Marks " +grade);
			break;
		case 4:
			System.out.println("GRADE C  Marks " +grade);
			break;
		case 3:
			System.out.println("GRADE D  Marks " +grade);
			break;
		case 2:
			System.out.println("GRADE E  Marks " +grade);
			break;
		case 1:
			System.out.println("Sorry you failed  Marks " +grade);
			break;
		default:
			System.out.println("INVALID INPUT");
			break;
		}

	}}
