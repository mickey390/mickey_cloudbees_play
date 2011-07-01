package models;

import java.util.Calendar;
import java.util.Date;
import javax.persistence.Entity;
import play.db.jpa.Model;

@Entity
public class MsgData extends Model {
        private static final long serialVersionUID = 1L;
        public String message;
        public String name;
        public Date time = Calendar.getInstance().getTime();
        
        public MsgData(String message,String name){
                this.name = name;
                this.message = message;
        }
}