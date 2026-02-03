package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dtfb {
    public static final void a(gda gdaVar, gpe gpeVar, gsa gsaVar, hcr hcrVar, final fdat fdatVar, hml hmlVar, final int i) {
        int i2;
        hcr hcrVar2;
        final gda gdaVar2;
        final gsa gsaVar2;
        final gpe gpeVar2;
        fdatVar.getClass();
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(295511914);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(gdaVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= 16;
        }
        if ((i & 384) == 0) {
            i2 |= true != hmlVarC.D(gsaVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != hmlVarC.D(hcrVar) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != hmlVarC.F(fdatVar) ? 8192 : 16384;
        }
        if ((i2 & 9363) == 9362 && hmlVarC.I()) {
            hmlVarC.s();
            hcrVar2 = hcrVar;
            gsaVar2 = gsaVar;
            gpeVar2 = gpeVar;
            gdaVar2 = gdaVar;
        } else {
            hmlVarC.t();
            if ((i & 1) == 0 || hmlVarC.G()) {
                gpeVar = new dtgd();
            } else {
                hmlVarC.s();
            }
            gpe gpeVar3 = gpeVar;
            hmlVarC.l();
            hcrVar2 = hcrVar;
            gmg.a(gdaVar, gpeVar3, gsaVar, hcrVar2, hxe.d(-1166625323, new dtfa(dtff.c(gdaVar, hmlVarC), fdatVar), hmlVarC), hmlVarC, (i2 & 14) | 24576 | (i2 & 896) | (i2 & 7168));
            gdaVar2 = gdaVar;
            gsaVar2 = gsaVar;
            gpeVar2 = gpeVar3;
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            final hcr hcrVar3 = hcrVar2;
            hpxVarL.d = new fdat() { // from class: dtez
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    gda gdaVar3 = gdaVar2;
                    gpe gpeVar4 = gpeVar2;
                    gsa gsaVar3 = gsaVar2;
                    hcr hcrVar4 = hcrVar3;
                    dtfb.a(gdaVar3, gpeVar4, gsaVar3, hcrVar4, fdatVar, (hml) obj, hpy.a(i | 1));
                    return fctx.a;
                }
            };
        }
    }
}
