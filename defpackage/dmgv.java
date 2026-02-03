package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dmgv implements dmhi {
    private final fdau a;
    private final fdap b;
    private final fdap c;
    private final dmgo d;
    private final Duration e;
    private final fdap f;

    public dmgv() {
        this(null, null, null, null, null, 63);
    }

    @Override // defpackage.dmhi
    public final Duration a() {
        return this.e;
    }

    @Override // defpackage.dmhi
    public final fdap b() {
        return this.b;
    }

    @Override // defpackage.dmhi
    public final fdap c() {
        return this.f;
    }

    @Override // defpackage.dmhi
    public final fdau d() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dmgv)) {
            return false;
        }
        dmgv dmgvVar = (dmgv) obj;
        return fdbq.f(this.a, dmgvVar.a) && fdbq.f(this.b, dmgvVar.b) && fdbq.f(this.c, dmgvVar.c) && fdbq.f(this.d, dmgvVar.d) && fdbq.f(this.e, dmgvVar.e) && fdbq.f(this.f, dmgvVar.f);
    }

    public final int hashCode() {
        return (((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode();
    }

    public final String toString() {
        return "Closed(bind=" + this.a + ", onCancel=" + this.b + ", onSwitchCamera=" + this.c + ", recordingActions=" + this.d + ", maxRecordingDuration=" + this.e + ", onLifecycleOnPause=" + this.f + ")";
    }

    public /* synthetic */ dmgv(fdau fdauVar, fdap fdapVar, fdap fdapVar2, dmgo dmgoVar, fdap fdapVar3, int i) {
        fdauVar = (i & 1) != 0 ? new dmgr(null) : fdauVar;
        fdapVar = (i & 2) != 0 ? new dmgs(null) : fdapVar;
        fdapVar2 = (i & 4) != 0 ? new fdap() { // from class: dmgq
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                ((lvj) obj).getClass();
                return fctx.a;
            }
        } : fdapVar2;
        dmgoVar = (i & 8) != 0 ? new dmgt() : dmgoVar;
        Duration durationG = (i & 16) != 0 ? eoob.g(3) : null;
        fdapVar3 = (i & 32) != 0 ? new dmgu(null) : fdapVar3;
        fdauVar.getClass();
        fdapVar.getClass();
        fdapVar2.getClass();
        dmgoVar.getClass();
        durationG.getClass();
        fdapVar3.getClass();
        this.a = fdauVar;
        this.b = fdapVar;
        this.c = fdapVar2;
        this.d = dmgoVar;
        this.e = durationG;
        this.f = fdapVar3;
    }
}
