class ChatUser extends Thread {
boolean isAlive = true;

ChatUser (String name) {
super (name);
}

public void run() {
for (int i = 1; i <= 5; i++) {
System.out.println (getName () + "says : Message" +i);
try { Thread.sleep (500); 
} catch (Exception e ) {}
}
}
}

public class EasyChatDemo {
public static void main (String [] args ) throws Exception{
ChatUser u1 = new ChatUser ("Alice");
ChatUser u2 = new ChatUser ("Bob");

u1.start();
u2.start();

System.out.println("Alice alive? " + u1.isAlive());
System.out.println("Bob alive? " + u2.isAlive());

u1.join();
u2.join();

System.out.println("Alice alive after join ? " + u1.isAlive());
System.out.println("Bob alive after join ? " + u2.isAlive());
System.out.println("Chat ended");
}
}


