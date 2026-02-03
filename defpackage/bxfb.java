package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bxfb {
    public final String a;
    public final Uri b;

    public bxfb(String str, Uri uri) {
        this.a = str;
        this.b = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bxfb)) {
            return false;
        }
        bxfb bxfbVar = (bxfb) obj;
        return fdbq.f(this.a, bxfbVar.a) && fdbq.f(this.b, bxfbVar.b);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = str == null ? 0 : str.hashCode();
        Uri uri = this.b;
        return (iHashCode * 31) + (uri != null ? uri.hashCode() : 0);
    }

    public final String toString() {
        return "VCardDetails(displayName=" + this.a + ", avatarUri=" + this.b + ")";
    }
}
