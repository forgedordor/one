package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class edkm extends edji {
    private final ekgb a;
    private final ekgb b;
    private final ejwi c;
    private final eure d;

    public edkm(ekgb ekgbVar, ekgb ekgbVar2, ejwi ejwiVar, eure eureVar) {
        this.a = ekgbVar;
        this.b = ekgbVar2;
        this.c = ejwiVar;
        this.d = eureVar;
    }

    @Override // defpackage.edji
    public final ejwi a() {
        return this.c;
    }

    @Override // defpackage.edji
    public final ekgb b() {
        return this.b;
    }

    @Override // defpackage.edji
    public final ekgb c() {
        return this.a;
    }

    @Override // defpackage.edji
    public final eure d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof edji) {
            edji edjiVar = (edji) obj;
            if (ekjz.h(this.a, edjiVar.c()) && ekjz.h(this.b, edjiVar.b()) && this.c.equals(edjiVar.a()) && this.d.equals(edjiVar.d())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        eure eureVar = this.d;
        ejwi ejwiVar = this.c;
        ekgb ekgbVar = this.b;
        return "ArtSearchResults{images=" + this.a.toString() + ", collections=" + ekgbVar.toString() + ", errorState=" + String.valueOf(ejwiVar) + ", eventLog=" + eureVar.toString() + "}";
    }
}
