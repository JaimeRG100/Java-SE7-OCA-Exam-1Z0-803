class FinalArguments {
  
  public Record getRecord(int fileNumber, final int recNumber) {
    Record r = new Record(3, 5);
    return r;
    
  }

  
}


//thi code is mine, to create a Record type class
class Record {
  private int fileNumber;
  private int recNumber;
  
  
  Record(int fileNumber, int recNumber){
    this.fileNumber = fileNumber;
    this.recNumber = recNumber;
  }
  
}