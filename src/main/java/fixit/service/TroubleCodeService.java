
package fixit.service;

import java.util.List;

import fixit.model.TroubleCode;
 
 
public interface TroubleCodeService {
     
    TroubleCode findById(int id);
     
    void saveTroubleCode(TroubleCode troubleCode);
     
    void updateTroubleCode(TroubleCode troubleCode);
     
    void deleteTroubleCodeByNumber(String number);
 
    List<TroubleCode> findAllTroubleCodes(); 
 
}
