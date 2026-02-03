package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class ckir extends ckjd {
    public final ewrp a;
    public final String b;
    public final String c;
    public final ewlr d;
    public final int e;

    public ckir(ewrp ewrpVar, int i, String str, String str2, ewlr ewlrVar) {
        this.a = ewrpVar;
        this.e = i;
        this.b = str;
        this.c = str2;
        this.d = ewlrVar;
    }

    @Override // defpackage.ckjd
    public final ewlr a() {
        return this.d;
    }

    @Override // defpackage.ckjd
    public final ewrp b() {
        return this.a;
    }

    @Override // defpackage.ckjd
    public final String c() {
        return this.c;
    }

    @Override // defpackage.ckjd
    public final String d() {
        return this.b;
    }

    @Override // defpackage.ckjd
    public final int e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ckjd) {
            ckjd ckjdVar = (ckjd) obj;
            if (this.a.equals(ckjdVar.b()) && this.e == ckjdVar.e() && this.b.equals(ckjdVar.d()) && this.c.equals(ckjdVar.c()) && this.d.equals(ckjdVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.e) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        ewlr ewlrVar = this.d;
        int i = this.e;
        return "ProvisioningHttpResponse{requestState=" + this.a.toString() + ", provisioningEngineWorker=" + ewrm.a(i) + ", requestId=" + this.b + ", provisioningSessionId=" + this.c + ", httpResponseEvent=" + String.valueOf(ewlrVar) + "}";
    }
}
