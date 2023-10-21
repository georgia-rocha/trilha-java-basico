import Entity.Iphone;

public class Main {
  public static void main(String[] args) {
    Iphone iphone = new Iphone();

    iphone.call("8299999999");
    iphone.meet();
    iphone.voiceMail();
    iphone.play("505");
    iphone.pause();
    iphone.selectMusic();
    iphone.displayPage();
    iphone.addNewTab();
    iphone.updatePage();
  }
}