package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class evz {
    public static final fcti a;

    static {
        fcvo fcvoVar = fcvo.a;
        a = new fcti(fcvoVar, fcvoVar);
    }

    public static final void a(final juo juoVar, final List list, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-1794596951);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(juoVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        char c = ' ';
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.F(list) ? 16 : 32;
        }
        if (hmlVarC.J((i2 & 19) != 18, i2 & 1)) {
            int size = list.size();
            int i4 = 0;
            while (i4 < size) {
                jum jumVar = (jum) list.get(i4);
                fdau fdauVar = (fdau) jumVar.a;
                int i5 = jumVar.b;
                int i6 = jumVar.c;
                hmw hmwVar = (hmw) hmlVarC;
                Object objS = hmwVar.S();
                if (objS == hmk.a) {
                    objS = evy.a;
                    hmwVar.af(objS);
                }
                ixm ixmVar = (ixm) objS;
                ico icoVar = ics.e;
                long jB = hmg.b(hmlVarC);
                long j = jB ^ (jB >>> c);
                hxi hxiVarAk = hmwVar.ak();
                ics icsVarB = icj.b(hmlVarC, icoVar);
                fdae fdaeVar = jbb.a;
                hmlVarC.x();
                int i7 = size;
                if (hmwVar.z) {
                    hmlVarC.j(fdaeVar);
                } else {
                    hmlVarC.z();
                }
                int i8 = (int) j;
                hsk.b(hmlVarC, ixmVar, jbb.e);
                hsk.b(hmlVarC, hxiVarAk, jbb.d);
                fdat fdatVar = jbb.f;
                if (hmwVar.z || !fdbq.f(hmwVar.S(), Integer.valueOf(i8))) {
                    Integer numValueOf = Integer.valueOf(i8);
                    hmwVar.af(numValueOf);
                    hmlVarC.h(numValueOf, fdatVar);
                }
                hsk.b(hmlVarC, icsVarB, jbb.c);
                fdauVar.a(juoVar.subSequence(i5, i6).b, hmlVarC, 0);
                hmlVarC.n();
                i4++;
                size = i7;
                c = ' ';
            }
        } else {
            hmlVarC.s();
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: evw
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    juo juoVar2 = juoVar;
                    int i9 = i;
                    evz.a(juoVar2, list, (hml) obj, hpy.a(i9 | 1));
                    return fctx.a;
                }
            };
        }
    }
}
