package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hlb {
    public static final ics a(ics icsVar, boolean z, final String str) {
        return z ? jsh.c(icsVar, false, new fdap() { // from class: hke
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                jtk.e((jto) obj, str);
                return fctx.a;
            }
        }) : icsVar;
    }

    public static final ics b(ics icsVar, final ijh ijhVar, final ikp ikpVar) {
        return ifb.b(icsVar, new fdap() { // from class: hkg
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                iew iewVar = (iew) obj;
                final ijz ijzVarA = ikpVar.a(iewVar.a(), iewVar.q(), iewVar);
                final ijh ijhVar2 = ijhVar;
                return iewVar.b(new fdap() { // from class: hkf
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj2) {
                        ika.c((imz) obj2, ijzVarA, ijhVar2.a());
                        return fctx.a;
                    }
                });
            }
        });
    }

    public static final ics c(ics icsVar, final fdae fdaeVar) {
        return iwl.a(icsVar, new fdau() { // from class: hkd
            @Override // defpackage.fdau
            public final Object a(Object obj, Object obj2, Object obj3) {
                ixp ixpVar = (ixp) obj;
                ixk ixkVar = (ixk) obj2;
                float f = ((kir) fdaeVar.invoke()).a;
                long j = ((kil) obj3).a;
                final iyl iylVarE = ixkVar.e(kil.m(j, 0, 0, kim.b(j, !kir.b(f, Float.NaN) ? ixpVar.ep(f) : 0), 0, 11));
                return ixpVar.ej(iylVarE.a, iylVarE.b, fcvp.a, new fdap() { // from class: hjx
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj4) {
                        ((iyk) obj4).s(iylVarE, 0, 0, 0.0f);
                        return fctx.a;
                    }
                });
            }
        });
    }

    public static final void d(long j, jyq jyqVar, fdat fdatVar, hml hmlVar, final int i) {
        int i2;
        final fdat fdatVar2;
        final jyq jyqVar2;
        final long j2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(396611577);
        if (i3 == 0) {
            i2 = (true != hmlVarC.C(j) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.D(jyqVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != hmlVarC.F(fdatVar) ? 128 : 256;
        }
        if (hmlVarC.J((i2 & 147) != 146, i2 & 1)) {
            hjt.a(j, jyqVar, fdatVar, hmlVarC, i2 & 1022);
            j2 = j;
            jyqVar2 = jyqVar;
            fdatVar2 = fdatVar;
        } else {
            fdatVar2 = fdatVar;
            jyqVar2 = jyqVar;
            j2 = j;
            hmlVarC.s();
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: hkh
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    long j3 = j2;
                    jyq jyqVar3 = jyqVar2;
                    hlb.d(j3, jyqVar3, fdatVar2, (hml) obj, hpy.a(i | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void e(final long j, final fdat fdatVar, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(590397809);
        if (i3 == 0) {
            i2 = (true != hmlVarC.C(j) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.F(fdatVar) ? 16 : 32;
        }
        if (hmlVarC.J((i2 & 19) != 18, i2 & 1)) {
            hnj.a(gea.a.c(new ije(j)), fdatVar, hmlVarC, (i2 & 112) | 8);
        } else {
            hmlVarC.s();
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: hjy
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    long j2 = j;
                    int i4 = i;
                    hlb.e(j2, fdatVar, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final float f(hml hmlVar) {
        long jI = glz.d(hmlVar).l.i();
        kce kceVar = hlq.a;
        long j = hlq.l;
        if (kjl.b(jI) != 4294967296L) {
            jI = j;
        }
        return ((kio) hmlVar.e(jmh.e)).eg(jI) / 2.0f;
    }

    public static final float g(hml hmlVar) {
        float f = ((kir) hmlVar.e(gks.c)).a;
        if (true == Float.isNaN(f)) {
            f = 0.0f;
        }
        return fddu.c((f - 24.0f) / 2.0f, 0.0f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:190:0x026b, code lost:
    
        if (r4 == 2) goto L194;
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x0296, code lost:
    
        if (r4 == 2) goto L206;
     */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x029e, code lost:
    
        throw new defpackage.fctg();
     */
    /* JADX WARN: Code restructure failed: missing block: B:212:0x02f1, code lost:
    
        if (r0 == 2) goto L213;
     */
    /* JADX WARN: Code restructure failed: missing block: B:222:0x0317, code lost:
    
        if (r0 == 2) goto L223;
     */
    /* JADX WARN: Code restructure failed: missing block: B:225:0x0320, code lost:
    
        throw new defpackage.fctg();
     */
    /* JADX WARN: Code restructure failed: missing block: B:234:0x0358, code lost:
    
        if (r3 == 2) goto L238;
     */
    /* JADX WARN: Code restructure failed: missing block: B:244:0x037e, code lost:
    
        if (r3 == 2) goto L250;
     */
    /* JADX WARN: Code restructure failed: missing block: B:247:0x0386, code lost:
    
        throw new defpackage.fctg();
     */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x037a  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x03cf  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x03d2  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x03e9  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x03ed  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x040f  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0412  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x042e  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0431  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0475  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x04c2  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x04cf  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x04e9  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x0512  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0515  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x0527  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x057e  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x059e  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x05a1  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x05b3  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x05d2  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x05d5  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x05ec  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x05ef  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x0606  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x0609  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x0617  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x0623  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x063b  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x0642  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x0658  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x0664  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x067c  */
    /* JADX WARN: Removed duplicated region for block: B:359:0x071b  */
    /* JADX WARN: Type inference failed for: r18v1, types: [dew, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r18v2, types: [dew, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r18v3, types: [dew, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r18v4, types: [dew, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r18v5, types: [dew, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void h(final int r43, final java.lang.CharSequence r44, final defpackage.fdat r45, final defpackage.gxw r46, final defpackage.fdau r47, final defpackage.fdat r48, final defpackage.fdat r49, final defpackage.fdat r50, final boolean r51, boolean r52, boolean r53, final defpackage.ebk r54, final defpackage.egc r55, final defpackage.gxi r56, defpackage.fdat r57, defpackage.hml r58, final int r59, final int r60) {
        /*
            Method dump skipped, instructions count: 1957
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hlb.h(int, java.lang.CharSequence, fdat, gxw, fdau, fdat, fdat, fdat, boolean, boolean, boolean, ebk, egc, gxi, fdat, hml, int, int):void");
    }
}
