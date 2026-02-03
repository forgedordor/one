package defpackage;

import android.database.Cursor;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class awwv extends dqqf implements awwn {
    @Deprecated
    public awwv(dqsy dqsyVar, Cursor cursor, String[] strArr, dqxe[] dqxeVarArr, dqwj dqwjVar, dqtm dqtmVar, awxb awxbVar) {
        super(dqsyVar, cursor, strArr, dqxeVarArr, awxh.a, dqwjVar, dqtmVar, awxbVar);
    }

    @Override // defpackage.dqqf
    protected final /* synthetic */ dqpd b() {
        return new awvr();
    }

    @Override // defpackage.awwn
    public final ekgb c() {
        ekfw ekfwVar = new ekfw();
        while (moveToNext()) {
            if (g() != null) {
                ekfwVar.h(g());
            }
        }
        return ekfwVar.g();
    }

    public final awxl e() {
        awxl[] awxlVarArrValues = awxl.values();
        int i = getInt(cO(4, awxh.a));
        if (i < awxlVarArrValues.length) {
            return awxlVarArrValues[i];
        }
        throw new IllegalArgumentException();
    }

    public final axcm f() {
        return axcn.a(getString(cO(1, awxh.a)));
    }

    @Override // defpackage.dqqf
    public final ekgb fI(dqth dqthVar) {
        axcm[] axcmVarArr;
        axcm[] axcmVarArr2;
        awxl[] awxlVarArr;
        dqwl dqwlVar = dqthVar.a;
        long[] jArrDC = dC(getString(dqthVar.h + 1));
        int length = jArrDC.length;
        if (length != 0) {
            if (length != 1 || jArrDC[0] != -1) {
                HashSet hashSet = new HashSet();
                dqtm dqtmVar = this.d;
                boolean zDj = dj(0);
                boolean z = dqtmVar.b;
                if (!zDj) {
                    axcmVarArr = null;
                } else if (z) {
                    String[] strArrDu = du(getString(cO(0, awxh.a)));
                    int length2 = strArrDu.length;
                    axcm[] axcmVarArr3 = new axcm[length2];
                    for (int i = 0; i < length2; i++) {
                        axcmVarArr3[i] = axcn.a(strArrDu[i]);
                    }
                    axcmVarArr = (axcm[]) dqru.D(null, axcmVarArr3, new axcm[0]);
                } else {
                    axcmVarArr = new axcm[]{g()};
                }
                dqqf.dA(length, axcmVarArr, new ejxr() { // from class: awwo
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "token:".concat(String.valueOf(this.a.getString(0)));
                    }
                });
                if (!dj(1)) {
                    axcmVarArr2 = null;
                } else if (z) {
                    String[] strArrDu2 = du(getString(cO(1, awxh.a)));
                    int length3 = strArrDu2.length;
                    axcm[] axcmVarArr4 = new axcm[length3];
                    for (int i2 = 0; i2 < length3; i2++) {
                        axcmVarArr4[i2] = axcn.a(strArrDu2[i2]);
                    }
                    axcmVarArr2 = (axcm[]) dqru.D(null, axcmVarArr4, new axcm[0]);
                } else {
                    axcmVarArr2 = new axcm[]{f()};
                }
                dqqf.dA(length, axcmVarArr2, new ejxr() { // from class: awwp
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "canonical_token:".concat(String.valueOf(this.a.getString(1)));
                    }
                });
                String[] strArr = dj(2) ? z ? (String[]) dqru.D(null, du(getString(cO(2, awxh.a))), new String[0]) : new String[]{j()} : null;
                dqqf.dA(length, strArr, new ejxr() { // from class: awwq
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "provisioning_id_v2:".concat(String.valueOf(this.a.getString(2)));
                    }
                });
                boolean[] zArrE = dj(3) ? z ? dqru.E(null, dv(getString(cO(3, awxh.a)))) : new boolean[]{k()} : null;
                dqqf.dB(length, zArrE, new ejxr() { // from class: awwr
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "is_verified_v2:".concat(String.valueOf(this.a.getString(3)));
                    }
                });
                if (!dj(4)) {
                    awxlVarArr = null;
                } else if (z) {
                    int[] iArrDs = ds(getString(cO(4, awxh.a)));
                    awxl[] awxlVarArrValues = awxl.values();
                    int length4 = awxlVarArrValues.length;
                    awxl[] awxlVarArr2 = new awxl[iArrDs.length];
                    for (int i3 = 0; i3 < iArrDs.length; i3++) {
                        int i4 = iArrDs[i3];
                        if (i4 >= length4) {
                            throw new IllegalStateException();
                        }
                        awxlVarArr2[i3] = awxlVarArrValues[i4];
                    }
                    awxlVarArr = (awxl[]) dqru.D(null, awxlVarArr2, new awxl[0]);
                } else {
                    awxlVarArr = new awxl[]{e()};
                }
                dqqf.dA(length, awxlVarArr, new ejxr() { // from class: awws
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "address_type:".concat(String.valueOf(this.a.getString(4)));
                    }
                });
                String[] strArr2 = dj(5) ? z ? (String[]) dqru.D(null, du(getString(cO(5, awxh.a))), new String[0]) : new String[]{h()} : null;
                dqqf.dA(length, strArr2, new ejxr() { // from class: awwt
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "phone_number:".concat(String.valueOf(this.a.getString(5)));
                    }
                });
                String[] strArr3 = dj(6) ? z ? (String[]) dqru.D(null, du(getString(cO(6, awxh.a))), new String[0]) : new String[]{i()} : null;
                dqqf.dA(length, strArr3, new ejxr() { // from class: awwu
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "display_name:".concat(String.valueOf(this.a.getString(6)));
                    }
                });
                ekfw ekfwVar = new ekfw();
                for (int i5 = 0; i5 < length; i5++) {
                    long j = jArrDC[i5];
                    if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                        hashSet.add(Long.valueOf(jArrDC[i5]));
                        String[] strArr4 = awxh.a;
                        awvv awvvVar = new awvv();
                        awvvVar.aF();
                        awvvVar.aD();
                        long j2 = jArrDC[i5];
                        if (axcmVarArr != null) {
                            awvvVar.i(axcmVarArr[i5]);
                        }
                        if (axcmVarArr2 != null) {
                            awvvVar.e(axcmVarArr2[i5]);
                        }
                        if (strArr != null) {
                            awvvVar.h(strArr[i5]);
                        }
                        if (zArrE != null) {
                            awvvVar.g(zArrE[i5]);
                        }
                        if (awxlVarArr != null) {
                            awvvVar.d(awxlVarArr[i5]);
                        }
                        if (strArr2 != null) {
                            awvvVar.c(strArr2[i5]);
                        }
                        if (strArr3 != null) {
                            awvvVar.f(strArr3[i5]);
                        }
                        ekfwVar.h(awvvVar.a());
                    }
                }
                return ekfwVar.g();
            }
        }
        int i6 = ekgb.d;
        return ekoe.a;
    }

    public final axcm g() {
        return axcn.a(getString(cO(0, awxh.a)));
    }

    public final String h() {
        return getString(cO(5, awxh.a));
    }

    public final String i() {
        return getString(cO(6, awxh.a));
    }

    public final String j() {
        return getString(cO(2, awxh.a));
    }

    public final boolean k() {
        return getInt(cO(3, awxh.a)) == 1;
    }

    @Override // defpackage.dqqj
    public final Cursor a() {
        return this;
    }
}
