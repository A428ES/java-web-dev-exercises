package exercises.class7;

public class SmartPhone extends Computer {
    private String phoneNumber;

    public SmartPhone(int ram, int space, String number){
        super(ram, space);

        phoneNumber = number;
    }

    public String getNumber(){
        return phoneNumber;
    }

    public void sendText(String content, String destination){
        System.out.println("Sending message [" + content + "] to [" + destination + "]");
    }

    public void receiveText(String content, String sender){
        System.out.println("Received message [" + content + "] from [" + sender + "]");
    }
}
