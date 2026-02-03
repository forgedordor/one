package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dxb {
    public static final dvj a(hml hmlVar) {
        dep depVarA = ddi.a(hmlVar);
        boolean zD = hmlVar.D(depVarA);
        hmw hmwVar = (hmw) hmlVar;
        Object objS = hmwVar.S();
        if (zD || objS == hmk.a) {
            objS = new dsz(depVarA);
            hmwVar.af(objS);
        }
        return (dsz) objS;
    }
}
