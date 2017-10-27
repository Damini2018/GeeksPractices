public class DateTimeStamp{

	public static void main(String[] args) {
		
	
	String stamp="10.20.45.200 Jan 06 2010";
	String arr[]=stamp.split(" ");
	for(String a:arr){
		System.out.println(a+"  ");
	}
	arr[0]=arr[0].replace(".","/");
	System.out.println("the arr is "+arr[0]);
	String timeArr[]= arr[0].split("/");
	String time="";
	for(int i=0;i<2;i++){
		time+=timeArr[i]+"/";
	}
	time+=timeArr[3];


	System.out.println(time);
  String date=arr[2]+"/";
	String month=arr[1];
	switch(month){
		case "Jan" : date+="01/";
		break;
		case "Feb" : date+="02/";
		break;
		case "Mar" : date+="03/";
		break;

		case "Apr" : date+="04/";
		break;
		case "May" : date+="05/";
		break;
		case "Jun" : date+="06/";
		break;
		case "July" : date+="07/";
		break;
		case "Aug" : date+="08/";
		break;
		case "Sep" : date+="09/";
		break;
		case "Oct" : date+="10/";
		break;
		case "Nov" : date+="11/";
		break;

		case "Dec" : date+="12/";
		break;
	default: date+="error";
		
	}
	date+=arr[3];

	System.out.println("the date is "+date);
	System.out.println("the time stamp is "+date+" "+time);
}
}