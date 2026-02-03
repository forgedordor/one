package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ceoc extends cepz {
    public final cepp a;
    public final cepp b;

    public ceoc(cepp ceppVar, cepp ceppVar2) {
        this.a = ceppVar;
        this.b = ceppVar2;
    }

    @Override // defpackage.cepz
    public final cepp a() {
        return this.a;
    }

    @Override // defpackage.cepz
    public final cepp b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cepz) {
            cepz cepzVar = (cepz) obj;
            if (this.a.equals(cepzVar.a()) && this.b.equals(cepzVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        cepp ceppVar = this.b;
        return "RpcCounterName{responseCounterNames=" + this.a.toString() + ", resultCounterNames=" + ceppVar.toString() + "}";
    }
}
