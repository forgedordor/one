package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dkpg implements dkpi {
    public final int a;
    private final Boolean b = null;
    private final int c = 1;

    public dkpg(int i) {
        this.a = i;
    }

    @Override // defpackage.dkpi
    public final Boolean a() {
        return null;
    }

    @Override // defpackage.dkpi
    public final int b() {
        return 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dkpg)) {
            return false;
        }
        dkpg dkpgVar = (dkpg) obj;
        if (this.a != dkpgVar.a) {
            return false;
        }
        Boolean bool = dkpgVar.b;
        if (!fdbq.f(null, null)) {
            return false;
        }
        int i = dkpgVar.c;
        return true;
    }

    public final int hashCode() {
        return (this.a * 961) + 1;
    }

    public final String toString() {
        return "Overflow(count=" + this.a + ", forceClipToCircle=null, monogramBadge=NONE)";
    }
}
