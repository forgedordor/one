package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class oxr {
    public static final orq a;
    private static final oro b;

    static {
        oro oroVar = new oro(false);
        b = oroVar;
        a = new orq(orn.a, oroVar, oroVar);
    }

    public static final oxm a(fdpl fdplVar, fcyh fcyhVar, hml hmlVar, int i) {
        hmlVar.w(388053246);
        if (i != 0) {
            fcyhVar = fcyi.a;
        }
        hmlVar.w(5004770);
        boolean zD = hmlVar.D(fdplVar);
        hmw hmwVar = (hmw) hmlVar;
        Object objS = hmwVar.S();
        if (zD || objS == hmk.a) {
            objS = new oxm(fdplVar);
            hmwVar.af(objS);
        }
        oxm oxmVar = (oxm) objS;
        hmwVar.ab();
        hmlVar.w(-1633490746);
        boolean zF = hmlVar.F(fcyhVar) | hmlVar.F(oxmVar);
        Object objS2 = hmwVar.S();
        if (zF || objS2 == hmk.a) {
            objS2 = new oxo(fcyhVar, oxmVar, null);
            hmwVar.af(objS2);
        }
        hmwVar.ab();
        hob.g(oxmVar, (fdat) objS2, hmlVar);
        hmlVar.w(-1633490746);
        boolean zF2 = hmlVar.F(fcyhVar) | hmlVar.F(oxmVar);
        Object objS3 = hmwVar.S();
        if (zF2 || objS3 == hmk.a) {
            objS3 = new oxq(fcyhVar, oxmVar, null);
            hmwVar.af(objS3);
        }
        hmwVar.ab();
        hob.g(oxmVar, (fdat) objS3, hmlVar);
        hmwVar.ab();
        return oxmVar;
    }
}
