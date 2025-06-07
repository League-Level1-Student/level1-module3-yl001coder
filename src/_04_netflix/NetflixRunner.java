package _04_netflix;

public class NetflixRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Movie robot = new Movie("The Wild Robot", 5);
		Movie otm = new Movie("Over the Moon", 4);
		Movie mario = new Movie("Super Mario Bros", 5);
		Movie cdf = new Movie("Cirque Du Freak: The Vampire's Assistant", 4);
		Movie wicked = new Movie("Wicked: The Musical", 4);
		robot.getTicketPrice();
		otm.getTicketPrice();
		mario.getTicketPrice();
		cdf.getTicketPrice();
		wicked.getTicketPrice();
		NetflixQueue queue = new NetflixQueue();
		queue.addMovie(robot);
		queue.addMovie(otm);
		queue.addMovie(mario);
		queue.addMovie(cdf);
		queue.addMovie(wicked);
		queue.printMovies();
		System.out.println("The best movie is... " + queue.getBestMovie());
		System.out.println("The second best movie is..." +  queue.getMovie(2));
		
		
	}

}
