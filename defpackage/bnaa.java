package defpackage;

import android.database.Cursor;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bnaa extends dqqf implements bmzr {
    @Deprecated
    public bnaa(dqsy dqsyVar, Cursor cursor, String[] strArr, dqxe[] dqxeVarArr, dqwj dqwjVar, dqtm dqtmVar, bnag bnagVar) {
        super(dqsyVar, cursor, strArr, dqxeVarArr, bnak.a, dqwjVar, dqtmVar, bnagVar);
    }

    @Override // defpackage.dqqf
    protected final /* synthetic */ dqpd b() {
        return new bmyw();
    }

    public final long c() {
        return getLong(cO(7, bnak.a));
    }

    public final long e() {
        return getLong(cO(0, bnak.a));
    }

    public final long f() {
        return getLong(cO(1, bnak.a));
    }

    @Override // defpackage.dqqf
    public final ekgb fI(dqth dqthVar) {
        avbk[] avbkVarArr;
        long[] jArr;
        dqwl dqwlVar = dqthVar.a;
        long[] jArrDC = dC(getString(dqthVar.h + 1));
        int length = jArrDC.length;
        if (length == 0 || (length == 1 && jArrDC[0] == -1)) {
            int i = ekgb.d;
            return ekoe.a;
        }
        HashSet hashSet = new HashSet();
        dqtm dqtmVar = this.d;
        boolean zDj = dj(0);
        boolean z = dqtmVar.b;
        long[] jArrC = zDj ? z ? dqru.C(null, dt(getString(cO(0, bnak.a)))) : new long[]{e()} : null;
        dqqf.dz(length, jArrC, new ejxr() { // from class: bmzs
            @Override // defpackage.ejxr
            public final Object get() {
                return "_id:".concat(String.valueOf(this.a.getString(0)));
            }
        });
        long[] jArrC2 = dj(1) ? z ? dqru.C(null, dt(getString(cO(1, bnak.a)))) : new long[]{f()} : null;
        dqqf.dz(length, jArrC2, new ejxr() { // from class: bmzt
            @Override // defpackage.ejxr
            public final Object get() {
                return "table_type:".concat(String.valueOf(this.a.getString(1)));
            }
        });
        String[] strArr = dj(2) ? z ? (String[]) dqru.D(null, du(getString(cO(2, bnak.a))), new String[0]) : new String[]{j()} : null;
        dqqf.dA(length, strArr, new ejxr() { // from class: bmzu
            @Override // defpackage.ejxr
            public final Object get() {
                return "item_id:".concat(String.valueOf(this.a.getString(2)));
            }
        });
        String[] strArr2 = dj(3) ? z ? (String[]) dqru.D(null, du(getString(cO(3, bnak.a))), new String[0]) : new String[]{i()} : null;
        dqqf.dA(length, strArr2, new ejxr() { // from class: bmzv
            @Override // defpackage.ejxr
            public final Object get() {
                return "cms_id:".concat(String.valueOf(this.a.getString(3)));
            }
        });
        long[] jArrC3 = dj(4) ? z ? dqru.C(null, dt(getString(cO(4, bnak.a)))) : new long[]{g()} : null;
        dqqf.dz(length, jArrC3, new ejxr() { // from class: bmzw
            @Override // defpackage.ejxr
            public final Object get() {
                return "timestamp:".concat(String.valueOf(this.a.getString(4)));
            }
        });
        if (!dj(5)) {
            avbkVarArr = null;
        } else if (z) {
            int[] iArrDs = ds(getString(cO(5, bnak.a)));
            avbk[] avbkVarArrValues = avbk.values();
            int length2 = avbkVarArrValues.length;
            avbk[] avbkVarArr2 = new avbk[iArrDs.length];
            for (int i2 = 0; i2 < iArrDs.length; i2++) {
                int i3 = iArrDs[i2];
                if (i3 >= length2) {
                    throw new IllegalStateException();
                }
                avbkVarArr2[i2] = avbkVarArrValues[i3];
            }
            avbkVarArr = (avbk[]) dqru.D(null, avbkVarArr2, new avbk[0]);
        } else {
            avbkVarArr = new avbk[]{h()};
        }
        dqqf.dA(length, avbkVarArr, new ejxr() { // from class: bmzx
            @Override // defpackage.ejxr
            public final Object get() {
                return "event_type:".concat(String.valueOf(this.a.getString(5)));
            }
        });
        String[] strArr3 = dj(6) ? z ? (String[]) dqru.D(null, du(getString(cO(6, bnak.a))), new String[0]) : new String[]{k()} : null;
        dqqf.dA(length, strArr3, new ejxr() { // from class: bmzy
            @Override // defpackage.ejxr
            public final Object get() {
                return "status:".concat(String.valueOf(this.a.getString(6)));
            }
        });
        long[] jArrC4 = dj(7) ? z ? dqru.C(null, dt(getString(cO(7, bnak.a)))) : new long[]{c()} : null;
        dqqf.dz(length, jArrC4, new ejxr() { // from class: bmzz
            @Override // defpackage.ejxr
            public final Object get() {
                return "attempt_number:".concat(String.valueOf(this.a.getString(7)));
            }
        });
        ekfw ekfwVar = new ekfw();
        int i4 = 0;
        while (i4 < length) {
            long j = jArrDC[i4];
            if (j <= 0 || hashSet.contains(Long.valueOf(j))) {
                jArr = jArrDC;
            } else {
                hashSet.add(Long.valueOf(jArrDC[i4]));
                String[] strArr4 = bnak.a;
                bmyy bmyyVar = new bmyy();
                bmyyVar.aF();
                bmyyVar.aD();
                long j2 = jArrDC[i4];
                jArr = jArrDC;
                if (jArrC != null) {
                    long j3 = jArrC[i4];
                    bmyyVar.aE(0);
                    bmyyVar.a = j3;
                }
                if (jArrC2 != null) {
                    bmyyVar.g(jArrC2[i4]);
                }
                if (strArr != null) {
                    bmyyVar.e(strArr[i4]);
                }
                if (strArr2 != null) {
                    bmyyVar.c(strArr2[i4]);
                }
                if (jArrC3 != null) {
                    bmyyVar.h(jArrC3[i4]);
                }
                if (avbkVarArr != null) {
                    bmyyVar.d(avbkVarArr[i4]);
                }
                if (strArr3 != null) {
                    bmyyVar.f(strArr3[i4]);
                }
                if (jArrC4 != null) {
                    bmyyVar.b(jArrC4[i4]);
                }
                ekfwVar.h(bmyyVar.a());
            }
            i4++;
            jArrDC = jArr;
        }
        return ekfwVar.g();
    }

    public final long g() {
        return getLong(cO(4, bnak.a));
    }

    public final avbk h() {
        avbk[] avbkVarArrValues = avbk.values();
        int i = getInt(cO(5, bnak.a));
        if (i < avbkVarArrValues.length) {
            return avbkVarArrValues[i];
        }
        throw new IllegalArgumentException();
    }

    public final String i() {
        return getString(cO(3, bnak.a));
    }

    public final String j() {
        return getString(cO(2, bnak.a));
    }

    public final String k() {
        return getString(cO(6, bnak.a));
    }

    @Override // defpackage.dqqj
    public final Cursor a() {
        return this;
    }
}
