package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eor {
    public static final void a(final fdae fdaeVar, final ics icsVar, final epj epjVar, final fdat fdatVar, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(2002163445);
        if (i3 == 0) {
            i2 = (true != hmlVarC.F(fdaeVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.D(icsVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != hmlVarC.D(epjVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != hmlVarC.F(fdatVar) ? 1024 : 2048;
        }
        if (hmlVarC.J((i2 & 1171) != 1170, i2 & 1)) {
            eqo.a(hxe.d(-1488997347, new eoq(epjVar, icsVar, fdatVar, hsc.a(fdaeVar, hmlVarC)), hmlVarC), hmlVarC, 6);
        } else {
            hmlVarC.s();
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: eol
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    fdae fdaeVar2 = fdaeVar;
                    ics icsVar2 = icsVar;
                    epj epjVar2 = epjVar;
                    eor.a(fdaeVar2, icsVar2, epjVar2, fdatVar, (hml) obj, hpy.a(i | 1));
                    return fctx.a;
                }
            };
        }
    }
}
