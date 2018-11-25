
package object;

import java.util.List;

public interface CommonDAO {
    List<?> getList();
    
    void insert(Employees e);
}
