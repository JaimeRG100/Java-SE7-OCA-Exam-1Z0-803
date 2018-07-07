public class SynchronizedMethod {
  public synchronized Record retrieveUser(int id) {
    Record r = new Record(id);
    return r;
  }
}


class Record {
  private int id;

  Record(int id){
    this.id = id;

  }  
}