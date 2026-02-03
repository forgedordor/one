package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djis {
    public final fdae a;
    public final fdae b;
    public final fdae c;

    public djis(fdae fdaeVar, fdae fdaeVar2, fdae fdaeVar3) {
        this.a = fdaeVar;
        this.b = fdaeVar2;
        this.c = fdaeVar3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof djis)) {
            return false;
        }
        djis djisVar = (djis) obj;
        return fdbq.f(this.a, djisVar.a) && fdbq.f(this.b, djisVar.b) && fdbq.f(this.c, djisVar.c);
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "SwipeUpToLockRecordingUiData(onPrepare=" + this.a + ", onDispose=" + this.b + ", onSwipeToLockRecording=" + this.c + ")";
    }
}
