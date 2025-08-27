public class Parcel {
    
    private String from;
    private String to;
    private String itemType;
    private String itemStatus;
    private long contact;
    public Parcel(){

    }
    public Parcel(String from, String to, String itemType, String itemStatus, long contact) {
        this.from = from;
        this.to = to;
        this.itemType = itemType;
        this.itemStatus = itemStatus;
        this.contact = contact;
    }
    //setters
    public void setFrom(String from){
        this.from = from;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    public void setItemStatus(String itemStatus) {
        this.itemStatus = itemStatus;
    }

    public void setContact(long contact) {
        this.contact = contact;
    }
    //getters
    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public String getItemType() {
        return itemType;
    }

    public String getItemStatus() {
        return itemStatus;
    }

    public long getContact() {
        return contact;
    }
   
    //totalreading
     @Override
    public String toString() {
        return "Parcel [from=" + from + ", to=" + to + ", itemType=" + itemType + ", itemStatus=" + itemStatus
                + ", contact=" + contact + "]";
    }
    
}

class Execution{
    public static void main(String[] args) {
        Parcel parcel = new Parcel("Alice", "Bob", "Books", "Shipped", 1234567890L);
        Parcel parcel2 = new Parcel();
        parcel2.setFrom("Charlie");
        parcel2.setTo("David");
        parcel2.setItemType("Electronics");
        parcel2.setItemStatus("Delivered");
        parcel2.setContact(9876543210L);
        parcel.getItemStatus();
       

    }
}