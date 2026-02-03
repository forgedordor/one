package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class ckin extends ckiu {
    public final ewrp a;
    public final String b;
    public final String c;
    public final ewlc d;
    public final int e;

    public ckin(ewrp ewrpVar, int i, String str, String str2, ewlc ewlcVar) {
        this.a = ewrpVar;
        this.e = i;
        this.b = str;
        this.c = str2;
        this.d = ewlcVar;
    }

    @Override // defpackage.ckiu
    public final ewlc a() {
        return this.d;
    }

    @Override // defpackage.ckiu
    public final ewrp b() {
        return this.a;
    }

    @Override // defpackage.ckiu
    public final String c() {
        return this.c;
    }

    @Override // defpackage.ckiu
    public final String d() {
        return this.b;
    }

    @Override // defpackage.ckiu
    public final int e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ckiu) {
            ckiu ckiuVar = (ckiu) obj;
            if (this.a.equals(ckiuVar.b()) && this.e == ckiuVar.e() && this.b.equals(ckiuVar.d()) && this.c.equals(ckiuVar.c()) && this.d.equals(ckiuVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.e) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        ewlc ewlcVar = this.d;
        int i = this.e;
        return "ProvisioningHttpFailure{requestState=" + this.a.toString() + ", provisioningEngineWorker=" + ewrm.a(i) + ", requestId=" + this.b + ", provisioningSessionId=" + this.c + ", httpFailureEvent=" + String.valueOf(ewlcVar) + "}";
    }
}
