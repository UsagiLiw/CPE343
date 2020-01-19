package Lecture1;

/**
 *  Class as a template of Lecture1.EmailMessage called by Lecture1.EmailTester
 *
 *  Created by Nonthakorn Sukprom (Mill) 60070503435,
 *  16 January 2020
 *
 */
public class EmailMessage
{
    IOUtils ioUtils = new IOUtils();

    String toAddress;
    String fromAddress;
    String messageSubject;
    String body = "";
    String createDateTime = ioUtils.getDateTime();

    /**
     * constructor method, set 'to' to String 'toAddress'
     * @param to    String passed from Lecture1.EmailTester class store "to address"
     */
    public void setToAddress(String to)
    {
        toAddress = to;
    }

    /**
     * constructor method, set 'from' to String 'fromAddress'
     * @param from    String passed from Lecture1.EmailTester class store "from address"
     */
    public void setFromAddress(String from)
    {
       fromAddress = from;
    }

    /**
     * constructor method, set 'subject' to String 'messageSubject'
     * @param subject    String passed from Lecture1.EmailTester class store "from address"
     */
    public void setSubject(String subject)
    {
        messageSubject = subject;
    }

    /**
     * constructor method, add 'line' into String 'body'
     * @param line      String passed from Lecture1.EmailTester class store "line of message"
     */
    public void addToBody(String line)
    {
        if (line != null)
        {
            body = body + line;
            body = body + "\n";
        }
    }

    /**
     * method to print report of email message details including
     *      message create date time
     *      message sent date time
     *      to address
     *      from address
     *      message subject
     *      message body
     */
    public void send()
    {
        String sentDateTime = ioUtils.getDateTime();
        System.out.println("-----------------------------------------------------------------");
        System.out.println("[Message created at " + createDateTime + "]");
        System.out.println("-----------------------------------------------------------------");
        System.out.println("TO:\t"+ toAddress);
        System.out.println("FROM:\t" + fromAddress);
        System.out.println("SUBJECT:\t" + messageSubject);
        System.out.println(body);
        System.out.println("-----------------------------------------------------------------");
        System.out.println("[Message sent at " + sentDateTime + "]");
        System.out.println("-----------------------------------------------------------------");
        System.out.println("\n\n");
    }

    /**
     * getter method, return 'to address'
     * @return toAddress of the Lecture1.EmailMessage object
     */
    public String getToAddress()
    {
        return toAddress;
    }

    /**
     * getter method, return 'from address'
     * @return fromAddress of the Lecture1.EmailMessage object
     */
    public String getFromAddress()
    {
        return  fromAddress;
    }

    /**
     * getter method, return 'subject'
     * @return messageSubject of the Lecture1.EmailMessage object
     */
    public String getSubject()
    {
        return messageSubject;
    }

    /**
     * getter method, return 'body'
     * @return body of the Lecture1.EmailMessage object
     */
    public String getBody()
    {
        return body;
    }
}

