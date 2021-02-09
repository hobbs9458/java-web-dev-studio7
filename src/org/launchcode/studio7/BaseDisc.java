package org.launchcode.studio7;

public abstract class BaseDisc implements OpticalDisc {
  private String title;
  private boolean playingStatus = false;

  public BaseDisc(String title) {
    this.title = title;
  }

  public void startPlaying() {
    this.playingStatus = true;
  }

  public void stopPlaying() {
    this.playingStatus = false;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }


  @Override
  public String toString() {
    return "BaseDisc{" +
        "title='" + title + '\'' +
        ", playingStatus=" + playingStatus +
        '}';
  }
}
