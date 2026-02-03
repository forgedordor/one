package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djkv {
    public static final void a(final ics icsVar, final djmj djmjVar, hml hmlVar, final int i) {
        int i2;
        hwv hwvVarD;
        long jB;
        hml hmlVar2;
        icsVar.getClass();
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-1516118501);
        if (i3 == 0) {
            i2 = i | (true != hmlVarC.D(icsVar) ? 2 : 4);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.D(djmjVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && hmlVarC.I()) {
            hmlVarC.s();
            hmlVar2 = hmlVarC;
        } else {
            djrr djrrVar = djmjVar.c;
            String str = djmjVar.d;
            fdae fdaeVar = djmjVar.i;
            hmlVarC.v(-995958481);
            hwv hwvVarD2 = djrrVar == null ? null : hxe.d(2111198353, new djkl(djrrVar), hmlVarC);
            hmw hmwVar = (hmw) hmlVarC;
            hmwVar.ab();
            hmlVarC.v(-995955127);
            hwv hwvVarD3 = str != null ? hxe.d(1106741809, new djkn(str), hmlVarC) : null;
            hmwVar.ab();
            if (djmjVar.e) {
                hmlVarC.v(-809683762);
                hwvVarD = hxe.d(-859932344, new djkp(djmjVar), hmlVarC);
                hmwVar.ab();
            } else {
                hmlVarC.v(-809527987);
                hwvVarD = hxe.d(-1034530849, new djkq(djmjVar), hmlVarC);
                hmwVar.ab();
            }
            if (djmjVar.f) {
                hmlVarC.v(-809129482);
                jB = glz.a(hmlVarC).w;
                hmwVar.ab();
            } else {
                hmlVarC.v(-809074767);
                jB = dtcj.b(hmlVarC);
                hmwVar.ab();
            }
            hmlVar2 = hmlVarC;
            dtcp.a(fdaeVar, hxe.d(-1670386077, new djks(djmjVar), hmlVarC), icsVar, hxe.d(-1243831579, new djku(djmjVar), hmlVarC), hwvVarD2, hwvVarD3, hwvVarD, null, 0L, 0.0f, jB, 0L, 0L, null, hmlVar2, ((i2 << 6) & 896) | 3120, 0, 15232);
        }
        hpx hpxVarL = hmlVar2.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: djkk
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    ics icsVar2 = icsVar;
                    int i4 = i;
                    djkv.a(icsVar2, djmjVar, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }
}
