package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wfl {
    public final djrr a;
    public final fdae b;

    public wfl(djrr djrrVar, fdae fdaeVar) {
        djrrVar.getClass();
        this.a = djrrVar;
        this.b = fdaeVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wfl)) {
            return false;
        }
        wfl wflVar = (wfl) obj;
        return this.a == wflVar.a && fdbq.f(this.b, wflVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "DirectSendImageCompressionUiData(selectedIconData=" + this.a + ", onTuneButtonClick=" + this.b + ")";
    }
}
