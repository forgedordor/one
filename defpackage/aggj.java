package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aggj implements afzx {
    public final Uri a;
    public final long b;
    public final int c;
    public final int d;

    public aggj(Uri uri, long j, int i, int i2) {
        this.a = uri;
        this.b = j;
        this.c = i;
        this.d = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aggj)) {
            return false;
        }
        aggj aggjVar = (aggj) obj;
        return fdbq.f(this.a, aggjVar.a) && this.b == aggjVar.b && this.c == aggjVar.c && this.d == aggjVar.d;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        long j = this.b;
        return ((((iHashCode + ((int) (j ^ (j >>> 32)))) * 31) + this.c) * 31) + this.d;
    }

    public final String toString() {
        return "VideoTrimmer(uri=" + this.a + ", maxOutputFileKb=" + this.b + ", outputWidthPx=" + this.c + ", outputHeightPx=" + this.d + ")";
    }
}
