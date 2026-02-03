package defpackage;

import androidx.window.extensions.layout.WindowLayoutComponent;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pwv {
    public static final fctc a;

    static {
        int i = fdcj.a;
        new fdbi(pww.class).c();
        a = fctd.a(new fdae() { // from class: pwu
            @Override // defpackage.fdae
            public final Object invoke() {
                WindowLayoutComponent windowLayoutComponentA;
                fctc fctcVar = pwv.a;
                try {
                    ClassLoader classLoader = pww.class.getClassLoader();
                    pwt pwtVar = classLoader != null ? new pwt(classLoader, new prm(classLoader)) : null;
                    if (pwtVar != null && (windowLayoutComponentA = pwtVar.a()) != null) {
                        prm prmVar = new prm(classLoader);
                        int i2 = prn.a;
                        int iA = prn.a();
                        return iA >= 9 ? new pxp(windowLayoutComponentA, prmVar) : iA >= 6 ? new pxo(windowLayoutComponentA, prmVar) : iA >= 2 ? new pxn(windowLayoutComponentA, prmVar) : iA == 1 ? new pxm(windowLayoutComponentA, prmVar) : new pxk();
                    }
                } catch (Throwable unused) {
                }
                return null;
            }
        });
    }
}
