
/**
 *
 * @author tshep
 */
public class MovieData {
       
    private String Mname;
    private int genreId;

 
  public MovieData(int genreId, String Mname)
{
        this.genreId = genreId;
        this.Mname = Mname;

    }
 
    public int getgenreId() {
        return genreId;
    }
 
    public String getMName() {
        return Mname;
    }
 
  } 
    

