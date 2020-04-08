import org.javatuples.Pair;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;

import java.util.List;

public class UIUtils {

    public static PieDataset convertPairsToPieDataset(List<Pair<String, Integer>> pairs) {
        // TODO
        DefaultPieDataset result = new DefaultPieDataset();
        result.setValue("Deaths",83568);
        result.setValue("Confirmed",1450343);
        result.setValue("Recovered",308617);

        return result;
    }

}
