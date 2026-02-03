package defpackage;

import android.database.Cursor;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class btgq extends dqqf implements btgm {
    @Deprecated
    public btgq(dqsy dqsyVar, Cursor cursor, String[] strArr, dqxe[] dqxeVarArr, dqwj dqwjVar, dqtm dqtmVar, btgt btgtVar) {
        super(dqsyVar, cursor, strArr, dqxeVarArr, btgv.a, dqwjVar, dqtmVar, btgtVar);
    }

    @Override // defpackage.dqqf
    protected final /* synthetic */ dqpd b() {
        return new btgb();
    }

    public final long c() {
        return getLong(cO(0, btgv.a));
    }

    public final long e() {
        return getLong(cO(2, btgv.a));
    }

    public final String f() {
        return getString(cO(1, btgv.a));
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
        long[] jArrC = zDj ? z ? dqru.C(null, dt(getString(cO(0, btgv.a)))) : new long[]{c()} : null;
        dqqf.dz(length, jArrC, new ejxr() { // from class: btgn
            @Override // defpackage.ejxr
            public final Object get() {
                return "_id:".concat(String.valueOf(this.a.getString(0)));
            }
        });
        String[] strArr = dj(1) ? z ? (String[]) dqru.D(null, du(getString(cO(1, btgv.a))), new String[0]) : new String[]{f()} : null;
        dqqf.dA(length, strArr, new ejxr() { // from class: btgo
            @Override // defpackage.ejxr
            public final Object get() {
                return "sticker_id:".concat(String.valueOf(this.a.getString(1)));
            }
        });
        long[] jArrC2 = dj(2) ? z ? dqru.C(null, dt(getString(cO(2, btgv.a)))) : new long[]{e()} : null;
        dqqf.dz(length, jArrC2, new ejxr() { // from class: btgp
            @Override // defpackage.ejxr
            public final Object get() {
                return "last_used_timestamp:".concat(String.valueOf(this.a.getString(2)));
            }
        });
        ekfw ekfwVar = new ekfw();
        for (int i2 = 0; i2 < length; i2++) {
            long j = jArrDC[i2];
            if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                hashSet.add(Long.valueOf(jArrDC[i2]));
                String[] strArr2 = btgv.a;
                btgd btgdVar = new btgd();
                btgdVar.aF();
                btgdVar.aD();
                long j2 = jArrDC[i2];
                if (jArrC != null) {
                    long j3 = jArrC[i2];
                    btgdVar.aE(0);
                    btgdVar.a = j3;
                }
                if (strArr != null) {
                    String str = strArr[i2];
                    btgdVar.aE(1);
                    btgdVar.b = str;
                }
                if (jArrC2 != null) {
                    long j4 = jArrC2[i2];
                    btgdVar.aE(2);
                    btgdVar.c = j4;
                }
                btgb btgbVar = new btgb();
                btgbVar.aD(btgdVar.aB());
                btgbVar.a = btgdVar.a;
                btgbVar.b = btgdVar.b;
                btgbVar.c = btgdVar.c;
                btgbVar.cM = btgdVar.aC();
                ekfwVar.h(btgbVar);
            }
        }
        return ekfwVar.g();
    }

    @Override // defpackage.dqqj
    public final Cursor a() {
        return this;
    }
}
