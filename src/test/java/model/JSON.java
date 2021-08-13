package model;

public class JSON {

    private String name;
    private String key;
    private String platform;
    private String appPackage;
    private String appActivity;
    private String udid;
    private String [] apps;
    private String [] device;
    private String [] os_version;
    private String [] appLocal;
    private Environments[] environments;


    public String getUserName(){
        return name;
    }

    public String getAccessKey(){
        return key;
    }

    public String getPlatform(){
        return platform;
    }

    public String[] getApps() {
        return apps;
    }

    public Environments[] getEnvironment(){
        return environments;
    }

    public String [] getDevices(){
        return device;
    }

    public String [] getOSVersions(){
        return os_version;
    }

    public String getAppPackage(){
        return appPackage;
    }

    public String getAppActivity(){
        return appActivity;
    }

    public String getUdid(){
        return udid;
    }

    public String [] getAppLocal(){
        return appLocal;
    }
}