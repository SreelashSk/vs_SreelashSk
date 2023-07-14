package coreJavaAssignment2;

public class PlayableMainClass {

	public static void main(String[] args) {

		Playable p1 = new Guitar();
		p1.play();
		System.out.println("*******************************");
		Playable p2 = new Piano();
		p2.play();
	}

}
