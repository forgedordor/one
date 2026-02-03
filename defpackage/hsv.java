package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hsv extends hty {
    public static final hsv a = new hsv();

    private hsv() {
        super(0, 2, 1);
    }

    @Override // defpackage.hty
    protected final void a(hud hudVar, hlw hlwVar, hre hreVar, hqs hqsVar, htz htzVar) {
        int i;
        hxg hxgVar = (hxg) hudVar.c(0);
        int iA = hreVar.a((hlv) hudVar.c(1));
        if (hreVar.q >= iA) {
            hmz.j("Check failed");
        }
        huc.a(hreVar, hlwVar, iA);
        int i2 = hreVar.q;
        int iL = hreVar.s;
        while (iL >= 0 && !hreVar.T(iL)) {
            iL = hreVar.l(iL);
        }
        int iJ = iL + 1;
        int iM = 0;
        while (iJ < i2) {
            if (hreVar.S(i2, iJ)) {
                if (true == hreVar.T(iJ)) {
                    iM = 0;
                }
                iJ++;
            } else {
                iM += hreVar.T(iJ) ? 1 : hreVar.k(iJ);
                iJ += hreVar.j(iJ);
            }
        }
        while (true) {
            i = hreVar.q;
            if (i >= iA) {
                break;
            }
            if (hreVar.S(iA, i)) {
                int i3 = hreVar.q;
                if (i3 < hreVar.r && (hreVar.b[(hreVar.h(i3) * 5) + 1] & 1073741824) != 0) {
                    hlwVar.d(hreVar.w(i3));
                    iM = 0;
                }
                hreVar.M();
            } else {
                iM += hreVar.m();
            }
        }
        if (i != iA) {
            hmz.j("Check failed");
        }
        hxgVar.a = iM;
    }
}
