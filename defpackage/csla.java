package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class csla {
    private final String a;
    private final sck b;
    private final csdo c;
    private final int d;

    public csla(int i, String str, sck sckVar) {
        this.d = i;
        this.a = str;
        this.b = sckVar;
        cczv cczvVar = csli.a;
        this.c = cskz.c(i);
    }

    public static /* synthetic */ csdd a(csla cslaVar, Integer num, boolean z, int i) {
        if (z && ((i & 2) == 0)) {
            return new csdd(cslaVar.c(), cslaVar.c, cslaVar.d(), null, cslaVar.b(), 8);
        }
        if (1 == (i & 1)) {
            num = null;
        }
        eoff eoffVarC = cslaVar.c();
        csdo csdoVar = cslaVar.c;
        String strD = cslaVar.d();
        cczv cczvVar = csli.a;
        return new csdd(eoffVarC, csdoVar, strD, cskz.b(cslaVar.c(), cslaVar.d, num), cslaVar.b());
    }

    private final csdb b() {
        sck sckVar = this.b;
        if (sckVar != null) {
            return new csdb(sckVar);
        }
        return null;
    }

    private final eoff c() {
        return this.c.compareTo(csdo.a) > 0 ? eoff.SPAM : eoff.NO_VERDICT;
    }

    private final String d() {
        String str = this.a;
        if (str == null || str.length() == 0) {
            return null;
        }
        return str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof csla)) {
            return false;
        }
        csla cslaVar = (csla) obj;
        return this.d == cslaVar.d && fdbq.f(this.a, cslaVar.a) && fdbq.f(this.b, cslaVar.b);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = str == null ? 0 : str.hashCode();
        int i = this.d;
        sck sckVar = this.b;
        return (((i * 31) + iHashCode) * 31) + (sckVar != null ? sckVar.hashCode() : 0);
    }

    public final String toString() {
        return "LinkCheckResult(action=" + ((Object) felu.b(this.d)) + ", initiatedBy=" + this.a + ", serverInfoParams=" + this.b + ")";
    }
}
