package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dqgm implements dpxp {
    public final fdvc a;
    public final fdae b;
    public final dqfz c;
    public final fdvc d;
    public final fdpl e;
    public final fdvc f;
    public final fdvc g;
    public final dqga h;
    public final boolean i = true;
    public final Optional j;
    public final boolean k;
    public final boolean l;
    public final cqwi m;

    public dqgm(fdvc fdvcVar, fdae fdaeVar, dqfz dqfzVar, fdvc fdvcVar2, fdpl fdplVar, fdvc fdvcVar3, fdvc fdvcVar4, dqga dqgaVar, cqwi cqwiVar, Optional optional, boolean z, boolean z2) {
        this.a = fdvcVar;
        this.b = fdaeVar;
        this.c = dqfzVar;
        this.d = fdvcVar2;
        this.e = fdplVar;
        this.f = fdvcVar3;
        this.g = fdvcVar4;
        this.h = dqgaVar;
        this.m = cqwiVar;
        this.j = optional;
        this.k = z;
        this.l = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dqgm)) {
            return false;
        }
        dqgm dqgmVar = (dqgm) obj;
        if (!fdbq.f(this.a, dqgmVar.a) || !fdbq.f(this.b, dqgmVar.b) || !fdbq.f(this.c, dqgmVar.c) || !fdbq.f(this.d, dqgmVar.d) || !fdbq.f(this.e, dqgmVar.e) || !fdbq.f(this.f, dqgmVar.f) || !fdbq.f(this.g, dqgmVar.g) || !fdbq.f(this.h, dqgmVar.h) || !fdbq.f(this.m, dqgmVar.m)) {
            return false;
        }
        boolean z = dqgmVar.i;
        return fdbq.f(this.j, dqgmVar.j) && this.k == dqgmVar.k && this.l == dqgmVar.l;
    }

    public final int hashCode() {
        return (((((((((((((((((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31) + this.h.hashCode()) * 31) + this.m.hashCode()) * 31) + dqgl.a(true)) * 31) + this.j.hashCode()) * 31) + dqgl.a(this.k)) * 31) + dqgl.a(this.l);
    }

    public final String toString() {
        return "VoiceConfiguration(voiceInputStateFlow=" + this.a + ", maxRecordingDuration=" + this.b + ", recordingActions=" + this.c + ", recordingTimerFlow=" + this.d + ", audioLevelFlow=" + this.e + ", errorMessageFlow=" + this.f + ", audioFileFlow=" + this.g + ", moodConfiguration=" + this.h + ", glideImageManager=" + this.m + ", pauseAudioPlaybackOnClose=true, xenoAudioProcessorState=" + this.j + ", useParentTheme=" + this.k + ", catchPlaybackPreparationException=" + this.l + ")";
    }
}
