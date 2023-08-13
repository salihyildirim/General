package ExceptionOrnek.HesapCheck;

import ExceptionOrnek.Exceptions.BakiyeYetersizException;

public class Hesap {
    private Double bakiye = 0.0; // static yaparak dene.

    public void bakiyeEkle(double bakiye) {
        this.bakiye += bakiye;
    }

    public void bakiyeCikar(double bakiye) throws BakiyeYetersizException {

        if (this.bakiye < bakiye) {
            throw new BakiyeYetersizException("Bakiye Yetersiz");
        }
        this.bakiye -= bakiye;
    }

    public Double getBakiye() {
        return bakiye;
    }

    public void setBakiye(Double bakiye) {
        this.bakiye = bakiye;
    }
}
