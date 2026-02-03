package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class avoh extends awcg {
    public final Optional a;
    public final Optional b;
    public final String c;

    public avoh(Optional optional, Optional optional2, String str) {
        this.a = optional;
        this.b = optional2;
        this.c = str;
    }

    @Override // defpackage.awcg
    public final Optional a() {
        return this.b;
    }

    @Override // defpackage.awcg
    public final Optional b() {
        return this.a;
    }

    @Override // defpackage.awcg
    public final String c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof awcg) {
            awcg awcgVar = (awcg) obj;
            if (this.a.equals(awcgVar.b()) && this.b.equals(awcgVar.a()) && this.c.equals(awcgVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        Optional optional = this.b;
        return "AnonymizedPhoneNumber{implicitCountryCode=" + this.a.toString() + ", explicitCountryCode=" + optional.toString() + ", nationalNumber=" + this.c + "}";
    }
}
