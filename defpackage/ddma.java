package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddma extends ddmf {
    public final ddmc a;
    public final ddme b;
    public final long c;
    private final ddmi d;
    private final ddmd e;

    public ddma(ddmc ddmcVar, ddmi ddmiVar, ddme ddmeVar, ddmd ddmdVar, long j) {
        this.a = ddmcVar;
        this.d = ddmiVar;
        this.b = ddmeVar;
        this.e = ddmdVar;
        this.c = j;
    }

    @Override // defpackage.ddmf
    public final long a() {
        return this.c;
    }

    @Override // defpackage.ddmf
    public final ddmc b() {
        return this.a;
    }

    @Override // defpackage.ddmf
    public final ddmd c() {
        return this.e;
    }

    @Override // defpackage.ddmf
    public final ddme d() {
        return this.b;
    }

    @Override // defpackage.ddmf
    public final ddmi e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ddmf) {
            ddmf ddmfVar = (ddmf) obj;
            if (this.a.equals(ddmfVar.b()) && this.d.equals(ddmfVar.e()) && this.b.equals(ddmfVar.d()) && this.e.equals(ddmfVar.c()) && this.c == ddmfVar.a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.e.hashCode();
        long j = this.c;
        return (iHashCode * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        ddmd ddmdVar = this.e;
        ddme ddmeVar = this.b;
        ddmi ddmiVar = this.d;
        return "Signals{buildInfo=" + this.a.toString() + ", systemProperties=" + ddmiVar.toString() + ", identifiers=" + ddmeVar.toString() + ", callerInfo=" + ddmdVar.toString() + ", signalCollectionTimeMillis=" + this.c + "}";
    }
}
