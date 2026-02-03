package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dqiu implements dqix {
    public final Duration a;
    public final fdvc b;
    public final fdvc c;
    public final Duration d;
    public final float e;
    public final dqfx f;
    public final dqbw g;
    public final fdap h;

    public dqiu() {
        Duration duration = Duration.ZERO;
        fduf fdufVarA = fdvf.a(false);
        fduf fdufVarA2 = fdvf.a(false);
        Duration duration2 = Duration.ZERO;
        dqit dqitVar = new dqit();
        dqbv dqbvVar = (dqbv) dqbw.a.createBuilder();
        dqbvVar.getClass();
        this(duration, fdufVarA, fdufVarA2, duration2, 0.0f, dqitVar, dqbx.a(dqbvVar), new fdap() { // from class: dqis
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                ((dqbw) obj).getClass();
                return fctx.a;
            }
        });
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dqiu)) {
            return false;
        }
        dqiu dqiuVar = (dqiu) obj;
        return fdbq.f(this.a, dqiuVar.a) && fdbq.f(this.b, dqiuVar.b) && fdbq.f(this.c, dqiuVar.c) && fdbq.f(this.d, dqiuVar.d) && Float.compare(this.e, dqiuVar.e) == 0 && fdbq.f(this.f, dqiuVar.f) && fdbq.f(this.g, dqiuVar.g) && fdbq.f(this.h, dqiuVar.h);
    }

    public final int hashCode() {
        return (((((((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + Float.floatToIntBits(this.e)) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31) + this.h.hashCode();
    }

    public final String toString() {
        return "Playback(audioDuration=" + this.a + ", isPreparedFlow=" + this.b + ", isPlayingFlow=" + this.c + ", currentTime=" + this.d + ", progress=" + this.e + ", playbackActions=" + this.f + ", voiceMetadata=" + this.g + ", onVoiceMetadataUpdated=" + this.h + ")";
    }

    public dqiu(Duration duration, fdvc fdvcVar, fdvc fdvcVar2, Duration duration2, float f, dqfx dqfxVar, dqbw dqbwVar, fdap fdapVar) {
        duration.getClass();
        duration2.getClass();
        dqfxVar.getClass();
        this.a = duration;
        this.b = fdvcVar;
        this.c = fdvcVar2;
        this.d = duration2;
        this.e = f;
        this.f = dqfxVar;
        this.g = dqbwVar;
        this.h = fdapVar;
    }
}
