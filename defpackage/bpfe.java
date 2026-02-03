package defpackage;

import android.database.Cursor;
import j$.time.Instant;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bpfe extends dqqf implements bpey {
    @Deprecated
    public bpfe(dqsy dqsyVar, Cursor cursor, String[] strArr, dqxe[] dqxeVarArr, dqwj dqwjVar, dqtm dqtmVar, bpfi bpfiVar) {
        super(dqsyVar, cursor, strArr, dqxeVarArr, bpfo.a, dqwjVar, dqtmVar, bpfiVar);
    }

    @Override // defpackage.dqqf
    protected final /* synthetic */ dqpd b() {
        return new bpej();
    }

    public final long c() {
        return getLong(cO(4, bpfo.a));
    }

    public final amrb e() {
        amrb[] amrbVarArrValues = amrb.values();
        int i = getInt(cO(1, bpfo.a));
        if (i < amrbVarArrValues.length) {
            return amrbVarArrValues[i];
        }
        throw new IllegalArgumentException();
    }

    public final Instant f() {
        return bart.b(getLong(cO(3, bpfo.a)));
    }

    @Override // defpackage.dqqf
    public final ekgb fI(dqth dqthVar) {
        amrb[] amrbVarArr;
        Instant[] instantArr;
        Instant[] instantArr2;
        dqwl dqwlVar = dqthVar.a;
        long[] jArrDC = dC(getString(dqthVar.h + 1));
        int length = jArrDC.length;
        if (length != 0) {
            if (length != 1 || jArrDC[0] != -1) {
                HashSet hashSet = new HashSet();
                dqtm dqtmVar = this.d;
                boolean zDj = dj(0);
                boolean z = dqtmVar.b;
                String[] strArr = zDj ? z ? (String[]) dqru.D(null, du(getString(cO(0, bpfo.a))), new String[0]) : new String[]{h()} : null;
                dqqf.dA(length, strArr, new ejxr() { // from class: bpez
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "emergency_destination:".concat(String.valueOf(this.a.getString(0)));
                    }
                });
                if (!dj(1)) {
                    amrbVarArr = null;
                } else if (z) {
                    int[] iArrDs = ds(getString(cO(1, bpfo.a)));
                    amrb[] amrbVarArrValues = amrb.values();
                    int length2 = amrbVarArrValues.length;
                    amrb[] amrbVarArr2 = new amrb[iArrDs.length];
                    for (int i = 0; i < iArrDs.length; i++) {
                        int i2 = iArrDs[i];
                        if (i2 >= length2) {
                            throw new IllegalStateException();
                        }
                        amrbVarArr2[i] = amrbVarArrValues[i2];
                    }
                    amrbVarArr = (amrb[]) dqru.D(null, amrbVarArr2, new amrb[0]);
                } else {
                    amrbVarArr = new amrb[]{e()};
                }
                dqqf.dA(length, amrbVarArr, new ejxr() { // from class: bpfa
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "type:".concat(String.valueOf(this.a.getString(1)));
                    }
                });
                if (!dj(2)) {
                    instantArr = null;
                } else if (z) {
                    long[] jArrDt = dt(getString(cO(2, bpfo.a)));
                    int length3 = jArrDt.length;
                    Instant[] instantArr3 = new Instant[length3];
                    for (int i3 = 0; i3 < length3; i3++) {
                        instantArr3[i3] = bart.b(jArrDt[i3]);
                    }
                    instantArr = (Instant[]) dqru.D(null, instantArr3, new Instant[0]);
                } else {
                    instantArr = new Instant[]{g()};
                }
                dqqf.dA(length, instantArr, new ejxr() { // from class: bpfb
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "start_timestamp:".concat(String.valueOf(this.a.getString(2)));
                    }
                });
                if (!dj(3)) {
                    instantArr2 = null;
                } else if (z) {
                    long[] jArrDt2 = dt(getString(cO(3, bpfo.a)));
                    int length4 = jArrDt2.length;
                    Instant[] instantArr4 = new Instant[length4];
                    for (int i4 = 0; i4 < length4; i4++) {
                        instantArr4[i4] = bart.b(jArrDt2[i4]);
                    }
                    instantArr2 = (Instant[]) dqru.D(null, instantArr4, new Instant[0]);
                } else {
                    instantArr2 = new Instant[]{f()};
                }
                dqqf.dA(length, instantArr2, new ejxr() { // from class: bpfc
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "end_timestamp:".concat(String.valueOf(this.a.getString(3)));
                    }
                });
                long[] jArrC = dj(4) ? z ? dqru.C(null, dt(getString(cO(4, bpfo.a)))) : new long[]{c()} : null;
                dqqf.dz(length, jArrC, new ejxr() { // from class: bpfd
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "refill_duration_ms:".concat(String.valueOf(this.a.getString(4)));
                    }
                });
                ekfw ekfwVar = new ekfw();
                for (int i5 = 0; i5 < length; i5++) {
                    long j = jArrDC[i5];
                    if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                        hashSet.add(Long.valueOf(jArrDC[i5]));
                        String[] strArr2 = bpfo.a;
                        bpel bpelVar = new bpel();
                        bpelVar.aF();
                        bpelVar.aD();
                        long j2 = jArrDC[i5];
                        if (strArr != null) {
                            bpelVar.b(strArr[i5]);
                        }
                        if (amrbVarArr != null) {
                            bpelVar.f(amrbVarArr[i5]);
                        }
                        if (instantArr != null) {
                            bpelVar.e(instantArr[i5]);
                        }
                        if (instantArr2 != null) {
                            bpelVar.c(instantArr2[i5]);
                        }
                        if (jArrC != null) {
                            bpelVar.d(jArrC[i5]);
                        }
                        ekfwVar.h(bpelVar.a());
                    }
                }
                return ekfwVar.g();
            }
        }
        int i6 = ekgb.d;
        return ekoe.a;
    }

    public final Instant g() {
        return bart.b(getLong(cO(2, bpfo.a)));
    }

    public final String h() {
        return getString(cO(0, bpfo.a));
    }

    @Override // defpackage.dqqj
    public final Cursor a() {
        return this;
    }
}
