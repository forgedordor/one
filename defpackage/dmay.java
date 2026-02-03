package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dmay {
    public final int a;
    public final int b;
    public final Duration c;
    public final Duration d;
    public final fdap e;
    private final int f;

    public dmay() {
        this(0, 0, null, null, 63);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dmay)) {
            return false;
        }
        dmay dmayVar = (dmay) obj;
        if (this.a != dmayVar.a || this.b != dmayVar.b) {
            return false;
        }
        int i = dmayVar.f;
        return fdbq.f(this.c, dmayVar.c) && fdbq.f(this.d, dmayVar.d) && fdbq.f(this.e, dmayVar.e);
    }

    public final int hashCode() {
        int iHashCode = (((this.a * 31) + this.b) * 961) + this.c.hashCode();
        Duration duration = this.d;
        return (((iHashCode * 31) + (duration == null ? 0 : duration.hashCode())) * 31) + this.e.hashCode();
    }

    public final String toString() {
        return "MicrophoneAudioSourceConfiguration(sampleRate=" + this.a + ", channelCount=" + this.b + ", outputBufferCapacity=0, outputTimeout=" + this.c + ", maxDuration=" + this.d + ", onMaxDurationReached=" + this.e + ")";
    }

    public /* synthetic */ dmay(int i, int i2, Duration duration, fdap fdapVar, int i3) {
        Duration durationG = (i3 & 8) != 0 ? eoob.g(1) : null;
        duration = (i3 & 16) != 0 ? null : duration;
        fdapVar = (i3 & 32) != 0 ? new dmax(null) : fdapVar;
        int i4 = i2 | (((i3 & 2) != 0 ? 0 : 1) ^ 1);
        i = 1 == (i3 & 1) ? 44100 : i;
        durationG.getClass();
        fdapVar.getClass();
        this.a = i;
        this.b = i4;
        this.f = 0;
        this.c = durationG;
        this.d = duration;
        this.e = fdapVar;
    }
}
