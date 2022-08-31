package app.demo.payload;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import java.io.Serializable;

@Document(indexName = "messages")
public class Message implements Serializable {
    @Id
    private String id;
    private Boolean disallowed;
    private String malware;
    private String superUser;
    private String sensitiveData;
    private Integer max_score_allowed;
    private Integer max_score_found;
    private Integer critical_vulns;
    private Integer high_vulns;
    private Integer medium_vulns;
    private Integer low_vulns;

    public Message() {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Boolean getDisallowed() {
        return disallowed;
    }

    public void setDisallowed(Boolean disallowed) {
        this.disallowed = disallowed;
    }

    public String getMalware() {
        return malware;
    }

    public void setMalware(String malware) {
        this.malware = malware;
    }

    public String getSuperUser() {
        return superUser;
    }

    public void setSuperUser(String superUser) {
        this.superUser = superUser;
    }

    public String getSensitiveData() {
        return sensitiveData;
    }

    public void setSensitiveData(String sensitiveData) {
        this.sensitiveData = sensitiveData;
    }

    public Integer getMax_score_allowed() {
        return max_score_allowed;
    }

    public void setMax_score_allowed(Integer max_score_allowed) {
        this.max_score_allowed = max_score_allowed;
    }

    public Integer getCritical_vulns() {
        return critical_vulns;
    }

    public void setCritical_vulns(Integer critical_vulns) {
        this.critical_vulns = critical_vulns;
    }

    public Integer getHigh_vulns() {
        return high_vulns;
    }

    public void setHigh_vulns(Integer high_vulns) {
        this.high_vulns = high_vulns;
    }

    public Integer getMedium_vulns() {
        return medium_vulns;
    }

    public void setMedium_vulns(Integer medium_vulns) {
        this.medium_vulns = medium_vulns;
    }

    public Integer getLow_vulns() {
        return low_vulns;
    }

    public void setLow_vulns(Integer low_vulns) {
        this.low_vulns = low_vulns;
    }

    public Integer getMax_score_found() {
        return max_score_found;
    }

    public void setMax_score_found(Integer max_score_found) {
        this.max_score_found = max_score_found;
    }
}
