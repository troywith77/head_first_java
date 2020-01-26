class HeapQuiz {
  int id = 0;
  public static void main(String [] args) {
    int x = 0;
    HeapQuiz [ ] hq = new HeapQuiz[5];
    while ( x < 3 ) {
      hq[x] = new HeapQuiz();
      hq[x].id = x;
      x = x + 1;
    }
    hq[3] = hq[1];
    hq[4] = hq[1];
    hq[3] = null;
    hq[4] = hq[0];
    hq[0] = hq[3];
    hq[3] = hq[2];
    hq[2] = hq[0];
    // do stuff
    for (int i = 0; i < 5; i++) {
      if (hq[i] != null) {
        System.out.println(i + " - " + hq[i].id);
      }
    }
  }
}
// 0 -> null
// 1 -> 1
// 2 -> null
// 3 -> 2
// 4 -> 0