import java.util.Date;

public class ScheduleValidation {
	
	Date[] currentSchedule;
	Date newScheduleDate;
	
	public ScheduleValidation(Date[] currentSchedule, Date newScheduleDate ){
		this.currentSchedule = currentSchedule;
		this.newScheduleDate = newScheduleDate;
	}
	
	public ScheduleValidation(Date[] currentSchedule){
		this.currentSchedule = currentSchedule;
	}
	
	public Date[] getCurrentSchedule(){
		return currentSchedule;
	}
	
	public Date getNewScheduleDate(){
		return newScheduleDate;
	}
	
	public void setNewScheduleDate(Date newScheduleDate) {
		this.newScheduleDate = newScheduleDate;
	}
		
	public boolean overlapExists(){
		return false;
	}
	
	public static void main(String[] args){
		
		System.out.println("*** ScheduleValidation Unit Test ***");
		
		Date[] dateTimeList = new Date[5];
		
		for(int i = 0; i <5; i++){
			dateTimeList[i] = new Date().
		}
		
	
	}

}
