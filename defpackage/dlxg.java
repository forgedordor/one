package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlxg {
    public final Uri a;
    public final ebsu b;
    public final int c;
    public final int e;
    public final Integer f;
    public final int d = 1;
    private final int g = 2;
    private final int h = 2;

    public dlxg(Uri uri, ebsu ebsuVar, int i, int i2, Integer num) {
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
        if (!(obj instanceof dlxg)) {
            return false;
        }
        dlxg dlxgVar = (dlxg) obj;
        if (!fdbq.f(this.a, dlxgVar.a) || !fdbq.f(this.b, dlxgVar.b) || this.c != dlxgVar.c) {
            return false;
        }
        int i = dlxgVar.d;
        int i2 = dlxgVar.g;
        if (this.e != dlxgVar.e) {
            return false;
        }
        int i3 = dlxgVar.h;
        return fdbq.f(this.f, dlxgVar.f);
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() * 31) + this.b.hashCode();
        Integer num = this.f;
        return (((((((((((iHashCode * 31) + this.c) * 31) + 1) * 31) + 2) * 31) + this.e) * 31) + 2) * 31) + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "Mpeg4EncoderConfiguration(outputUri=" + this.a + ", sourcePolicy=" + this.b + ", sampleRate=" + this.c + ", channelCount=1, pcmEncoding=2, bitRate=" + this.e + ", aacProfile=2, maxFileSize=" + this.f + ")";
    }
}
