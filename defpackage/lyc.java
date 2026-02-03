package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lyc {
    public static final hsf a(fdvc fdvcVar, hml hmlVar) {
        lvj lvjVar = (lvj) hmlVar.e(lyj.a);
        lvb lvbVar = lvb.d;
        fcyi fcyiVar = fcyi.a;
        Object objC = fdvcVar.c();
        lvc lvcVarP = lvjVar.P();
        Object[] objArr = {fdvcVar, lvcVarP, lvbVar, fcyiVar};
        boolean zF = hmlVar.F(lvcVarP) | hmlVar.B(lvbVar.ordinal()) | hmlVar.F(fcyiVar) | hmlVar.F(fdvcVar);
        Object objF = hmlVar.f();
        if (zF || objF == hmk.a) {
            Object lybVar = new lyb(lvcVarP, lvbVar, fcyiVar, fdvcVar, null);
            hmlVar.y(lybVar);
            objF = lybVar;
        }
        fdat fdatVar = (fdat) objF;
        Object objF2 = hmlVar.f();
        Object obj = hmk.a;
        if (objF2 == obj) {
            Object hplVar = new hpl(objC, hsi.a);
            hmlVar.y(hplVar);
            objF2 = hplVar;
        }
        hox hoxVar = (hox) objF2;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, 4);
        boolean zF2 = hmlVar.F(fdatVar);
        Object objF3 = hmlVar.f();
        if (zF2 || objF3 == obj) {
            objF3 = new hrs(fdatVar, hoxVar, null);
            hmlVar.y(objF3);
        }
        hob.h(objArrCopyOf, (fdat) objF3, hmlVar);
        return hoxVar;
    }
}
