package person;

import transport.Transport;
/**
 * @description:
 * @author: 邓建军
 * @date: Created in 2020/5/18 18:07
 * @version: 1.0
 * @modified By:
 */
public class Person {
    private int p_Age = 19;
    private String p_Sex = "男";
    private String id = "201902187";
    private String p_Name;

    public Person(String p_Name) {
        this.p_Name = p_Name;
    }

    public Person() {
    }

    public void driveTransport(Transport transport) {
        transport.drivingMethod();
    }
}
