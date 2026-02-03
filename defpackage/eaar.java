package defpackage;

import j$.util.DesugarCollections;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eaar {
    public static final eaar a = new eaar(eaan.a, eaaj.a);
    public final eaan b;
    public final eaaj c;

    private eaar(eaan eaanVar, eaaj eaajVar) {
        eaanVar.getClass();
        this.b = eaanVar;
        this.c = eaajVar;
    }

    public static eaar c(evqz evqzVar) throws evtj {
        long j;
        String strX;
        eaam eaamVar;
        int iK = evqzVar.k();
        if (iK > 1) {
            throw new evtj(a.e(iK, "Unsupported version: ", ". Current version is: 1"));
        }
        evqzVar.k();
        int iE = evqzVar.e(evqzVar.n());
        evrr evrrVar = evrr.a;
        evuq evuqVar = evuq.a;
        eaaj eaajVar = (eaaj) evsn.parseFrom(eaaj.a, evqzVar, evrr.a);
        evqzVar.A(iE);
        byte[] bArrF = evqzVar.F();
        eaal eaalVar = new eaal();
        try {
            eaalVar.a.setInput(bArrF);
            try {
                evqz evqzVarK = evqz.K(new eaak(eaalVar));
                eaan eaanVar = eaan.a;
                int iJ = evqzVarK.j();
                if (iJ < 0) {
                    throw new evtj("Negative number of flags");
                }
                ekii ekiiVar = new ekii(ekno.a);
                long j2 = 0;
                for (int i = 0; i < iJ; i++) {
                    long jR = evqzVarK.r();
                    int i2 = (int) jR;
                    long j3 = jR >>> 3;
                    if (j3 == 0) {
                        j = 0;
                        strX = evqzVarK.x();
                    } else {
                        long j4 = j3 + j2;
                        if (j4 > 2305843009213693951L) {
                            throw new evtj("Flag name larger than max size");
                        }
                        j = j4;
                        strX = null;
                    }
                    int i3 = i2 & 7;
                    if (i3 == 0 || i3 == 1) {
                        eaamVar = new eaam(j, strX, i3, 0L, null);
                    } else if (i3 == 2) {
                        eaamVar = new eaam(j, strX, i3, evqzVarK.r(), null);
                    } else if (i3 == 3) {
                        eaamVar = new eaam(j, strX, i3, Double.doubleToRawLongBits(evqzVarK.b()), null);
                    } else if (i3 == 4) {
                        eaamVar = new eaam(j, strX, i3, 0L, evqzVarK.x());
                    } else {
                        if (i3 != 5) {
                            throw new evtj("Unrecognized flag type " + i3);
                        }
                        eaamVar = new eaam(j, strX, i3, 0L, evqzVarK.F());
                    }
                    eaam eaamVar2 = eaamVar;
                    long j5 = eaamVar2.a;
                    if (j5 != 0) {
                        j2 = j5;
                    }
                    ekiiVar.m(eaamVar2);
                }
                eaan eaanVar2 = new eaan(ekiiVar.g());
                eaalVar.close();
                return new eaar(eaanVar2, eaajVar);
            } finally {
                eaalVar.a.reset();
            }
        } finally {
        }
    }

    public final long a() {
        return this.c.e;
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x021b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.eaan b() {
        /*
            Method dump skipped, instructions count: 723
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eaar.b():eaan");
    }

    public final evqs d() {
        return this.c.c;
    }

    public final String e() {
        return this.c.d;
    }

    public final String f() {
        return this.c.b;
    }

    public final Map g() {
        eaaj eaajVar = this.c;
        if (eaajVar.f.size() == 0) {
            return null;
        }
        return DesugarCollections.unmodifiableMap(eaajVar.f);
    }
}
