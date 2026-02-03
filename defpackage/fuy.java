package defpackage;

import com.android.vcard.VCardConfig;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fuy {
    public static final int a(iyl iylVar) {
        if (iylVar != null) {
            return iylVar.b;
        }
        return 0;
    }

    public static final int b(iyl iylVar) {
        if (iylVar != null) {
            return iylVar.a;
        }
        return 0;
    }

    public static final Object c(ivt ivtVar) {
        Object objF = ivtVar.f();
        iwc iwcVar = objF instanceof iwc ? (iwc) objF : null;
        if (iwcVar != null) {
            return iwcVar.e();
        }
        return null;
    }

    public static final void d(final long j, jyq jyqVar, final fdat fdatVar, hml hmlVar, final int i, final int i2) {
        int i3;
        int i4 = i2 & 1;
        hml hmlVarC = hmlVar.c(2064632657);
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (true != hmlVarC.C(j) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= true != hmlVarC.D(jyqVar) ? 16 : 32;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= true != hmlVarC.D(null) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i3 |= true != hmlVarC.F(fdatVar) ? 1024 : 2048;
        }
        if ((i3 & 1171) == 1170 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            if (i5 != 0) {
                jyqVar = null;
            }
            hwv hwvVarD = hxe.d(-650790565, new fux(j, fdatVar), hmlVarC);
            if (jyqVar != null) {
                hmlVarC.v(-162879041);
                fvx.a(jyqVar, hwvVarD, hmlVarC, ((i3 >> 3) & 14) | 48);
            } else {
                hmlVarC.v(-162877405);
                hwvVarD.a(hmlVarC, 6);
            }
            ((hmw) hmlVarC).ab();
        }
        final jyq jyqVar2 = jyqVar;
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: fup
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    long j2 = j;
                    jyq jyqVar3 = jyqVar2;
                    fuy.d(j2, jyqVar3, fdatVar, (hml) obj, hpy.a(i | 1), i2);
                    return fctx.a;
                }
            };
        }
    }

    public static final void e(final int i, final String str, final fdat fdatVar, final kfp kfpVar, final fdat fdatVar2, final fdat fdatVar3, final boolean z, final ebk ebkVar, final egc egcVar, final ikp ikpVar, final foz fozVar, final fdat fdatVar4, hml hmlVar, final int i2, final int i3) {
        int i4;
        fdat fdatVar5;
        fdat fdatVar6;
        fdat fdatVar7;
        int i5;
        ikp ikpVar2;
        long j;
        hml hmlVar2;
        int i6 = i2 & 6;
        hml hmlVarC = hmlVar.c(418608794);
        if (i6 == 0) {
            i4 = (true != hmlVarC.B(i + (-1)) ? 2 : 4) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= true != hmlVarC.D(str) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            fdatVar5 = fdatVar;
            i4 |= true != hmlVarC.F(fdatVar5) ? 128 : 256;
        } else {
            fdatVar5 = fdatVar;
        }
        if ((i2 & 3072) == 0) {
            i4 |= true != hmlVarC.D(kfpVar) ? 1024 : 2048;
        }
        if ((i2 & 24576) == 0) {
            fdatVar6 = fdatVar2;
            i4 |= true != hmlVarC.F(fdatVar6) ? 8192 : 16384;
        } else {
            fdatVar6 = fdatVar2;
        }
        if ((i2 & 196608) == 0) {
            i4 |= true != hmlVarC.F(null) ? 65536 : 131072;
        }
        if ((1572864 & i2) == 0) {
            i4 |= true != hmlVarC.F(null) ? 524288 : 1048576;
        }
        if ((12582912 & i2) == 0) {
            fdatVar7 = fdatVar3;
            i4 |= true != hmlVarC.F(fdatVar7) ? 4194304 : VCardConfig.FLAG_REFRAIN_IMAGE_EXPORT;
        } else {
            fdatVar7 = fdatVar3;
        }
        if ((100663296 & i2) == 0) {
            i4 |= true != hmlVarC.E(false) ? VCardConfig.FLAG_REFRAIN_PHONE_NUMBER_FORMATTING : VCardConfig.FLAG_APPEND_TYPE_PARAM;
        }
        if ((805306368 & i2) == 0) {
            i4 |= true != hmlVarC.E(z) ? VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES : 536870912;
        }
        if ((i3 & 6) == 0) {
            i5 = i3 | (true != hmlVarC.E(false) ? 2 : 4);
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= true != hmlVarC.D(ebkVar) ? 16 : 32;
        }
        if ((i3 & 384) == 0) {
            i5 |= true != hmlVarC.D(egcVar) ? 128 : 256;
        }
        if ((i3 & 3072) == 0) {
            ikpVar2 = ikpVar;
            i5 |= true == hmlVarC.D(ikpVar2) ? 2048 : 1024;
        } else {
            ikpVar2 = ikpVar;
        }
        if ((i3 & 24576) == 0) {
            i5 |= true == hmlVarC.D(fozVar) ? 16384 : 8192;
        }
        if ((i3 & 196608) == 0) {
            i5 |= true == hmlVarC.F(fdatVar4) ? 131072 : 65536;
        }
        if ((306783379 & i4) == 306783378 && (74899 & i5) == 74898 && hmlVarC.I()) {
            hmlVarC.s();
            hmlVar2 = hmlVarC;
        } else {
            boolean z2 = (i4 & 112) == 32;
            boolean z3 = (i4 & 7168) == 2048;
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            if ((z3 | z2) || objS == hmk.a) {
                kfm kfmVar = new kfm(new juo(str, null, 6), kek.a);
                hmwVar.af(kfmVar);
                objS = kfmVar;
            }
            fqm fqmVar = ((Boolean) ebg.a(ebkVar, hmlVarC, (i5 >> 3) & 14).a()).booleanValue() ? fqm.a : ((kfm) objS).a.b.length() == 0 ? fqm.b : fqm.c;
            fuv fuvVar = new fuv(fozVar, z, ebkVar);
            fvy fvyVarC = fqq.c(hmlVarC);
            jyq jyqVar = fvyVarC.a;
            jyq jyqVar2 = fvyVarC.d;
            long jF = jyqVar.f();
            long j2 = ije.h;
            boolean z4 = (fcts.a(jF, j2) && !fcts.a(jyqVar2.f(), j2)) || (!fcts.a(jyqVar.f(), j2) && fcts.a(jyqVar2.f(), j2));
            fvq fvqVar = fvq.a;
            hmlVarC.v(-1443811667);
            long jF2 = fqq.c(hmlVarC).d.f();
            if (z4) {
                j = 16;
                hmlVarC.v(-887928539);
                if (jF2 == 16) {
                    jF2 = ((ije) fuvVar.a(fqmVar, hmlVarC, 0)).i;
                }
                hmwVar.ab();
            } else {
                j = 16;
                hmlVarC.v(1218284988);
                hmwVar.ab();
            }
            long j3 = jF2;
            hmwVar.ab();
            hmlVarC.v(-1443804401);
            long jF3 = fqq.c(hmlVarC).a.f();
            if (z4) {
                hmlVarC.v(-1026713946);
                if (jF3 == j) {
                    jF3 = ((ije) fuvVar.a(fqmVar, hmlVarC, 0)).i;
                }
                hmwVar.ab();
            } else {
                hmlVarC.v(798166043);
                hmwVar.ab();
            }
            hmwVar.ab();
            hmlVar2 = hmlVarC;
            fvqVar.a(fqmVar, j3, jF3, fuvVar, true, hxe.d(33336375, new fuu(fdatVar6, fozVar, z, fdatVar7, ikpVar2, i, fdatVar5, egcVar, z4, fdatVar4), hmlVarC), hmlVar2, 1769472);
        }
        hpx hpxVarL = hmlVar2.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: fuo
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i7 = i;
                    String str2 = str;
                    fdat fdatVar8 = fdatVar;
                    kfp kfpVar2 = kfpVar;
                    fdat fdatVar9 = fdatVar2;
                    fdat fdatVar10 = fdatVar3;
                    boolean z5 = z;
                    ebk ebkVar2 = ebkVar;
                    egc egcVar2 = egcVar;
                    ikp ikpVar3 = ikpVar;
                    foz fozVar2 = fozVar;
                    int i8 = i2;
                    fuy.e(i7, str2, fdatVar8, kfpVar2, fdatVar9, fdatVar10, z5, ebkVar2, egcVar2, ikpVar3, fozVar2, fdatVar4, (hml) obj, hpy.a(i8 | 1), hpy.a(i3));
                    return fctx.a;
                }
            };
        }
    }
}
