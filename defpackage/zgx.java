package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zgx {
    public static final hpt a = new hsg(new fdae() { // from class: zgu
        @Override // defpackage.fdae
        public final Object invoke() {
            hpt hptVar = zgx.a;
            throw new IllegalStateException("VideoBubbleLoader must be provided");
        }
    });

    public static final void a(final zij zijVar, final eve eveVar, final Object obj, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(335509953);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(zijVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.D(eveVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != hmlVarC.F(obj) ? 128 : 256;
        }
        if ((i2 & 147) == 146 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            hmlVarC.t();
            if ((i & 1) != 0 && !hmlVarC.G()) {
                hmlVarC.s();
            }
            hmlVarC.l();
            hmlVarC.v(5004770);
            int i4 = i2 & 14;
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            if (i4 == 4 || objS == hmk.a) {
                objS = new zgv(zijVar, null);
                hmwVar.af(objS);
            }
            hmwVar.ab();
            hob.g(zijVar, (fdat) objS, hmlVarC);
            int iOrdinal = zijVar.e.ordinal();
            if (iOrdinal == 0) {
                hmlVarC.v(788384027);
                hmwVar.ab();
                hpx hpxVarL = hmlVarC.L();
                if (hpxVarL != null) {
                    hpxVarL.d = new fdat() { // from class: zgs
                        @Override // defpackage.fdat
                        public final Object a(Object obj2, Object obj3) {
                            ((Integer) obj3).intValue();
                            zij zijVar2 = zijVar;
                            int i5 = i;
                            eve eveVar2 = eveVar;
                            int iA = hpy.a(i5 | 1);
                            zgx.a(zijVar2, eveVar2, obj, (hml) obj2, iA);
                            return fctx.a;
                        }
                    };
                    return;
                }
                return;
            }
            if (iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3) {
                hmlVarC.v(302531200);
                String str = zijVar.f;
                String str2 = zijVar.g;
                String str3 = zijVar.j;
                dili diliVar = new dili(str, str2, str3 == null ? "" : str3, 4);
                boolean z = zijVar.k;
                dker dkerVar = zijVar.i;
                dioo.a(new diot(diliVar, new dios(dkerVar.a, dkerVar.c), str3, z, (fdae) null, 48), null, eveVar, hmlVarC, (i2 << 3) & 896, 2);
                hmwVar.ab();
            } else {
                hmlVarC.v(789256336);
                dknf.b(zijVar.d, null, hxe.d(-282188261, new zgw(zijVar, eveVar, obj), hmlVarC), hmlVarC, 384);
                hmwVar.ab();
            }
        }
        hpx hpxVarL2 = hmlVarC.L();
        if (hpxVarL2 != null) {
            hpxVarL2.d = new fdat() { // from class: zgt
                @Override // defpackage.fdat
                public final Object a(Object obj2, Object obj3) {
                    ((Integer) obj3).intValue();
                    zij zijVar2 = zijVar;
                    int i5 = i;
                    eve eveVar2 = eveVar;
                    int iA = hpy.a(i5 | 1);
                    zgx.a(zijVar2, eveVar2, obj, (hml) obj2, iA);
                    return fctx.a;
                }
            };
        }
    }
}
