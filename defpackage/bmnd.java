package defpackage;

import android.database.Cursor;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bmnd extends dqqf implements bmmy {
    @Deprecated
    public bmnd(dqsy dqsyVar, Cursor cursor, String[] strArr, dqxe[] dqxeVarArr, dqwj dqwjVar, dqtm dqtmVar, bmnj bmnjVar) {
        super(dqsyVar, cursor, strArr, dqxeVarArr, bmnn.a, dqwjVar, dqtmVar, bmnjVar);
    }

    @Override // defpackage.dqqf
    protected final /* synthetic */ dqpd b() {
        return new bmml();
    }

    public final long c() {
        return getLong(cO(2, bmnn.a));
    }

    public final long e() {
        return getLong(cO(1, bmnn.a));
    }

    public final long f() {
        return getLong(cO(0, bmnn.a));
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
        long[] jArrC = zDj ? z ? dqru.C(null, dt(getString(cO(0, bmnn.a)))) : new long[]{f()} : null;
        dqqf.dz(length, jArrC, new ejxr() { // from class: bmmz
            @Override // defpackage.ejxr
            public final Object get() {
                return "_id:".concat(String.valueOf(this.a.getString(0)));
            }
        });
        long[] jArrC2 = dj(1) ? z ? dqru.C(null, dt(getString(cO(1, bmnn.a)))) : new long[]{e()} : null;
        dqqf.dz(length, jArrC2, new ejxr() { // from class: bmna
            @Override // defpackage.ejxr
            public final Object get() {
                return "dependent_id:".concat(String.valueOf(this.a.getString(1)));
            }
        });
        long[] jArrC3 = dj(2) ? z ? dqru.C(null, dt(getString(cO(2, bmnn.a)))) : new long[]{c()} : null;
        dqqf.dz(length, jArrC3, new ejxr() { // from class: bmnb
            @Override // defpackage.ejxr
            public final Object get() {
                return "dependency_id:".concat(String.valueOf(this.a.getString(2)));
            }
        });
        long[] jArrC4 = dj(3) ? z ? dqru.C(null, dt(getString(cO(3, bmnn.a)))) : new long[]{g()} : null;
        dqqf.dz(length, jArrC4, new ejxr() { // from class: bmnc
            @Override // defpackage.ejxr
            public final Object get() {
                return "inserted_at_timestamp:".concat(String.valueOf(this.a.getString(3)));
            }
        });
        ekfw ekfwVar = new ekfw();
        for (int i2 = 0; i2 < length; i2++) {
            long j = jArrDC[i2];
            if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                hashSet.add(Long.valueOf(jArrDC[i2]));
                String[] strArr = bmnn.a;
                bmmn bmmnVar = new bmmn();
                bmmnVar.aF();
                bmmnVar.aD();
                long j2 = jArrDC[i2];
                if (jArrC != null) {
                    long j3 = jArrC[i2];
                    bmmnVar.aE(0);
                    bmmnVar.a = j3;
                }
                if (jArrC2 != null) {
                    bmmnVar.c(jArrC2[i2]);
                }
                if (jArrC3 != null) {
                    bmmnVar.b(jArrC3[i2]);
                }
                if (jArrC4 != null) {
                    bmmnVar.d(jArrC4[i2]);
                }
                ekfwVar.h(bmmnVar.a());
            }
        }
        return ekfwVar.g();
    }

    public final long g() {
        return getLong(cO(3, bmnn.a));
    }

    @Override // defpackage.dqqj
    public final Cursor a() {
        return this;
    }
}
