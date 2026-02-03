package defpackage;

import android.database.Cursor;
import j$.time.Instant;
import java.util.HashSet;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class brgj extends dqqf implements brgf {
    @Deprecated
    public brgj(dqsy dqsyVar, Cursor cursor, String[] strArr, dqxe[] dqxeVarArr, dqwj dqwjVar, dqtm dqtmVar, brgo brgoVar) {
        super(dqsyVar, cursor, strArr, dqxeVarArr, brgt.a, dqwjVar, dqtmVar, brgoVar);
    }

    @Override // defpackage.dqqf
    protected final /* synthetic */ dqpd b() {
        return new brfr();
    }

    public final float c() {
        return getFloat(cO(2, brgt.a));
    }

    public final bash e() {
        return new bash(getLong(cO(0, brgt.a)));
    }

    public final Instant f() {
        return barq.b(getLong(cO(1, brgt.a)));
    }

    @Override // defpackage.dqqf
    public final ekgb fI(dqth dqthVar) {
        bash[] bashVarArr;
        Instant[] instantArr;
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
                    bashVarArr = null;
                } else if (z) {
                    long[] jArrDt = dt(getString(cO(0, brgt.a)));
                    int length2 = jArrDt.length;
                    bash[] bashVarArr2 = new bash[length2];
                    for (int i = 0; i < length2; i++) {
                        bashVarArr2[i] = new bash(jArrDt[i]);
                    }
                    bashVarArr = (bash[]) dqru.D(null, bashVarArr2, new bash[0]);
                } else {
                    bashVarArr = new bash[]{e()};
                }
                dqqf.dA(length, bashVarArr, new ejxr() { // from class: brgg
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "feature_id:".concat(String.valueOf(this.a.getString(0)));
                    }
                });
                if (!dj(1)) {
                    instantArr = null;
                } else if (z) {
                    long[] jArrDt2 = dt(getString(cO(1, brgt.a)));
                    int length3 = jArrDt2.length;
                    Instant[] instantArr2 = new Instant[length3];
                    for (int i2 = 0; i2 < length3; i2++) {
                        instantArr2[i2] = barq.b(jArrDt2[i2]);
                    }
                    instantArr = (Instant[]) dqru.D(null, instantArr2, new Instant[0]);
                } else {
                    instantArr = new Instant[]{f()};
                }
                dqqf.dA(length, instantArr, new ejxr() { // from class: brgh
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "date:".concat(String.valueOf(this.a.getString(1)));
                    }
                });
                float[] fArrI = dj(2) ? z ? dqru.I(dr(getString(cO(2, brgt.a)))) : new float[]{c()} : null;
                dqqf.dx(length, fArrI, new ejxr() { // from class: brgi
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "feature_value:".concat(String.valueOf(this.a.getString(2)));
                    }
                });
                ekfw ekfwVar = new ekfw();
                for (int i3 = 0; i3 < length; i3++) {
                    long j = jArrDC[i3];
                    if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                        hashSet.add(Long.valueOf(jArrDC[i3]));
                        String[] strArr = brgt.a;
                        brfv brfvVar = new brfv();
                        brfvVar.aF();
                        brfvVar.aD();
                        long j2 = jArrDC[i3];
                        if (bashVarArr != null) {
                            brfvVar.c(bashVarArr[i3]);
                        }
                        if (instantArr != null) {
                            brfvVar.b(instantArr[i3]);
                        }
                        if (fArrI != null) {
                            brfvVar.d(fArrI[i3]);
                        }
                        ekfwVar.h(brfvVar.a(new Supplier() { // from class: brft
                            @Override // java.util.function.Supplier
                            public final Object get() {
                                return new brfr();
                            }
                        }));
                    }
                }
                return ekfwVar.g();
            }
        }
        int i4 = ekgb.d;
        return ekoe.a;
    }

    @Override // defpackage.dqqj
    public final Cursor a() {
        return this;
    }
}
