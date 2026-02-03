package defpackage;

import android.database.Cursor;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bowf extends dqqf implements bowb {
    @Deprecated
    public bowf(dqsy dqsyVar, Cursor cursor, String[] strArr, dqxe[] dqxeVarArr, dqwj dqwjVar, dqtm dqtmVar, bowj bowjVar) {
        super(dqsyVar, cursor, strArr, dqxeVarArr, bowl.a, dqwjVar, dqtmVar, bowjVar);
    }

    @Override // defpackage.dqqf
    protected final /* synthetic */ dqpd b() {
        return new bovq();
    }

    public final long c() {
        return getLong(cO(2, bowl.a));
    }

    public final long e() {
        return getLong(cO(0, bowl.a));
    }

    public final String f() {
        return getString(cO(1, bowl.a));
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
        long[] jArrC = zDj ? z ? dqru.C(null, dt(getString(cO(0, bowl.a)))) : new long[]{e()} : null;
        dqqf.dz(length, jArrC, new ejxr() { // from class: bowc
            @Override // defpackage.ejxr
            public final Object get() {
                return "_id:".concat(String.valueOf(this.a.getString(0)));
            }
        });
        String[] strArr = dj(1) ? z ? (String[]) dqru.D(null, du(getString(cO(1, bowl.a))), new String[0]) : new String[]{f()} : null;
        dqqf.dA(length, strArr, new ejxr() { // from class: bowd
            @Override // defpackage.ejxr
            public final Object get() {
                return "phone_number:".concat(String.valueOf(this.a.getString(1)));
            }
        });
        long[] jArrC2 = dj(2) ? z ? dqru.C(null, dt(getString(cO(2, bowl.a)))) : new long[]{c()} : null;
        dqqf.dz(length, jArrC2, new ejxr() { // from class: bowe
            @Override // defpackage.ejxr
            public final Object get() {
                return "data_size:".concat(String.valueOf(this.a.getString(2)));
            }
        });
        ekfw ekfwVar = new ekfw();
        for (int i2 = 0; i2 < length; i2++) {
            long j = jArrDC[i2];
            if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                hashSet.add(Long.valueOf(jArrDC[i2]));
                String[] strArr2 = bowl.a;
                bovs bovsVar = new bovs();
                bovsVar.aF();
                bovsVar.aD();
                long j2 = jArrDC[i2];
                if (jArrC != null) {
                    long j3 = jArrC[i2];
                    bovsVar.aE(0);
                    bovsVar.a = j3;
                }
                if (strArr != null) {
                    String str = strArr[i2];
                    bovsVar.aE(1);
                    bovsVar.b = str;
                }
                if (jArrC2 != null) {
                    long j4 = jArrC2[i2];
                    bovsVar.aE(2);
                    bovsVar.c = j4;
                }
                bovq bovqVar = new bovq();
                bovqVar.aD(bovsVar.aB());
                bovqVar.a = bovsVar.a;
                bovqVar.b = bovsVar.b;
                bovqVar.c = bovsVar.c;
                bovqVar.cM = bovsVar.aC();
                ekfwVar.h(bovqVar);
            }
        }
        return ekfwVar.g();
    }

    @Override // defpackage.dqqj
    public final Cursor a() {
        return this;
    }
}
