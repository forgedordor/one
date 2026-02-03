package defpackage;

import android.database.Cursor;
import j$.time.Instant;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ccdy extends dqqf implements ccds {
    @Deprecated
    public ccdy(dqsy dqsyVar, Cursor cursor, String[] strArr, dqxe[] dqxeVarArr, dqwj dqwjVar, dqtm dqtmVar, cceg ccegVar) {
        super(dqsyVar, cursor, strArr, dqxeVarArr, ccen.a, dqwjVar, dqtmVar, ccegVar);
    }

    @Override // defpackage.dqqf
    protected final /* synthetic */ dqpd b() {
        return new ccdd();
    }

    @Override // defpackage.ccds
    public final ekgb c() {
        ekfw ekfwVar = new ekfw();
        while (moveToNext()) {
            e();
            ekfwVar.h(Long.valueOf(e()));
        }
        return ekfwVar.g();
    }

    public final long e() {
        return getLong(cO(2, ccen.a));
    }

    public final Instant f() {
        return bart.b(getLong(cO(4, ccen.a)));
    }

    @Override // defpackage.dqqf
    public final ekgb fI(dqth dqthVar) {
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
                String[] strArr = zDj ? z ? (String[]) dqru.D(null, du(getString(cO(0, ccen.a))), new String[0]) : new String[]{h()} : null;
                dqqf.dA(length, strArr, new ejxr() { // from class: ccdt
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "identity_id:".concat(String.valueOf(this.a.getString(0)));
                    }
                });
                String[] strArr2 = dj(1) ? z ? (String[]) dqru.D(null, du(getString(cO(1, ccen.a))), new String[0]) : new String[]{g()} : null;
                dqqf.dA(length, strArr2, new ejxr() { // from class: ccdu
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "group_id:".concat(String.valueOf(this.a.getString(1)));
                    }
                });
                long[] jArrC = dj(2) ? z ? dqru.C(null, dt(getString(cO(2, ccen.a)))) : new long[]{e()} : null;
                dqqf.dz(length, jArrC, new ejxr() { // from class: ccdv
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "epoch_id:".concat(String.valueOf(this.a.getString(2)));
                    }
                });
                byte[][] bArrF = dj(3) ? z ? dqru.F(null, dD(getString(cO(3, ccen.a)))) : new byte[][]{i()} : null;
                dqqf.dA(length, bArrF, new ejxr() { // from class: ccdw
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "epoch_data:".concat(String.valueOf(this.a.getString(3)));
                    }
                });
                if (dj(4)) {
                    if (z) {
                        long[] jArrDt = dt(getString(cO(4, ccen.a)));
                        int length2 = jArrDt.length;
                        Instant[] instantArr2 = new Instant[length2];
                        for (int i = 0; i < length2; i++) {
                            instantArr2[i] = bart.b(jArrDt[i]);
                        }
                        instantArr = (Instant[]) dqru.D(null, instantArr2, new Instant[0]);
                    } else {
                        instantArr = new Instant[]{f()};
                    }
                }
                dqqf.dA(length, instantArr, new ejxr() { // from class: ccdx
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "creation_timestamp:".concat(String.valueOf(this.a.getString(4)));
                    }
                });
                ekfw ekfwVar = new ekfw();
                for (int i2 = 0; i2 < length; i2++) {
                    long j = jArrDC[i2];
                    if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                        hashSet.add(Long.valueOf(jArrDC[i2]));
                        String[] strArr3 = ccen.a;
                        ccdf ccdfVar = new ccdf();
                        ccdfVar.aF();
                        ccdfVar.aD();
                        long j2 = jArrDC[i2];
                        if (strArr != null) {
                            ccdfVar.f(strArr[i2]);
                        }
                        if (strArr2 != null) {
                            ccdfVar.e(strArr2[i2]);
                        }
                        if (jArrC != null) {
                            ccdfVar.d(jArrC[i2]);
                        }
                        if (bArrF != null) {
                            ccdfVar.c(bArrF[i2]);
                        }
                        if (instantArr != null) {
                            ccdfVar.b(instantArr[i2]);
                        }
                        ekfwVar.h(ccdfVar.a());
                    }
                }
                return ekfwVar.g();
            }
        }
        int i3 = ekgb.d;
        return ekoe.a;
    }

    public final String g() {
        return getString(cO(1, ccen.a));
    }

    public final String h() {
        return getString(cO(0, ccen.a));
    }

    public final byte[] i() {
        return getBlob(cO(3, ccen.a));
    }

    @Override // defpackage.dqqj
    public final Cursor a() {
        return this;
    }
}
