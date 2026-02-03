package defpackage;

import android.database.Cursor;
import j$.time.Instant;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ccgq extends dqqf implements ccgm {
    @Deprecated
    public ccgq(dqsy dqsyVar, Cursor cursor, String[] strArr, dqxe[] dqxeVarArr, dqwj dqwjVar, dqtm dqtmVar, ccgw ccgwVar) {
        super(dqsyVar, cursor, strArr, dqxeVarArr, ccha.a, dqwjVar, dqtmVar, ccgwVar);
    }

    @Override // defpackage.dqqf
    protected final /* synthetic */ dqpd b() {
        return new ccgb();
    }

    public final Instant c() {
        return bart.b(getLong(cO(2, ccha.a)));
    }

    public final byte[] e() {
        return getBlob(cO(0, ccha.a));
    }

    public final byte[] f() {
        return getBlob(cO(1, ccha.a));
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
                byte[][] bArrF = zDj ? z ? dqru.F(null, dD(getString(cO(0, ccha.a)))) : new byte[][]{e()} : null;
                dqqf.dA(length, bArrF, new ejxr() { // from class: ccgn
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "_id:".concat(String.valueOf(this.a.getString(0)));
                    }
                });
                byte[][] bArrF2 = dj(1) ? z ? dqru.F(null, dD(getString(cO(1, ccha.a)))) : new byte[][]{f()} : null;
                dqqf.dA(length, bArrF2, new ejxr() { // from class: ccgo
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "key_package:".concat(String.valueOf(this.a.getString(1)));
                    }
                });
                if (dj(2)) {
                    if (z) {
                        long[] jArrDt = dt(getString(cO(2, ccha.a)));
                        int length2 = jArrDt.length;
                        Instant[] instantArr2 = new Instant[length2];
                        for (int i = 0; i < length2; i++) {
                            instantArr2[i] = bart.b(jArrDt[i]);
                        }
                        instantArr = (Instant[]) dqru.D(null, instantArr2, new Instant[0]);
                    } else {
                        instantArr = new Instant[]{c()};
                    }
                }
                dqqf.dA(length, instantArr, new ejxr() { // from class: ccgp
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "expiration_timestamp:".concat(String.valueOf(this.a.getString(2)));
                    }
                });
                ekfw ekfwVar = new ekfw();
                for (int i2 = 0; i2 < length; i2++) {
                    long j = jArrDC[i2];
                    if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                        hashSet.add(Long.valueOf(jArrDC[i2]));
                        String[] strArr = ccha.a;
                        ccgd ccgdVar = new ccgd();
                        ccgdVar.aF();
                        ccgdVar.aD();
                        long j2 = jArrDC[i2];
                        if (bArrF != null) {
                            ccgdVar.c(bArrF[i2]);
                        }
                        if (bArrF2 != null) {
                            ccgdVar.d(bArrF2[i2]);
                        }
                        if (instantArr != null) {
                            ccgdVar.b(instantArr[i2]);
                        }
                        ekfwVar.h(ccgdVar.a());
                    }
                }
                return ekfwVar.g();
            }
        }
        int i3 = ekgb.d;
        return ekoe.a;
    }

    @Override // defpackage.dqqj
    public final Cursor a() {
        return this;
    }
}
