package tech.bugstars.mytomcat.chapter02;

public class StaticResourceProcessor {

    public void process(Request request,Response response){
        response.sendStaticResource();
    }
}
