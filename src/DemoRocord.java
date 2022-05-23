public class DemoRocord {
    String serial;
    String name;
    String id;

    DemoRocord(String serial, String name, String id)
    {
        this.serial = serial;
        this.name = name;
        this.id = id;
    }

    public String getSerial() {
        return serial;
    }
    public String getName() {
        return name;
    }
    public String getId() {
        return id;
    }
}
