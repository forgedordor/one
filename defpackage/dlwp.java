package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlwp {
    public final Uri a;
    public final ebsu b;
    public final int c;
    public final int e;
    public final Integer f;
    public final int d = 1;
    private final int g = 2;

    public dlwp(Uri uri, ebsu ebsuVar, int i, int i2, Integer num) {
        this.a = uri;
        this.b = ebsuVar;
        this.c = i;
        this.e = i2;
        this.f = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dlwp)) {
            return false;
        }
        dlwp dlwpVar = (dlwp) obj;
        if (!fdbq.f(this.a, dlwpVar.a) || !fdbq.f(this.b, dlwpVar.b) || this.c != dlwpVar.c) {
            return false;
        }
        int i = dlwpVar.d;
        int i2 = dlwpVar.g;
        return this.e == dlwpVar.e && fdbq.f(this.f, dlwpVar.f);
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() * 31) + this.b.hashCode();
        Integer num = this.f;
        return (((((((((iHashCode * 31) + this.c) * 31) + 1) * 31) + 2) * 31) + this.e) * 31) + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "AmrEncoderConfiguration(outputUri=" + this.a + ", sourcePolicy=" + this.b + ", sampleRate=" + this.c + ", channelCount=1, pcmEncoding=2, bitRate=" + this.e + ", maxFileSize=" + this.f + ")";
    }
}
