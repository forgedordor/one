package defpackage;

import android.view.ViewConfiguration;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ddi {
    public static final float a = ViewConfiguration.getScrollFriction();

    public static final dep a(hml hmlVar) {
        kio kioVar = (kio) hmlVar.e(jmh.e);
        boolean zA = hmlVar.A(kioVar.ed());
        Object objF = hmlVar.f();
        if (zA || objF == hmk.a) {
            objF = new dep(new ddh(kioVar));
            hmlVar.y(objF);
        }
        return (dep) objF;
    }
}
