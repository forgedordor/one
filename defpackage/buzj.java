package defpackage;

import android.database.Cursor;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class buzj extends dqqf implements buzh {
    @Deprecated
    public buzj(dqsy dqsyVar, Cursor cursor, String[] strArr, dqxe[] dqxeVarArr, dqwj dqwjVar, dqtm dqtmVar, buzn buznVar) {
        super(dqsyVar, cursor, strArr, dqxeVarArr, buzp.a, dqwjVar, dqtmVar, buznVar);
    }

    @Override // defpackage.dqqf
    protected final /* synthetic */ dqpd b() {
        return new buza();
    }

    public final String c() {
        return getString(cO(0, buzp.a));
    }

    @Override // defpackage.dqqf
    public final ekgb fI(dqth dqthVar) {
        dqwl dqwlVar = dqthVar.a;
        long[] jArrDC = dC(getString(dqthVar.h + 1));
        int length = jArrDC.length;
        if (length == 0 || (length == 1 && jArrDC[0] == -1)) {
            int i = ekgb.d;
            return ekoe.a;
        }
        HashSet hashSet = new HashSet();
        String[] strArr = dj(0) ? this.d.b ? (String[]) dqru.D(null, du(getString(cO(0, buzp.a))), new String[0]) : new String[]{c()} : null;
        dqqf.dA(length, strArr, new ejxr() { // from class: buzi
            @Override // defpackage.ejxr
            public final Object get() {
                return "sender_id:".concat(String.valueOf(this.a.getString(0)));
            }
        });
        ekfw ekfwVar = new ekfw();
        for (int i2 = 0; i2 < length; i2++) {
            long j = jArrDC[i2];
            if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                hashSet.add(Long.valueOf(jArrDC[i2]));
                String[] strArr2 = buzp.a;
                buzc buzcVar = new buzc();
                buzcVar.aF();
                buzcVar.aD();
                long j2 = jArrDC[i2];
                if (strArr != null) {
                    String str = strArr[i2];
                    buzcVar.aE(0);
                    buzcVar.a = str;
                }
                buza buzaVar = new buza();
                buzaVar.aD(buzcVar.aB());
                buzaVar.a = buzcVar.a;
                buzaVar.cM = buzcVar.aC();
                ekfwVar.h(buzaVar);
            }
        }
        return ekfwVar.g();
    }

    @Override // defpackage.dqqj
    public final Cursor a() {
        return this;
    }
}
