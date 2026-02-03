package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlyk {
    public final fduj a;
    public final int b;
    public final int c;
    public final Duration d;

    public dlyk(fduj fdujVar, int i, int i2, Duration duration) {
        this.a = fdujVar;
        this.b = i;
        this.c = i2;
        this.d = duration;
        if (fdbq.f(duration, Duration.ZERO)) {
            throw new IllegalArgumentException("Cannot process window duration of 0.");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dlyk)) {
            return false;
        }
        dlyk dlykVar = (dlyk) obj;
        return fdbq.f(this.a, dlykVar.a) && this.b == dlykVar.b && this.c == dlykVar.c && fdbq.f(this.d, dlykVar.d);
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b) * 31) + this.c) * 31) + this.d.hashCode();
    }

    public final String toString() {
        return "AudioLevelProcessorConfiguration(inputFlow=" + this.a + ", sampleRate=" + this.b + ", channelCount=" + this.c + ", windowDuration=" + this.d + ")";
    }
}
