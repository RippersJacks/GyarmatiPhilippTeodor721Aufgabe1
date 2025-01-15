import XMLLog.FileType;
import parser.LogParser;
import parser.LogParserFactory;
import parser.LogStatistic;
public class main {
    public static void main(String[] args) {

        System.out.println("XML Log");
        parseLogByType(FileType.XML);

    }

    private static void parseLogByType(FileType fileType) {
        LogParser parser = LogParserFactory.getParser(fileType);
        String path = "evenimente.xml";

        LogStatistic stat = new LogStatistic(parser, path);
        System.out.println("Normal print");
        stat.print();
        System.out.println("Sorted print");
        stat.sortedPrint();
    }
}
