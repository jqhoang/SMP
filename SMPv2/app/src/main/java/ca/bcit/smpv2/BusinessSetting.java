package ca.bcit.smpv2;

public class BusinessSetting {

    private int businessID;
    private Setting setting;
    private String value;

    public BusinessSetting(int businessID, Setting businessSetting, String value) {
        this.businessID = businessID;
        this.setting = businessSetting;
        this.value = value;
    }

    public BusinessSetting(String sqlResult){
        String[] result = sqlResult.split("~s");
        this.businessID = Integer.parseInt(result[0]);
        this.setting = new Setting(result[1] + "~s" + result[2] + "~s" + result[3]);
        this.value = result[4];
    }

    public int getBusinessID() {
        return businessID;
    }

    public void setBusinessID(int businessID) {
        this.businessID = businessID;
    }

    public Setting getSetting() {
        return setting;
    }

    public void setSetting(Setting setting) {
        this.setting = setting;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
