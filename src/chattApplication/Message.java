package chattApplication;

public class Message {
	
private String contenu;

private String Destinataire;
private String Expediteur;
private int msgId;

public int getMsgId() {
    return msgId;
}
public void setNom(int msgId) {
    this.msgId = msgId;
}

public String getContenu() {
	    return contenu;
	}
public void setNom(String contenu) {
	    this.contenu = contenu;
	}
public void Expediteur(String Destinataire) {
    this.Destinataire = Destinataire;
}
public String getDestinataire() {
    return Destinataire;
}
public void setExpediteur(String Expediteur) {
    this.Expediteur = Expediteur;
}
public String getExpediteur() {
    return Expediteur;
}
}
