package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dmhc implements dmhi {
    public final fdap a;
    public final dmgo b;
    public final Integer c;
    private final fdau d;
    private final fdap e;
    private final Duration f;
    private final fdap g;

    public dmhc() {
        this(null, null, null, null, null, null, 127);
    }

    @Override // defpackage.dmhi
    public final Duration a() {
        return this.f;
    }

    @Override // defpackage.dmhi
    public final fdap b() {
        return this.e;
    }

    @Override // defpackage.dmhi
    public final fdap c() {
        return this.g;
    }

    @Override // defpackage.dmhi
    public final fdau d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dmhc)) {
            return false;
        }
        dmhc dmhcVar = (dmhc) obj;
        return fdbq.f(this.d, dmhcVar.d) && fdbq.f(this.e, dmhcVar.e) && fdbq.f(this.a, dmhcVar.a) && fdbq.f(this.b, dmhcVar.b) && fdbq.f(this.f, dmhcVar.f) && fdbq.f(this.g, dmhcVar.g) && fdbq.f(this.c, dmhcVar.c);
    }

    public final int hashCode() {
        int iHashCode = (((((((((this.d.hashCode() * 31) + this.e.hashCode()) * 31) + this.a.hashCode()) * 31) + this.b.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g.hashCode();
        Integer num = this.c;
        return (iHashCode * 31) + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "PreRecording(bind=" + this.d + ", onCancel=" + this.e + ", onSwitchCamera=" + this.a + ", recordingActions=" + this.b + ", maxRecordingDuration=" + this.f + ", onLifecycleOnPause=" + this.g + ", countdownValue=" + this.c + ")";
    }

    public /* synthetic */ dmhc(fdau fdauVar, fdap fdapVar, fdap fdapVar2, dmgo dmgoVar, fdap fdapVar3, Integer num, int i) {
        fdauVar = (i & 1) != 0 ? new dmgy(null) : fdauVar;
        fdapVar = (i & 2) != 0 ? new dmgz(null) : fdapVar;
        fdapVar2 = (i & 4) != 0 ? new fdap() { // from class: dmgx
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                ((lvj) obj).getClass();
                return fctx.a;
            }
        } : fdapVar2;
        dmgoVar = (i & 8) != 0 ? new dmha() : dmgoVar;
        Duration durationG = (i & 16) != 0 ? eoob.g(3) : null;
        fdapVar3 = (i & 32) != 0 ? new dmhb(null) : fdapVar3;
        num = (i & 64) != 0 ? null : num;
        fdauVar.getClass();
        fdapVar.getClass();
        fdapVar2.getClass();
        dmgoVar.getClass();
        durationG.getClass();
        fdapVar3.getClass();
        this.d = fdauVar;
        this.e = fdapVar;
        this.a = fdapVar2;
        this.b = dmgoVar;
        this.f = durationG;
        this.g = fdapVar3;
        this.c = num;
    }
}
