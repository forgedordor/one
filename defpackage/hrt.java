package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class hrt {
    public static final hsf a(Object obj, fdat fdatVar, hml hmlVar) {
        hmw hmwVar = (hmw) hmlVar;
        Object objS = hmwVar.S();
        Object obj2 = hmk.a;
        if (objS == obj2) {
            hpl hplVar = new hpl(obj, hsi.a);
            hmwVar.af(hplVar);
            objS = hplVar;
        }
        hox hoxVar = (hox) objS;
        fctx fctxVar = fctx.a;
        boolean zF = hmlVar.F(fdatVar);
        Object objS2 = hmwVar.S();
        if (zF || objS2 == obj2) {
            objS2 = new hrq(fdatVar, hoxVar, null);
            hmwVar.af(objS2);
        }
        hob.g(fctxVar, (fdat) objS2, hmlVar);
        return hoxVar;
    }
}
