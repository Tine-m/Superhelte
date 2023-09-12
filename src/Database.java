public class Database {

    private Superhero[] superheroes = new Superhero[5];
    private int count = 0;

    public Database() {
        // Lægger altid 3 superhelte i databasen, fordi det bliver lettere at teste uden brugerindtastninger
        superheroes[count++] = new Superhero("Superman", "Clark Kent", "Superstyrke", 1938, false, 100);
        superheroes[count++] = new Superhero("Batman", "Bruce Wayne", "Millioner", 1939, true, 1.2);
        superheroes[count++] = new Superhero("Spider-Man", "Peter Parker", "Spind", 1962, true, 2.4);
    }

    // Opret superhelt objekt og tilføj til array
    public void addSuperhero(String superheroName, String realName, String superPower, int yearcreated, boolean isHuman, double strength) {
        Superhero superhero = new Superhero(superheroName, realName, superPower, yearcreated, isHuman, strength);
        superheroes[count++] = superhero;
    }


}
