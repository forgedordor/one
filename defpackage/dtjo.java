package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dtjo {
    public final Uri a;
    public final int b;
    public final int c;
    public final boolean d;
    private final int e;

    public dtjo(Uri uri, int i, int i2, boolean z, int i3) {
        uri.getClass();
        this.a = uri;
        this.b = i;
        this.c = i2;
        this.d = z;
        this.e = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dtjo)) {
            return false;
        }
        dtjo dtjoVar = (dtjo) obj;
        return fdbq.f(this.a, dtjoVar.a) && this.b == dtjoVar.b && this.c == dtjoVar.c && this.d == dtjoVar.d && this.e == dtjoVar.e;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        return ((((((iHashCode + this.b) * 31) + this.c) * 31) + (true != this.d ? 1237 : 1231)) * 31) + this.e;
    }

    public final String toString() {
        return "FontInfo(uri=" + this.a + ", ttcIndex=" + this.b + ", weight=" + this.c + ", isItalic=" + this.d + ", resultCode=" + this.e + ")";
    }
}
