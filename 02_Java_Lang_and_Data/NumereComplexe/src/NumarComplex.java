public class NumarComplex {
    private float re;
    private float im;

    public float getRe() {
        return re;
    }

    public void setRe(float re) {
        this.re = re;
    }

    public float getIm() {
        return im;
    }

    public void setIm(float im) {
        this.im = im;
    }

    @Override
    public String toString() {
        if (getIm() > 0) {
            return getRe() + " + " + getIm() + "i";
        } else if (getIm() < 0) {
            return getRe() + " - " + getIm() + "i";
        } else {
            return String.valueOf(getRe());
        }
    }
}
