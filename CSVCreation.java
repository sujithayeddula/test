import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;


public class CSVCreation {
	
	
	public static void buildingCSV(HashMap<Integer, ArrayList<CSVDTO>> CSVdata , HashMap<Integer, String> CSVDomain)throws IOException{
		BufferedWriter writer = null;
        String fileName = "D:/CSVTest/test.csv";
            try {
            	
				writer = new BufferedWriter(new OutputStreamWriter(
				        new FileOutputStream(fileName, true), "UTF8"));
				//for domain headings
				String domainString = "Domain"+","+"Standard"+","+"Score"+","+"Evidence Notes"+","+"Additional Notes";
			    //String staticActionString = "Action Type"+","+"Action"+","+"Assurances";
				if(CSVdata!=null && CSVdata.size()>0){
					for(Integer diagnosticid:CSVdata.keySet()){
						 ArrayList<CSVDTO> CSVDataList  = CSVdata.get(diagnosticid);
						 writer.write(domainString);	
						 writer.newLine();
						 for(int i=0;i<CSVDataList.size();i++){
							 CSVDTO csvdto = CSVDataList.get(i) ;							
							 writer.write(CSVDomain.get(csvdto.diagnosticid)+","+csvdto.domainName +","+csvdto.score+","+csvdto.evidenceNote+","+csvdto.additionalNotes);
							writer.newLine();
						 }
						 writer.newLine();
						 writer.newLine();
					}
				}
				
			} catch (UnsupportedEncodingException e) {
				e.printStackTrace();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
            finally {
                if (writer != null)
                {
                    writer.flush();
                    writer.close();
                }
            }
	}
	
	
	
	public static void main(String[] args) throws IOException {
		
		CSVDTO csvdto = new CSVDTO();
		
	    ArrayList<CSVDTO> CSVData = csvdto.gettingCSVData();
	    HashMap<Integer, ArrayList<CSVDTO>> CSVDataMap= new HashMap<Integer, ArrayList<CSVDTO>>();	
	    HashMap<Integer, String> CSVDomain= new HashMap<Integer, String>();
	    ArrayList<CSVDTO> CSVDataList  = new ArrayList<CSVDTO>();
	    
	    
		for(int i=0;i<CSVData.size();i++)  {
			
			CSVDTO csvdto1 = CSVData.get(i) ;	
			if(csvdto1.diagnosticid != 0 ){
				if(CSVDataMap.containsKey(csvdto1.diagnosticid)){
					CSVDataList = CSVDataMap.get(csvdto1.diagnosticid);
					CSVDataList.add(csvdto1);
					CSVDataMap.put(csvdto1.diagnosticid, CSVDataList);
				}else{					
					if(!csvdto1.domainName.equals("Leadership Capactiy") && !csvdto1.domainName.equals("Learning Capactiy") 
							&& !csvdto1.domainName.equals("Resource Capactiy") ){	// change made here	
					CSVDataList  = new ArrayList<CSVDTO>();
					CSVDataList.add(csvdto1);
					CSVDataMap.put(csvdto1.diagnosticid, CSVDataList);
					}else{
					CSVDomain.put(csvdto1.diagnosticid, csvdto1.domainName);
					}
				}
				
			}
			
		}
		
		
		
		buildingCSV(CSVDataMap , CSVDomain );
		
	}	
	

}
