package defpackage;

import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eiiy {
    @fcsv
    public static eieu a(String str) {
        return k(str);
    }

    public static eiev b(eiew eiewVar) {
        eiev eievVarD = eiev.d(2);
        for (eifn eifnVarC = eidc.c(); eifnVarC != null; eifnVarC = eifnVarC.a()) {
            eievVarD = eifnVarC.j(eiewVar);
            if (eievVarD.c() - 1 == 0) {
                break;
            }
        }
        return eievVarD;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0030, code lost:
    
        r2 = r0.j(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003a, code lost:
    
        if ((r2.c() - 1) == 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003c, code lost:
    
        r0 = r0.a();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.eiev c(defpackage.eiew r5) {
        /*
            eifn r0 = defpackage.eidc.c()
            java.util.List r1 = defpackage.eicf.c
            if (r0 != 0) goto Le
            r5 = 2
            eiev r5 = defpackage.eiev.d(r5)
            return r5
        Le:
            r2 = 3
            eiev r2 = defpackage.eiev.d(r2)
        L13:
            if (r0 == 0) goto L41
            java.util.Iterator r3 = r1.iterator()
        L19:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L30
            java.lang.Object r4 = r3.next()
            eiew r4 = (defpackage.eiew) r4
            eiev r4 = r0.j(r4)
            boolean r4 = r4.b()
            if (r4 == 0) goto L19
            goto L41
        L30:
            eiev r2 = r0.j(r5)
            int r3 = r2.c()
            int r3 = r3 + (-1)
            if (r3 == 0) goto L41
            eifn r0 = r0.a()
            goto L13
        L41:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eiiy.c(eiew):eiev");
    }

    public static String d() {
        eifn eifnVarC = eidc.c();
        return eifnVarC == null ? "<no trace>" : eidc.o(eifnVarC);
    }

    public static void e() {
        eidc.z(false);
    }

    public static boolean f(eifn eifnVar) {
        return (eifnVar == null || (eifnVar instanceof eicp) || (eifnVar instanceof eidy) || (eifnVar instanceof eieo) || (eifnVar instanceof eied)) ? false : true;
    }

    public static eieu g(String str, int i, Class cls, String str2) {
        return k(cls.getName() + ": " + str2);
    }

    @fcsv
    public static eieu h(String str) {
        return k(str);
    }

    public static eieu i(String str, eiez eiezVar, boolean z) {
        boolean z2;
        eifn eifnVarI;
        boolean z3;
        eidw eidwVar;
        eifi eifiVarB = eidc.b();
        eifn eifnVar = eifiVarB.c;
        if (eifnVar == eieo.a) {
            eifnVar = null;
            eidc.h(eifiVarB, null);
            z2 = true;
        } else {
            z2 = false;
        }
        boolean z4 = z2;
        if (eifnVar == null) {
            UUID uuidB = eidg.a.b();
            String strHo = eibd.ho(uuidB);
            if (eifo.a()) {
                eicn eicnVar = new eicn();
                eidw.m();
                z3 = z;
                eidwVar = new eidw(uuidB, strHo, str, eiezVar, eicnVar, z3, eidc.u(eicnVar), eifiVarB);
            } else {
                z3 = z;
                eicn eicnVar2 = eidu.a;
                eidw.m();
                eidwVar = new eidw(uuidB, strHo, str, eiezVar, eicnVar2, z3, false, eifiVarB);
            }
            boolean z5 = eidwVar.a;
            eifnVarI = eidwVar;
            eifnVarI = eidwVar;
            if (!z5 && z3) {
                eidc.y();
                eifnVarI = eidwVar;
            }
        } else {
            eifnVarI = eifnVar instanceof eicp ? ((eicp) eifnVar).i(str, eiezVar, z, eifiVarB) : eifnVar.s(str, eiezVar, eifiVarB);
        }
        eidc.h(eifiVarB, eifnVarI);
        return new eieu(eifnVarI, z4);
    }

    public static eieu j(String str, eiez eiezVar) {
        return i(str, eiezVar, true);
    }

    public static eieu k(String str) {
        return j(str, eiey.a);
    }
}
