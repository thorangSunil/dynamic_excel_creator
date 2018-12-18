package report_config;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class ReportConfig {
    public List<FieldSelector> reportFieldSelector = new ArrayList<FieldSelector>();

    public boolean isFieldToShow(String fieldCanonicalName){
//        for (FieldSelector fs: reportFieldSelector) {
//            if(fs.fieldIdentifier.equalsIgnoreCase(fieldCanonicalName) && fs.isPlotOnReport){
//                return true;
//            }
//        }
        return true;
    }

    @Getter
    @Setter
    public static class FieldSelector{
        String fieldName;
        String headerText;
        String fieldIdentifier;
        boolean isPlotOnReport;

        public FieldSelector(String fieldName, String headerText, String fieldIdentifier, boolean isPlotOnReport) {
            this.fieldName = fieldName;
            this.headerText = headerText;
            this.fieldIdentifier = fieldIdentifier;
            this.isPlotOnReport = isPlotOnReport;
        }
    }
}


