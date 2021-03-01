package champollion;

public class ServicePrevu {// TODO : implémenter cette classe
    private int volumehoCM;
	private int volumehoTD;
	private int volumehoTP;
	private final UE ue;

	public ServicePrevu(UE ue,int volumehoCM, int volumehoTD, int volumehoTP) {
		this.volumehoCM = volumehoCM;
		this.volumehoTD = volumehoTD;
		this.volumehoTP = volumehoTP;
		this.ue = ue;
	}

    ServicePrevu(int volumehoCM, int volumehoTD, int volumehoTP, UE ue) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

	public UE getUe() {
		return ue;
	}

	public int getVolumehoeCM() {
		return volumehoCM;
	}

	public void setVolumehoCM(int volumehoCM) {
		this.volumehoCM = volumehoCM;
	}

	public int getVolumehoTD() {
		return volumehoTD;
	}

	public void setVolumehoTD(int volumehoTD) {
		this.volumehoTD = volumehoTD;
	}

	public int getVolumehoTP() {
		return volumehoTP;
	}

	public void setVolumehoTP(int volumehoTP) {
		this.volumehoTP = volumehoTP;
	}
	
	public int getVolumehoPour(TypeIntervention type) {
		int result = 0;
		switch (type) {
			case CM: result = (int)getVolumehoCM(); break;
			case TD: result = getVolumehoTD(); break;
			case TP: result = getVolumehoTP(); break;
		}
		return result;
	}

    float getVolumehoCM() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setVolumeCM(float f) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setVolumeTD(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setVolumeTP(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
