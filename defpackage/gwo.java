package defpackage;

import com.android.vcard.VCardConfig;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gwo {
    public static final float a;
    public static final float b = 16.0f;
    public static final long c;

    static {
        float f = hlo.a;
        a = hlo.a;
        c = kjm.c(20);
    }

    /* JADX WARN: Type inference failed for: r11v9, types: [dew, java.lang.Object] */
    public static final void a(long j, final long j2, boolean z, final fdat fdatVar, hml hmlVar, final int i) {
        long j3;
        int i2;
        final boolean z2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-833145221);
        if (i3 == 0) {
            j3 = j;
            i2 = (true != hmlVarC.C(j3) ? 2 : 4) | i;
        } else {
            j3 = j;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.C(j2) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            z2 = z;
            i2 |= true != hmlVarC.E(z2) ? 128 : 256;
        } else {
            z2 = z;
        }
        if ((i & 3072) == 0) {
            i2 |= true != hmlVarC.F(fdatVar) ? 1024 : 2048;
        }
        if (hmlVarC.J((i2 & 1171) != 1170, i2 & 1)) {
            int i4 = i2 >> 6;
            dhk dhkVarD = dhy.d(Boolean.valueOf(z2), null, hmlVarC, i4 & 14, 2);
            gwn gwnVar = gwn.a;
            boolean zBooleanValue = ((Boolean) dhkVarD.f()).booleanValue();
            hmlVarC.v(-1069234984);
            long j4 = true != zBooleanValue ? j2 : j3;
            hmw hmwVar = (hmw) hmlVarC;
            hmwVar.ab();
            ilg ilgVarF = ije.f(j4);
            boolean zD = hmlVarC.D(ilgVarF);
            Object objS = hmwVar.S();
            if (zD || objS == hmk.a) {
                objS = cys.a.invoke(ilgVarF);
                hmwVar.af(objS);
            }
            dib dibVar = (dib) objS;
            boolean zBooleanValue2 = ((Boolean) dhkVarD.e()).booleanValue();
            hmlVarC.v(-1069234984);
            long j5 = true != zBooleanValue2 ? j2 : j3;
            hmwVar.ab();
            ije ijeVar = new ije(j5);
            boolean zBooleanValue3 = ((Boolean) dhkVarD.f()).booleanValue();
            hmlVarC.v(-1069234984);
            long j6 = true != zBooleanValue3 ? j2 : j3;
            hmwVar.ab();
            hnj.a(gea.a.c(new ije(((ije) dhy.f(dhkVarD, ijeVar, new ije(j6), gwnVar.a(dhkVarD.d(), hmlVarC, 0), dibVar, hmlVarC, 0).a()).i)), fdatVar, hmlVarC, (i4 & 112) | 8);
        } else {
            hmlVarC.s();
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            final long j7 = j3;
            hpxVarL.d = new fdat() { // from class: gwg
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    hml hmlVar2 = (hml) obj;
                    ((Integer) obj2).intValue();
                    long j8 = j7;
                    long j9 = j2;
                    int i5 = i;
                    gwo.a(j8, j9, z2, fdatVar, hmlVar2, hpy.a(i5 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void b(final boolean z, final fdae fdaeVar, final ics icsVar, final boolean z2, final long j, final long j2, final fdau fdauVar, hml hmlVar, final int i) {
        boolean z3;
        int i2;
        fdae fdaeVar2;
        long j3;
        fdau fdauVar2;
        hml hmlVar2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-1573136853);
        if (i3 == 0) {
            z3 = z;
            i2 = (true != hmlVarC.E(z3) ? 2 : 4) | i;
        } else {
            z3 = z;
            i2 = i;
        }
        if ((i & 48) == 0) {
            fdaeVar2 = fdaeVar;
            i2 |= true != hmlVarC.F(fdaeVar2) ? 16 : 32;
        } else {
            fdaeVar2 = fdaeVar;
        }
        if ((i & 384) == 0) {
            i2 |= true != hmlVarC.D(icsVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != hmlVarC.E(z2) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != hmlVarC.C(j) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            j3 = j2;
            i2 |= true != hmlVarC.C(j3) ? 65536 : 131072;
        } else {
            j3 = j2;
        }
        if ((1572864 & i) == 0) {
            i2 |= true != hmlVarC.D(null) ? 524288 : 1048576;
        }
        if ((12582912 & i) == 0) {
            fdauVar2 = fdauVar;
            i2 |= true != hmlVarC.F(fdauVar2) ? 4194304 : VCardConfig.FLAG_REFRAIN_IMAGE_EXPORT;
        } else {
            fdauVar2 = fdauVar;
        }
        if (hmlVarC.J((4793491 & i2) != 4793490, i2 & 1)) {
            hmlVarC.t();
            if ((i & 1) != 0 && !hmlVarC.G()) {
                hmlVarC.s();
            }
            hmlVarC.l();
            int i4 = i2 >> 12;
            long j4 = j3;
            hmlVar2 = hmlVarC;
            a(j, j4, z, hxe.d(1128552423, new gwj(icsVar, z3, grb.a(true, 0.0f, j, 2), z2, fdaeVar2, fdauVar2), hmlVarC), hmlVar2, ((i2 << 6) & 896) | (i4 & 112) | (i4 & 14) | 3072);
        } else {
            hmlVar2 = hmlVarC;
            hmlVar2.s();
        }
        hpx hpxVarL = hmlVar2.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: gwe
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    hml hmlVar3 = (hml) obj;
                    ((Integer) obj2).intValue();
                    boolean z4 = z;
                    fdae fdaeVar3 = fdaeVar;
                    ics icsVar2 = icsVar;
                    boolean z5 = z2;
                    long j5 = j;
                    int i5 = i;
                    gwo.b(z4, fdaeVar3, icsVar2, z5, j5, j2, fdauVar, hmlVar3, hpy.a(i5 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void c(final boolean z, final fdae fdaeVar, final ics icsVar, final boolean z2, fdat fdatVar, final long j, final long j2, hml hmlVar, final int i) {
        boolean z3;
        int i2;
        fdat fdatVar2;
        hml hmlVar2;
        hwv hwvVarD;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(1015017965);
        if (i3 == 0) {
            z3 = z;
            i2 = (true != hmlVarC.E(z3) ? 2 : 4) | i;
        } else {
            z3 = z;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.F(fdaeVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != hmlVarC.D(icsVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != hmlVarC.E(z2) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != hmlVarC.F(fdatVar) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i2 |= true != hmlVarC.F(null) ? 65536 : 131072;
        }
        if ((1572864 & i) == 0) {
            i2 |= true != hmlVarC.C(j) ? 524288 : 1048576;
        }
        if ((i & 12582912) == 0) {
            i2 |= true != hmlVarC.C(j2) ? 4194304 : VCardConfig.FLAG_REFRAIN_IMAGE_EXPORT;
        }
        if ((100663296 & i) == 0) {
            i2 |= true != hmlVarC.D(null) ? VCardConfig.FLAG_REFRAIN_PHONE_NUMBER_FORMATTING : VCardConfig.FLAG_APPEND_TYPE_PARAM;
        }
        if (hmlVarC.J((38347923 & i2) != 38347922, i2 & 1)) {
            hmlVarC.t();
            if ((i & 1) != 0 && !hmlVarC.G()) {
                hmlVarC.s();
            }
            hmlVarC.l();
            if (fdatVar == null) {
                hmlVarC.v(1830898677);
                ((hmw) hmlVarC).ab();
                hwvVarD = null;
                fdatVar2 = fdatVar;
            } else {
                hmlVarC.v(1830898678);
                fdatVar2 = fdatVar;
                hwvVarD = hxe.d(-1745256900, new gwk(fdatVar2), hmlVarC);
                ((hmw) hmlVarC).ab();
            }
            ics icsVarA = iwl.a(icsVar, new fdau() { // from class: fyy
                @Override // defpackage.fdau
                public final Object a(Object obj, Object obj2, Object obj3) {
                    ixp ixpVar = (ixp) obj;
                    final iyl iylVarE = ((ixk) obj2).e(((kil) obj3).a);
                    return ixpVar.eu(iylVarE.a, iylVarE.b, fcvp.a, new fdap() { // from class: fza
                        @Override // defpackage.fdap
                        public final Object invoke(Object obj4) {
                            iyz iyzVar = (iyz) obj4;
                            iyzVar.b(fzc.b, (int) (iyzVar.a().g() >> 32));
                            iyzVar.b(fzc.a, 0.0f);
                            return fctx.a;
                        }
                    }, new fdap() { // from class: fzb
                        @Override // defpackage.fdap
                        public final Object invoke(Object obj4) {
                            ((iyk) obj4).s(iylVarE, 0, 0, 0.0f);
                            return fctx.a;
                        }
                    });
                }
            });
            hwv hwvVarD2 = hxe.d(-906085472, new gwi(hwvVarD), hmlVarC);
            int i4 = (i2 & 14) | 12582912;
            int i5 = i2 & 112;
            int i6 = i2 & 7168;
            int i7 = i2 >> 6;
            hmlVar2 = hmlVarC;
            b(z3, fdaeVar, icsVarA, z2, j, j2, hwvVarD2, hmlVar2, i4 | i5 | i6 | (57344 & i7) | (458752 & i7) | (i7 & 3670016));
        } else {
            fdatVar2 = fdatVar;
            hmlVar2 = hmlVarC;
            hmlVar2.s();
        }
        hpx hpxVarL = hmlVar2.L();
        if (hpxVarL != null) {
            final fdat fdatVar3 = fdatVar2;
            hpxVarL.d = new fdat() { // from class: gwf
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    hml hmlVar3 = (hml) obj;
                    ((Integer) obj2).intValue();
                    boolean z4 = z;
                    fdae fdaeVar2 = fdaeVar;
                    ics icsVar2 = icsVar;
                    boolean z5 = z2;
                    fdat fdatVar4 = fdatVar3;
                    int i8 = i;
                    gwo.c(z4, fdaeVar2, icsVar2, z5, fdatVar4, j, j2, hmlVar3, hpy.a(i8 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void d(final fdat fdatVar, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-1349901398);
        if (i3 == 0) {
            i2 = (true != hmlVarC.F(fdatVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.F(null) ? 16 : 32;
        }
        if (hmlVarC.J((i2 & 19) != 18, i2 & 1)) {
            int i4 = i2 & 14;
            boolean z = i4 == 4;
            boolean z2 = (i2 & 112) == 32;
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            if ((z | z2) || objS == hmk.a) {
                objS = new gwm(fdatVar);
                hmwVar.af(objS);
            }
            ixm ixmVar = (ixm) objS;
            ico icoVar = ics.e;
            int iA = hmg.a(hmlVarC);
            hxi hxiVarAk = hmwVar.ak();
            ics icsVarB = icj.b(hmlVarC, icoVar);
            fdae fdaeVar = jbb.a;
            hmlVarC.x();
            if (hmwVar.z) {
                hmlVarC.j(fdaeVar);
            } else {
                hmlVarC.z();
            }
            fdat fdatVar2 = jbb.e;
            hsk.b(hmlVarC, ixmVar, fdatVar2);
            fdat fdatVar3 = jbb.d;
            hsk.b(hmlVarC, hxiVarAk, fdatVar3);
            fdat fdatVar4 = jbb.f;
            if (hmwVar.z || !fdbq.f(hmwVar.S(), Integer.valueOf(iA))) {
                Integer numValueOf = Integer.valueOf(iA);
                hmwVar.af(numValueOf);
                hmlVarC.h(numValueOf, fdatVar4);
            }
            fdat fdatVar5 = jbb.c;
            hsk.b(hmlVarC, icsVarB, fdatVar5);
            if (fdatVar != null) {
                hmlVarC.v(870361332);
                ics icsVarI = efy.i(iwa.a(icoVar, ConversationSuggestion.SUGGESTION_PROPERTY_TEXT), b, 0.0f, 2);
                ixm ixmVarA = ecz.a(ibw.a, false);
                int iA2 = hmg.a(hmlVarC);
                hxi hxiVarAk2 = hmwVar.ak();
                ics icsVarB2 = icj.b(hmlVarC, icsVarI);
                hmlVarC.x();
                if (hmwVar.z) {
                    hmlVarC.j(fdaeVar);
                } else {
                    hmlVarC.z();
                }
                hsk.b(hmlVarC, ixmVarA, fdatVar2);
                hsk.b(hmlVarC, hxiVarAk2, fdatVar3);
                if (hmwVar.z || !fdbq.f(hmwVar.S(), Integer.valueOf(iA2))) {
                    Integer numValueOf2 = Integer.valueOf(iA2);
                    hmwVar.af(numValueOf2);
                    hmlVarC.h(numValueOf2, fdatVar4);
                }
                hsk.b(hmlVarC, icsVarB2, fdatVar5);
                fdatVar.a(hmlVarC, Integer.valueOf(i4));
                hmlVarC.n();
                hmwVar.ab();
            } else {
                hmlVarC.v(870466081);
                hmwVar.ab();
            }
            hmlVarC.v(870557345);
            hmwVar.ab();
            hmlVarC.n();
        } else {
            hmlVarC.s();
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: gwh
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int iA3 = hpy.a(i | 1);
                    gwo.d(fdatVar, (hml) obj, iA3);
                    return fctx.a;
                }
            };
        }
    }
}
