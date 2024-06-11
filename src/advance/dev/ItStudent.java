package advance.dev;

public class ItStudent implements IHacker, IGamer, ICoder {
	@Override
	public void code() {
		System.out.println("Coding...");
	}

	@Override
	public void playGame() {
		System.out.println("Playing game...");
	}

	@Override
	public void hackFacebook() {
		System.out.println("Hacking Facebook...");
	}

	@Override
	public String sleep(String time) {
		return "Sleeping at " + time;
	}

	public void goToSchool() {
		System.out.println("Going to school...");
	}
}
