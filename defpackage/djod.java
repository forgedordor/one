package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djod {
    public static final void a(final evxt evxtVar, final ddp ddpVar, hml hmlVar, final int i) {
        int i2;
        ddpVar.getClass();
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-41620519);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(evxtVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != ((i & 64) == 0 ? hmlVarC.D(ddpVar) : hmlVarC.F(ddpVar)) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            hmlVarC.v(-1633490746);
            boolean z = (i2 & 112) == 32 || ((i2 & 64) != 0 && hmlVarC.F(ddpVar));
            boolean z2 = (i2 & 14) == 4;
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            if ((z2 | z) || objS == hmk.a) {
                objS = new djob(ddpVar, evxtVar, null);
                hmwVar.af(objS);
            }
            hmwVar.ab();
            hob.f(evxtVar, ddpVar, (fdat) objS, hmlVarC);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: djnz
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    evxt evxtVar2 = evxtVar;
                    int i4 = i;
                    djod.a(evxtVar2, ddpVar, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void b(final evxt evxtVar, final ddp ddpVar, final long j, hml hmlVar, final int i) {
        int i2;
        ddpVar.getClass();
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-706631248);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(evxtVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != ((i & 64) == 0 ? hmlVarC.D(ddpVar) : hmlVarC.F(ddpVar)) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != hmlVarC.C(j) ? 128 : 256;
        }
        if ((i2 & 147) == 146 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            hmlVarC.v(-1746271574);
            boolean z = (i2 & 112) == 32 || ((i2 & 64) != 0 && hmlVarC.F(ddpVar));
            boolean z2 = (i2 & 14) == 4;
            boolean z3 = (i2 & 896) == 256;
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            if ((z2 | z | z3) || objS == hmk.a) {
                objS = new djoc(ddpVar, evxtVar, j, null);
                hmwVar.af(objS);
            }
            hmwVar.ab();
            hob.g(evxtVar, (fdat) objS, hmlVarC);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: djoa
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    evxt evxtVar2 = evxtVar;
                    ddp ddpVar2 = ddpVar;
                    djod.b(evxtVar2, ddpVar2, j, (hml) obj, hpy.a(i | 1));
                    return fctx.a;
                }
            };
        }
    }
}
