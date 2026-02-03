package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class hsb {
    public static final fdpl a(fdae fdaeVar) {
        return new fdui(new hsa(fdaeVar, null));
    }

    public static final hsf b(fdpl fdplVar, Object obj, fcyh fcyhVar, hml hmlVar, int i) {
        if ((i & 2) != 0) {
            fcyhVar = fcyi.a;
        }
        boolean zF = hmlVar.F(fcyhVar) | hmlVar.F(fdplVar);
        Object objF = hmlVar.f();
        if (zF || objF == hmk.a) {
            objF = new hrx(fcyhVar, fdplVar, null);
            hmlVar.y(objF);
        }
        fdat fdatVar = (fdat) objF;
        Object objF2 = hmlVar.f();
        Object obj2 = hmk.a;
        if (objF2 == obj2) {
            Object hplVar = new hpl(obj, hsi.a);
            hmlVar.y(hplVar);
            objF2 = hplVar;
        }
        hox hoxVar = (hox) objF2;
        boolean zF2 = hmlVar.F(fdatVar);
        Object objF3 = hmlVar.f();
        if (zF2 || objF3 == obj2) {
            objF3 = new hrr(fdatVar, hoxVar, null);
            hmlVar.y(objF3);
        }
        hob.f(fdplVar, fcyhVar, (fdat) objF3, hmlVar);
        return hoxVar;
    }
}
