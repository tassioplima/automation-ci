package utils;

public enum ValuesEnum {

    MOBILE(System.getProperty("MOBILE")),
    BOOLENV(Boolean.getBoolean("EXEC"))
    ;

    private boolean bool;
    private String env;

    ValuesEnum (String env){
        this.env = env;
    }

    ValuesEnum (boolean bool){
        this.bool = bool;
    }

    public boolean getBool(){
        return bool;
    }

    public String getEnv(){
        return env;
    }

}
