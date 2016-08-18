
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
        //java classNama -c ccc -t ttt 是会生成个数为4的数组 两辆一对 所以创建如下的数组
        String[] argsTest=new String[]{"-c","ccc","-t","ttt"};
        Options options=new Options();
        options.addOption("t",false,"display current time");
        options.addOption("c", true, "country code");

        CommandLineParser parser =new DefaultParser();
        CommandLine commandLine=null;
        try {
            commandLine=parser.parse(options,argsTest);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        if(commandLine.hasOption("c")){
            String countryCode=commandLine.getOptionValue("c");
            System.out.println(countryCode);
        }
        if(commandLine.hasOption("t")){
            String currentTime=commandLine.getOptionValue("t");
            System.out.println(currentTime);//输出为null
        }
    }


}
