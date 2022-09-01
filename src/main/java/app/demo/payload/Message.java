package app.demo.payload;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
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
}
