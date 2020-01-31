import java.util.Comparator;

public class Player implements Comparator<Player> {
String name;
String skill;


public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}


public String getSkill() {
	return skill;
}


public void setSkill(String skill) {
	this.skill = skill;
}


public Player(String name, String skill) {
	super();
	this.name = name;
	this.skill = skill;
}


@Override
public String toString() {
	return "Player [name=" + name + ", skill=" + skill + "]";
}


@Override
public int compare(Player o1, Player o2) {
	// TODO Auto-generated method stub
	return 0;
}


}
