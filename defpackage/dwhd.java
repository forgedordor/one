package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dwhd extends dwhf {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final ejwi g;
    public final ejwi h;

    public dwhd(String str, String str2, String str3, String str4, String str5, String str6, ejwi ejwiVar, ejwi ejwiVar2) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = ejwiVar;
        this.h = ejwiVar2;
    }

    @Override // defpackage.dwhf
    public final ejwi a() {
        return this.h;
    }

    @Override // defpackage.dwhf
    public final ejwi b() {
        return this.g;
    }

    @Override // defpackage.dwhf
    public final String c() {
        return this.f;
    }

    @Override // defpackage.dwhf
    public final String d() {
        return this.c;
    }

    @Override // defpackage.dwhf
    public final String e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dwhf) {
            dwhf dwhfVar = (dwhf) obj;
            if (this.a.equals(dwhfVar.g()) && this.b.equals(dwhfVar.h()) && this.c.equals(dwhfVar.d()) && this.d.equals(dwhfVar.f()) && this.e.equals(dwhfVar.e()) && this.f.equals(dwhfVar.c()) && this.g.equals(dwhfVar.b()) && this.h.equals(dwhfVar.a())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.dwhf
    public final String f() {
        return this.d;
    }

    @Override // defpackage.dwhf
    public final String g() {
        return this.a;
    }

    @Override // defpackage.dwhf
    public final String h() {
        return this.b;
    }

    public final int hashCode() {
        return ((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode();
    }

    public final String toString() {
        ejwi ejwiVar = this.h;
        return "LinkPreview{messageText=" + this.a + ", title=" + this.b + ", description=" + this.c + ", imageUrl=" + this.d + ", domain=" + this.e + ", canonicalUrl=" + this.f + ", image=" + String.valueOf(this.g) + ", expirationTimeMs=" + String.valueOf(ejwiVar) + "}";
    }
}
