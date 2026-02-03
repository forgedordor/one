package defpackage;

import android.database.Cursor;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class btcj extends dqqf implements btcg {
    @Deprecated
    public btcj(dqsy dqsyVar, Cursor cursor, String[] strArr, dqxe[] dqxeVarArr, dqwj dqwjVar, dqtm dqtmVar, btcn btcnVar) {
        super(dqsyVar, cursor, strArr, dqxeVarArr, btcp.a, dqwjVar, dqtmVar, btcnVar);
    }

    @Override // defpackage.dqqf
    protected final /* synthetic */ dqpd b() {
        return new btbx();
    }

    public final basd c() {
        return basd.a(getString(cO(0, btcp.a)));
    }

    public final String e() {
        return getString(cO(1, btcp.a));
    }

    @Override // defpackage.dqqf
    public final ekgb fI(dqth dqthVar) {
        basd[] basdVarArr;
        dqwl dqwlVar = dqthVar.a;
        long[] jArrDC = dC(getString(dqthVar.h + 1));
        int length = jArrDC.length;
        if (length == 0 || (length == 1 && jArrDC[0] == -1)) {
            int i = ekgb.d;
            return ekoe.a;
        }
        HashSet hashSet = new HashSet();
        dqtm dqtmVar = this.d;
        boolean zDj = dj(0);
        boolean z = dqtmVar.b;
        if (!zDj) {
            basdVarArr = null;
        } else if (z) {
            String[] strArrDu = du(getString(cO(0, btcp.a)));
            int length2 = strArrDu.length;
            basd[] basdVarArr2 = new basd[length2];
            for (int i2 = 0; i2 < length2; i2++) {
                basdVarArr2[i2] = basd.a(strArrDu[i2]);
            }
            basdVarArr = (basd[]) dqru.D(null, basdVarArr2, new basd[0]);
        } else {
            basdVarArr = new basd[]{c()};
        }
        dqqf.dA(length, basdVarArr, new ejxr() { // from class: btch
            @Override // defpackage.ejxr
            public final Object get() {
                return "rcs_message_id:".concat(String.valueOf(this.a.getString(0)));
            }
        });
        String[] strArr = dj(1) ? z ? (String[]) dqru.D(null, du(getString(cO(1, btcp.a))), new String[0]) : new String[]{e()} : null;
        dqqf.dA(length, strArr, new ejxr() { // from class: btci
            @Override // defpackage.ejxr
            public final Object get() {
                return "self_msisdn:".concat(String.valueOf(this.a.getString(1)));
            }
        });
        ekfw ekfwVar = new ekfw();
        for (int i3 = 0; i3 < length; i3++) {
            long j = jArrDC[i3];
            if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                hashSet.add(Long.valueOf(jArrDC[i3]));
                String[] strArr2 = btcp.a;
                btbz btbzVar = new btbz();
                btbzVar.aF();
                btbzVar.aD();
                long j2 = jArrDC[i3];
                if (basdVarArr != null) {
                    basd basdVar = basdVarArr[i3];
                    btbzVar.aE(0);
                    btbzVar.a = basdVar;
                }
                if (strArr != null) {
                    String str = strArr[i3];
                    btbzVar.aE(1);
                    btbzVar.b = str;
                }
                btbx btbxVar = new btbx();
                btbxVar.aD(btbzVar.aB());
                btbxVar.a = btbzVar.a;
                btbxVar.b = btbzVar.b;
                btbxVar.cM = btbzVar.aC();
                ekfwVar.h(btbxVar);
            }
        }
        return ekfwVar.g();
    }

    @Override // defpackage.dqqj
    public final Cursor a() {
        return this;
    }
}
