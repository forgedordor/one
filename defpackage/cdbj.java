package defpackage;

import android.database.Cursor;
import j$.time.Instant;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cdbj extends dqqf implements cdbe {
    @Deprecated
    public cdbj(dqsy dqsyVar, Cursor cursor, String[] strArr, dqxe[] dqxeVarArr, dqwj dqwjVar, dqtm dqtmVar, cdbm cdbmVar) {
        super(dqsyVar, cursor, strArr, dqxeVarArr, cdbo.a, dqwjVar, dqtmVar, cdbmVar);
    }

    @Override // defpackage.dqqf
    protected final /* synthetic */ dqpd b() {
        return new cdar();
    }

    public final cdap c() {
        return cdap.b(getInt(cO(0, cdbo.a)));
    }

    public final Instant e() {
        return bart.b(getLong(cO(3, cdbo.a)));
    }

    public final String f() {
        return getString(cO(1, cdbo.a));
    }

    @Override // defpackage.dqqf
    public final ekgb fI(dqth dqthVar) {
        cdap[] cdapVarArr;
        dqwl dqwlVar = dqthVar.a;
        int i = 1;
        long[] jArrDC = dC(getString(dqthVar.h + 1));
        int length = jArrDC.length;
        if (length == 0 || (length == 1 && jArrDC[0] == -1)) {
            int i2 = ekgb.d;
            return ekoe.a;
        }
        HashSet hashSet = new HashSet();
        dqtm dqtmVar = this.d;
        boolean zDj = dj(0);
        boolean z = dqtmVar.b;
        Instant[] instantArr = null;
        if (!zDj) {
            cdapVarArr = null;
        } else if (z) {
            int[] iArrDs = ds(getString(cO(0, cdbo.a)));
            cdap[] cdapVarArr2 = new cdap[iArrDs.length];
            for (int i3 = 0; i3 < iArrDs.length; i3++) {
                cdap cdapVarB = cdap.b(iArrDs[i3]);
                if (cdapVarB == null) {
                    throw new IllegalStateException();
                }
                cdapVarArr2[i3] = cdapVarB;
            }
            cdapVarArr = (cdap[]) dqru.D(null, cdapVarArr2, new cdap[0]);
        } else {
            cdapVarArr = new cdap[]{c()};
        }
        dqqf.dA(length, cdapVarArr, new ejxr() { // from class: cdbf
            @Override // defpackage.ejxr
            public final Object get() {
                return "external_application:".concat(String.valueOf(this.a.getString(0)));
            }
        });
        String[] strArr = dj(1) ? z ? (String[]) dqru.D(null, du(getString(cO(1, cdbo.a))), new String[0]) : new String[]{f()} : null;
        dqqf.dA(length, strArr, new ejxr() { // from class: cdbg
            @Override // defpackage.ejxr
            public final Object get() {
                return "capability_key:".concat(String.valueOf(this.a.getString(1)));
            }
        });
        String[] strArr2 = dj(2) ? z ? (String[]) dqru.D(null, du(getString(cO(2, cdbo.a))), new String[0]) : new String[]{g()} : null;
        dqqf.dA(length, strArr2, new ejxr() { // from class: cdbh
            @Override // defpackage.ejxr
            public final Object get() {
                return "capability_value:".concat(String.valueOf(this.a.getString(2)));
            }
        });
        if (dj(3)) {
            if (z) {
                long[] jArrDt = dt(getString(cO(3, cdbo.a)));
                int length2 = jArrDt.length;
                Instant[] instantArr2 = new Instant[length2];
                for (int i4 = 0; i4 < length2; i4++) {
                    instantArr2[i4] = bart.b(jArrDt[i4]);
                }
                instantArr = (Instant[]) dqru.D(null, instantArr2, new Instant[0]);
            } else {
                instantArr = new Instant[]{e()};
            }
        }
        dqqf.dA(length, instantArr, new ejxr() { // from class: cdbi
            @Override // defpackage.ejxr
            public final Object get() {
                return "expiry:".concat(String.valueOf(this.a.getString(3)));
            }
        });
        ekfw ekfwVar = new ekfw();
        int i5 = 0;
        while (i5 < length) {
            long j = jArrDC[i5];
            if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                hashSet.add(Long.valueOf(jArrDC[i5]));
                String[] strArr3 = cdbo.a;
                cdat cdatVar = new cdat();
                cdatVar.aF();
                cdatVar.aD();
                long j2 = jArrDC[i5];
                if (cdapVarArr != null) {
                    cdap cdapVar = cdapVarArr[i5];
                    cdatVar.aE(0);
                    cdatVar.a = cdapVar;
                }
                if (strArr != null) {
                    String str = strArr[i5];
                    cdatVar.aE(i);
                    cdatVar.b = str;
                }
                if (strArr2 != null) {
                    String str2 = strArr2[i5];
                    cdatVar.aE(2);
                    cdatVar.c = str2;
                }
                if (instantArr != null) {
                    Instant instant = instantArr[i5];
                    cdatVar.aE(3);
                    cdatVar.d = instant;
                }
                cdar cdarVar = new cdar();
                cdarVar.aD(cdatVar.aB());
                cdarVar.a = cdatVar.a;
                cdarVar.b = cdatVar.b;
                cdarVar.c = cdatVar.c;
                cdarVar.d = cdatVar.d;
                cdarVar.cM = cdatVar.aC();
                ekfwVar.h(cdarVar);
            }
            i5++;
            i = 1;
        }
        return ekfwVar.g();
    }

    public final String g() {
        return getString(cO(2, cdbo.a));
    }

    @Override // defpackage.dqqj
    public final Cursor a() {
        return this;
    }
}
