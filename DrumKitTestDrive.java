public class DrumKitTestDrive {
  public static void main (String[] args) {
    DrumKit d = new DrumKit();
    if (d.snare) {
      d.playSnare();
    }
    if (d.topHat) {
      d.playTopHat();
    }
  }
}