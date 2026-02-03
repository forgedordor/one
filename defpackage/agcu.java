package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agcu implements afzv {
    public final Uri a;
    public final String b;
    public final String c;
    public final long d;
    public final boolean e;

    public agcu(Uri uri, String str, String str2, long j, boolean z) {
        str.getClass();
        this.a = uri;
        this.b = str;
        this.c = str2;
        this.d = j;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof agcu)) {
            return false;
        }
        agcu agcuVar = (agcu) obj;
        return fdbq.f(this.a, agcuVar.a) && fdbq.f(this.b, agcuVar.b) && fdbq.f(this.c, agcuVar.c) && this.d == agcuVar.d && this.e == agcuVar.e;
    }

    public final int hashCode() {
        int iHashCode = (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
        int i = true != this.e ? 1237 : 1231;
        long j = this.d;
        return (((iHashCode * 31) + ((int) (j ^ (j >>> 32)))) * 31) + i;
    }

    public final String toString() {
        return "FileViewer(fileUri=" + this.a + ", contentType=" + this.b + ", fileName=" + this.c + ", fileSize=" + this.d + ", saveUnsupportedFile=" + this.e + ")";
    }
}
