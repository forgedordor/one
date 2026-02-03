package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class atbd extends atbq {
    public final coid a;
    public final int b;
    public final ekgp c;
    public final String d;
    public final Optional e;
    private final Optional g;

    public atbd(coid coidVar, int i, ekgp ekgpVar, String str, Optional optional, Optional optional2) {
        this.a = coidVar;
        this.b = i;
        this.c = ekgpVar;
        this.d = str;
        this.g = optional;
        this.e = optional2;
    }

    @Override // defpackage.atbq
    public final int a() {
        return this.b;
    }

    @Override // defpackage.atbq
    public final coid b() {
        return this.a;
    }

    @Override // defpackage.atbq
    public final ekgp c() {
        return this.c;
    }

    @Override // defpackage.atbq
    public final Optional d() {
        return this.g;
    }

    @Override // defpackage.atbq
    public final Optional e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof atbq) {
            atbq atbqVar = (atbq) obj;
            if (this.a.equals(atbqVar.b()) && this.b == atbqVar.a() && this.c.equals(atbqVar.c()) && this.d.equals(atbqVar.f()) && this.g.equals(atbqVar.d()) && this.e.equals(atbqVar.e())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.atbq
    public final String f() {
        return this.d;
    }

    public final int hashCode() {
        return ((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.e.hashCode();
    }

    public final String toString() {
        Optional optional = this.e;
        Optional optional2 = this.g;
        ekgp ekgpVar = this.c;
        return "FileTransferFailure{reason=" + String.valueOf(this.a) + ", httpResponseCode=" + this.b + ", httpHeaders=" + String.valueOf(ekgpVar) + ", transactionId=" + this.d + ", cronetException=" + String.valueOf(optional2) + ", genericException=" + String.valueOf(optional) + "}";
    }
}
