package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jyl {
    public static final jyk a(hml hmlVar) {
        kbi kbiVar = (kbi) hmlVar.e(jmh.g);
        kio kioVar = (kio) hmlVar.e(jmh.e);
        kji kjiVar = (kji) hmlVar.e(jmh.j);
        boolean zD = hmlVar.D(kbiVar) | hmlVar.D(kioVar) | hmlVar.B(kjiVar.ordinal()) | hmlVar.B(8);
        hmw hmwVar = (hmw) hmlVar;
        Object objS = hmwVar.S();
        if (zD || objS == hmk.a) {
            objS = new jyk(kbiVar, kioVar, kjiVar);
            hmwVar.af(objS);
        }
        return (jyk) objS;
    }
}
