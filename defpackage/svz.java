package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class svz {
    public final int a;
    public final int b;
    public final Duration c;
    public final String d;

    public svz(int i, int i2, Duration duration, String str) {
        this.a = i;
        this.b = i2;
        this.c = duration;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof svz)) {
            return false;
        }
        svz svzVar = (svz) obj;
        return this.a == svzVar.a && this.b == svzVar.b && fdbq.f(this.c, svzVar.c) && fdbq.f(this.d, svzVar.d);
    }

    public final int hashCode() {
        return (((((this.a * 31) + this.b) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    public final String toString() {
        return "AudioInfo(samplingRateHz=" + this.a + ", channelCount=" + this.b + ", audioDuration=" + this.c + ", codec=" + this.d + ")";
    }
}
