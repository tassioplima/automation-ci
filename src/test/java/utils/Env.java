package utils;

public enum Env {

    MOBILE(System.getProperty("MOBILE")),
    BOOLENV(Boolean.getBoolean("EXEC")),
    AUTOMATE_USERNAME(System.getenv("BROWSERSTACK_USERNAME")),
    AUTOMATE_ACCESS_KEY(System.getenv("BROWSERSTACK_ACCESS_KEY")),
    LOCAL_USERNAME(Utils.pathCapabilitie().getUserName()),
    LOCAL_ACCESS_KEY(Utils.pathCapabilitie().getAccessKey()),
    ;

    private boolean bool;
    private String env;

    Env(String env){
        this.env = env;
    }

    Env(boolean bool){
        this.bool = bool;
    }

    public boolean getBool(){
        return bool;
    }

    public String getEnv(){
        return env;
    }

}