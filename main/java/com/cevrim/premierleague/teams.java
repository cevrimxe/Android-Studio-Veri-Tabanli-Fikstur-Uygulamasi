package com.cevrim.premierleague;

public class teams {


    String m_TeamName;
    int m_TeamLogo;



    public teams(String m_TeamName, int m_TeamLogo) {
        this.m_TeamName = m_TeamName;
        this.m_TeamLogo = m_TeamLogo;
    }

    public String getM_TeamName() {
        return m_TeamName;
    }

    public void setM_TeamName(String m_TeamName) {
        this.m_TeamName = m_TeamName;
    }

    public int getM_TeamLogo() {
        return m_TeamLogo;
    }

    public void setM_TeamLogo(int m_TeamLogo) {
        this.m_TeamLogo = m_TeamLogo;
    }
}
