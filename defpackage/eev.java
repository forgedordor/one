package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eev {
    public ixk a;
    public ixk b;
    public final int c = 2;
    private final int d = 0;
    private final int e = 0;

    public final void a(ivt ivtVar, ivt ivtVar2, long j) {
        long jB = efx.b(j);
        if (ivtVar != null) {
            eeq.d(ivtVar, eeq.e(ivtVar, kil.a(jB)));
            this.a = ivtVar instanceof ixk ? (ixk) ivtVar : null;
        }
        if (ivtVar2 != null) {
            eeq.d(ivtVar2, eeq.e(ivtVar2, kil.a(jB)));
            this.b = ivtVar2 instanceof ixk ? (ixk) ivtVar2 : null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eev)) {
            return false;
        }
        eev eevVar = (eev) obj;
        int i = eevVar.c;
        int i2 = eevVar.d;
        int i3 = eevVar.e;
        return true;
    }

    public final int hashCode() {
        return 1922;
    }

    public final String toString() {
        return "FlowLayoutOverflowState(type=Clip, minLinesToShowCollapse=0, minCrossAxisSizeToShowCollapse=0)";
    }
}
