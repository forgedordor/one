package defpackage;

import android.database.Cursor;
import j$.time.Instant;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bsou extends dqqf implements bsop {
    @Deprecated
    public bsou(dqsy dqsyVar, Cursor cursor, String[] strArr, dqxe[] dqxeVarArr, dqwj dqwjVar, dqtm dqtmVar, bsoy bsoyVar) {
        super(dqsyVar, cursor, strArr, dqxeVarArr, bspe.a, dqwjVar, dqtmVar, bsoyVar);
    }

    @Override // defpackage.dqqf
    protected final /* synthetic */ dqpd b() {
        return new bsoc();
    }

    @Override // defpackage.bsop
    public final String c() {
        return getString(cO(3, bspe.a));
    }

    @Override // defpackage.bsop
    public final String e() {
        return getString(cO(2, bspe.a));
    }

    public final long f() {
        return getLong(cO(0, bspe.a));
    }

    @Override // defpackage.dqqf
    public final ekgb fI(dqth dqthVar) {
        Instant[] instantArr;
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
        long[] jArrC = zDj ? z ? dqru.C(null, dt(getString(cO(0, bspe.a)))) : new long[]{f()} : null;
        dqqf.dz(length, jArrC, new ejxr() { // from class: bsoq
            @Override // defpackage.ejxr
            public final Object get() {
                return "_id:".concat(String.valueOf(this.a.getString(0)));
            }
        });
        if (!dj(1)) {
            instantArr = null;
        } else if (z) {
            long[] jArrDt = dt(getString(cO(1, bspe.a)));
            int length2 = jArrDt.length;
            Instant[] instantArr2 = new Instant[length2];
            for (int i2 = 0; i2 < length2; i2++) {
                instantArr2[i2] = bart.b(jArrDt[i2]);
            }
            instantArr = (Instant[]) dqru.D(null, instantArr2, new Instant[0]);
        } else {
            instantArr = new Instant[]{g()};
        }
        dqqf.dA(length, instantArr, new ejxr() { // from class: bsor
            @Override // defpackage.ejxr
            public final Object get() {
                return "timestamp:".concat(String.valueOf(this.a.getString(1)));
            }
        });
        String[] strArr = dj(2) ? z ? (String[]) dqru.D(null, du(getString(cO(2, bspe.a))), new String[0]) : new String[]{e()} : null;
        dqqf.dA(length, strArr, new ejxr() { // from class: bsos
            @Override // defpackage.ejxr
            public final Object get() {
                return "hash_value:".concat(String.valueOf(this.a.getString(2)));
            }
        });
        String[] strArr2 = dj(3) ? z ? (String[]) dqru.D(null, du(getString(cO(3, bspe.a))), new String[0]) : new String[]{c()} : null;
        dqqf.dA(length, strArr2, new ejxr() { // from class: bsot
            @Override // defpackage.ejxr
            public final Object get() {
                return "hash_key:".concat(String.valueOf(this.a.getString(3)));
            }
        });
        ekfw ekfwVar = new ekfw();
        for (int i3 = 0; i3 < length; i3++) {
            long j = jArrDC[i3];
            if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                hashSet.add(Long.valueOf(jArrDC[i3]));
                String[] strArr3 = bspe.a;
                bsoe bsoeVar = new bsoe();
                bsoeVar.aF();
                bsoeVar.aD();
                long j2 = jArrDC[i3];
                if (jArrC != null) {
                    long j3 = jArrC[i3];
                    bsoeVar.aE(0);
                    bsoeVar.a = j3;
                }
                if (instantArr != null) {
                    Instant instant = instantArr[i3];
                    bsoeVar.aE(1);
                    bsoeVar.b = instant;
                }
                if (strArr != null) {
                    bsoeVar.c(strArr[i3]);
                }
                if (strArr2 != null) {
                    bsoeVar.b(strArr2[i3]);
                }
                ekfwVar.h(bsoeVar.a());
            }
        }
        return ekfwVar.g();
    }

    public final Instant g() {
        return bart.b(getLong(cO(1, bspe.a)));
    }

    @Override // defpackage.dqqj
    public final Cursor a() {
        return this;
    }
}
