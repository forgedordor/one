package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cuci {
    public final dloh a;
    public final boolean b;

    public cuci(dloh dlohVar, boolean z) {
        this.a = dlohVar;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cuci)) {
            return false;
        }
        cuci cuciVar = (cuci) obj;
        return fdbq.f(this.a, cuciVar.a) && this.b == cuciVar.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + (true != this.b ? 1237 : 1231);
    }

    public final String toString() {
        return "ExtendedTopAppBarUiData(topAppBarUiData=" + this.a + ", overrideSystemBack=" + this.b + ")";
    }
}
