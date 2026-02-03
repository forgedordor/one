package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ibe {
    public static final Integer a(hqz hqzVar, hnb hnbVar, int i, int i2) {
        Integer numA;
        while (true) {
            if (i >= i2) {
                return null;
            }
            int iC = hqzVar.c(i) + i;
            if (hqzVar.y(i) && hqzVar.b(i) == 206 && fdbq.f(hqzVar.m(i), hmz.e)) {
                Object objL = hqzVar.l(i, 0);
                hms hmsVar = objL instanceof hms ? (hms) objL : null;
                if (hmsVar != null && fdbq.f(hmsVar.a, hnbVar)) {
                    return Integer.valueOf(i);
                }
            }
            if (hqzVar.w(i) && (numA = a(hqzVar, hnbVar, i + 1, iC)) != null) {
                return Integer.valueOf(numA.intValue());
            }
            i = iC;
        }
    }

    public static final List b(hqz hqzVar, int i, Object obj) {
        ArrayList arrayList = new ArrayList();
        int iE = hqzVar.e(i);
        hlv hlvVarG = hqzVar.g(i);
        while (i >= 0) {
            ibd.a(hqzVar.a.b(i), obj);
            if (iE >= 0) {
                hlv hlvVar = hlvVarG;
                hlvVarG = hqzVar.g(iE);
                i = iE;
                iE = hqzVar.e(iE);
                obj = hlvVar;
            } else {
                i = iE;
                obj = hlvVarG;
            }
        }
        return arrayList;
    }

    public static final List d(hre hreVar, int i, Integer num) {
        int iL;
        cuu cuuVar;
        if (hreVar.t || hreVar.f() == 0) {
            return fcvo.a;
        }
        ArrayList arrayList = new ArrayList();
        if (num != null) {
            iL = num.intValue();
        } else {
            iL = hreVar.s;
            if (iL < 0) {
                iL = hreVar.l(i);
            }
        }
        int iQ = hreVar.i - hreVar.q(i);
        cuh cuhVar = hreVar.p;
        int i2 = 0;
        if (cuhVar != null && (cuuVar = (cuu) cuhVar.a(i)) != null) {
            i2 = cuuVar.c;
        }
        Object objValueOf = Integer.valueOf(iQ + i2);
        while (i >= 0) {
            ibd.a(hreVar.t(i), objValueOf);
            objValueOf = hreVar.r(i);
            if (iL >= 0) {
                int i3 = iL;
                iL = hreVar.l(iL);
                i = i3;
            } else {
                i = iL;
            }
        }
        return arrayList;
    }
}
