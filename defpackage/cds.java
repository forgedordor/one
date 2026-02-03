package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cds extends cdp {
    public final String a;
    public final int b;
    private final int c;
    private final int d;
    private final int e;
    private final int f;
    private final int g;

    public cds(String str, int i, int i2, int i3, int i4, int i5, int i6) {
        this.a = str;
        this.b = i;
        this.g = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = i6;
    }

    @Override // defpackage.cdp
    public final int a() {
        return this.c;
    }

    @Override // defpackage.cdp
    public final int b() {
        return this.d;
    }

    @Override // defpackage.cdp
    public final int c() {
        return this.f;
    }

    @Override // defpackage.cdp
    public final int d() {
        return this.e;
    }

    @Override // defpackage.cdp
    public final int e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cdp) {
            cdp cdpVar = (cdp) obj;
            if (this.a.equals(cdpVar.h()) && this.b == cdpVar.e()) {
                int i = this.g;
                int i2 = cdpVar.i();
                if (i == 0) {
                    throw null;
                }
                if (i2 == 1 && this.c == cdpVar.a() && this.d == cdpVar.b() && this.e == cdpVar.d() && this.f == cdpVar.c()) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.cdp, defpackage.cei
    public final String h() {
        return this.a;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        bmy.b(this.g);
        return (((((((((((iHashCode * 1000003) ^ this.b) * 1000003) ^ 1) * 1000003) ^ this.c) * 1000003) ^ this.d) * 1000003) ^ this.e) * 1000003) ^ this.f;
    }

    @Override // defpackage.cdp, defpackage.cei
    public final int i() {
        return this.g;
    }

    public final String toString() {
        return "AudioEncoderConfig{mimeType=" + this.a + ", profile=" + this.b + ", inputTimebase=" + ((Object) bmy.a(this.g)) + ", bitrate=" + this.c + ", captureSampleRate=" + this.d + ", encodeSampleRate=" + this.e + ", channelCount=" + this.f + "}";
    }
}
