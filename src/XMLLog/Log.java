package XMLLog;

import parser.HausCopie;

import java.time.LocalDateTime;
import java.util.List;

public class Log implements Comparable<Log> {
    int id;

    private LocalDateTime datum;

    private List<HausCopie> haeuser;

    private Message message;

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public List<HausCopie> getVisibility() {
        return visibility;
    }

    public void setVisibility(List<Visibility> visibility) {
        this.visibility = visibility;
    }

    public Message getMessage() {
        return message;
    }

    public void setMessage(Message message) {
        this.message = message;
    }

    public HausCopie getSeverity() {
        return severity;
    }

    public void setSeverity(Severity severity) {
        this.severity = severity;
    }

    @Override
    public String toString() {
        return "log.model.Log{" +
                "timestamp=" + timestamp +
                ", Visibility=" + visibility +
                ", message=" + message +
                ", severity=" + severity +
                '}';
    }

    @Override
    public int compareTo(Log o) {
        return this.getSeverity().compareTo(o.getSeverity());
    }
}

