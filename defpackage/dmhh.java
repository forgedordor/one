package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dmhh implements dmhi {
    private final fdau a;
    private final fdap b;
    private final dmgo c;
    private final Duration d;
    private final fdap e;

    public dmhh(fdau fdauVar, fdap fdapVar, dmgo dmgoVar, Duration duration, fdap fdapVar2) {
        this.a = fdauVar;
        this.b = fdapVar;
        this.c = dmgoVar;
        this.d = duration;
        this.e = fdapVar2;
    }

    @Override // defpackage.dmhi
    public final Duration a() {
        return this.d;
    }

    @Override // defpackage.dmhi
    public final fdap b() {
        return this.b;
    }

    @Override // defpackage.dmhi
    public final fdap c() {
        return this.e;
    }

    @Override // defpackage.dmhi
    public final fdau d() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dmhh)) {
            return false;
        }
        dmhh dmhhVar = (dmhh) obj;
        return fdbq.f(this.a, dmhhVar.a) && fdbq.f(this.b, dmhhVar.b) && fdbq.f(this.c, dmhhVar.c) && fdbq.f(this.d, dmhhVar.d) && fdbq.f(this.e, dmhhVar.e);
    }

    public final int hashCode() {
        return (((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode();
    }

    public final String toString() {
        return "Recording(bind=" + this.a + ", onCancel=" + this.b + ", recordingActions=" + this.c + ", maxRecordingDuration=" + this.d + ", onLifecycleOnPause=" + this.e + ")";
    }

    public dmhh() {
        this(new dmhd(null), new dmhe(null), new dmhf(), eoob.g(3), new dmhg(null));
    }
}
