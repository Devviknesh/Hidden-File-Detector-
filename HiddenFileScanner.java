import java.io.File;

public class HiddenFileScanner {
    public static void main(String[] args) {
        File dir = new File(".");
        for (File file : dir.listFiles())
            if (file.isHidden()) System.out.println(file.getName());
    }
}
