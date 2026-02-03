package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class htr extends hty {
    public static final htr a = new htr();

    private htr() {
        super(1, 0, 2);
    }

    @Override // defpackage.hty
    protected final void a(hud hudVar, hlw hlwVar, hre hreVar, hqs hqsVar, htz htzVar) {
        int iG;
        int iA = hudVar.a(0);
        int iG2 = hreVar.g();
        int i = hreVar.s;
        int iQ = hreVar.q(i);
        int iC = hreVar.c(hreVar.b, hreVar.h(i + 1));
        for (int iMax = Math.max(iQ, iC - iA); iMax < iC; iMax++) {
            Object obj = hreVar.c[hreVar.d(iMax)];
            if (obj instanceof hqu) {
                int i2 = iG2 - iMax;
                hqu hquVar = (hqu) obj;
                hlv hlvVar = hquVar.b;
                int iA2 = -1;
                if (hlvVar == null || !hlvVar.a()) {
                    iG = -1;
                } else {
                    iA2 = hreVar.a(hlvVar);
                    iG = hreVar.g() - hreVar.p(iA2);
                }
                hqsVar.a(hquVar, i2, iA2, iG);
            } else if (obj instanceof hpx) {
                ((hpx) obj).b();
            }
        }
        if (iA <= 0) {
            hmz.j("Check failed");
        }
        int i3 = hreVar.s;
        int iN = hreVar.n(hreVar.b, hreVar.h(i3));
        int iC2 = hreVar.c(hreVar.b, hreVar.h(i3 + 1)) - iA;
        if (iC2 < iN) {
            hmz.j("Check failed");
        }
        hreVar.J(iC2, iA, i3);
        int i4 = hreVar.i;
        if (i4 >= iN) {
            hreVar.i = i4 - iA;
        }
    }
}
