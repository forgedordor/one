package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dmgw implements dmhi {
    public final dmgo a;
    public final dojr b;
    private final fdau c;
    private final fdap d;
    private final Duration e;
    private final fdap f;
    private final boolean g = true;

    public dmgw(fdau fdauVar, fdap fdapVar, dmgo dmgoVar, Duration duration, fdap fdapVar2, dojr dojrVar) {
        this.c = fdauVar;
        this.d = fdapVar;
        this.a = dmgoVar;
        this.e = duration;
        this.f = fdapVar2;
        this.b = dojrVar;
    }

    @Override // defpackage.dmhi
    public final Duration a() {
        return this.e;
    }

    @Override // defpackage.dmhi
    public final fdap b() {
        return this.d;
    }

    @Override // defpackage.dmhi
    public final fdap c() {
        return this.f;
    }

    @Override // defpackage.dmhi
    public final fdau d() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dmgw)) {
            return false;
        }
        dmgw dmgwVar = (dmgw) obj;
        if (!fdbq.f(this.c, dmgwVar.c) || !fdbq.f(this.d, dmgwVar.d) || !fdbq.f(this.a, dmgwVar.a) || !fdbq.f(this.e, dmgwVar.e) || !fdbq.f(this.f, dmgwVar.f) || !fdbq.f(this.b, dmgwVar.b)) {
            return false;
        }
        boolean z = dmgwVar.g;
        return true;
    }

    public final int hashCode() {
        return (((((((((((this.c.hashCode() * 31) + this.d.hashCode()) * 31) + this.a.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.b.hashCode()) * 31) + 1231;
    }

    public final String toString() {
        return "Playback(bind=" + this.c + ", onCancel=" + this.d + ", recordingActions=" + this.a + ", maxRecordingDuration=" + this.e + ", onLifecycleOnPause=" + this.f + ", capturedMedia=" + this.b + ", enablePopupCameraPlaybackBottomMarginFix=true)";
    }
}
