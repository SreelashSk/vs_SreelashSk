package coreJavaAssignment2;

public interface Playable {

	void play();
}

class Guitar implements Playable {

	@Override
	public void play() {
		System.out.println("Ram is playing Guitar..");
	}

}

class Piano implements Playable {

	@Override
	public void play() {
		System.out.println("Suraj is playing Piano");
	}

}
