package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class psd extends psg {
    private final psc d;
    private final boolean e;

    public psd(int i, int i2, psc pscVar, boolean z) {
        super(i, i2);
        this.d = pscVar;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof psd) {
            psd psdVar = (psd) obj;
            if (this.b == psdVar.b && this.c == psdVar.c && fdbq.f(this.d, psdVar.d) && this.e == psdVar.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.b * 31) + this.c) * 31) + this.d.hashCode()) * 31) + (true != this.e ? 1237 : 1231);
    }

    @Override // defpackage.psg
    public final String toString() {
        return "psd{width=" + this.b + ", color=" + this.c + ", primaryContainerDragRange=" + this.d + ", isDraggingToFullscreenAllowed=" + this.e + '}';
    }
}
