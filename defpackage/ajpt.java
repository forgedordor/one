package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ajpt implements ajpq {
    private final String a;
    private final String b;
    private final String c;
    private final alqm d;
    private final String e;
    private final String f;
    private final Uri g;

    public ajpt(String str, String str2, String str3, alqm alqmVar, String str4, String str5, Uri uri) {
        str5.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = alqmVar;
        this.e = str4;
        this.f = str5;
        this.g = uri;
    }

    @Override // defpackage.ajpq
    public final Uri a() {
        return this.g;
    }

    @Override // defpackage.ajpq
    public final alqm b() {
        return this.d;
    }

    @Override // defpackage.ajpq
    public final String c() {
        return this.e;
    }

    @Override // defpackage.ajpq
    public final String d() {
        return this.f;
    }

    @Override // defpackage.ajpq
    public final String e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ajpt)) {
            return false;
        }
        ajpt ajptVar = (ajpt) obj;
        return fdbq.f(this.a, ajptVar.a) && fdbq.f(this.b, ajptVar.b) && fdbq.f(this.c, ajptVar.c) && fdbq.f(this.d, ajptVar.d) && fdbq.f(this.e, ajptVar.e) && fdbq.f(this.f, ajptVar.f) && fdbq.f(this.g, ajptVar.g);
    }

    @Override // defpackage.ajpq
    public final String f() {
        return this.a;
    }

    @Override // defpackage.ajpq
    public final String g() {
        return this.b;
    }

    public final int hashCode() {
        int iHashCode = (((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode();
        Uri uri = this.g;
        return (iHashCode * 31) + (uri == null ? 0 : uri.hashCode());
    }

    public final String toString() {
        return "IcingSearchContactEntry(id=" + this.a + ", lookupKey=" + this.b + ", displayName=" + this.c + ", destination=" + this.d + ", destinationType=" + this.e + ", displayDestination=" + this.f + ", uri=" + this.g + ")";
    }
}
