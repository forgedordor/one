package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlww {
    public final int a;
    public final int b;
    private final Duration c;
    private final String d;

    public dlww(int i, int i2, Duration duration, String str) {
        this.a = i;
        this.b = i2;
        this.c = duration;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dlww)) {
            return false;
        }
        dlww dlwwVar = (dlww) obj;
        return this.a == dlwwVar.a && this.b == dlwwVar.b && fdbq.f(this.c, dlwwVar.c) && fdbq.f(this.d, dlwwVar.d);
    }

    public final int hashCode() {
        return (((((this.a * 31) + this.b) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    public final String toString() {
        return "AudioInfo(samplingRateHz=" + this.a + ", channelCount=" + this.b + ", audioDuration=" + this.c + ", codec=" + this.d + ")";
    }
}
