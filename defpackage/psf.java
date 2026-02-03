package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class psf extends psg {
    public psf(int i, int i2) {
        super(i, i2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof psf) {
            psf psfVar = (psf) obj;
            if (this.b == psfVar.b && this.c == psfVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.b * 31) + this.c;
    }
}
