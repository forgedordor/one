package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cnql extends cnrv {
    private final cmnv a;
    private final cmoa b;

    public cnql(cmnv cmnvVar, cmoa cmoaVar) {
        if (cmnvVar == null) {
            throw new NullPointerException("Null localMessage");
        }
        this.a = cmnvVar;
        if (cmoaVar == null) {
            throw new NullPointerException("Null remoteMessage");
        }
        this.b = cmoaVar;
    }

    @Override // defpackage.cnrv
    public final cmnv a() {
        return this.a;
    }

    @Override // defpackage.cnrv
    public final cmoa b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cnrv) {
            cnrv cnrvVar = (cnrv) obj;
            if (this.a.equals(cnrvVar.a()) && this.b.equals(cnrvVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        cmoa cmoaVar = this.b;
        return "LocalAndRemoteMessagesToMerge{localMessage=" + this.a.toString() + ", remoteMessage=" + cmoaVar.toString() + "}";
    }
}
