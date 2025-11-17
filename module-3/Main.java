class Cellphone {

    // Method: ringing
    public void ring() {
        System.out.println("Ringing...");
    }

    // Method: vibrating
    public void vibrate() {
        System.out.println("Vibrating...");
    }

    // Method: call friend
    public void callFriend() {
        System.out.println("Calling your friend...");
    }

    // Method: send message
    public void sendMessage() {
        System.out.println("Sending message...");
    }
}

public class Main {
    public static void main(String[] args) {
        Cellphone phone = new Cellphone();

        phone.ring();
        phone.vibrate();
        phone.callFriend();
        phone.sendMessage();
    }
}
