import java.util.ArrayList;

public class Team {

    private String name;
    int Played = 0;
    int lost = 0;
    int won = 0;
    int tied = 0;

    private ArrayList<player> members = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public  boolean addplayer(player player) {

        if (members.contains(player)) {
            System.out.println(player.getName() + "is already on this team");
            return false;
        } else {
            members.add(player);
            System.out.println(player.getName() + "picked for team" + this.name);
            return true;
        }
    }
        public int numPlayers(){
            return this.members.size();

        }
        public void matchResult(Team opponent,int ourscore,int theirscore){
            if(ourscore>theirscore){
                won++;
            }else if(ourscore==theirscore){
                tied++;

            }else{
                lost++;
            }
            Played++;
            if(opponent!= null){
                opponent.matchResult(null,theirscore,ourscore);
            }

        }



    public  int ranking(){
        return (won*2) + tied;
    }
}
