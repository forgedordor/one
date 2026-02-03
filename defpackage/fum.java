package defpackage;

import com.android.vcard.VCardConfig;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fum {
    public static final fum a = new fum();

    private fum() {
    }

    public final void a(final boolean z, final ebk ebkVar, final foz fozVar, final ikp ikpVar, float f, float f2, hml hmlVar, final int i) {
        boolean z2;
        int i2;
        fum fumVar;
        float f3;
        float f4;
        final float f5;
        final float f6;
        hml hmlVarC = hmlVar.c(943754022);
        if ((i & 6) == 0) {
            z2 = z;
            i2 = (true != hmlVarC.E(z2) ? 2 : 4) | i;
        } else {
            z2 = z;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.E(false) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != hmlVarC.D(ebkVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != hmlVarC.D(fozVar) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != hmlVarC.D(ikpVar) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i2 |= 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= 524288;
        }
        if ((12582912 & i) == 0) {
            fumVar = this;
            i2 |= true != hmlVarC.D(fumVar) ? 4194304 : VCardConfig.FLAG_REFRAIN_IMAGE_EXPORT;
        } else {
            fumVar = this;
        }
        if ((4793491 & i2) == 4793490 && hmlVarC.I()) {
            hmlVarC.s();
            f5 = f;
            f6 = f2;
        } else {
            hmlVarC.t();
            if ((i & 1) == 0 || hmlVarC.G()) {
                f3 = 1.0f;
                f4 = 2.0f;
            } else {
                hmlVarC.s();
                f4 = f;
                f3 = f2;
            }
            hmlVarC.l();
            ecz.b(dkr.b(ics.e, (dky) fun.a(z2, ebkVar, fozVar, f4, f3, hmlVarC, i2 & 8190).a(), ikpVar), hmlVarC, 0);
            f5 = f4;
            f6 = f3;
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            final fum fumVar2 = fumVar;
            hpxVarL.d = new fdat() { // from class: fuk
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    fum fumVar3 = this.a;
                    boolean z3 = z;
                    ebk ebkVar2 = ebkVar;
                    foz fozVar2 = fozVar;
                    ikp ikpVar2 = ikpVar;
                    float f7 = f5;
                    fumVar3.a(z3, ebkVar2, fozVar2, ikpVar2, f7, f6, (hml) obj, hpy.a(i | 1));
                    return fctx.a;
                }
            };
        }
    }

    public final void b(final String str, final fdat fdatVar, final boolean z, final kfp kfpVar, final ebk ebkVar, final fdat fdatVar2, final fdat fdatVar3, final ikp ikpVar, final foz fozVar, egc egcVar, final fdat fdatVar4, hml hmlVar, final int i, final int i2) {
        int i3;
        fdat fdatVar5;
        boolean z2;
        kfp kfpVar2;
        int i4;
        fdat fdatVar6;
        fdat fdatVar7;
        int i5;
        foz fozVar2;
        fdat fdatVar8;
        egc egdVar;
        hml hmlVar2;
        final egc egcVar2;
        hml hmlVarC = hmlVar.c(1154925202);
        if ((i & 6) == 0) {
            i3 = (true != hmlVarC.D(str) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            fdatVar5 = fdatVar;
            i3 |= true != hmlVarC.F(fdatVar5) ? 16 : 32;
        } else {
            fdatVar5 = fdatVar;
        }
        if ((i & 384) == 0) {
            z2 = z;
            i3 |= true != hmlVarC.E(z2) ? 128 : 256;
        } else {
            z2 = z;
        }
        if ((i & 3072) == 0) {
            i3 |= true != hmlVarC.E(false) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            kfpVar2 = kfpVar;
            i3 |= true != hmlVarC.D(kfpVar2) ? 8192 : 16384;
        } else {
            kfpVar2 = kfpVar;
        }
        if ((i & 196608) == 0) {
            i4 = 196608;
            i3 |= true != hmlVarC.D(ebkVar) ? 65536 : 131072;
        } else {
            i4 = 196608;
        }
        if ((1572864 & i) == 0) {
            i3 |= true != hmlVarC.E(false) ? 524288 : 1048576;
        }
        if ((12582912 & i) == 0) {
            fdatVar6 = fdatVar2;
            i3 |= true != hmlVarC.F(fdatVar6) ? 4194304 : VCardConfig.FLAG_REFRAIN_IMAGE_EXPORT;
        } else {
            fdatVar6 = fdatVar2;
        }
        if ((100663296 & i) == 0) {
            i3 |= true != hmlVarC.F(null) ? VCardConfig.FLAG_REFRAIN_PHONE_NUMBER_FORMATTING : VCardConfig.FLAG_APPEND_TYPE_PARAM;
        }
        if ((805306368 & i) == 0) {
            i3 |= true != hmlVarC.F(null) ? VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES : 536870912;
        }
        if ((i2 & 6) == 0) {
            fdatVar7 = fdatVar3;
            i5 = i2 | (true != hmlVarC.F(fdatVar7) ? 2 : 4);
        } else {
            fdatVar7 = fdatVar3;
            i5 = i2;
        }
        if ((i2 & 48) == 0) {
            i5 |= true != hmlVarC.D(ikpVar) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            fozVar2 = fozVar;
            i5 |= true != hmlVarC.D(fozVar2) ? 128 : 256;
        } else {
            fozVar2 = fozVar;
        }
        if ((i2 & 3072) == 0) {
            i5 |= 1024;
        }
        if ((i2 & 24576) == 0) {
            fdatVar8 = fdatVar4;
            i5 |= true == hmlVarC.F(fdatVar8) ? 16384 : 8192;
        } else {
            fdatVar8 = fdatVar4;
        }
        if ((i2 & i4) == 0) {
            i5 |= true == hmlVarC.D(this) ? 131072 : 65536;
        }
        if ((306783379 & i3) == 306783378 && (74899 & i5) == 74898 && hmlVarC.I()) {
            hmlVarC.s();
            egcVar2 = egcVar;
            hmlVar2 = hmlVarC;
        } else {
            int i6 = i5 & (-7169);
            hmlVarC.t();
            if ((i & 1) == 0 || hmlVarC.G()) {
                egdVar = new egd(16.0f, 16.0f, 16.0f, 16.0f);
            } else {
                hmlVarC.s();
                egdVar = egcVar;
            }
            hmlVarC.l();
            int i7 = i3 << 3;
            hmlVar2 = hmlVarC;
            int i8 = i3 >> 9;
            int i9 = i6 << 6;
            fuy.e(2, str, fdatVar5, kfpVar2, fdatVar6, fdatVar7, z2, ebkVar, egdVar, ikpVar, fozVar2, fdatVar8, hmlVar2, ((i3 >> 3) & 7168) | (i7 & 896) | (i7 & 112) | 6 | (i8 & 57344) | (i8 & 458752) | (i8 & 3670016) | ((i6 << 21) & 29360128) | ((i3 << 15) & 234881024) | ((i3 << 21) & 1879048192), (i9 & 57344) | ((i3 >> 18) & 14) | ((i3 >> 12) & 112) | (i9 & 7168) | (458752 & (i6 << 3)));
            egcVar2 = egdVar;
        }
        hpx hpxVarL = hmlVar2.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: fuj
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    fum fumVar = this.a;
                    String str2 = str;
                    fdat fdatVar9 = fdatVar;
                    boolean z3 = z;
                    kfp kfpVar3 = kfpVar;
                    ebk ebkVar2 = ebkVar;
                    fdat fdatVar10 = fdatVar2;
                    fdat fdatVar11 = fdatVar3;
                    ikp ikpVar2 = ikpVar;
                    foz fozVar3 = fozVar;
                    egc egcVar3 = egcVar2;
                    int i10 = i;
                    fumVar.b(str2, fdatVar9, z3, kfpVar3, ebkVar2, fdatVar10, fdatVar11, ikpVar2, fozVar3, egcVar3, fdatVar4, (hml) obj, hpy.a(i10 | 1), hpy.a(i2));
                    return fctx.a;
                }
            };
        }
    }

    public final void c(final String str, final fdat fdatVar, final boolean z, final kfp kfpVar, final ebk ebkVar, final fdat fdatVar2, final ikp ikpVar, final foz fozVar, egc egcVar, hml hmlVar, final int i, final int i2) {
        String str2;
        int i3;
        boolean z2;
        kfp kfpVar2;
        int i4;
        ebk ebkVar2;
        fdat fdatVar3;
        int i5;
        foz fozVar2;
        fum fumVar;
        hml hmlVar2;
        int i6;
        egc egdVar;
        final egc egcVar2;
        hml hmlVarC = hmlVar.c(2088762355);
        if ((i & 6) == 0) {
            str2 = str;
            i3 = (true != hmlVarC.D(str2) ? 2 : 4) | i;
        } else {
            str2 = str;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= true != hmlVarC.F(fdatVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            z2 = z;
            i3 |= true != hmlVarC.E(z2) ? 128 : 256;
        } else {
            z2 = z;
        }
        if ((i & 3072) == 0) {
            i3 |= true != hmlVarC.E(false) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            kfpVar2 = kfpVar;
            i3 |= true != hmlVarC.D(kfpVar2) ? 8192 : 16384;
        } else {
            kfpVar2 = kfpVar;
        }
        if ((i & 196608) == 0) {
            i4 = 196608;
            ebkVar2 = ebkVar;
            i3 |= true != hmlVarC.D(ebkVar2) ? 65536 : 131072;
        } else {
            i4 = 196608;
            ebkVar2 = ebkVar;
        }
        if ((1572864 & i) == 0) {
            i3 |= true != hmlVarC.E(false) ? 524288 : 1048576;
        }
        if ((12582912 & i) == 0) {
            fdatVar3 = fdatVar2;
            i3 |= true != hmlVarC.F(fdatVar3) ? 4194304 : VCardConfig.FLAG_REFRAIN_IMAGE_EXPORT;
        } else {
            fdatVar3 = fdatVar2;
        }
        if ((100663296 & i) == 0) {
            i3 |= true != hmlVarC.F(null) ? VCardConfig.FLAG_REFRAIN_PHONE_NUMBER_FORMATTING : VCardConfig.FLAG_APPEND_TYPE_PARAM;
        }
        if ((805306368 & i) == 0) {
            i3 |= true != hmlVarC.F(null) ? VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES : 536870912;
        }
        if ((i2 & 6) == 0) {
            i5 = i2 | (true != hmlVarC.F(null) ? 2 : 4);
        } else {
            i5 = i2;
        }
        if ((i2 & 48) == 0) {
            i5 |= true != hmlVarC.D(ikpVar) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            fozVar2 = fozVar;
            i5 |= true != hmlVarC.D(fozVar2) ? 128 : 256;
        } else {
            fozVar2 = fozVar;
        }
        if ((i2 & 3072) == 0) {
            i5 |= 1024;
        }
        if ((i2 & 24576) == 0) {
            fumVar = this;
            i5 |= true == hmlVarC.D(fumVar) ? 16384 : 8192;
        } else {
            fumVar = this;
        }
        if ((306783379 & i3) == 306783378 && (i5 & 9363) == 9362 && hmlVarC.I()) {
            hmlVarC.s();
            egcVar2 = egcVar;
            hmlVar2 = hmlVarC;
        } else {
            int i7 = i5 & (-7169);
            hmlVarC.t();
            if ((i & 1) == 0 || hmlVarC.G()) {
                hmlVar2 = hmlVarC;
                i6 = i3;
                egdVar = new egd(16.0f, 20.0f, 16.0f, 10.0f);
            } else {
                hmlVarC.s();
                egdVar = egcVar;
                hmlVar2 = hmlVarC;
                i6 = i3;
            }
            hmlVar2.l();
            int i8 = i6 << 3;
            int i9 = i6 >> 9;
            int i10 = i7 << 21;
            int i11 = i7 << 6;
            kfp kfpVar3 = kfpVar2;
            fuy.e(1, str2, fdatVar, kfpVar3, fdatVar3, null, z2, ebkVar2, egdVar, ikpVar, fozVar2, null, hmlVar2, (i8 & 896) | (i8 & 112) | 6 | ((i6 >> 3) & 7168) | (57344 & i9) | (458752 & i9) | (3670016 & i9) | (i10 & 29360128) | ((i6 << 15) & 234881024) | ((i6 << 21) & 1879048192), ((i6 >> 18) & 14) | i4 | ((i6 >> 12) & 112) | (i11 & 7168) | (57344 & i11));
            egcVar2 = egdVar;
        }
        hpx hpxVarL = hmlVar2.L();
        if (hpxVarL != null) {
            final fum fumVar2 = fumVar;
            hpxVarL.d = new fdat() { // from class: fui
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    hml hmlVar3 = (hml) obj;
                    ((Integer) obj2).intValue();
                    fum fumVar3 = this.a;
                    String str3 = str;
                    fdat fdatVar4 = fdatVar;
                    boolean z3 = z;
                    kfp kfpVar4 = kfpVar;
                    ebk ebkVar3 = ebkVar;
                    fdat fdatVar5 = fdatVar2;
                    ikp ikpVar2 = ikpVar;
                    foz fozVar3 = fozVar;
                    int i12 = i;
                    fumVar3.c(str3, fdatVar4, z3, kfpVar4, ebkVar3, fdatVar5, ikpVar2, fozVar3, egcVar2, hmlVar3, hpy.a(i12 | 1), hpy.a(i2));
                    return fctx.a;
                }
            };
        }
    }
}
