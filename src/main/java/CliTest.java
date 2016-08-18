
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;
import org.apache.commons.cli.CommandLine;

/**
 * Created by Zhou on 2016/8/18.
 */
public class CliTest {

    public static void main(String[] args) {
        System.out.println(args.toString());
        Options options=new Options();
        options.addOption("t",false,"display current time");
        options.addOption("c", true, "country code");

        CommandLineParser parser =new DefaultParser();
        CommandLine commandLine=null;
        try {
            commandLine=parser.parse(options,args);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        if(commandLine.hasOption("c")){
            String countryCode=commandLine.getOptionValue("c");
            System.out.println(countryCode);
        }
        if(commandLine.hasOption("t")){
            String currentTime=commandLine.getOptionValue("t");
            System.out.println(currentTime);
        }
    }


}
