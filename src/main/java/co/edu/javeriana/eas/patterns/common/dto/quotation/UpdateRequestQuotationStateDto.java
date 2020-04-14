package co.edu.javeriana.eas.patterns.common.dto.quotation;

import co.edu.javeriana.eas.patterns.common.enums.ERequestStatus;

public class UpdateRequestQuotationStateDto {

    private int requestId;
    private ERequestStatus eRequestStatus;

    public int getRequestId() {
        return requestId;
    }

    public void setRequestId(int requestId) {
        this.requestId = requestId;
    }

    public ERequestStatus geteRequestStatus() {
        return eRequestStatus;
    }

    public void seteRequestStatus(ERequestStatus eRequestStatus) {
        this.eRequestStatus = eRequestStatus;
    }

    @Override
    public String toString() {
        return "UpdateRequestQuotationStateDto{" +
                "requestId=" + requestId +
                ", eRequestStatus=" + eRequestStatus +
                '}';
    }
    
}