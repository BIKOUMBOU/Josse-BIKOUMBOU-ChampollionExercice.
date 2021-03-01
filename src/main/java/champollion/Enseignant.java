package champollion;

public class Enseignant extends Personne {

    // TODO : rajouter les autres méthodes présentes dans le diagramme UML
    public Enseignant(String nom, String email) {
        super(nom, email);
    }

    /**
     * Calcule le nombre total d'heures prévues pour cet enseignant en "heures
     * équivalent TD" Pour le calcul : 1 heure de cours magistral vaut 1,5 h
     * "équivalent TD" 1 heure de TD vaut 1h "équivalent TD" 1 heure de TP vaut
     * 0,75h "équivalent TD"
     *
     * @return le nombre total d'heures "équivalent TD" prévues pour cet
     * enseignant, arrondi à l'entier le plus proche
     *
     */
    public int heuresPrevues() { // TODO: Implémenter cette méthode
        float result = 0f;
        for (UE ue : enseignements.keySet()) {
            result += heuresPrevuesPourUE(ue);
        }
        return Math.round(result);
    }

/**
 * Calcule le nombre total d'heures prévues pour cet enseignant dans l'UE
 * spécifiée en "heures équivalent TD" Pour le calcul : 1 heure de cours
 * magistral vaut 1,5 h "équivalent TD" 1 heure de TD vaut 1h "équivalent TD" 1
 * heure de TP vaut 0,75h "équivalent TD"
 *
 * @param ue l'UE concernée
 * @return le nombre total d'heures "équivalent TD" prévues pour cet enseignant,
 * arrondi à l'entier le plus proche
 *
 */
    public int heuresPrevuesPourUE(UE ue) { // TODO: Implémenter cette méthode
        float result = 0;
             ServicePrevu p = enseignements.get(ue);
	     if (p != null) 
             { 
	     result = p.getVolumehoCM() * 1.5f + p.getVolumehoTD() + p.getVolumehoTP() * 0.75f ;
             }
		return Math.round(result);
    }

    /**
     * Ajoute un enseignement au service prévu pour cet enseignant
     *
     * @param ue l'UE concernée
     * @param volumehoCM le volume d'heures de cours magitral
     * @param volumehoTD le volume d'heures de TD
     * @param volumehoTP le volume d'heures de TP
     */
    public void ajouteEnseignement(UE ue, int volumehoCM, int volumehoTD, int volumehoTP) { // TODO: Implémenter cette méthode
        if (volumehoCM < 0 | volumehoTD < 0 | volumehoTP < 0) 
            {
		throw new IllegalArgumentException("Les sont supérieures ou égales à 0");
	         }
		ServicePrevu sp = enseignements.get(ue);
		if (sp == null) 
                { 

			sp = new ServicePrevu(volumehoCM, volumehoTD, volumehoTP, ue);
			enseignements.put(ue, sp);
		   } else 
                     { 
			sp.setVolumeCM(volumehoCM + sp.getVolumehoCM());
			sp.setVolumeTD(volumehoTD + sp.getVolumehoTD());
			sp.setVolumeTP(volumehoTP + sp.getVolumehoTP());
		          }
    }
}
