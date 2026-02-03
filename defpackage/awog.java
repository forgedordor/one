package defpackage;

import android.database.Cursor;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class awog extends dqqf implements awod {
    @Deprecated
    public awog(dqsy dqsyVar, Cursor cursor, String[] strArr, dqxe[] dqxeVarArr, dqwj dqwjVar, dqtm dqtmVar, awom awomVar) {
        super(dqsyVar, cursor, strArr, dqxeVarArr, awoq.a, dqwjVar, dqtmVar, awomVar);
    }

    @Override // defpackage.dqqf
    protected final /* synthetic */ dqpd b() {
        return new awns();
    }

    public final awjl c() {
        return awjm.a(getString(cO(1, awoq.a)));
    }

    public final awjl e() {
        return awjm.a(getString(cO(0, awoq.a)));
    }

    @Override // defpackage.dqqf
    public final ekgb fI(dqth dqthVar) {
        awjl[] awjlVarArr;
        dqwl dqwlVar = dqthVar.a;
        long[] jArrDC = dC(getString(dqthVar.h + 1));
        int length = jArrDC.length;
        if (length != 0) {
            if (length != 1 || jArrDC[0] != -1) {
                HashSet hashSet = new HashSet();
                dqtm dqtmVar = this.d;
                boolean zDj = dj(0);
                boolean z = dqtmVar.b;
                awjl[] awjlVarArr2 = null;
                if (!zDj) {
                    awjlVarArr = null;
                } else if (z) {
                    String[] strArrDu = du(getString(cO(0, awoq.a)));
                    int length2 = strArrDu.length;
                    awjl[] awjlVarArr3 = new awjl[length2];
                    for (int i = 0; i < length2; i++) {
                        awjlVarArr3[i] = awjm.a(strArrDu[i]);
                    }
                    awjlVarArr = (awjl[]) dqru.D(null, awjlVarArr3, new awjl[0]);
                } else {
                    awjlVarArr = new awjl[]{e()};
                }
                dqqf.dA(length, awjlVarArr, new ejxr() { // from class: awoe
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "group_token:".concat(String.valueOf(this.a.getString(0)));
                    }
                });
                if (dj(1)) {
                    if (z) {
                        String[] strArrDu2 = du(getString(cO(1, awoq.a)));
                        int length3 = strArrDu2.length;
                        awjl[] awjlVarArr4 = new awjl[length3];
                        for (int i2 = 0; i2 < length3; i2++) {
                            awjlVarArr4[i2] = awjm.a(strArrDu2[i2]);
                        }
                        awjlVarArr2 = (awjl[]) dqru.D(null, awjlVarArr4, new awjl[0]);
                    } else {
                        awjlVarArr2 = new awjl[]{c()};
                    }
                }
                dqqf.dA(length, awjlVarArr2, new ejxr() { // from class: awof
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "destination_token:".concat(String.valueOf(this.a.getString(1)));
                    }
                });
                ekfw ekfwVar = new ekfw();
                for (int i3 = 0; i3 < length; i3++) {
                    long j = jArrDC[i3];
                    if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                        hashSet.add(Long.valueOf(jArrDC[i3]));
                        String[] strArr = awoq.a;
                        awnu awnuVar = new awnu();
                        awnuVar.aF();
                        awnuVar.aD();
                        long j2 = jArrDC[i3];
                        if (awjlVarArr != null) {
                            awnuVar.c(awjlVarArr[i3]);
                        }
                        if (awjlVarArr2 != null) {
                            awnuVar.b(awjlVarArr2[i3]);
                        }
                        ekfwVar.h(awnuVar.a());
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
