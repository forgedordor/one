package defpackage;

import android.util.Size;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cdu extends cgp {
    public final String a;
    public final int b;
    public final Size c;
    public final int d;
    public final cgq e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;

    public cdu(String str, int i, int i2, Size size, int i3, cgq cgqVar, int i4, int i5, int i6, int i7) {
        this.a = str;
        this.b = i;
        this.j = i2;
        this.c = size;
        this.d = i3;
        this.e = cgqVar;
        this.f = i4;
        this.g = i5;
        this.h = i6;
        this.i = i7;
    }

    @Override // defpackage.cgp
    public final int a() {
        return this.i;
    }

    @Override // defpackage.cgp
    public final int b() {
        return this.f;
    }

    @Override // defpackage.cgp
    public final int c() {
        return this.d;
    }

    @Override // defpackage.cgp
    public final int d() {
        return this.g;
    }

    @Override // defpackage.cgp
    public final int e() {
        return this.h;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cgp) {
            cgp cgpVar = (cgp) obj;
            if (this.a.equals(cgpVar.h()) && this.b == cgpVar.g()) {
                int i = this.j;
                int i2 = cgpVar.i();
                if (i == 0) {
                    throw null;
                }
                if (i == i2 && this.c.equals(cgpVar.j()) && this.d == cgpVar.c() && this.e.equals(cgpVar.l()) && this.f == cgpVar.b() && this.g == cgpVar.d() && this.h == cgpVar.e() && this.i == cgpVar.a()) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.cgp
    public final int g() {
        return this.b;
    }

    @Override // defpackage.cgp, defpackage.cei
    public final String h() {
        return this.a;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        int i = this.j;
        bmy.b(i);
        return (((((((((((((((((iHashCode * 1000003) ^ this.b) * 1000003) ^ i) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f) * 1000003) ^ this.g) * 1000003) ^ this.h) * 1000003) ^ this.i;
    }

    @Override // defpackage.cgp, defpackage.cei
    public final int i() {
        return this.j;
    }

    @Override // defpackage.cgp
    public final Size j() {
        return this.c;
    }

    @Override // defpackage.cgp
    public final cgo k() {
        return new cdt(this);
    }

    @Override // defpackage.cgp
    public final cgq l() {
        return this.e;
    }

    public final String toString() {
        return "VideoEncoderConfig{mimeType=" + this.a + ", profile=" + this.b + ", inputTimebase=" + ((Object) bmy.a(this.j)) + ", resolution=" + this.c + ", colorFormat=" + this.d + ", dataSpace=" + this.e + ", captureFrameRate=" + this.f + ", encodeFrameRate=" + this.g + ", IFrameInterval=" + this.h + ", bitrate=" + this.i + "}";
    }
}
