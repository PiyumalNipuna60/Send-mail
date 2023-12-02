import mail.Mail;

public class Main {
    public static void main(String[] args) {
        System.out.println("Start");
        String subject = "doc injection";



        //String body = bodyField.getText();  //set body

        Mail mail = new Mail(); //creating an instance of Mail class
        mail.setMsg("Hi");//email message
        mail.setTo("piyumalkavindya.228@gmail.com"); //receiver's mail
        mail.setSubject(subject); //email subject

        Thread thread = new Thread(mail);
        thread.start();

        System.out.println("end");
    }
}