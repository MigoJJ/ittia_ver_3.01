package je.panse.doro.fourgate.routinecheck;

import je.panse.doro.GDSEMR_frame;
import je.panse.doro.samsara.comm.datetime.Date_current;

public class routinecheck {
    
    public static void GDSRC(String[] args) {
    	String cdate = Date_current.main("d");
            GDSEMR_frame.setTextAreaText(0, "GDS clinic Routine check");
            GDSEMR_frame.setTextAreaText(7, "\n  #  GDS clinic Routine check  [ " + cdate + " ]");

    }
    public static void HCRC(String[] args) {
    	String cdate = Date_current.main("d");
            GDSEMR_frame.setTextAreaText(0, "공단검진 at GDS");
            GDSEMR_frame.setTextAreaText(7, "\n  #  공단검진 at GDS  [ " + cdate + " ]");

    }
}
