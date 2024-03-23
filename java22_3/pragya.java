class pragya {
	static void p() {
		clrscr();
		System.out.println("**********    ");
		System.out.println("***********   ");
		System.out.println("***        *  ");
		System.out.println("***        *  ");
		System.out.println("***       *   ");
		System.out.println("**********    ");
		System.out.println("*********     ");
		System.out.println("***           ");
		System.out.println("***           ");
		System.out.println("***           ");
		System.out.println("***           ");
	}

	static void R() {
		clrscr();
		System.out.println("**********    ");
		System.out.println("***********   ");
		System.out.println("***        *  ");
		System.out.println("***        *  ");
		System.out.println("***       *   ");
		System.out.println("**********    ");
		System.out.println("*********     ");
		System.out.println("*** *         ");
		System.out.println("***   *       ");
		System.out.println("***     *     ");
		System.out.println("***       *   ");
	}

	static void A() {
		clrscr();
		System.out.println(" *********   ");
		System.out.println("***********  ");
		System.out.println("**       **  ");
		System.out.println("**       **  ");
		System.out.println("**       **  ");
		System.out.println("***********  ");
		System.out.println("***********  ");
		System.out.println("**       **  ");
		System.out.println("**       **  ");
		System.out.println("**       **  ");
		System.out.println("**       **  ");
	}

	static void G() {
		clrscr();
		System.out.println(" *********       ");
		System.out.println("************     ");
		System.out.println("**               ");
		System.out.println("**               ");
		System.out.println("**               ");
		System.out.println("**       *****   ");
		System.out.println("**         ***   ");
		System.out.println("**          **   ");
		System.out.println("**         **    ");
		System.out.println(" **       **    ");
		System.out.println("   *******       ");
	}

	static void Y() {
		clrscr();
		System.out.println("**       **  ");
		System.out.println("**       **  ");
		System.out.println("**       **  ");
		System.out.println("**       **  ");
		System.out.println("**       **  ");
		System.out.println("***********  ");
		System.out.println("***********  ");
		System.out.println("    **       ");
		System.out.println("    **  	 ");
		System.out.println("    **  	 ");
		System.out.println("    **   	 ");
	}

	static void _2() {
		clrscr();
		System.out.println("***********  ");
		System.out.println("***********  ");
		System.out.println("         **  ");
		System.out.println("         **  ");
		System.out.println("         **  ");
		System.out.println("***********  ");
		System.out.println("***********  ");
		System.out.println("**           ");
		System.out.println("**           ");
		System.out.println("***********  ");
		System.out.println("***********  ");
	}

	static void _0() {
		clrscr();
		System.out.println("**********  ");
		System.out.println("***********  ");
		System.out.println("**       **  ");
		System.out.println("**       **  ");
		System.out.println("**       **  ");
		System.out.println("**       **  ");
		System.out.println("**       **  ");
		System.out.println("**       **  ");
		System.out.println("**       **  ");
		System.out.println("***********  ");
		System.out.println("***********  ");
	}

	static void _4() {
		clrscr();
		System.out.println("**       **  ");
		System.out.println("**       **  ");
		System.out.println("**       **  ");
		System.out.println("**       **  ");
		System.out.println("**       **  ");
		System.out.println("***********  ");
		System.out.println("***********  ");
		System.out.println("         **  ");
		System.out.println("         **  ");
		System.out.println("         **  ");
		System.out.println("         **  ");
	}

	static void clrscr() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {

		}
		System.out.println("\033[H\033[2J");
	}

	public static void main(String args[]){
		p();
		R();
		A();
		G();
		Y();
		A();
		_2();
		_0();
		_2();
		_4();
	}
}
