import clans.Company;
import clans.character.Dwarf;

/**
 * Created by inkwizytor89 on 19.10.16.
 */
public class Main {

    public static void main(String[] args) {
        Company zgraja = new Company("zgraja");

        zgraja.add(new Dwarf("Mikolaj", zgraja));
        zgraja.add(new Dwarf("Tomasz", zgraja));
        zgraja.add(new Dwarf("Grzegorz", zgraja));
        zgraja.add(new Dwarf("Jan", zgraja));

        System.out.println(zgraja.toString());

    }
}
