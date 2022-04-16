package day31_Constructors;

public class MovieObjects {
    public static void main(String[] args) {

        Movie movie = new Movie("Turkey", "Zugurt Aga", "Dram", "May  1990", "Memduh Un");

        String casting = "Sener Sen";

        movie.addCast(casting);

        System.out.println(movie);//Movie{country='Turkey', title='Zugurt Aga', releaseDate='May  1990', total number of casts='1'}

        String[] castings = {"Zeynep", "Murat", "Ali"};

        movie.addCast(castings);

        System.out.println(movie);//Movie{country='Turkey', title='Zugurt Aga', releaseDate='May  1990', total number of casts='4'}


    }
}
