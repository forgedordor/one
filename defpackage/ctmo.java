package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctmo {
    public final int a;
    private final boolean b;

    public ctmo() {
        this(0, 3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ctmo)) {
            return false;
        }
        ctmo ctmoVar = (ctmo) obj;
        if (this.a != ctmoVar.a) {
            return false;
        }
        boolean z = ctmoVar.b;
        return true;
    }

    public final int hashCode() {
        return (this.a * 31) + 1237;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RcsCapabilitiesTrackingInfo(rcsCapabilitiesStatus=");
        int i = this.a;
        sb.append((Object) (i != 1 ? i != 2 ? "NOT_CAPABLE" : "CAPABLE" : "UNKNOWN"));
        sb.append(", isBackgroundRefresh=false)");
        return sb.toString();
    }

    public /* synthetic */ ctmo(int i, int i2) {
        i = 1 == (i2 & 1) ? 1 : i;
        if (i == 0) {
            throw null;
        }
        this.a = i;
        this.b = false;
    }
}
