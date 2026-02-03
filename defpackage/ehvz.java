package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ehvz extends ehwk {
    private final boolean b;
    private final ehwb c;
    private final fcsu d;

    public ehvz(boolean z, ehwb ehwbVar, fcsu fcsuVar) {
        this.b = z;
        this.c = ehwbVar;
        this.d = fcsuVar;
    }

    @Override // defpackage.ehwk
    public final ehwb a() {
        return this.c;
    }

    @Override // defpackage.ehwk
    public final fcsu b() {
        return this.d;
    }

    @Override // defpackage.ehwk
    public final boolean c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        ehwb ehwbVar;
        fcsu fcsuVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof ehwk) {
            ehwk ehwkVar = (ehwk) obj;
            if (this.b == ehwkVar.c() && ((ehwbVar = this.c) != null ? ehwbVar.equals(ehwkVar.a()) : ehwkVar.a() == null) && ((fcsuVar = this.d) != null ? fcsuVar.equals(ehwkVar.b()) : ehwkVar.b() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        ehwb ehwbVar = this.c;
        int iHashCode = (ehwbVar == null ? 0 : ehwbVar.hashCode()) ^ (((true != this.b ? 1237 : 1231) ^ 1000003) * 1000003);
        fcsu fcsuVar = this.d;
        return (iHashCode * 1000003) ^ (fcsuVar != null ? fcsuVar.hashCode() : 0);
    }

    public final String toString() {
        fcsu fcsuVar = this.d;
        return "SyncletBinding{enabled=" + this.b + ", syncConfig=" + String.valueOf(this.c) + ", syncletProvider=" + String.valueOf(fcsuVar) + "}";
    }
}
