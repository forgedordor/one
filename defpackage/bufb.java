package defpackage;

import android.database.Cursor;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bufb extends dqqf implements buex {
    @Deprecated
    public bufb(dqsy dqsyVar, Cursor cursor, String[] strArr, dqxe[] dqxeVarArr, dqwj dqwjVar, dqtm dqtmVar, bufe bufeVar) {
        super(dqsyVar, cursor, strArr, dqxeVarArr, bufg.a, dqwjVar, dqtmVar, bufeVar);
    }

    @Override // defpackage.dqqf
    protected final /* synthetic */ dqpd b() {
        return new buel();
    }

    public final String c() {
        return getString(cO(2, bufg.a));
    }

    public final String e() {
        return getString(cO(1, bufg.a));
    }

    public final String f() {
        return getString(cO(0, bufg.a));
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
        dqtm dqtmVar = this.d;
        boolean zDj = dj(0);
        boolean z = dqtmVar.b;
        String[] strArr = zDj ? z ? (String[]) dqru.D(null, du(getString(cO(0, bufg.a))), new String[0]) : new String[]{f()} : null;
        dqqf.dA(length, strArr, new ejxr() { // from class: buey
            @Override // defpackage.ejxr
            public final Object get() {
                return "sticker_set_id:".concat(String.valueOf(this.a.getString(0)));
            }
        });
        String[] strArr2 = dj(1) ? z ? (String[]) dqru.D(null, du(getString(cO(1, bufg.a))), new String[0]) : new String[]{e()} : null;
        dqqf.dA(length, strArr2, new ejxr() { // from class: buez
            @Override // defpackage.ejxr
            public final Object get() {
                return "locale:".concat(String.valueOf(this.a.getString(1)));
            }
        });
        String[] strArr3 = dj(2) ? z ? (String[]) dqru.D(null, du(getString(cO(2, bufg.a))), new String[0]) : new String[]{c()} : null;
        dqqf.dA(length, strArr3, new ejxr() { // from class: bufa
            @Override // defpackage.ejxr
            public final Object get() {
                return "display_name:".concat(String.valueOf(this.a.getString(2)));
            }
        });
        ekfw ekfwVar = new ekfw();
        for (int i2 = 0; i2 < length; i2++) {
            long j = jArrDC[i2];
            if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                hashSet.add(Long.valueOf(jArrDC[i2]));
                String[] strArr4 = bufg.a;
                buen buenVar = new buen();
                buenVar.aF();
                buenVar.aD();
                long j2 = jArrDC[i2];
                if (strArr != null) {
                    String str = strArr[i2];
                    buenVar.aE(0);
                    buenVar.a = str;
                }
                if (strArr2 != null) {
                    String str2 = strArr2[i2];
                    buenVar.aE(1);
                    buenVar.b = str2;
                }
                if (strArr3 != null) {
                    String str3 = strArr3[i2];
                    buenVar.aE(2);
                    buenVar.c = str3;
                }
                buel buelVar = new buel();
                buelVar.aD(buenVar.aB());
                buelVar.a = buenVar.a;
                buelVar.b = buenVar.b;
                buelVar.c = buenVar.c;
                buelVar.cM = buenVar.aC();
                ekfwVar.h(buelVar);
            }
        }
        return ekfwVar.g();
    }

    @Override // defpackage.dqqj
    public final Cursor a() {
        return this;
    }
}
