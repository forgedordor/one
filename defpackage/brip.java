package defpackage;

import android.database.Cursor;
import j$.time.Instant;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class brip extends dqqf implements brim {
    @Deprecated
    public brip(dqsy dqsyVar, Cursor cursor, String[] strArr, dqxe[] dqxeVarArr, dqwj dqwjVar, dqtm dqtmVar, briv brivVar) {
        super(dqsyVar, cursor, strArr, dqxeVarArr, briz.a, dqwjVar, dqtmVar, brivVar);
    }

    @Override // defpackage.dqqf
    protected final /* synthetic */ dqpd b() {
        return new brib();
    }

    @Override // defpackage.brim
    public final ejqq c() {
        String[] strArr = briz.a;
        if (isNull(cO(1, strArr))) {
            throw new IllegalStateException("found null in cursor for column features");
        }
        byte[] blob = getBlob(cO(1, strArr));
        if (blob == null) {
            return null;
        }
        try {
            return (ejqq) evsn.parseFrom(ejqq.a, blob, evrr.a());
        } catch (Throwable unused) {
            return ejqq.a;
        }
    }

    public final Instant e() {
        return barq.b(getLong(cO(0, briz.a)));
    }

    @Override // defpackage.dqqf
    public final ekgb fI(dqth dqthVar) {
        Instant[] instantArr;
        ejqq ejqqVar;
        dqwl dqwlVar = dqthVar.a;
        long[] jArrDC = dC(getString(dqthVar.h + 1));
        int length = jArrDC.length;
        if (length != 0) {
            if (length != 1 || jArrDC[0] != -1) {
                HashSet hashSet = new HashSet();
                dqtm dqtmVar = this.d;
                boolean zDj = dj(0);
                boolean z = dqtmVar.b;
                ejqq[] ejqqVarArr = null;
                if (!zDj) {
                    instantArr = null;
                } else if (z) {
                    long[] jArrDt = dt(getString(cO(0, briz.a)));
                    int length2 = jArrDt.length;
                    Instant[] instantArr2 = new Instant[length2];
                    for (int i = 0; i < length2; i++) {
                        instantArr2[i] = barq.b(jArrDt[i]);
                    }
                    instantArr = (Instant[]) dqru.D(null, instantArr2, new Instant[0]);
                } else {
                    instantArr = new Instant[]{e()};
                }
                dqqf.dA(length, instantArr, new ejxr() { // from class: brin
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "date:".concat(String.valueOf(this.a.getString(0)));
                    }
                });
                if (dj(1)) {
                    if (z) {
                        String[] strArr = briz.a;
                        if (isNull(cO(1, strArr))) {
                            throw new IllegalStateException("found null in cursor for column features");
                        }
                        List listDf = df(getString(cO(1, strArr)));
                        ejqq[] ejqqVarArr2 = new ejqq[listDf.size()];
                        Iterator it = listDf.iterator();
                        int i2 = 0;
                        while (it.hasNext()) {
                            try {
                                byte[] bArrZ = dqru.z((String) it.next());
                                int i3 = i2 + 1;
                                if (bArrZ == null) {
                                    ejqqVar = null;
                                } else {
                                    try {
                                        ejqqVar = (ejqq) evsn.parseFrom(ejqq.a, bArrZ);
                                    } catch (Throwable unused) {
                                        i2 = i3;
                                        ejqqVarArr2[i2] = null;
                                        i2++;
                                    }
                                }
                                ejqqVarArr2[i2] = ejqqVar;
                                i2 = i3;
                            } catch (Throwable unused2) {
                            }
                        }
                        ejqqVarArr = (ejqq[]) dqru.D(null, ejqqVarArr2, new ejqq[0]);
                    } else {
                        ejqqVarArr = new ejqq[]{c()};
                    }
                }
                dqqf.dA(length, ejqqVarArr, new ejxr() { // from class: brio
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "features:".concat(String.valueOf(this.a.getString(1)));
                    }
                });
                ekfw ekfwVar = new ekfw();
                for (int i4 = 0; i4 < length; i4++) {
                    long j = jArrDC[i4];
                    if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                        hashSet.add(Long.valueOf(jArrDC[i4]));
                        String[] strArr2 = briz.a;
                        brif brifVar = new brif();
                        brifVar.aF();
                        brifVar.aD();
                        long j2 = jArrDC[i4];
                        if (instantArr != null) {
                            brifVar.b(instantArr[i4]);
                        }
                        if (ejqqVarArr != null) {
                            brifVar.c(ejqqVarArr[i4]);
                        }
                        ekfwVar.h(brifVar.a(new Supplier() { // from class: brid
                            @Override // java.util.function.Supplier
                            public final Object get() {
                                return new brib();
                            }
                        }));
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
