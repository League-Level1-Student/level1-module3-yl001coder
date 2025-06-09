package _04_netflix;

public class NetflixRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NetflixQueue queue = new NetflixQueue();
		Movie hp1 = new Movie("Harry Potter #1",5);
		Movie hp2 = new Movie("Harry Potter #2",5);
		Movie hp3 = new Movie("Harry Potter #3",5);
		Movie hp4 = new Movie("Harry Potter #4",5);
		Movie hp5 = new Movie("Harry Potter #5",5);
		Movie hp6 = new Movie("Harry Potter #6",5);
		Movie hp7 = new Movie("Harry Potter #7 Pt.1",5);
		Movie hp8 = new Movie("Harry Potter #7 Pt.2",5);
		Movie catwoman = new Movie("CatWoman", 3);
		Movie titanic = new Movie("The Legend of the Titanic",1);
		
		queue.addMovie(titanic);
		queue.addMovie(catwoman);
		queue.addMovie(hp8);
		queue.addMovie(hp7);
		queue.addMovie(hp6);
		queue.addMovie(hp5);
		queue.addMovie(hp4);
		queue.addMovie(hp3);
		queue.addMovie(hp2);
		queue.addMovie(hp1);
		queue.printMovies();
		System.out.println("The best movie is... " + queue.getBestMovie());
		System.out.println("The second best movie is... " + queue.getMovie(2));
		
	}

}
