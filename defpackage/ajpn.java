package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ajpn implements ajpq {
    public final alqm a;
    private final String b;
    private final String c;
    private final String d;
    private final String e;
    private final Uri f;

    public ajpn(String str, String str2, String str3, alqm alqmVar, String str4, Uri uri) {
        str.getClass();
        str4.getClass();
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.a = alqmVar;
        this.e = str4;
        this.f = uri;
    }

    @Override // defpackage.ajpq
    public final Uri a() {
        return this.f;
    }

    @Override // defpackage.ajpq
    public final alqm b() {
        return this.a;
    }

    @Override // defpackage.ajpq
    public final String c() {
        return this.e;
    }

    @Override // defpackage.ajpq
    public final /* synthetic */ String d() {
        String string = this.a.F().toString();
        if (aqiv.a()) {
            string = cssf.b(string, false);
        }
        string.getClass();
        return string;
    }

    @Override // defpackage.ajpq
    public final String e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ajpn)) {
            return false;
        }
        ajpn ajpnVar = (ajpn) obj;
        return fdbq.f(this.b, ajpnVar.b) && fdbq.f(this.c, ajpnVar.c) && fdbq.f(this.d, ajpnVar.d) && fdbq.f(this.a, ajpnVar.a) && fdbq.f(this.e, ajpnVar.e) && fdbq.f(this.f, ajpnVar.f);
    }

    @Override // defpackage.ajpq
    public final String f() {
        return this.b;
    }

    @Override // defpackage.ajpq
    public final String g() {
        return this.c;
    }

    public final int hashCode() {
        int iHashCode = (((((((this.b.hashCode() * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.a.hashCode()) * 31) + this.e.hashCode();
        Uri uri = this.f;
        return (iHashCode * 31) + (uri == null ? 0 : uri.hashCode());
    }

    public final String toString() {
        return "DefaultSearchContactEntry(id=" + this.b + ", lookupKey=" + this.c + ", displayName=" + this.d + ", destination=" + this.a + ", destinationType=" + this.e + ", photo=" + this.f + ")";
    }
}
