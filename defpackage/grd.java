package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class grd implements dnk {
    public final long a;
    private final boolean b;
    private final float c;
    private final ijh d = null;

    public grd(boolean z, float f, long j) {
        this.b = z;
        this.c = f;
        this.a = j;
    }

    @Override // defpackage.dnk
    public final jbf a(ebk ebkVar) {
        return new gix(ebkVar, this.b, this.c, new grc(this));
    }

    @Override // defpackage.dne
    public final /* synthetic */ dol b(hml hmlVar) {
        return dnd.a(hmlVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof grd)) {
            return false;
        }
        grd grdVar = (grd) obj;
        if (this.b != grdVar.b || !kir.b(this.c, grdVar.c)) {
            return false;
        }
        ijh ijhVar = grdVar.d;
        if (!fdbq.f(null, null)) {
            return false;
        }
        long j = this.a;
        long j2 = grdVar.a;
        long j3 = ije.a;
        return fcts.a(j, j2);
    }

    @Override // defpackage.dnk
    public final int hashCode() {
        int iFloatToIntBits = ((true != this.b ? 1237 : 1231) * 31) + Float.floatToIntBits(this.c);
        long j = this.a;
        long j2 = ije.a;
        return (iFloatToIntBits * 961) + fctr.a(j);
    }
}
