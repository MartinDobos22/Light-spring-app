package somepackage;


import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class idk {
    private List<String> nvm = null;

    public idk() {
        this.nvm = Arrays.asList("first", "second");
    }

    public String random(){
        Random random = new Random();
        int i =random.nextInt(nvm.size());
        return nvm.get(i);
    }
}
