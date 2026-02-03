package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efib extends efkn {
    public final String a;
    public final Optional b;
    public final Optional c;

    public efib(String str, Optional optional, Optional optional2) {
        this.a = str;
        this.b = optional;
        this.c = optional2;
    }

    @Override // defpackage.efkn
    public final Optional a() {
        return this.b;
    }

    @Override // defpackage.efkn
    public final Optional b() {
        return this.c;
    }

    @Override // defpackage.efkn
    public final String c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof efkn) {
            efkn efknVar = (efkn) obj;
            if (this.a.equals(efknVar.c()) && this.b.equals(efknVar.a()) && this.c.equals(efknVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        Optional optional = this.c;
        return "RbmDeepLinkContext{agentId=" + this.a + ", context=" + this.b.toString() + ", greetingId=" + optional.toString() + "}";
    }
}
