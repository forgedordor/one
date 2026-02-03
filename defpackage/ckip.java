package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class ckip extends ckja {
    public final String a;
    public final String b;
    private final ewrp c;
    private final String d;
    private final Optional e;
    private final ewlp f;
    private final Optional g;
    private final int h;

    public ckip(ewrp ewrpVar, int i, String str, String str2, String str3, Optional optional, ewlp ewlpVar, Optional optional2) {
        this.c = ewrpVar;
        this.h = i;
        this.a = str;
        this.b = str2;
        this.d = str3;
        this.e = optional;
        this.f = ewlpVar;
        this.g = optional2;
    }

    @Override // defpackage.ckja
    public final ewlp a() {
        return this.f;
    }

    @Override // defpackage.ckja
    public final ewrp b() {
        return this.c;
    }

    @Override // defpackage.ckja
    public final Optional c() {
        return this.g;
    }

    @Override // defpackage.ckja
    public final Optional d() {
        return this.e;
    }

    @Override // defpackage.ckja
    public final String e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ckja) {
            ckja ckjaVar = (ckja) obj;
            if (this.c.equals(ckjaVar.b()) && this.h == ckjaVar.h() && this.a.equals(ckjaVar.g()) && this.b.equals(ckjaVar.f()) && this.d.equals(ckjaVar.e()) && this.e.equals(ckjaVar.d()) && this.f.equals(ckjaVar.a()) && this.g.equals(ckjaVar.c())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.ckja
    public final String f() {
        return this.b;
    }

    @Override // defpackage.ckja
    public final String g() {
        return this.a;
    }

    @Override // defpackage.ckja
    public final int h() {
        return this.h;
    }

    public final int hashCode() {
        return ((((((((((((((this.c.hashCode() ^ 1000003) * 1000003) ^ this.h) * 1000003) ^ this.a.hashCode()) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode();
    }

    public final String toString() {
        Optional optional = this.g;
        ewlp ewlpVar = this.f;
        Optional optional2 = this.e;
        int i = this.h;
        return "ProvisioningHttpRequest{requestState=" + this.c.toString() + ", provisioningEngineWorker=" + ewrm.a(i) + ", requestId=" + this.a + ", provisioningSessionId=" + this.b + ", constructedServerUrl=" + this.d + ", requestPath=" + String.valueOf(optional2) + ", httpRequestEvent=" + String.valueOf(ewlpVar) + ", droidGuardAttestation=" + String.valueOf(optional) + "}";
    }
}
