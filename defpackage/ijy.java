package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ijy extends ijz {
    public final ihw a;
    public final ikd b;

    public ijy(ihw ihwVar) {
        this.a = ihwVar;
        iik iikVar = null;
        if (!ihx.c(ihwVar)) {
            iik iikVar2 = new iik((byte[]) null);
            iikVar2.t(ihwVar);
            iikVar = iikVar2;
        }
        this.b = iikVar;
    }

    @Override // defpackage.ijz
    public final ihu a() {
        ihw ihwVar = this.a;
        return new ihu(ihwVar.a, ihwVar.b, ihwVar.c, ihwVar.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ijy) && fdbq.f(this.a, ((ijy) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
