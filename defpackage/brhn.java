package defpackage;

import android.database.Cursor;
import j$.time.Instant;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class brhn extends dqqf implements brhj {
    @Deprecated
    public brhn(dqsy dqsyVar, Cursor cursor, String[] strArr, dqxe[] dqxeVarArr, dqwj dqwjVar, dqtm dqtmVar, brhr brhrVar) {
        super(dqsyVar, cursor, strArr, dqxeVarArr, brhv.a, dqwjVar, dqtmVar, brhrVar);
    }

    @Override // defpackage.dqqf
    protected final /* synthetic */ dqpd b() {
        return new brgy();
    }

    public final bash c() {
        return new bash(getLong(cO(0, brhv.a)));
    }

    public final basi e() {
        return basi.a(getString(cO(1, brhv.a)));
    }

    public final Instant f() {
        return barq.b(getLong(cO(2, brhv.a)));
    }

    @Override // defpackage.dqqf
    public final ekgb fI(dqth dqthVar) {
        bash[] bashVarArr;
        basi[] basiVarArr;
        dqwl dqwlVar = dqthVar.a;
        long[] jArrDC = dC(getString(dqthVar.h + 1));
        int length = jArrDC.length;
        if (length != 0) {
            if (length != 1 || jArrDC[0] != -1) {
                HashSet hashSet = new HashSet();
                dqtm dqtmVar = this.d;
                boolean zDj = dj(0);
                boolean z = dqtmVar.b;
                Instant[] instantArr = null;
                if (!zDj) {
                    bashVarArr = null;
                } else if (z) {
                    long[] jArrDt = dt(getString(cO(0, brhv.a)));
                    int length2 = jArrDt.length;
                    bash[] bashVarArr2 = new bash[length2];
                    for (int i = 0; i < length2; i++) {
                        bashVarArr2[i] = new bash(jArrDt[i]);
                    }
                    bashVarArr = (bash[]) dqru.D(null, bashVarArr2, new bash[0]);
                } else {
                    bashVarArr = new bash[]{c()};
                }
                dqqf.dA(length, bashVarArr, new ejxr() { // from class: brhk
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "feature_id:".concat(String.valueOf(this.a.getString(0)));
                    }
                });
                if (!dj(1)) {
                    basiVarArr = null;
                } else if (z) {
                    String[] strArrDu = du(getString(cO(1, brhv.a)));
                    int length3 = strArrDu.length;
                    basi[] basiVarArr2 = new basi[length3];
                    for (int i2 = 0; i2 < length3; i2++) {
                        basiVarArr2[i2] = basi.a(strArrDu[i2]);
                    }
                    basiVarArr = (basi[]) dqru.D(null, basiVarArr2, new basi[0]);
                } else {
                    basiVarArr = new basi[]{e()};
                }
                dqqf.dA(length, basiVarArr, new ejxr() { // from class: brhl
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "feature:".concat(String.valueOf(this.a.getString(1)));
                    }
                });
                if (dj(2)) {
                    if (z) {
                        long[] jArrDt2 = dt(getString(cO(2, brhv.a)));
                        int length4 = jArrDt2.length;
                        Instant[] instantArr2 = new Instant[length4];
                        for (int i3 = 0; i3 < length4; i3++) {
                            instantArr2[i3] = barq.b(jArrDt2[i3]);
                        }
                        instantArr = (Instant[]) dqru.D(null, instantArr2, new Instant[0]);
                    } else {
                        instantArr = new Instant[]{f()};
                    }
                }
                dqqf.dA(length, instantArr, new ejxr() { // from class: brhm
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "start_date:".concat(String.valueOf(this.a.getString(2)));
                    }
                });
                ekfw ekfwVar = new ekfw();
                for (int i4 = 0; i4 < length; i4++) {
                    long j = jArrDC[i4];
                    if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                        hashSet.add(Long.valueOf(jArrDC[i4]));
                        String[] strArr = brhv.a;
                        brha brhaVar = new brha();
                        brhaVar.aF();
                        brhaVar.aD();
                        long j2 = jArrDC[i4];
                        if (bashVarArr != null) {
                            brhaVar.c(bashVarArr[i4]);
                        }
                        if (basiVarArr != null) {
                            brhaVar.b(basiVarArr[i4]);
                        }
                        if (instantArr != null) {
                            brhaVar.d(instantArr[i4]);
                        }
                        ekfwVar.h(brhaVar.a());
                    }
                }
                return ekfwVar.g();
            }
        }
        int i5 = ekgb.d;
        return ekoe.a;
    }

    @Override // defpackage.dqqj
    public final Cursor a() {
        return this;
    }
}
