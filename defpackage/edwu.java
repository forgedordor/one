package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class edwu extends edwx {
    public final String a;
    public final Object b;
    public final boolean c;
    public final etvj d;
    public final boolean e;
    public final boolean f;
    public final Uri g;
    public final boolean h;
    private final String i;

    public edwu(String str, Object obj, String str2, boolean z, etvj etvjVar, boolean z2, boolean z3, Uri uri, boolean z4) {
        uri.getClass();
        this.a = str;
        this.b = obj;
        this.i = str2;
        this.c = z;
        this.d = etvjVar;
        this.e = z2;
        this.f = z3;
        this.g = uri;
        this.h = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof edwu)) {
            return false;
        }
        edwu edwuVar = (edwu) obj;
        return fdbq.f(this.a, edwuVar.a) && fdbq.f(this.b, edwuVar.b) && fdbq.f(this.i, edwuVar.i) && this.c == edwuVar.c && this.d == edwuVar.d && this.e == edwuVar.e && this.f == edwuVar.f && fdbq.f(this.g, edwuVar.g) && this.h == edwuVar.h;
    }

    public final int hashCode() {
        int iHashCode = (((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.i.hashCode()) * 31) + edwt.a(this.c)) * 31) + this.d.hashCode();
        Uri uri = this.g;
        return (((((((iHashCode * 31) + edwt.a(this.e)) * 31) + edwt.a(this.f)) * 31) + uri.hashCode()) * 31) + edwt.a(this.h);
    }

    public final String toString() {
        return "Ready(name=" + this.a + ", avatarGlideModel=" + this.b + ", accountName=" + this.i + ", locked=" + this.c + ", infoMessage=" + this.d + ", hasAnyGooglePhotos=" + this.e + ", isDefaultPhoto=" + this.f + ", cameraUri=" + this.g + ", remoteStateLoadDone=" + this.h + ")";
    }
}
