package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djnw {
    public static final void a(final ics icsVar, final djmv djmvVar, hml hmlVar, final int i) {
        int i2;
        hml hmlVar2;
        icsVar.getClass();
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-977599828);
        if (i3 == 0) {
            i2 = i | (true != hmlVarC.D(icsVar) ? 2 : 4);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.D(djmvVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && hmlVarC.I()) {
            hmlVarC.s();
            hmlVar2 = hmlVarC;
        } else {
            String str = djmvVar.a;
            fdae fdaeVar = djmvVar.f;
            dktq dktqVar = djmvVar.e;
            hmlVarC.v(1124418611);
            hwv hwvVarD = dktqVar == null ? null : hxe.d(1619950758, new djnr(dktqVar), hmlVarC);
            ((hmw) hmlVarC).ab();
            hmlVar2 = hmlVarC;
            dtcp.a(fdaeVar, hxe.d(-319590556, new djns(djmvVar), hmlVarC), icsVar, hwvVarD, hxe.d(1388464257, new djnt(djmvVar), hmlVarC), hxe.d(526160096, new djnu(str), hmlVarC), hxe.d(-336144065, new djnv(djmvVar), hmlVarC), null, 0L, 0.0f, 0L, 0L, 0L, null, hmlVar2, ((i2 << 6) & 896) | 1794096, 0, 16256);
        }
        hpx hpxVarL = hmlVar2.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: djnp
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    ics icsVar2 = icsVar;
                    int i4 = i;
                    djnw.a(icsVar2, djmvVar, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void b(final djmu djmuVar, hml hmlVar, final int i) {
        int i2;
        hml hmlVar2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(1322571187);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(djmuVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && hmlVarC.I()) {
            hmlVarC.s();
            hmlVar2 = hmlVarC;
        } else {
            hmlVarC.v(-1311348412);
            hmlVar2 = hmlVarC;
            djrv.a(djmuVar.a, null, egq.k(ics.e, 64.0f), null, null, null, null, null, 0.0f, null, null, null, "verification_dialog_glide_icon", null, null, null, hmlVar2, 432, 196608, 491512);
            ((hmw) hmlVar2).ab();
        }
        hpx hpxVarL = hmlVar2.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: djnq
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    djnw.b(djmuVar, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }
}
