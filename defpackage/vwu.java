package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class vwu {
    public final boolean a;
    public final int b;
    public final ajna c;
    public final long d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final int h;

    public vwu(int i, boolean z, int i2, ajna ajnaVar, long j, boolean z2, boolean z3, boolean z4) {
        this.h = i;
        this.a = z;
        this.b = i2;
        this.c = ajnaVar;
        this.d = j;
        this.e = z2;
        this.f = z3;
        this.g = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vwu)) {
            return false;
        }
        vwu vwuVar = (vwu) obj;
        return this.h == vwuVar.h && this.a == vwuVar.a && this.b == vwuVar.b && this.c == vwuVar.c && this.d == vwuVar.d && this.e == vwuVar.e && this.f == vwuVar.f && this.g == vwuVar.g;
    }

    public final int hashCode() {
        int iA = (((((this.h * 31) + vwt.a(this.a)) * 31) + this.b) * 31) + this.c.hashCode();
        long j = this.d;
        boolean z = this.g;
        return (((((((iA * 31) + ((int) (j ^ (j >>> 32)))) * 31) + vwt.a(this.e)) * 31) + vwt.a(this.f)) * 31) + vwt.a(z);
    }

    public final String toString() {
        return "ComposeConstraintsTransportData(attachmentMode=" + ((Object) ajlg.a(this.h)) + ", locationSharingSupported=" + this.a + ", attachmentCountLimit=" + this.b + ", bestAvailableTransportFeatureSet=" + this.c + ", maxCharacterLimit=" + this.d + ", editSupported=" + this.e + ", remoteDeleteSupported=" + this.f + ", h265DecodingSupported=" + this.g + ")";
    }
}
