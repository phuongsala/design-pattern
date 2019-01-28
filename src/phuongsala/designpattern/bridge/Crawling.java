package phuongsala.designpattern.bridge;

public class Crawling implements Movement {

	@Override
	public void move() {
		System.out.println("Move: crawl");
	}

}
