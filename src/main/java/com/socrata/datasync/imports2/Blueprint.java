package com.socrata.datasync.imports2;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.map.annotate.JsonSerialize;

@JsonIgnoreProperties(ignoreUnknown=true)
@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
public class Blueprint {
    private String fileId;
    private Summary summary;
    private Error error;
    private String[] warnings;

    @JsonProperty("fileId")
    public void setFileId(String fileId) {
        this.fileId = fileId;
    }

    @JsonProperty("fileId")
    public String getFileId() {
        return this.fileId;
    }

    @JsonProperty("summary")
    public void setSummary(Summary summary) {
        this.summary = summary;
    }

    @JsonProperty("summary")
    public Summary getSummary() {
        return this.summary;
    }

    @JsonProperty("error")
    public void setError(Error error) {
        this.error = error;
    }

    @JsonProperty("error")
    public Error getError() {
        return this.error;
    }
}