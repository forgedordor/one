package defpackage;

import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.android.vcard.VCardConfig;
import org.chromium.net.NetError;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dswt {
    private final dsxb a;

    public dswt(dsxb dsxbVar) {
        this.a = dsxbVar;
    }

    public static final void c(fdae fdaeVar) {
        fdaeVar.invoke();
    }

    public final void a(final int i, final dsva[] dsvaVarArr, final dsvb[] dsvbVarArr, final fdat fdatVar, final fdat fdatVar2, hml hmlVar, final int i2) {
        final dsvd dsvdVar;
        int i3 = i2 & 6;
        hml hmlVarC = hmlVar.c(1083810443);
        int i4 = i3 == 0 ? (true != hmlVarC.B(i) ? 2 : 4) | i2 : i2;
        if ((i2 & 48) == 0) {
            i4 |= true != hmlVarC.F(dsvaVarArr) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i4 |= true != hmlVarC.F(dsvbVarArr) ? 128 : 256;
        }
        if ((i2 & 3072) == 0) {
            i4 |= true != hmlVarC.F(null) ? 1024 : 2048;
        }
        if ((i2 & 24576) == 0) {
            i4 |= true != hmlVarC.F(null) ? 8192 : 16384;
        }
        if ((196608 & i2) == 0) {
            i4 |= true != hmlVarC.E(false) ? 65536 : 131072;
        }
        if ((1572864 & i2) == 0) {
            i4 |= true != hmlVarC.F(fdatVar) ? 524288 : 1048576;
        }
        if ((12582912 & i2) == 0) {
            i4 |= true != hmlVarC.F(null) ? 4194304 : VCardConfig.FLAG_REFRAIN_IMAGE_EXPORT;
        }
        if ((100663296 & i2) == 0) {
            i4 |= true != hmlVarC.F(fdatVar2) ? VCardConfig.FLAG_REFRAIN_PHONE_NUMBER_FORMATTING : VCardConfig.FLAG_APPEND_TYPE_PARAM;
        }
        if ((805306368 & i2) == 0) {
            i4 |= true != hmlVarC.D(this) ? VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES : 536870912;
        }
        if ((306783379 & i4) == 306783378 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            hmlVarC.t();
            if ((i2 & 1) != 0 && !hmlVarC.G()) {
                hmlVarC.s();
            }
            hmlVarC.l();
            hmlVarC.v(-2135197492);
            hpt hptVar = dsww.a;
            int length = dsvbVarArr.length;
            int i5 = 0;
            while (true) {
                if (i5 < length) {
                    Object obj = dsvbVarArr[i5].b;
                    if ((obj instanceof dtae) && ((dtae) obj).d) {
                        dsvdVar = null;
                        break;
                    }
                    i5++;
                } else {
                    hmlVarC.v(-2135191614);
                    hpt hptVar2 = dsww.a;
                    Object objE = hmlVarC.e(hptVar2);
                    hmw hmwVar = (hmw) hmlVarC;
                    hmwVar.ab();
                    if (objE != null) {
                        hmlVarC.v(-1766403746);
                        dsvdVar = (dsvd) hmlVarC.e(hptVar2);
                        hmwVar.ab();
                    } else {
                        hmlVarC.v(-1766296641);
                        dsvd dsvdVarC = null;
                        for (View view = (View) hmlVarC.e(AndroidCompositionLocals_androidKt.f); view != null; view = (View) view.getParent()) {
                            dsvdVarC = dsvu.c(view);
                            if (dsvdVarC != null || view.getId() == 16908290) {
                                break;
                            }
                        }
                        dsvdVar = dsvdVarC;
                        hmwVar.ab();
                    }
                }
            }
            hmw hmwVar2 = (hmw) hmlVarC;
            hmwVar2.ab();
            hmlVarC.v(-2135170503);
            dswq dswqVar = new dswq(i, dsvaVarArr, dsvbVarArr);
            hmlVarC.v(5004770);
            boolean zD = hmlVarC.D(dswqVar);
            Object objS = hmwVar2.S();
            if (zD || objS == hmk.a) {
                dsuy dsuyVar = new dsuy(dsvc.a(i), new ejvr() { // from class: dtan
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj2) {
                        dsvd dsvdVar2 = (dsvd) obj2;
                        dtal dtalVar = new dtal(dsvdVar2);
                        dsvdVar2.f = dtalVar;
                        dtalVar.l();
                        return dsvdVar2;
                    }
                }, this.a, null);
                for (dsva dsvaVar : dsvaVarArr) {
                    dsuyVar.f(dsvaVar);
                }
                for (dsvb dsvbVar : dsvbVarArr) {
                    dsuyVar.g(dsvbVar);
                }
                objS = dsuyVar.a();
                hmwVar2.af(objS);
            }
            final dsvd dsvdVar2 = (dsvd) objS;
            hmwVar2.ab();
            hmwVar2.ab();
            hnj.a(dsww.a.c(dsvdVar2), fdatVar2, hmlVarC, ((i4 >> 21) & 112) | 8);
            hmlVarC.v(-1224400529);
            boolean zF = hmlVarC.F(dsvdVar) | hmlVarC.F(dsvdVar2);
            boolean z = (3670016 & i4) == 1048576;
            boolean z2 = (i4 & 14) == 4;
            int i6 = i4;
            boolean z3 = (458752 & i4) == 131072;
            boolean z4 = (i6 & 1879048192) == 536870912;
            Object objS2 = hmwVar2.S();
            if ((zF | z | z2 | z3 | z4) || objS2 == hmk.a) {
                objS2 = new fdap() { // from class: dswl
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj2) {
                        ((hny) obj2).getClass();
                        final dsvd dsvdVar3 = dsvdVar;
                        final dsvd dsvdVar4 = dsvdVar2;
                        final fdat fdatVar3 = fdatVar;
                        final int i7 = i;
                        dswt.c(new fdae() { // from class: dswn
                            @Override // defpackage.fdae
                            public final Object invoke() {
                                dsvd dsvdVar5 = dsvdVar3;
                                dsvd dsvdVar6 = dsvdVar4;
                                if (dsvdVar5 == null) {
                                    dsvdVar6.f.h();
                                } else {
                                    Object objD = dsvdVar6.f.d();
                                    if (objD != null) {
                                        int i8 = i7;
                                        fdat fdatVar4 = fdatVar3;
                                        if (fdbq.f(objD, dsvdVar5)) {
                                            fdatVar4.a(Integer.valueOf(i8), "CVE is already linked to the same parent");
                                        } else {
                                            fdatVar4.a(Integer.valueOf(i8), "CVE is already linked to a different parent");
                                        }
                                    } else {
                                        dsvdVar5.f.e(dsvdVar6);
                                    }
                                }
                                return fctx.a;
                            }
                        });
                        return new dsws(dsvdVar3, dsvdVar4, fdatVar3, i7);
                    }
                };
                hmwVar2.af(objS2);
            }
            hmwVar2.ab();
            hob.b(dsvdVar, dsvdVar2, (fdap) objS2, hmlVarC);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dswm
                @Override // defpackage.fdat
                public final Object a(Object obj2, Object obj3) {
                    ((Integer) obj3).intValue();
                    dswt dswtVar = this.a;
                    int i7 = i;
                    dsva[] dsvaVarArr2 = dsvaVarArr;
                    dsvb[] dsvbVarArr2 = dsvbVarArr;
                    fdat fdatVar3 = fdatVar;
                    dswtVar.a(i7, dsvaVarArr2, dsvbVarArr2, fdatVar3, fdatVar2, (hml) obj2, hpy.a(i2 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public final void b(final int i, dsva[] dsvaVarArr, dsvb[] dsvbVarArr, fdat fdatVar, final fdat fdatVar2, hml hmlVar, final int i2, final int i3) {
        int i4;
        int i5;
        dsva[] dsvaVarArr2;
        dsvb[] dsvbVarArr2;
        dsvb[] dsvbVarArr3;
        dsvb[] dsvbVarArr4;
        dsva[] dsvaVarArr3;
        fdat fdatVar3;
        final dsva[] dsvaVarArr4;
        final dsvb[] dsvbVarArr5;
        final fdat fdatVar4;
        fdatVar2.getClass();
        int i6 = i3 & 1;
        hml hmlVarC = hmlVar.c(-2099895634);
        if (i6 != 0) {
            i5 = i2 | 6;
            i4 = i;
        } else {
            i4 = i;
            if ((i2 & 6) == 0) {
                i5 = (true != hmlVarC.B(i4) ? 2 : 4) | i2;
            } else {
                i5 = i2;
            }
        }
        if ((i2 & 48) == 0) {
            int i7 = 16;
            if ((i3 & 2) == 0) {
                dsvaVarArr2 = dsvaVarArr;
                if (hmlVarC.F(dsvaVarArr2)) {
                    i7 = 32;
                }
            } else {
                dsvaVarArr2 = dsvaVarArr;
            }
            i5 |= i7;
        } else {
            dsvaVarArr2 = dsvaVarArr;
        }
        if ((i2 & 384) == 0) {
            int i8 = 128;
            if ((i3 & 4) == 0) {
                dsvbVarArr2 = dsvbVarArr;
                if (hmlVarC.F(dsvbVarArr2)) {
                    i8 = 256;
                }
            } else {
                dsvbVarArr2 = dsvbVarArr;
            }
            i5 |= i8;
        } else {
            dsvbVarArr2 = dsvbVarArr;
        }
        int i9 = i5 | 1797120;
        if ((i2 & 12582912) == 0) {
            i9 |= true != hmlVarC.F(fdatVar2) ? 4194304 : VCardConfig.FLAG_REFRAIN_IMAGE_EXPORT;
        }
        if ((100663296 & i2) == 0) {
            i9 |= true != hmlVarC.D(this) ? VCardConfig.FLAG_REFRAIN_PHONE_NUMBER_FORMATTING : VCardConfig.FLAG_APPEND_TYPE_PARAM;
        }
        if ((38347923 & i9) == 38347922 && hmlVarC.I()) {
            hmlVarC.s();
            fdatVar4 = fdatVar;
            dsvbVarArr5 = dsvbVarArr2;
            dsvaVarArr4 = dsvaVarArr2;
        } else {
            int i10 = i3 & 4;
            int i11 = i3 & 2;
            hmlVarC.t();
            if ((i2 & 1) == 0 || hmlVarC.G()) {
                if (i11 != 0) {
                    i9 &= NetError.ERR_SSL_VERSION_OR_CIPHER_MISMATCH;
                    dsvaVarArr2 = new dsva[0];
                }
                if (i10 != 0) {
                    dsvbVarArr3 = new dsvb[0];
                    i9 &= -897;
                } else {
                    dsvbVarArr3 = dsvbVarArr2;
                }
                hmlVarC.v(1849434622);
                hmw hmwVar = (hmw) hmlVarC;
                Object objS = hmwVar.S();
                if (objS == hmk.a) {
                    objS = new fdat() { // from class: dswo
                        @Override // defpackage.fdat
                        public final Object a(Object obj, Object obj2) {
                            ((Integer) obj).intValue();
                            ((String) obj2).getClass();
                            return fctx.a;
                        }
                    };
                    hmwVar.af(objS);
                }
                hmwVar.ab();
                dsvbVarArr4 = dsvbVarArr3;
                dsvaVarArr3 = dsvaVarArr2;
                fdatVar3 = (fdat) objS;
            } else {
                hmlVarC.s();
                if (i11 != 0) {
                    i9 &= NetError.ERR_SSL_VERSION_OR_CIPHER_MISMATCH;
                }
                if (i10 != 0) {
                    i9 &= -897;
                }
                fdatVar3 = fdatVar;
                dsvaVarArr3 = dsvaVarArr2;
                dsvbVarArr4 = dsvbVarArr2;
            }
            hmlVarC.l();
            int i12 = i9 << 3;
            a(i4, dsvaVarArr3, dsvbVarArr4, fdatVar3, fdatVar2, hmlVarC, (i9 & 3670016) | (i9 & 14) | 12582912 | (i9 & 112) | (i9 & 896) | (i9 & 7168) | (57344 & i9) | (458752 & i9) | (234881024 & i12) | (1879048192 & i12));
            dsvaVarArr4 = dsvaVarArr3;
            dsvbVarArr5 = dsvbVarArr4;
            fdatVar4 = fdatVar3;
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dswp
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dswt dswtVar = this.a;
                    int i13 = i;
                    dsva[] dsvaVarArr5 = dsvaVarArr4;
                    dsvb[] dsvbVarArr6 = dsvbVarArr5;
                    fdat fdatVar5 = fdatVar4;
                    dswtVar.b(i13, dsvaVarArr5, dsvbVarArr6, fdatVar5, fdatVar2, (hml) obj, hpy.a(i2 | 1), i3);
                    return fctx.a;
                }
            };
        }
    }
}
