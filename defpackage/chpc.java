package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class chpc {
    public final Uri a;
    public final chpq b;
    public final boolean c;

    public /* synthetic */ chpc(Uri uri, chpq chpqVar, boolean z, int i) {
        chpqVar = (i & 2) != 0 ? chpq.PROFILE_PEOPLE_SHARING_SOURCE : chpqVar;
        boolean z2 = (i & 4) == 0;
        chpqVar.getClass();
        this.a = uri;
        this.b = chpqVar;
        this.c = z & z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof chpc)) {
            return false;
        }
        chpc chpcVar = (chpc) obj;
        return fdbq.f(this.a, chpcVar.a) && this.b == chpcVar.b && this.c == chpcVar.c;
    }

    public final int hashCode() {
        Uri uri = this.a;
        return ((((uri == null ? 0 : uri.hashCode()) * 31) + this.b.hashCode()) * 31) + (true != this.c ? 1237 : 1231);
    }

    public final String toString() {
        return "DefaultProfilePhoto(uri=" + this.a + ", source=" + this.b + ", hasPhoto=" + this.c + ")";
    }
}
