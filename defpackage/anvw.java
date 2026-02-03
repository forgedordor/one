package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class anvw {
    public final Uri a;
    public final Uri b;
    public final chpq c;

    public anvw(Uri uri, Uri uri2, chpq chpqVar) {
        chpqVar.getClass();
        this.a = uri;
        this.b = uri2;
        this.c = chpqVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof anvw)) {
            return false;
        }
        anvw anvwVar = (anvw) obj;
        return fdbq.f(this.a, anvwVar.a) && fdbq.f(this.b, anvwVar.b) && this.c == anvwVar.c;
    }

    public final int hashCode() {
        Uri uri = this.a;
        int iHashCode = uri == null ? 0 : uri.hashCode();
        Uri uri2 = this.b;
        return (((iHashCode * 31) + (uri2 != null ? uri2.hashCode() : 0)) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "RecipientPhotoImpl(highResolutionPhotoUri=" + this.a + ", thumbnailPhotoUri=" + this.b + ", source=" + this.c + ")";
    }
}
