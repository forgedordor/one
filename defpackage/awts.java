package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class awts extends awxn {
    private final ekhx a;
    private final Optional b;
    private final awxl c;
    private final Optional d;
    private final axcm e;
    private final Optional f;
    private final String g;
    private final Optional h;
    private final boolean i;

    public awts(ekhx ekhxVar, Optional optional, awxl awxlVar, Optional optional2, axcm axcmVar, Optional optional3, String str, Optional optional4, boolean z) {
        this.a = ekhxVar;
        this.b = optional;
        this.c = awxlVar;
        this.d = optional2;
        this.e = axcmVar;
        this.f = optional3;
        this.g = str;
        this.h = optional4;
        this.i = z;
    }

    @Override // defpackage.awxn
    public final awxl a() {
        return this.c;
    }

    @Override // defpackage.awxn
    public final axcm b() {
        return this.e;
    }

    @Override // defpackage.awxn
    public final ekhx c() {
        return this.a;
    }

    @Override // defpackage.awxn
    public final Optional d() {
        return this.b;
    }

    @Override // defpackage.awxn
    public final Optional e() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof awxn) {
            awxn awxnVar = (awxn) obj;
            if (this.a.equals(awxnVar.c()) && this.b.equals(awxnVar.d()) && this.c.equals(awxnVar.a()) && this.d.equals(awxnVar.f()) && this.e.equals(awxnVar.b()) && this.f.equals(awxnVar.e()) && this.g.equals(awxnVar.h()) && this.h.equals(awxnVar.g()) && this.i == awxnVar.i()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.awxn
    @Deprecated
    public final Optional f() {
        return this.d;
    }

    @Override // defpackage.awxn
    public final Optional g() {
        return this.h;
    }

    @Override // defpackage.awxn
    public final String h() {
        return this.g;
    }

    public final int hashCode() {
        return ((((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode()) * 1000003) ^ (true != this.i ? 1237 : 1231);
    }

    @Override // defpackage.awxn
    public final boolean i() {
        return this.i;
    }

    public final String toString() {
        Optional optional = this.h;
        Optional optional2 = this.f;
        axcm axcmVar = this.e;
        Optional optional3 = this.d;
        awxl awxlVar = this.c;
        Optional optional4 = this.b;
        return "MyIdentity{allSubs=" + String.valueOf(this.a) + ", address=" + String.valueOf(optional4) + ", addressType=" + awxlVar.toString() + ", messagingIdentity=" + String.valueOf(optional3) + ", token=" + axcmVar.toString() + ", canonicalToken=" + String.valueOf(optional2) + ", displayName=" + this.g + ", provisioningId=" + String.valueOf(optional) + ", isVerified=" + this.i + "}";
    }
}
