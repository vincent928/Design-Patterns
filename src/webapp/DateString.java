package webapp;

import javax.sql.rowset.serial.SerialBlob;
import java.sql.Blob;
import java.sql.SQLException;

public class DateString {
    public static void main(String[] args) {
       String a="按照凉山州金叶货运共享平台物流运输要求，本着对货主、买家、物流司机公开、公平、公正原则，特制定信用体系。\n" +
               "\n" +
               "  一、 按要求完成一次送货，未出现货物损坏、丢失和客户投诉等异常情况，信用积分+1分。\n" +
               "\n" +
               "  二、车辆未在规定时间内到达指定送货地点装货，信用积分-1分。\n" +
               "\n" +
               "  三、未在规定时间内交付保证金，信用积分-1分。\n" +
               "\n" +
               "  四、运输过程中出现短包少件、水湿及其他安全情况发生，信用积分-1分。\n" +
               "\n" +
               "  五、承运过程中违反装卸方管理规定，出现客户投诉，信用积分-1分。\n" +
               "\n" +
               "  六、未在规定时间内将货物送达指定地点，信用积分-1分。\n" +
               "\n" +
               "  七、出现运单、准运证（电子合同）遗失、损毁，信用积分-1分。\n" +
               "\n" +
               "  八、不按公司管理规定实施装载及安全防护，信用积分-1分。\n" +
               "\n" +
               "  九、不在规定时间内将承运单据交回公司，信用积分-1分。\n" +
               "\n" +
               "  十、在运输过程中出现交通安全事故造成货损，信用积分-1分。\n" +
               "\n" +
               "  积分越高，在货运平台中预约送货成功率越高，积分低于20分，则进入失信名单，不能再进入平台享用相关服务。";
     Blob blob=null;
        try {
             blob=new SerialBlob(a.getBytes());
        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println(blob.toString());
    }



}
