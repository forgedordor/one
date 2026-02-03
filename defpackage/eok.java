package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class eok implements izo {
    private final eoe a;
    private final cuq b;

    public eok(eoe eoeVar) {
        this.a = eoeVar;
        int i = cvf.a;
        this.b = new cuq((byte[]) null);
    }

    @Override // defpackage.izo
    public final void a(izn iznVar) {
        cuq cuqVar = this.b;
        cuqVar.a();
        cuv cuvVar = iznVar.a;
        Object[] objArr = cuvVar.b;
        long[] jArr = cuvVar.c;
        int i = cuvVar.e;
        while (i != Integer.MAX_VALUE) {
            long j = jArr[i] >> 31;
            Object obj = objArr[i];
            Object objA = this.a.a(obj);
            int iG = cuqVar.g(objA, 0);
            int i2 = (int) (j & 2147483647L);
            if (iG == 7) {
                iznVar.remove(obj);
            } else {
                cuqVar.c(objA, iG + 1);
            }
            i = i2;
        }
    }

    @Override // defpackage.izo
    public final boolean b(Object obj, Object obj2) {
        eoe eoeVar = this.a;
        return fdbq.f(eoeVar.a(obj), eoeVar.a(obj2));
    }
}
