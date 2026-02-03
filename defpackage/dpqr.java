package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dpqr {
    public static final ics a(ics icsVar, edk edkVar, dppy dppyVar, hml hmlVar) {
        icsVar.getClass();
        hmlVar.v(-1469461224);
        float fD = edkVar.d();
        float fC = edkVar.c();
        float fD2 = dppyVar.d();
        float fC2 = dppyVar.c();
        kio kioVar = (kio) hmlVar.e(jmh.e);
        hmlVar.v(-1224400529);
        boolean zA = hmlVar.A(fD2) | hmlVar.A(fC2) | hmlVar.A(fD) | hmlVar.A(fC);
        Object objF = hmlVar.f();
        if (zA || objF == hmk.a) {
            int iEn = (int) kioVar.en(fD);
            int iEn2 = (int) kioVar.en(fC);
            float fD3 = fddu.d(Math.min(iEn / fD2, iEn2 / fC2), 3.0f);
            objF = new kiw(kis.a(((kir) fddu.o(new kir(kioVar.eh(fD2 * fD3)), new kir(kioVar.el(iEn)))).a, ((kir) fddu.o(new kir(kioVar.eh(fC2 * fD3)), new kir(kioVar.el(iEn2)))).a));
            hmlVar.y(objF);
        }
        long j = ((kiw) objF).a;
        hmlVar.o();
        ics icsVarL = egq.l(icsVar, j);
        hmlVar.o();
        return icsVarL;
    }
}
