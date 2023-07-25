package com.example.restaurantefinal.dto;

public class ReclamationResponseDTO extends ReclamationDTO{

    private String campus;
    private String state;
    private String reason;



    public String getCampus() {
        return campus;
    }

    public void setCampus(String campus) {
        this.campus = campus;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }
}
