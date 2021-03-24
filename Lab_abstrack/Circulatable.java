import java.util.Date;

interface Circulatable {
     String getHolderName();
     Date getDueDate();
     boolean isOverdue();
     int getOverduePrice();
}
