package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dter {
    public static final egc a = efy.h(24.0f, 16.0f, 12.0f, 0.0f, 8);
    public static final egc b = efy.h(24.0f, 0.0f, 12.0f, 12.0f, 2);

    public static final void a(final ghy ghyVar, ics icsVar, gfd gfdVar, geq geqVar, fdat fdatVar, fdat fdatVar2, boolean z, hml hmlVar, final int i) {
        int i2;
        ics icsVar2;
        geq geqVarA;
        fdat fdatVarD;
        boolean z2;
        gfd gfdVar2;
        fdat fdatVarD2;
        final boolean z3;
        final fdat fdatVar3;
        final fdat fdatVar4;
        final geq geqVar2;
        final gfd gfdVar3;
        final ics icsVar3;
        ghyVar.getClass();
        hml hmlVarC = hmlVar.c(-151238119);
        if ((i & 6) == 0) {
            i2 = (true != hmlVarC.D(ghyVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if ((i & 384) == 0) {
            i3 = i2 | 176;
        }
        if ((i & 3072) == 0) {
            i3 |= 1024;
        }
        int i4 = 1794048 | i3;
        if ((599187 & i4) == 599186 && hmlVarC.I()) {
            hmlVarC.s();
            icsVar3 = icsVar;
            gfdVar3 = gfdVar;
            geqVar2 = geqVar;
            fdatVar4 = fdatVar;
            fdatVar3 = fdatVar2;
            z3 = z;
        } else {
            hmlVarC.t();
            if ((i & 1) == 0 || hmlVarC.G()) {
                icsVar2 = ics.e;
                hmlVarC.v(1849434622);
                hmw hmwVar = (hmw) hmlVarC;
                Object objS = hmwVar.S();
                if (objS == hmk.a) {
                    gev gevVar = gev.a;
                    objS = new gfd();
                    hmwVar.af(objS);
                }
                gfd gfdVar4 = (gfd) objS;
                hmwVar.ab();
                geqVarA = dtel.a(hmlVarC);
                fdatVarD = hxe.d(-1574577523, new dtep(ghyVar, geqVarA), hmlVarC);
                z2 = true;
                gfdVar2 = gfdVar4;
                fdatVarD2 = hxe.d(2056112311, new dteq(ghyVar, gfdVar4, geqVarA), hmlVarC);
            } else {
                hmlVarC.s();
                icsVar2 = icsVar;
                gfdVar2 = gfdVar;
                geqVarA = geqVar;
                fdatVarD = fdatVar;
                fdatVarD2 = fdatVar2;
                z2 = z;
            }
            hmlVarC.l();
            int i5 = 4186238 & i4;
            ics icsVar4 = icsVar2;
            geq geqVar3 = geqVarA;
            fdat fdatVar5 = fdatVarD;
            boolean z4 = z2;
            ghx.l(ghyVar, icsVar4, gfdVar2, geqVar3, fdatVar5, fdatVarD2, z4, null, hmlVarC, i5);
            z3 = z4;
            fdatVar3 = fdatVarD2;
            fdatVar4 = fdatVar5;
            geqVar2 = geqVar3;
            gfdVar3 = gfdVar2;
            icsVar3 = icsVar4;
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dteo
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    hml hmlVar2 = (hml) obj;
                    ((Integer) obj2).intValue();
                    ghy ghyVar2 = ghyVar;
                    ics icsVar5 = icsVar3;
                    gfd gfdVar5 = gfdVar3;
                    geq geqVar4 = geqVar2;
                    fdat fdatVar6 = fdatVar4;
                    int i6 = i;
                    dter.a(ghyVar2, icsVar5, gfdVar5, geqVar4, fdatVar6, fdatVar3, z3, hmlVar2, hpy.a(i6 | 1));
                    return fctx.a;
                }
            };
        }
    }
}
