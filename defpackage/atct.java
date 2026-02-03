package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class atct extends atdn {
    public final String a;
    public final String b;
    public final Optional c;
    public final String d;
    public final Optional e;
    private final Optional f;
    private final Optional g;

    public atct(String str, String str2, Optional optional, Optional optional2, String str3, Optional optional3, Optional optional4) {
        this.a = str;
        this.b = str2;
        this.f = optional;
        this.c = optional2;
        this.d = str3;
        this.g = optional3;
        this.e = optional4;
    }

    @Override // defpackage.atdn
    public final Optional a() {
        return this.f;
    }

    @Override // defpackage.atdn
    public final Optional b() {
        return this.e;
    }

    @Override // defpackage.atdn
    public final Optional c() {
        return this.c;
    }

    @Override // defpackage.atdn
    public final Optional d() {
        return this.g;
    }

    @Override // defpackage.atdn
    public final String e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof atdn) {
            atdn atdnVar = (atdn) obj;
            if (this.a.equals(atdnVar.g()) && this.b.equals(atdnVar.f()) && this.f.equals(atdnVar.a()) && this.c.equals(atdnVar.c()) && this.d.equals(atdnVar.e()) && this.g.equals(atdnVar.d()) && this.e.equals(atdnVar.b())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.atdn
    public final String f() {
        return this.b;
    }

    @Override // defpackage.atdn
    public final String g() {
        return this.a;
    }

    public final int hashCode() {
        return ((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.e.hashCode();
    }

    public final String toString() {
        Optional optional = this.e;
        Optional optional2 = this.g;
        Optional optional3 = this.c;
        return "WwwAuthenticateHeader{schema=" + this.a + ", realm=" + this.b + ", domain=" + String.valueOf(this.f) + ", qop=" + String.valueOf(optional3) + ", nonce=" + this.d + ", stale=" + String.valueOf(optional2) + ", opaque=" + String.valueOf(optional) + "}";
    }
}
