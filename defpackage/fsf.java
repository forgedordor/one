package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fsf implements dnk {
    public final long a;
    private final boolean b;
    private final float c;
    private final ijh d = null;

    public fsf(boolean z, float f, long j) {
        this.b = z;
        this.c = f;
        this.a = j;
    }

    @Override // defpackage.dnk
    public final jbf a(ebk ebkVar) {
        return new fpd(ebkVar, this.b, this.c, new fse(this));
    }

    @Override // defpackage.dne
    public final /* synthetic */ dol b(hml hmlVar) {
        return dnd.a(hmlVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fsf)) {
            return false;
        }
        fsf fsfVar = (fsf) obj;
        if (this.b != fsfVar.b || !kir.b(this.c, fsfVar.c)) {
            return false;
        }
        ijh ijhVar = fsfVar.d;
        if (!fdbq.f(null, null)) {
            return false;
        }
        long j = this.a;
        long j2 = fsfVar.a;
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
