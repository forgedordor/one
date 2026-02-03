package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hsq extends hty {
    public static final hsq a = new hsq();

    private hsq() {
        super(0, 2, 1);
    }

    @Override // defpackage.hty
    protected final void a(hud hudVar, hlw hlwVar, hre hreVar, hqs hqsVar, htz htzVar) {
        hlv hlvVar = (hlv) hudVar.c(0);
        Object objC = hudVar.c(1);
        if (objC instanceof hqu) {
            hqsVar.b((hqu) objC);
        }
        if (hreVar.n != 0) {
            hmz.j("Can only append a slot if not current inserting");
        }
        int i = hreVar.i;
        int i2 = hreVar.j;
        int iA = hreVar.a(hlvVar);
        int iC = hreVar.c(hreVar.b, hreVar.h(iA + 1));
        hreVar.i = iC;
        hreVar.j = iC;
        hreVar.F(1, iA);
        if (i >= iC) {
            i++;
            i2++;
        }
        hreVar.c[iC] = objC;
        hreVar.i = i;
        hreVar.j = i2;
    }
}
