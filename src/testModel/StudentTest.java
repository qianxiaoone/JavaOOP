package testModel;

import model.Student;

/**
 * 名称：〈一句话功能简述〉<br> 
 * 功能：〈功能详细描述〉<br>
 * 方法：〈方法简述 - 方法描述〉<br>
 * 版本：1.0 <br>
 * 日期：2019年7月16日 <br>
 * 作者：wang-hc <br>
 * 说明：<br>
 */
public class StudentTest {
    public static void main(String[] args) {
        Student sdt = new Student("小明", 18, "男", "201900001");
        System.out.println("姓名："+sdt.getName()+";年龄:"+sdt.getAge()+";性别："+sdt.getSex()+";学号："+sdt.getId());
    }

}
