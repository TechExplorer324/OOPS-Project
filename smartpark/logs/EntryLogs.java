import java.time.*;

class EntryLogs{
  LocalDate localDate = LocalDate.now();
  LocalTime localTime = LocalTime.now();
  boolean success;

EntryLogs(localDate,localTime,success){
  this.localDate=localDate;
  this.localTime=localTime;
  this.success=success;  
}
}
