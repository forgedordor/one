package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dizc implements dize {
    private final Uri a;
    private final String b;
    private final fdae c;

    public dizc(Uri uri, String str, fdae fdaeVar) {
        uri.getClass();
        this.a = uri;
        this.b = str;
        this.c = fdaeVar;
    }

    @Override // defpackage.dize
    public final Uri a() {
        return this.a;
    }

    @Override // defpackage.dize
    public final String b() {
        return this.b;
    }

    @Override // defpackage.dize
    public final fdae c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dizc)) {
            return false;
        }
        dizc dizcVar = (dizc) obj;
        return fdbq.f(this.a, dizcVar.a) && fdbq.f(this.b, dizcVar.b) && fdbq.f(this.c, dizcVar.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "Image(uri=" + this.a + ", contentDescription=" + this.b + ", onClick=" + this.c + ")";
    }
}
