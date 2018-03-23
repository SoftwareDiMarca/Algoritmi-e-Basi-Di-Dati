/**
* Classe test per costruire una parte dell'albero genealogico dei Medici
*/

public class DinastyTreeTest {
	
	public static void main(String[] args) {
	
		DinastyTree cosimoIlVecchio = new DinastyTree("Cosimo il Vecchio", 75);
		DinastyTree pieroIlGottoso = new DinastyTree("Piero il Gottoso", 53);
		DinastyTree giovanni = new DinastyTree("Giovanni", 42);
		DinastyTree carlo = new DinastyTree("Carlo", 62);	

		DinastyTree giuliano = new DinastyTree("Giuliano", 25);
		DinastyTree lorenzoIlMagnifico = new DinastyTree("Lorenzo il Magnifico", 43);
		DinastyTree maria = new DinastyTree("Maria", 66);
		DinastyTree bianca = new DinastyTree("Bianca", 66);
		DinastyTree nannina = new DinastyTree("Nannina", 46);
		
		DinastyTree giulio = new DinastyTree("Giulio", 56);
		giuliano.aggiungiFiglio(giulio);
		
		DinastyTree lucrezia = new DinastyTree("Lucrezia", 34);
		DinastyTree piero = new DinastyTree("Piero", 31);
		DinastyTree maddalena = new DinastyTree("Maddalena", 46);
		DinastyTree giovanniII = new DinastyTree("Giovanni II", 46);
		DinastyTree luisa = new DinastyTree("Luisa", 46);
		DinastyTree contessina = new DinastyTree("Contessina", 37);
		DinastyTree giulianoII = new DinastyTree("Giuliano II", 36);
		
		DinastyTree[] lorenzoIlMagnificoFigli = {lucrezia, piero, maddalena, giovanniII, luisa, contessina};
		lorenzoIlMagnifico.aggiungiFigli(lorenzoIlMagnificoFigli);		
		
		DinastyTree[] cosimoIlVecchioFigli = {pieroIlGottoso, giovanni, carlo};
		cosimoIlVecchio.aggiungiFigli(cosimoIlVecchioFigli);		
		
		DinastyTree[] pieroIlGottosoFigli = {giuliano, lorenzoIlMagnifico, maria, bianca, nannina};
		pieroIlGottoso.aggiungiFigli(pieroIlGottosoFigli);
		
		DinastyTreeVisits visit = new DinastyTreeVisits();
		visit.visit(cosimoIlVecchio, 0);
		
		System.out.println(visit.minoreDiAnni(cosimoIlVecchio, 30).getNome());
	
		System.out.println(visit.cercaDiscendentePerNome2(cosimoIlVecchio, "Carlo").getNome());
		
	}

}
