/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientes.Models;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 *
 * @author Jonathan
 */
public class Cliente {
    private int ID;
    private String NAME;
    private String LASTNAME;
    private String EMAIL;
    private String LOGIN;    
    private String PASSWORD;
    private String GENDER;
    private LocalDate DOB;
    private LocalDateTime DATEREGISTER;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNAME() {
        return NAME;
    }

    public void setNAME(String NAME) {
        this.NAME = NAME;
    }

    public String getLASTNAME() {
        return LASTNAME;
    }

    public void setLASTNAME(String LASTNAME) {
        this.LASTNAME = LASTNAME;
    }

    public String getEMAIL() {
        return EMAIL;
    }

    public void setEMAIL(String EMAIL) {
        this.EMAIL = EMAIL;
    }

    public String getLOGIN() {
        return LOGIN;
    }

    public void setLOGIN(String LOGIN) {
        this.LOGIN = LOGIN;
    }

    public String getPASSWORD() {
        return PASSWORD;
    }

    public void setPASSWORD(String PASSWORD) {
        this.PASSWORD = PASSWORD;
    }

    public String getGENDER() {
        return GENDER;
    }

    public void setGENDER(String GENDER) {
        this.GENDER = GENDER;
    }

    public LocalDate getDOB() {
        return DOB;
    }

    public void setDOB(LocalDate DOB) {
        this.DOB = DOB;
    }

    public LocalDateTime getDATEREGISTER() {
        return DATEREGISTER;
    }

    public void setDATEREGISTER(LocalDateTime DATEREGISTER) {
        this.DATEREGISTER = DATEREGISTER;
    }
}
