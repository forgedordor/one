package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class swe {
    public final Uri a;
    public final float b;
    private final String c;

    public swe(Uri uri, String str, float f) {
        this.a = uri;
        this.c = str;
        this.b = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof swe)) {
            return false;
        }
        swe sweVar = (swe) obj;
        return fdbq.f(this.a, sweVar.a) && fdbq.f(this.c, sweVar.c) && Float.compare(this.b, sweVar.b) == 0;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.c.hashCode()) * 31) + Float.floatToIntBits(this.b);
    }

    public final String toString() {
        return "SodaProgress(audioUri=" + this.a + ", partialResult=" + this.c + ", progress=" + this.b + ")";
    }
}
