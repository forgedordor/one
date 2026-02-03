package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dsfk extends dsgn {
    public final ekhx a;
    public final ekhx b;
    public final ekhx c;
    public final ekhx d;

    public dsfk(ekhx ekhxVar, ekhx ekhxVar2, ekhx ekhxVar3, ekhx ekhxVar4) {
        this.a = ekhxVar;
        this.b = ekhxVar2;
        this.c = ekhxVar3;
        this.d = ekhxVar4;
    }

    @Override // defpackage.dsgn
    public final ekhx a() {
        return this.c;
    }

    @Override // defpackage.dsgn
    public final ekhx b() {
        return this.a;
    }

    @Override // defpackage.dsgn
    public final ekhx c() {
        return this.d;
    }

    @Override // defpackage.dsgn
    public final ekhx d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dsgn) {
            dsgn dsgnVar = (dsgn) obj;
            if (this.a.equals(dsgnVar.b()) && this.b.equals(dsgnVar.d()) && this.c.equals(dsgnVar.a()) && this.d.equals(dsgnVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        ekhx ekhxVar = this.d;
        ekhx ekhxVar2 = this.c;
        ekhx ekhxVar3 = this.b;
        return "TargetingData{clearcutEvents=" + String.valueOf(this.a) + ", veEvents=" + String.valueOf(ekhxVar3) + ", appStateIds=" + String.valueOf(ekhxVar2) + ", requestedPermissions=" + String.valueOf(ekhxVar) + "}";
    }
}
