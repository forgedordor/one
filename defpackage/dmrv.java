package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dmrv {
    public final dzub a;
    public final String b;

    public dmrv(dzub dzubVar, String str) {
        this.a = dzubVar;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dmrv)) {
            return false;
        }
        dmrv dmrvVar = (dmrv) obj;
        return fdbq.f(this.a, dmrvVar.a) && fdbq.f(this.b, dmrvVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "EffectsTimerEvent(timerEvent=" + this.a + ", effectId=" + this.b + ")";
    }
}
