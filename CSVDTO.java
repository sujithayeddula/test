import java.util.ArrayList;


public class CSVDTO {
	int diagnosticid ;
	String domainName;	
	int score;
	//String standard;
	String evidenceNote;
	String additionalNotes;	
	ArrayList<CSVDTO> leadershipCapactiyData;
	ArrayList<CSVDTO> learningCapactiyData;
	ArrayList<CSVDTO> resourceCapacityData;
    ArrayList<CSVDTO> CSVData;
    
    public ArrayList<CSVDTO> gettingCSVData(){
    	ArrayList<CSVDTO> CSVData= new ArrayList<CSVDTO>();
    	CSVDTO csvDTO1 = new CSVDTO();
    	csvDTO1.diagnosticid    = 10;     		
		csvDTO1.domainName      = "Leadership Capactiy";
		csvDTO1.score           =  80 ;
		csvDTO1.evidenceNote    = "Leadership Evidence" ;
		csvDTO1.additionalNotes = "Leadership Additional" ;
		CSVData.add(csvDTO1);
		
		
    	for(int i=0;i<4;i++){
    		CSVDTO csvDTO = new CSVDTO();
    		csvDTO.diagnosticid    = 10;     		
    		csvDTO.domainName        = "Leadership Standard # "+ i;
    		csvDTO.score           =  80 + i;
    		csvDTO.evidenceNote    = "Leadership Evidence" + i;
    		csvDTO.additionalNotes = "Leadership Additional" + i;
    		CSVData.add(csvDTO);
    	}
    	CSVDTO csvDTO2 = new CSVDTO();
    	csvDTO2.diagnosticid    = 20;     		
		csvDTO2.domainName      = "Learning Capactiy";
		csvDTO2.score           =  80 ;
		csvDTO2.evidenceNote    = "" ;
		csvDTO2.additionalNotes = "" ;
		CSVData.add(csvDTO2);
    	for(int i=0;i<4;i++){
    		CSVDTO csvDTO = new CSVDTO();
    		csvDTO.diagnosticid    = 20;     		
    		csvDTO.domainName        = "Learning Standard # "+ i;
    		csvDTO.score           =  90 + i;
    		csvDTO.evidenceNote    = "Learning Evidence" + i;
    		csvDTO.additionalNotes = "Learning Additional" + i;
    		CSVData.add(csvDTO);
    	}
    	CSVDTO csvDTO3 = new CSVDTO();
    	csvDTO3.diagnosticid    = 30;     		
		csvDTO3.domainName      = "Resource Capactiy";
		csvDTO3.score           =  80 ;
		csvDTO3.evidenceNote    = "" ;
		csvDTO3.additionalNotes = "" ;
		CSVData.add(csvDTO3);
    	for(int i=0;i<4;i++){
    		CSVDTO csvDTO = new CSVDTO();
    		csvDTO.diagnosticid    = 30; 
    		csvDTO.domainName      = "Resource Standard # "+ i;    		
    		csvDTO.score           =  70 + i;
    		csvDTO.evidenceNote    = "Resource Evidence" + i;
    		csvDTO.additionalNotes = "Resource Additional" + i;
    		CSVData.add(csvDTO);
    	}
    	return CSVData;
    }
 
  
}
