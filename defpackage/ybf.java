package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ybf {
    public final ekgb a;
    public final boolean b;
    public final boolean c;
    public final fdae d;

    public ybf(ekgb ekgbVar, boolean z, boolean z2, fdae fdaeVar) {
        ekgbVar.getClass();
        this.a = ekgbVar;
        this.b = z;
        this.c = z2;
        this.d = fdaeVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ybf)) {
            return false;
        }
        ybf ybfVar = (ybf) obj;
        return fdbq.f(this.a, ybfVar.a) && this.b == ybfVar.b && this.c == ybfVar.c && fdbq.f(this.d, ybfVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        fdae fdaeVar = this.d;
        return ((((iHashCode + ybe.a(this.b)) * 31) + ybe.a(this.c)) * 31) + fdaeVar.hashCode();
    }

    public final String toString() {
        return "ReplyOverlayUiData(replies=" + this.a + ", overflow=" + this.b + ", isEnabled=" + this.c + ", onClose=" + this.d + ")";
    }
}
