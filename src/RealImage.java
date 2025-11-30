public class RealImage implements Image{
    private String filemane;
    public RealImage(String filename){
        this.filemane =  filename;
        loadFromDisk();
    }

    private void loadFromDisk(){ System.out.println("Loading image : " + filemane);}

    public void display(){System.out.println("Display Image: " + filemane);}
}
