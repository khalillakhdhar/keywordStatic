package keywordStatic;

class Intervention {
    private static double sommeTotale = 0;
    private String intervenant;
    private double somme;

    public Intervention(String intervenant, double somme) {
        this.intervenant = intervenant;
        this.somme = somme;
        sommeTotale += somme;
    }

    public String getIntervenant() {
        return intervenant;
    }

    public static double getSommeTotale() {
        return sommeTotale;
    }

	@Override
	public String toString() {
		return "Intervention [intervenant=" + intervenant + ", somme=" + somme + "]";
	}
    
    
    
}

