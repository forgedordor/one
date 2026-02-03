package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dmrd implements dmri {
    public final Integer a;
    public final Throwable b;

    public dmrd(Integer num, Throwable th) {
        this.a = num;
        this.b = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dmrd)) {
            return false;
        }
        dmrd dmrdVar = (dmrd) obj;
        return fdbq.f(this.a, dmrdVar.a) && fdbq.f(this.b, dmrdVar.b);
    }

    public final int hashCode() {
        Integer num = this.a;
        int iHashCode = num == null ? 0 : num.hashCode();
        Throwable th = this.b;
        return (iHashCode * 31) + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        return "Finalize(error=" + this.a + ", cause=" + this.b + ")";
    }

    public dmrd() {
        this(null, null);
    }
}
