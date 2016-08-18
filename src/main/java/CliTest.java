
import org.apache.commons.cli.Options;

/**
 * Created by Zhou on 2016/8/18.
 */
public class CliTest {

    public static void main(String[] args) {
        Options options=new Options();
        options.addOption("t",false,"display current time");
        options.addOption("c", true, "country code");
    }


}
