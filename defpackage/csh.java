package defpackage;

import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class csh {
    public static final float b(csg csgVar) {
        return ((csi) csgVar.a).b;
    }

    public static final float c(csg csgVar) {
        return ((csi) csgVar.a).a;
    }

    public static final void d(csg csgVar) {
        if (!csgVar.c()) {
            csgVar.a(0, 0, 0, 0);
            return;
        }
        float fB = b(csgVar);
        float fC = c(csgVar);
        int iCeil = (int) Math.ceil(csj.a(fB, fC, csgVar.b()));
        int iCeil2 = (int) Math.ceil(csj.b(fB, fC, csgVar.b()));
        csgVar.a(iCeil, iCeil2, iCeil, iCeil2);
    }

    public final void a(csg csgVar, float f) {
        Drawable drawable = csgVar.a;
        boolean zC = csgVar.c();
        boolean zB = csgVar.b();
        csi csiVar = (csi) drawable;
        if (f != csiVar.b || csiVar.c != zC || csiVar.d != zB) {
            csiVar.b = f;
            csiVar.c = zC;
            csiVar.d = zB;
            csiVar.b(null);
            csiVar.invalidateSelf();
        }
        d(csgVar);
    }
}
