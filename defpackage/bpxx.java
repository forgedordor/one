package defpackage;

import android.database.Cursor;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bpxx extends dqqf implements bpxv {
    @Deprecated
    public bpxx(dqsy dqsyVar, Cursor cursor, String[] strArr, dqxe[] dqxeVarArr, dqwj dqwjVar, dqtm dqtmVar, bpyd bpydVar) {
        super(dqsyVar, cursor, strArr, dqxeVarArr, bpyh.a, dqwjVar, dqtmVar, bpydVar);
    }

    @Override // defpackage.dqqf
    protected final /* synthetic */ dqpd b() {
        return new bpxo();
    }

    @Override // defpackage.bpxv
    public final int c() {
        return getInt(cO(0, bpyh.a));
    }

    @Override // defpackage.dqqf
    public final ekgb fI(dqth dqthVar) {
        dqwl dqwlVar = dqthVar.a;
        long[] jArrDC = dC(getString(dqthVar.h + 1));
        int length = jArrDC.length;
        if (length != 0) {
            if (length != 1 || jArrDC[0] != -1) {
                HashSet hashSet = new HashSet();
                int[] iArrA = dj(0) ? this.d.b ? dqru.A(null, ds(getString(cO(0, bpyh.a)))) : new int[]{c()} : null;
                dqqf.dy(length, iArrA, new ejxr() { // from class: bpxw
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "account_id:".concat(String.valueOf(this.a.getString(0)));
                    }
                });
                ekfw ekfwVar = new ekfw();
                for (int i = 0; i < length; i++) {
                    long j = jArrDC[i];
                    if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                        hashSet.add(Long.valueOf(jArrDC[i]));
                        String[] strArr = bpyh.a;
                        bpxq bpxqVar = new bpxq();
                        bpxqVar.aF();
                        bpxqVar.aD();
                        long j2 = jArrDC[i];
                        if (iArrA != null) {
                            bpxqVar.b(iArrA[i]);
                        }
                        ekfwVar.h(bpxqVar.a());
                    }
                }
                return ekfwVar.g();
            }
        }
        int i2 = ekgb.d;
        return ekoe.a;
    }

    @Override // defpackage.dqqj
    public final Cursor a() {
        return this;
    }
}
