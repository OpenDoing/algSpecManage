package entity.sign;

import java.util.HashMap;
import java.util.List;

/**
 * 观察操作子,Attr是关键字
 * 键值对形式
 *
 * @author Duyining
 * @date 2019/8/2
 */
public class Attributes {
    private List<HashMap<String,Object>> attrs;

    public List<HashMap<String, Object>> getAttrs() {
        return attrs;
    }

    public void setAttrs(List<HashMap<String, Object>> attrs) {
        this.attrs = attrs;
    }

    @Override
    public String toString() {
        return "Attributes{" +
                "attrs=" + attrs +
                '}';
    }

}
