package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ebg {
    public static final hsf a(ebk ebkVar, hml hmlVar, int i) {
        Object objF = hmlVar.f();
        Object obj = hmk.a;
        if (objF == obj) {
            hpl hplVar = new hpl(false, hsi.a);
            hmlVar.y(hplVar);
            objF = hplVar;
        }
        hox hoxVar = (hox) objF;
        boolean z = (((i & 14) ^ 6) > 4 && hmlVar.D(ebkVar)) || (i & 6) == 4;
        Object objF2 = hmlVar.f();
        if (z || objF2 == obj) {
            objF2 = new ebf(ebkVar, hoxVar, null);
            hmlVar.y(objF2);
        }
        hob.g(ebkVar, (fdat) objF2, hmlVar);
        return hoxVar;
    }
}
