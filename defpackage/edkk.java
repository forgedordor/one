package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class edkk extends edjc {
    private final ekgb a;
    private final ejwi b;
    private final eure c;

    public edkk(ekgb ekgbVar, ejwi ejwiVar, eure eureVar) {
        this.a = ekgbVar;
        this.b = ejwiVar;
        this.c = eureVar;
    }

    @Override // defpackage.edjc
    public final ejwi a() {
        return this.b;
    }

    @Override // defpackage.edjc
    public final ekgb b() {
        return this.a;
    }

    @Override // defpackage.edjc
    public final eure c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof edjc) {
            edjc edjcVar = (edjc) obj;
            if (ekjz.h(this.a, edjcVar.b()) && this.b.equals(edjcVar.a()) && this.c.equals(edjcVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        eure eureVar = this.c;
        ejwi ejwiVar = this.b;
        return "ArtSearchInterests{interests=" + this.a.toString() + ", errorState=" + String.valueOf(ejwiVar) + ", eventLog=" + eureVar.toString() + "}";
    }
}
