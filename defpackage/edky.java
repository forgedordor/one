package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class edky extends edla {
    private final ekgb a;
    private final eure b;
    private final ejwi c;

    public edky(ekgb ekgbVar, eure eureVar, ejwi ejwiVar) {
        if (ekgbVar == null) {
            throw new NullPointerException("Null photos");
        }
        this.a = ekgbVar;
        if (eureVar == null) {
            throw new NullPointerException("Null eventLog");
        }
        this.b = eureVar;
        this.c = ejwiVar;
    }

    @Override // defpackage.edla
    public final ejwi a() {
        return this.c;
    }

    @Override // defpackage.edla
    public final ekgb b() {
        return this.a;
    }

    @Override // defpackage.edla
    public final eure c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof edla) {
            edla edlaVar = (edla) obj;
            if (ekjz.h(this.a, edlaVar.b()) && this.b.equals(edlaVar.c()) && this.c.equals(edlaVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        ejwi ejwiVar = this.c;
        eure eureVar = this.b;
        return "DevicePhotoResource{photos=" + this.a.toString() + ", eventLog=" + eureVar.toString() + ", errorState=" + ejwiVar.toString() + "}";
    }
}
