package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cci extends cbi {
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;

    public cci(int i, int i2, int i3, int i4, int i5) {
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = i5;
    }

    @Override // defpackage.cbi
    public final int a() {
        return this.f;
    }

    @Override // defpackage.cbi
    public final int b() {
        return this.b;
    }

    @Override // defpackage.cbi
    public final int d() {
        return this.c;
    }

    @Override // defpackage.cbi
    public final int e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cbi) {
            cbi cbiVar = (cbi) obj;
            if (this.b == cbiVar.b() && this.c == cbiVar.d() && this.d == cbiVar.f() && this.e == cbiVar.e() && this.f == cbiVar.a()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.cbi
    public final int f() {
        return this.d;
    }

    public final int hashCode() {
        return ((((((((this.b ^ 1000003) * 1000003) ^ this.c) * 1000003) ^ this.d) * 1000003) ^ this.e) * 1000003) ^ this.f;
    }

    public final String toString() {
        return "AudioSettings{audioSource=" + this.b + ", captureSampleRate=" + this.c + ", encodeSampleRate=" + this.d + ", channelCount=" + this.e + ", audioFormat=" + this.f + "}";
    }
}
