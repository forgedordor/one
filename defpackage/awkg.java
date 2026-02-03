package defpackage;

import android.database.Cursor;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class awkg extends dqqf implements awkc {
    @Deprecated
    public awkg(dqsy dqsyVar, Cursor cursor, String[] strArr, dqxe[] dqxeVarArr, dqwj dqwjVar, dqtm dqtmVar, awkk awkkVar) {
        super(dqsyVar, cursor, strArr, dqxeVarArr, awko.a, dqwjVar, dqtmVar, awkkVar);
    }

    @Override // defpackage.dqqf
    protected final /* synthetic */ dqpd b() {
        return new awjr();
    }

    public final awja c() {
        awja[] awjaVarArrValues = awja.values();
        int i = getInt(cO(2, awko.a));
        if (i < awjaVarArrValues.length) {
            return awjaVarArrValues[i];
        }
        throw new IllegalArgumentException();
    }

    public final awjl e() {
        return awjm.a(getString(cO(0, awko.a)));
    }

    public final String f() {
        return getString(cO(1, awko.a));
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
                awja[] awjaVarArr = null;
                if (!zDj) {
                    awjlVarArr = null;
                } else if (z) {
                    String[] strArrDu = du(getString(cO(0, awko.a)));
                    int length2 = strArrDu.length;
                    awjl[] awjlVarArr2 = new awjl[length2];
                    for (int i = 0; i < length2; i++) {
                        awjlVarArr2[i] = awjm.a(strArrDu[i]);
                    }
                    awjlVarArr = (awjl[]) dqru.D(null, awjlVarArr2, new awjl[0]);
                } else {
                    awjlVarArr = new awjl[]{e()};
                }
                dqqf.dA(length, awjlVarArr, new ejxr() { // from class: awkd
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "token:".concat(String.valueOf(this.a.getString(0)));
                    }
                });
                String[] strArr = dj(1) ? z ? (String[]) dqru.D(null, du(getString(cO(1, awko.a))), new String[0]) : new String[]{f()} : null;
                dqqf.dA(length, strArr, new ejxr() { // from class: awke
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "address:".concat(String.valueOf(this.a.getString(1)));
                    }
                });
                if (dj(2)) {
                    if (z) {
                        int[] iArrDs = ds(getString(cO(2, awko.a)));
                        awja[] awjaVarArrValues = awja.values();
                        int length3 = awjaVarArrValues.length;
                        awja[] awjaVarArr2 = new awja[iArrDs.length];
                        for (int i2 = 0; i2 < iArrDs.length; i2++) {
                            int i3 = iArrDs[i2];
                            if (i3 >= length3) {
                                throw new IllegalStateException();
                            }
                            awjaVarArr2[i2] = awjaVarArrValues[i3];
                        }
                        awjaVarArr = (awja[]) dqru.D(null, awjaVarArr2, new awja[0]);
                    } else {
                        awjaVarArr = new awja[]{c()};
                    }
                }
                dqqf.dA(length, awjaVarArr, new ejxr() { // from class: awkf
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "address_type:".concat(String.valueOf(this.a.getString(2)));
                    }
                });
                ekfw ekfwVar = new ekfw();
                for (int i4 = 0; i4 < length; i4++) {
                    long j = jArrDC[i4];
                    if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                        hashSet.add(Long.valueOf(jArrDC[i4]));
                        String[] strArr2 = awko.a;
                        awjt awjtVar = new awjt();
                        awjtVar.aF();
                        awjtVar.aD();
                        long j2 = jArrDC[i4];
                        if (awjlVarArr != null) {
                            awjtVar.d(awjlVarArr[i4]);
                        }
                        if (strArr != null) {
                            awjtVar.b(strArr[i4]);
                        }
                        if (awjaVarArr != null) {
                            awjtVar.c(awjaVarArr[i4]);
                        }
                        ekfwVar.h(awjtVar.a());
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
