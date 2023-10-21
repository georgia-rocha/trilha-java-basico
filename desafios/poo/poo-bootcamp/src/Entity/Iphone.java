package Entity;

public class Iphone {
  @Override

  public void call(String phone) {
    System.out.println("calling" + phone);
  }

  @Override
  public void meet() {
    System.out.println("answering the call");
  }

  @Override
  public void voiceMail() {
    System.out.println("playing voicemail");
  }

  @Override
  public void displayPage() {
    System.out.println("displaying page");
  }

  @Override
  public void addNewTab() {
    System.out.println("New Tab!");
  }

  @Override
  public void updatePage() {
    System.out.println("updated page!");
  }

  @Override
  public void play(String music) {

    System.out.println("Playing " + music);
  }

  @Override
  public void pause() {
    System.out.println("Music paused!");
  }

  @Override
  public void selectMusic() {
    System.out.println("Selected music!");
  }

}
