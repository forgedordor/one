package defpackage;

import android.database.Cursor;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bovb extends dqqf implements bouy {
    @Deprecated
    public bovb(dqsy dqsyVar, Cursor cursor, String[] strArr, dqxe[] dqxeVarArr, dqwj dqwjVar, dqtm dqtmVar, bovh bovhVar) {
        super(dqsyVar, cursor, strArr, dqxeVarArr, bovn.a, dqwjVar, dqtmVar, bovhVar);
    }

    @Override // defpackage.dqqf
    protected final /* synthetic */ dqpd b() {
        return new boup();
    }

    public final long c() {
        return getLong(cO(1, bovn.a));
    }

    public final bvdj e() {
        return bvdj.b(getInt(cO(0, bovn.a)));
    }

    @Override // defpackage.dqqf
    public final ekgb fI(dqth dqthVar) {
        bvdj[] bvdjVarArr;
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
                    bvdjVarArr = null;
                } else if (z) {
                    int[] iArrDs = ds(getString(cO(0, bovn.a)));
                    bvdj[] bvdjVarArr2 = new bvdj[iArrDs.length];
                    for (int i = 0; i < iArrDs.length; i++) {
                        bvdj bvdjVarB = bvdj.b(iArrDs[i]);
                        if (bvdjVarB == null) {
                            throw new IllegalStateException();
                        }
                        bvdjVarArr2[i] = bvdjVarB;
                    }
                    bvdjVarArr = (bvdj[]) dqru.D(null, bvdjVarArr2, new bvdj[0]);
                } else {
                    bvdjVarArr = new bvdj[]{e()};
                }
                dqqf.dA(length, bvdjVarArr, new ejxr() { // from class: bouz
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "_id:".concat(String.valueOf(this.a.getString(0)));
                    }
                });
                long[] jArrC = dj(1) ? z ? dqru.C(null, dt(getString(cO(1, bovn.a)))) : new long[]{c()} : null;
                dqqf.dz(length, jArrC, new ejxr() { // from class: bova
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "last_update_version:".concat(String.valueOf(this.a.getString(1)));
                    }
                });
                ekfw ekfwVar = new ekfw();
                for (int i2 = 0; i2 < length; i2++) {
                    long j = jArrDC[i2];
                    if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                        hashSet.add(Long.valueOf(jArrDC[i2]));
                        String[] strArr = bovn.a;
                        bour bourVar = new bour();
                        bourVar.aF();
                        bourVar.aD();
                        long j2 = jArrDC[i2];
                        if (bvdjVarArr != null) {
                            bourVar.b(bvdjVarArr[i2]);
                        }
                        if (jArrC != null) {
                            bourVar.c(jArrC[i2]);
                        }
                        ekfwVar.h(bourVar.a());
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
