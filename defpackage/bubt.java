package defpackage;

import android.database.Cursor;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bubt extends dqqf implements bubn {
    @Deprecated
    public bubt(dqsy dqsyVar, Cursor cursor, String[] strArr, dqxe[] dqxeVarArr, dqwj dqwjVar, dqtm dqtmVar, bubz bubzVar) {
        super(dqsyVar, cursor, strArr, dqxeVarArr, bucf.a, dqwjVar, dqtmVar, bubzVar);
    }

    @Override // defpackage.dqqf
    protected final /* synthetic */ dqpd b() {
        return new buay();
    }

    public final long c() {
        return getLong(cO(0, bucf.a));
    }

    public final long e() {
        return getLong(cO(4, bucf.a));
    }

    public final String f() {
        return getString(cO(1, bucf.a));
    }

    @Override // defpackage.dqqf
    public final ekgb fI(dqth dqthVar) {
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
        long[] jArrC = zDj ? z ? dqru.C(null, dt(getString(cO(0, bucf.a)))) : new long[]{c()} : null;
        dqqf.dz(length, jArrC, new ejxr() { // from class: bubo
            @Override // defpackage.ejxr
            public final Object get() {
                return "_id:".concat(String.valueOf(this.a.getString(0)));
            }
        });
        String[] strArr = dj(1) ? z ? (String[]) dqru.D(null, du(getString(cO(1, bucf.a))), new String[0]) : new String[]{f()} : null;
        dqqf.dA(length, strArr, new ejxr() { // from class: bubp
            @Override // defpackage.ejxr
            public final Object get() {
                return "key:".concat(String.valueOf(this.a.getString(1)));
            }
        });
        String[] strArr2 = dj(2) ? z ? (String[]) dqru.D(null, du(getString(cO(2, bucf.a))), new String[0]) : new String[]{g()} : null;
        dqqf.dA(length, strArr2, new ejxr() { // from class: bubq
            @Override // defpackage.ejxr
            public final Object get() {
                return "sub_key:".concat(String.valueOf(this.a.getString(2)));
            }
        });
        byte[][] bArrF = dj(3) ? z ? dqru.F(null, dD(getString(cO(3, bucf.a)))) : new byte[][]{h()} : null;
        dqqf.dA(length, bArrF, new ejxr() { // from class: bubr
            @Override // defpackage.ejxr
            public final Object get() {
                return "data:".concat(String.valueOf(this.a.getString(3)));
            }
        });
        long[] jArrC2 = dj(4) ? z ? dqru.C(null, dt(getString(cO(4, bucf.a)))) : new long[]{e()} : null;
        dqqf.dz(length, jArrC2, new ejxr() { // from class: bubs
            @Override // defpackage.ejxr
            public final Object get() {
                return "last_modified_timestamp:".concat(String.valueOf(this.a.getString(4)));
            }
        });
        ekfw ekfwVar = new ekfw();
        for (int i2 = 0; i2 < length; i2++) {
            long j = jArrDC[i2];
            if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                hashSet.add(Long.valueOf(jArrDC[i2]));
                String[] strArr3 = bucf.a;
                buba bubaVar = new buba();
                bubaVar.aF();
                bubaVar.aD();
                long j2 = jArrDC[i2];
                if (jArrC != null) {
                    long j3 = jArrC[i2];
                    bubaVar.aE(0);
                    bubaVar.a = j3;
                }
                if (strArr != null) {
                    bubaVar.c(strArr[i2]);
                }
                if (strArr2 != null) {
                    bubaVar.d(strArr2[i2]);
                }
                if (bArrF != null) {
                    bubaVar.b(bArrF[i2]);
                }
                if (jArrC2 != null) {
                    long j4 = jArrC2[i2];
                    bubaVar.aE(4);
                    bubaVar.e = j4;
                }
                ekfwVar.h(bubaVar.a());
            }
        }
        return ekfwVar.g();
    }

    public final String g() {
        return getString(cO(2, bucf.a));
    }

    public final byte[] h() {
        return getBlob(cO(3, bucf.a));
    }

    @Override // defpackage.dqqj
    public final Cursor a() {
        return this;
    }
}
