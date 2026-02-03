package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dqij {
    public final dqgo a;
    public final Duration b;
    public final dojp c;
    public final Float d;
    public final Duration e;
    public final boolean f;
    public final dqbw g;

    public dqij(dqgo dqgoVar, Duration duration, dojp dojpVar, Float f, Duration duration2, boolean z, dqbw dqbwVar) {
        this.a = dqgoVar;
        this.b = duration;
        this.c = dojpVar;
        this.d = f;
        this.e = duration2;
        this.f = z;
        this.g = dqbwVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dqij)) {
            return false;
        }
        dqij dqijVar = (dqij) obj;
        return this.a == dqijVar.a && fdbq.f(this.b, dqijVar.b) && fdbq.f(this.c, dqijVar.c) && fdbq.f(this.d, dqijVar.d) && fdbq.f(this.e, dqijVar.e) && this.f == dqijVar.f && fdbq.f(this.g, dqijVar.g);
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() * 31) + this.b.hashCode();
        dojp dojpVar = this.c;
        int iHashCode2 = ((iHashCode * 31) + (dojpVar == null ? 0 : dojpVar.hashCode())) * 31;
        Float f = this.d;
        return ((((((iHashCode2 + (f != null ? f.hashCode() : 0)) * 31) + this.e.hashCode()) * 31) + (true != this.f ? 1237 : 1231)) * 31) + this.g.hashCode();
    }

    public final String toString() {
        return "VoiceFlowRequirements(state=" + this.a + ", recordingTime=" + this.b + ", audioFile=" + this.c + ", seekProgress=" + this.d + ", currentPosition=" + this.e + ", isPrepared=" + this.f + ", voiceMetadata=" + this.g + ")";
    }
}
