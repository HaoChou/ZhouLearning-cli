import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.OptionBuilder;
import org.apache.commons.cli.Options;

/**
 * Created by zhouhao9 on 2016/8/19.
 */
public class HelpFormatterTest {


    public static void main(String[] args) {
        Options options = new Options();
        //官网的exmpale是用OptionBuilder的 这里改成用最新的Option.builder()
        options.addOption(Option.builder("f")
                .longOpt("file")
                .desc("The file to be peocessd ")
                .hasArg()
                .argName("FILE")
                .required()
                .build());

        //OptionBuilder已经在1.3的时候弃用
        options.addOption(OptionBuilder.withLongOpt("help").create('h'));

        options.addOption(Option.builder("v")
                .longOpt("version")
                .desc("Print the version of the application")
                .build());

        String header = "Do something useful with an input file\n\n";
        String footer = "\nPlease report issues at http://example.com/issues";

        HelpFormatter formatter = new HelpFormatter();
        formatter.printHelp("myapp", header, options, footer, true);


    }


}
