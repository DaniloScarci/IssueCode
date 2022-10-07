import java.time.LocalDateTime;
import java.util.Objects;

class DataSlotEntity {
    private Integer date;
    private String simpleDate;

    DataSlotEntity(Integer date){
        this(date,null);
    }

    DataSlotEntity(Integer date,String simpleDate){
        this.date = date;
        this.simpleDate = simpleDate;
    }

    DataSlotEntity(String simpleDate){
        this(null,simpleDate);
    }

    DataSlotEntity(){
        this(null,null);
    }

    public Integer getDate() {
        return date;
    }

    public String getSimpleDate() {
        return simpleDate;
    }

    public void setDate(Integer date) {
        this.date = date;
    }

    public void setSimpleDate(String simpleDate) {
        this.simpleDate = simpleDate;
    }
}

class NotificaDao {
    public static void addNotifica(Integer nPratica){
        addNotifica(nPratica,null);
    }

    public static void addNotifica(Integer nPratica, String text){
        System.out.println("Numero Pratica: " + nPratica + " testo inserito: " + text);
    }
}

public class Fix {
    public static void main(String[] args){
        DataSlotEntity data = new DataSlotEntity(10);
        int nPratica = 1234;

        if(!Objects.isNull(data.getSimpleDate())){
            System.out.println("CHIAMAMI SUBITO");

            LocalDateTime now = LocalDateTime.now();
            NotificaDao.addNotifica(nPratica);

        } else if(!Objects.isNull(data.getDate())){

            System.out.println("Prenotazione effettuata non CHIAMAMI SUBITO");

            LocalDateTime now = LocalDateTime.now();
            String textMessage = "Appuntamento " + now.toString();
            NotificaDao.addNotifica(nPratica,textMessage);
        }
    }
}
