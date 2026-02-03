package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dilf implements dilh {
    public final Uri a;
    public final Uri b;
    public final String c;
    public final dike d;

    public dilf(Uri uri, Uri uri2, String str, dike dikeVar) {
        this.a = uri;
        this.b = uri2;
        this.c = str;
        this.d = dikeVar;
    }

    @Override // defpackage.dilm
    public final String e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dilf)) {
            return false;
        }
        dilf dilfVar = (dilf) obj;
        return fdbq.f(this.a, dilfVar.a) && fdbq.f(this.b, dilfVar.b) && fdbq.f(this.c, dilfVar.c) && fdbq.f(this.d, dilfVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Uri uri = this.b;
        int iHashCode2 = (((iHashCode + (uri == null ? 0 : uri.hashCode())) * 31) + this.c.hashCode()) * 31;
        dike dikeVar = this.d;
        return iHashCode2 + (dikeVar != null ? dikeVar.hashCode() : 0);
    }

    public final String toString() {
        return "Loaded(uri=" + this.a + ", fallbackUri=" + this.b + ", contentDescription=" + this.c + ", renderListener=" + this.d + ")";
    }
}
