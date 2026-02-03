package defpackage;

import android.database.Cursor;
import j$.time.Instant;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cckf extends dqqf implements ccjt {
    @Deprecated
    public cckf(dqsy dqsyVar, Cursor cursor, String[] strArr, dqxe[] dqxeVarArr, dqwj dqwjVar, dqtm dqtmVar, cckk cckkVar) {
        super(dqsyVar, cursor, strArr, dqxeVarArr, cckr.a, dqwjVar, dqtmVar, cckkVar);
    }

    @Override // defpackage.dqqf
    protected final /* synthetic */ dqpd b() {
        return new ccis();
    }

    @Override // defpackage.ccjt
    public final ekgb c() {
        ekfw ekfwVar = new ekfw();
        while (moveToNext()) {
            if (k() != null) {
                ekfwVar.h(k());
            }
        }
        return ekfwVar.g();
    }

    public final long e() {
        return getLong(cO(7, cckr.a));
    }

    public final long f() {
        return getLong(cO(8, cckr.a));
    }

    @Override // defpackage.dqqf
    public final ekgb fI(dqth dqthVar) {
        basd[] basdVarArr;
        basd[] basdVarArr2;
        Instant[] instantArr;
        int i;
        long[] jArrC;
        long[] jArrC2;
        byte[][] bArrF;
        long[] jArr;
        long[] jArr2;
        athh[] athhVarArr;
        int i2;
        int i3;
        int i4;
        dqwl dqwlVar = dqthVar.a;
        long[] jArrDC = dC(getString(dqthVar.h + 1));
        int length = jArrDC.length;
        if (length == 0 || (length == 1 && jArrDC[0] == -1)) {
            int i5 = ekgb.d;
            return ekoe.a;
        }
        HashSet hashSet = new HashSet();
        boolean z = this.d.b;
        if (!dj(0)) {
            basdVarArr = null;
        } else if (z) {
            String[] strArrDu = du(getString(cO(0, cckr.a)));
            int length2 = strArrDu.length;
            basd[] basdVarArr3 = new basd[length2];
            for (int i6 = 0; i6 < length2; i6++) {
                basdVarArr3[i6] = basd.a(strArrDu[i6]);
            }
            basdVarArr = (basd[]) dqru.D(null, basdVarArr3, new basd[0]);
        } else {
            basdVarArr = new basd[]{i()};
        }
        dqqf.dA(length, basdVarArr, new ejxr() { // from class: ccju
            @Override // defpackage.ejxr
            public final Object get() {
                return "rcs_message_id:".concat(String.valueOf(this.a.getString(0)));
            }
        });
        if (!dj(1)) {
            basdVarArr2 = null;
        } else if (z) {
            String[] strArrDu2 = du(getString(cO(1, cckr.a)));
            int length3 = strArrDu2.length;
            basd[] basdVarArr4 = new basd[length3];
            for (int i7 = 0; i7 < length3; i7++) {
                basdVarArr4[i7] = basd.a(strArrDu2[i7]);
            }
            basdVarArr2 = (basd[]) dqru.D(null, basdVarArr4, new basd[0]);
        } else {
            basdVarArr2 = new basd[]{h()};
        }
        dqqf.dA(length, basdVarArr2, new ejxr() { // from class: ccjx
            @Override // defpackage.ejxr
            public final Object get() {
                return "original_rcs_message_id:".concat(String.valueOf(this.a.getString(1)));
            }
        });
        byte[][] bArrF2 = dj(2) ? z ? dqru.F(null, dD(getString(cO(2, cckr.a)))) : new byte[][]{o()} : null;
        dqqf.dA(length, bArrF2, new ejxr() { // from class: ccjy
            @Override // defpackage.ejxr
            public final Object get() {
                return "raw_cpim_content:".concat(String.valueOf(this.a.getString(2)));
            }
        });
        byte[][] bArrF3 = dj(3) ? z ? dqru.F(null, dD(getString(cO(3, cckr.a)))) : new byte[][]{m()} : null;
        dqqf.dA(length, bArrF3, new ejxr() { // from class: ccjz
            @Override // defpackage.ejxr
            public final Object get() {
                return "encrypted_cpim_content:".concat(String.valueOf(this.a.getString(3)));
            }
        });
        if (!dj(4)) {
            instantArr = null;
        } else if (z) {
            long[] jArrDt = dt(getString(cO(4, cckr.a)));
            int length4 = jArrDt.length;
            Instant[] instantArr2 = new Instant[length4];
            for (int i8 = 0; i8 < length4; i8++) {
                instantArr2[i8] = bart.b(jArrDt[i8]);
            }
            instantArr = (Instant[]) dqru.D(null, instantArr2, new Instant[0]);
        } else {
            instantArr = new Instant[]{j()};
        }
        dqqf.dA(length, instantArr, new ejxr() { // from class: ccka
            @Override // defpackage.ejxr
            public final Object get() {
                return "encryption_timestamp:".concat(String.valueOf(this.a.getString(4)));
            }
        });
        String[] strArr = dj(5) ? z ? (String[]) dqru.D(null, du(getString(cO(5, cckr.a))), new String[0]) : new String[]{l()} : null;
        dqqf.dA(length, strArr, new ejxr() { // from class: cckb
            @Override // defpackage.ejxr
            public final Object get() {
                return "self_identity_id:".concat(String.valueOf(this.a.getString(5)));
            }
        });
        String[] strArr2 = dj(6) ? z ? (String[]) dqru.D(null, du(getString(cO(6, cckr.a))), new String[0]) : new String[]{k()} : null;
        dqqf.dA(length, strArr2, new ejxr() { // from class: cckc
            @Override // defpackage.ejxr
            public final Object get() {
                return "mls_group_id:".concat(String.valueOf(this.a.getString(6)));
            }
        });
        if (!dj(7)) {
            i = 0;
            jArrC = null;
        } else if (z) {
            i = 0;
            jArrC = dqru.C(null, dt(getString(cO(7, cckr.a))));
        } else {
            i = 0;
            jArrC = new long[]{e()};
        }
        dqqf.dz(length, jArrC, new ejxr() { // from class: cckd
            @Override // defpackage.ejxr
            public final Object get() {
                return "mls_epoch_id:".concat(String.valueOf(this.a.getString(7)));
            }
        });
        if (!dj(8)) {
            jArrC2 = null;
        } else if (z) {
            jArrC2 = dqru.C(null, dt(getString(cO(8, cckr.a))));
        } else {
            long[] jArr3 = new long[1];
            jArr3[i] = f();
            jArrC2 = jArr3;
        }
        dqqf.dz(length, jArrC2, new ejxr() { // from class: ccke
            @Override // defpackage.ejxr
            public final Object get() {
                return "mls_era_id:".concat(String.valueOf(this.a.getString(8)));
            }
        });
        if (!dj(9)) {
            bArrF = null;
        } else if (z) {
            bArrF = dqru.F(null, dD(getString(cO(9, cckr.a))));
        } else {
            bArrF = new byte[1][];
            bArrF[i] = n();
        }
        dqqf.dA(length, bArrF, new ejxr() { // from class: ccjv
            @Override // defpackage.ejxr
            public final Object get() {
                return "epoch_authenticator:".concat(String.valueOf(this.a.getString(9)));
            }
        });
        if (!dj(10)) {
            jArr = jArrDC;
            jArr2 = jArrC2;
            athhVarArr = null;
            i2 = i;
        } else if (z) {
            String[] strArrDu3 = du(getString(cO(10, cckr.a)));
            int length5 = strArrDu3.length;
            jArr = jArrDC;
            athh[] athhVarArr2 = new athh[length5];
            jArr2 = jArrC2;
            for (int i9 = i; i9 < length5; i9++) {
                athhVarArr2[i9] = athg.a(strArrDu3[i9]);
            }
            i2 = i;
            athhVarArr = (athh[]) dqru.D(null, athhVarArr2, new athh[i2]);
        } else {
            jArr = jArrDC;
            jArr2 = jArrC2;
            i2 = i;
            athhVarArr = new athh[1];
            athhVarArr[i2] = g();
        }
        dqqf.dA(length, athhVarArr, new ejxr() { // from class: ccjw
            @Override // defpackage.ejxr
            public final Object get() {
                return "file_processing_id:".concat(String.valueOf(this.a.getString(10)));
            }
        });
        ekfw ekfwVar = new ekfw();
        while (i2 < length) {
            long j = jArr[i2];
            if (j <= 0 || hashSet.contains(Long.valueOf(j))) {
                i3 = i2;
                i4 = length;
            } else {
                hashSet.add(Long.valueOf(jArr[i2]));
                String[] strArr3 = cckr.a;
                cciu cciuVar = new cciu();
                cciuVar.aF();
                cciuVar.aD();
                long j2 = jArr[i2];
                if (basdVarArr != null) {
                    cciuVar.k(basdVarArr[i2]);
                }
                if (basdVarArr2 != null) {
                    cciuVar.i(basdVarArr2[i2]);
                }
                if (bArrF2 != null) {
                    cciuVar.j(bArrF2[i2]);
                }
                if (bArrF3 != null) {
                    cciuVar.b(bArrF3[i2]);
                }
                if (instantArr != null) {
                    cciuVar.c(instantArr[i2]);
                }
                if (strArr != null) {
                    cciuVar.l(strArr[i2]);
                }
                if (strArr2 != null) {
                    cciuVar.h(strArr2[i2]);
                }
                i3 = i2;
                i4 = length;
                if (jArrC != null) {
                    cciuVar.f(jArrC[i3]);
                }
                if (jArr2 != null) {
                    cciuVar.g(jArr2[i3]);
                }
                if (bArrF != null) {
                    cciuVar.d(bArrF[i3]);
                }
                if (athhVarArr != null) {
                    cciuVar.e(athhVarArr[i3]);
                }
                ekfwVar.h(cciuVar.a());
            }
            i2 = i3 + 1;
            length = i4;
        }
        return ekfwVar.g();
    }

    public final athh g() {
        return athg.a(getString(cO(10, cckr.a)));
    }

    public final basd h() {
        return basd.a(getString(cO(1, cckr.a)));
    }

    public final basd i() {
        return basd.a(getString(cO(0, cckr.a)));
    }

    public final Instant j() {
        return bart.b(getLong(cO(4, cckr.a)));
    }

    public final String k() {
        return getString(cO(6, cckr.a));
    }

    public final String l() {
        return getString(cO(5, cckr.a));
    }

    public final byte[] m() {
        return getBlob(cO(3, cckr.a));
    }

    public final byte[] n() {
        return getBlob(cO(9, cckr.a));
    }

    public final byte[] o() {
        return getBlob(cO(2, cckr.a));
    }

    @Override // defpackage.dqqj
    public final Cursor a() {
        return this;
    }
}
