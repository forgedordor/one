package defpackage;

import androidx.compose.foundation.HoverableElement;
import com.android.vcard.VCardConfig;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gte {
    public static final gte a = new gte();
    private static final ikd b = new iik((byte[]) null);

    private gte() {
    }

    public static final void a(imz imzVar, dwm dwmVar, long j, long j2, long j3, float f, float f2) {
        ihw ihwVarA;
        int i = (int) (j2 >> 32);
        int i2 = (int) (j2 & 4294967295L);
        long jFloatToRawIntBits = (Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f) & 4294967295L);
        long jFloatToRawIntBits2 = (Float.floatToRawIntBits(f2) << 32) | (Float.floatToRawIntBits(f2) & 4294967295L);
        if (dwmVar == dwm.a) {
            float fIntBitsToFloat = Float.intBitsToFloat(i);
            float fIntBitsToFloat2 = Float.intBitsToFloat(i2);
            ihwVarA = ihx.a(ihv.a(j, (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32)), jFloatToRawIntBits, jFloatToRawIntBits, jFloatToRawIntBits2, jFloatToRawIntBits2);
        } else {
            float fIntBitsToFloat3 = Float.intBitsToFloat(i);
            float fIntBitsToFloat4 = Float.intBitsToFloat(i2);
            ihwVarA = ihx.a(ihv.a(j, (Float.floatToRawIntBits(fIntBitsToFloat4) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat3) << 32)), jFloatToRawIntBits, jFloatToRawIntBits2, jFloatToRawIntBits2, jFloatToRawIntBits);
        }
        ikd ikdVar = b;
        ikdVar.t(ihwVarA);
        imy.h(imzVar, ikdVar, j3, null, 60);
        ikdVar.l();
    }

    public static final gst b(gda gdaVar) {
        gst gstVar = gdaVar.ab;
        if (gstVar != null) {
            return gstVar;
        }
        long jF = gdd.f(gdaVar, 26);
        long jF2 = gdd.f(gdaVar, 26);
        long jF3 = gdd.f(gdaVar, 32);
        long jF4 = gdd.f(gdaVar, 32);
        long jF5 = gdd.f(gdaVar, 26);
        long jF6 = gdd.f(gdaVar, 18);
        long jH = ijg.h(ijg.f(ije.d(jF6), ije.c(jF6), ije.b(jF6), 0.38f, ije.f(jF6)), gdaVar.p);
        long jF7 = gdd.f(gdaVar, 18);
        long jF8 = ijg.f(ije.d(jF7), ije.c(jF7), ije.b(jF7), 0.38f, ije.f(jF7));
        long jF9 = gdd.f(gdaVar, 18);
        long jF10 = ijg.f(ije.d(jF9), ije.c(jF9), ije.b(jF9), 0.12f, ije.f(jF9));
        long jF11 = gdd.f(gdaVar, 18);
        long jF12 = ijg.f(ije.d(jF11), ije.c(jF11), ije.b(jF11), 0.12f, ije.f(jF11));
        long jF13 = gdd.f(gdaVar, 18);
        gst gstVar2 = new gst(jF, jF2, jF3, jF4, jF5, jH, jF8, jF10, jF12, ijg.f(ije.d(jF13), ije.c(jF13), ije.b(jF13), 0.38f, ije.f(jF13)));
        gdaVar.ab = gstVar2;
        return gstVar2;
    }

    public final void c(final ebk ebkVar, final ics icsVar, final gst gstVar, final boolean z, final long j, hml hmlVar, final int i) {
        int i2;
        gte gteVar;
        long jFloatToRawIntBits;
        hml hmlVarC = hmlVar.c(-290277409);
        if ((i & 6) == 0) {
            i2 = (true != hmlVarC.D(ebkVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.D(icsVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != hmlVarC.D(gstVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != hmlVarC.E(z) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != hmlVarC.C(j) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            gteVar = this;
            i2 |= true != hmlVarC.D(gteVar) ? 65536 : 131072;
        } else {
            gteVar = this;
        }
        if (hmlVarC.J((74899 & i2) != 74898, i2 & 1)) {
            hmlVarC.t();
            if ((i & 1) != 0 && !hmlVarC.G()) {
                hmlVarC.s();
            }
            hmlVarC.l();
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            Object obj = hmk.a;
            if (objS == obj) {
                objS = new iac();
                hmwVar.af(objS);
            }
            int i3 = i2 & 14;
            iac iacVar = (iac) objS;
            Object objS2 = hmwVar.S();
            if (i3 == 4 || objS2 == obj) {
                objS2 = new gtc(ebkVar, iacVar, null);
                hmwVar.af(objS2);
            }
            hob.g(ebkVar, (fdat) objS2, hmlVarC);
            if (iacVar.isEmpty()) {
                jFloatToRawIntBits = j;
            } else {
                jFloatToRawIntBits = (Float.floatToRawIntBits(kiw.a(j)) & 4294967295L) | (Float.floatToRawIntBits(kiw.b(j) / 2.0f) << 32);
            }
            egt.a(dkl.a(egq.l(icsVar, jFloatToRawIntBits).a(new HoverableElement(ebkVar)), z ? gstVar.a : gstVar.f, gsc.e(7, hmlVarC)), hmlVarC);
        } else {
            hmlVarC.s();
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            final gte gteVar2 = gteVar;
            hpxVarL.d = new fdat() { // from class: gsv
                @Override // defpackage.fdat
                public final Object a(Object obj2, Object obj3) {
                    ((Integer) obj3).intValue();
                    gte gteVar3 = this.a;
                    ebk ebkVar2 = ebkVar;
                    ics icsVar2 = icsVar;
                    gst gstVar2 = gstVar;
                    boolean z2 = z;
                    gteVar3.c(ebkVar2, icsVar2, gstVar2, z2, j, (hml) obj2, hpy.a(i | 1));
                    return fctx.a;
                }
            };
        }
    }

    public final void d(final gtx gtxVar, final ics icsVar, final boolean z, final gst gstVar, final fdat fdatVar, fdau fdauVar, final float f, final float f2, hml hmlVar, final int i) {
        gtx gtxVar2;
        int i2;
        float f3;
        hml hmlVar2;
        final fdau fdauVar2;
        fdau fdauVar3;
        hml hmlVarC = hmlVar.c(49984771);
        if ((i & 6) == 0) {
            gtxVar2 = gtxVar;
            i2 = (true != hmlVarC.F(gtxVar2) ? 2 : 4) | i;
        } else {
            gtxVar2 = gtxVar;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.D(icsVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != hmlVarC.E(z) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != hmlVarC.D(gstVar) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != hmlVarC.F(fdatVar) ? 8192 : 16384;
        }
        int i3 = i2 | 196608;
        if ((1572864 & i) == 0) {
            f3 = f;
            i3 |= true != hmlVarC.A(f3) ? 524288 : 1048576;
        } else {
            f3 = f;
        }
        if ((12582912 & i) == 0) {
            i3 |= true != hmlVarC.A(f2) ? 4194304 : VCardConfig.FLAG_REFRAIN_IMAGE_EXPORT;
        }
        if ((100663296 & i) == 0) {
            i3 |= true != hmlVarC.D(this) ? VCardConfig.FLAG_REFRAIN_PHONE_NUMBER_FORMATTING : VCardConfig.FLAG_APPEND_TYPE_PARAM;
        }
        if (hmlVarC.J((38347923 & i3) != 38347922, i3 & 1)) {
            hmlVarC.t();
            if ((i & 1) == 0 || hmlVarC.G()) {
                hmw hmwVar = (hmw) hmlVarC;
                Object objS = hmwVar.S();
                if (objS == hmk.a) {
                    objS = gtd.a;
                    hmwVar.af(objS);
                }
                fdauVar3 = (fdau) objS;
            } else {
                hmlVarC.s();
                fdauVar3 = fdauVar;
            }
            hmlVarC.l();
            int i4 = i3 << 3;
            hmlVar2 = hmlVarC;
            float f4 = f3;
            e(gtxVar2, icsVar, z, gstVar, fdatVar, fdauVar3, f4, f2, hmlVar2, 805306416 | (i3 & 14) | (i4 & 896) | (i4 & 7168) | (57344 & i4) | (458752 & i4) | (3670016 & i4) | (29360128 & i4) | (234881024 & i4), ((i3 >> 21) & 112) | 6);
            fdauVar2 = fdauVar3;
        } else {
            hmlVar2 = hmlVarC;
            hmlVar2.s();
            fdauVar2 = fdauVar;
        }
        hpx hpxVarL = hmlVar2.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: gta
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    gte gteVar = this.a;
                    gtx gtxVar3 = gtxVar;
                    ics icsVar2 = icsVar;
                    boolean z2 = z;
                    gst gstVar2 = gstVar;
                    fdat fdatVar2 = fdatVar;
                    fdau fdauVar4 = fdauVar2;
                    float f5 = f;
                    gteVar.d(gtxVar3, icsVar2, z2, gstVar2, fdatVar2, fdauVar4, f5, f2, (hml) obj, hpy.a(i | 1));
                    return fctx.a;
                }
            };
        }
    }

    public final void e(final gtx gtxVar, final ics icsVar, final boolean z, final gst gstVar, final fdat fdatVar, final fdau fdauVar, final float f, final float f2, hml hmlVar, final int i, final int i2) {
        int i3;
        int i4;
        hml hmlVar2;
        ics icsVarE;
        ics icsVar2;
        int i5 = i & 6;
        hml hmlVarC = hmlVar.c(133396521);
        if (i5 == 0) {
            i3 = (true != hmlVarC.F(gtxVar) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= true != hmlVarC.A(Float.NaN) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i3 |= true != hmlVarC.D(icsVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i3 |= true != hmlVarC.E(z) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i3 |= true != hmlVarC.D(gstVar) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i3 |= true != hmlVarC.F(fdatVar) ? 65536 : 131072;
        }
        if ((1572864 & i) == 0) {
            i3 |= true != hmlVarC.F(fdauVar) ? 524288 : 1048576;
        }
        if ((12582912 & i) == 0) {
            i3 |= true != hmlVarC.A(f) ? 4194304 : VCardConfig.FLAG_REFRAIN_IMAGE_EXPORT;
        }
        if ((100663296 & i) == 0) {
            i3 |= true != hmlVarC.A(f2) ? VCardConfig.FLAG_REFRAIN_PHONE_NUMBER_FORMATTING : VCardConfig.FLAG_APPEND_TYPE_PARAM;
        }
        if ((805306368 & i) == 0) {
            i3 |= true != hmlVarC.E(false) ? VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES : 536870912;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (true != hmlVarC.E(false) ? 2 : 4);
        } else {
            i4 = i2;
        }
        if (hmlVarC.J(((i3 & 306783379) == 306783378 && (i4 & 3) == 2) ? false : true, i3 & 1)) {
            int i6 = i3;
            final long jB = gstVar.b(z, false);
            final long jB2 = gstVar.b(z, true);
            int i7 = i4;
            final long jA = gstVar.a(z, false);
            final long jA2 = gstVar.a(z, true);
            if (gtxVar.e == dwm.a) {
                izp izpVar = gtt.a;
                icsVarE = egq.b(egq.o(icsVar, 16.0f), 1.0f);
            } else {
                ics icsVarD = egq.d(icsVar, 1.0f);
                izp izpVar2 = gtt.a;
                icsVarE = egq.e(icsVarD, 16.0f);
            }
            boolean z2 = (i6 & 112) == 32;
            ico icoVar = ics.e;
            boolean zF = z2 | hmlVarC.F(gtxVar);
            hmw hmwVar = (hmw) hmlVarC;
            boolean z3 = z2;
            Object objS = hmwVar.S();
            if (zF || objS == hmk.a) {
                objS = new fdau() { // from class: gsx
                    @Override // defpackage.fdau
                    public final Object a(Object obj, Object obj2, Object obj3) {
                        ixp ixpVar = (ixp) obj;
                        long j = ((kil) obj3).a;
                        gte gteVar = gte.a;
                        final iyl iylVarE = ((ixk) obj2).e(j);
                        return ixpVar.ej(iylVarE.a, iylVarE.b, fcwa.c(new fcti(gtt.a, Integer.valueOf(kir.b(Float.NaN, Float.NaN) ? gtxVar.e == dwm.a ? iylVarE.a / 2 : iylVarE.b / 2 : ixpVar.ep(Float.NaN)))), new fdap() { // from class: gsw
                            @Override // defpackage.fdap
                            public final Object invoke(Object obj4) {
                                gte gteVar2 = gte.a;
                                ((iyk) obj4).s(iylVarE, 0, 0, 0.0f);
                                return fctx.a;
                            }
                        });
                    }
                };
                hmwVar.af(objS);
            }
            ics icsVarA = icsVarE.a(iwl.a(icoVar, (fdau) objS));
            boolean zF2 = z3 | hmlVarC.F(gtxVar) | hmlVarC.C(jB) | hmlVarC.C(jB2) | hmlVarC.C(jA) | hmlVarC.C(jA2);
            boolean z4 = (i6 & 29360128) == 8388608;
            boolean z5 = (i6 & 234881024) == 67108864;
            boolean z6 = (i6 & 458752) == 131072;
            boolean z7 = (i6 & 3670016) == 1048576;
            boolean z8 = (i6 & 1879048192) == 536870912;
            boolean z9 = (i7 & 14) == 4;
            Object objS2 = hmwVar.S();
            if (((zF2 | z4 | z5 | z6 | z7 | z8) || z9) || objS2 == hmk.a) {
                hmlVar2 = hmlVarC;
                icsVar2 = icsVarA;
                objS2 = new fdap() { // from class: gsy
                    /* JADX WARN: Removed duplicated region for block: B:68:0x01cd  */
                    /* JADX WARN: Removed duplicated region for block: B:69:0x01e8  */
                    /* JADX WARN: Removed duplicated region for block: B:74:0x021b  */
                    @Override // defpackage.fdap
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object invoke(java.lang.Object r30) {
                        /*
                            Method dump skipped, instructions count: 738
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: defpackage.gsy.invoke(java.lang.Object):java.lang.Object");
                    }
                };
                hmwVar.af(objS2);
            } else {
                hmlVar2 = hmlVarC;
                icsVar2 = icsVarA;
            }
            dlb.a(icsVar2, (fdap) objS2, hmlVar2, 0);
        } else {
            hmlVar2 = hmlVarC;
            hmlVar2.s();
        }
        hpx hpxVarL = hmlVar2.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: gsz
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    hml hmlVar3 = (hml) obj;
                    ((Integer) obj2).intValue();
                    gte gteVar = this.a;
                    gtx gtxVar2 = gtxVar;
                    ics icsVar3 = icsVar;
                    boolean z10 = z;
                    gst gstVar2 = gstVar;
                    fdat fdatVar2 = fdatVar;
                    fdau fdauVar2 = fdauVar;
                    float f3 = f;
                    int i8 = i;
                    gteVar.e(gtxVar2, icsVar3, z10, gstVar2, fdatVar2, fdauVar2, f3, f2, hmlVar3, hpy.a(i8 | 1), hpy.a(i2));
                    return fctx.a;
                }
            };
        }
    }
}
