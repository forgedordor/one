package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dtjq {
    public final kcc a;
    public final int b;

    public dtjq(kcc kccVar) {
        kccVar.getClass();
        this.a = kccVar;
        this.b = 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dtjq)) {
            return false;
        }
        dtjq dtjqVar = (dtjq) obj;
        if (!fdbq.f(this.a, dtjqVar.a)) {
            return false;
        }
        int i = dtjqVar.b;
        return kbw.b(0, 0);
    }

    public final int hashCode() {
        return this.a.i * 31;
    }

    public final String toString() {
        return "GoogleSansConfig(weight=" + this.a + ", style=" + kbw.a(0) + ")";
    }
}
