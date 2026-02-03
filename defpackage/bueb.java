package defpackage;

import android.database.Cursor;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bueb extends dqqf implements budx {
    @Deprecated
    public bueb(dqsy dqsyVar, Cursor cursor, String[] strArr, dqxe[] dqxeVarArr, dqwj dqwjVar, dqtm dqtmVar, buee bueeVar) {
        super(dqsyVar, cursor, strArr, dqxeVarArr, buei.a, dqwjVar, dqtmVar, bueeVar);
    }

    @Override // defpackage.dqqf
    protected final /* synthetic */ dqpd b() {
        return new budm();
    }

    public final String c() {
        return getString(cO(1, buei.a));
    }

    public final String e() {
        return getString(cO(2, buei.a));
    }

    public final String f() {
        return getString(cO(0, buei.a));
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
                String[] strArr = zDj ? z ? (String[]) dqru.D(null, du(getString(cO(0, buei.a))), new String[0]) : new String[]{f()} : null;
                dqqf.dA(length, strArr, new ejxr() { // from class: budy
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "tbl:".concat(String.valueOf(this.a.getString(0)));
                    }
                });
                String[] strArr2 = dj(1) ? z ? (String[]) dqru.D(null, du(getString(cO(1, buei.a))), new String[0]) : new String[]{c()} : null;
                dqqf.dA(length, strArr2, new ejxr() { // from class: budz
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "idx:".concat(String.valueOf(this.a.getString(1)));
                    }
                });
                String[] strArr3 = dj(2) ? z ? (String[]) dqru.D(null, du(getString(cO(2, buei.a))), new String[0]) : new String[]{e()} : null;
                dqqf.dA(length, strArr3, new ejxr() { // from class: buea
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "stat:".concat(String.valueOf(this.a.getString(2)));
                    }
                });
                ekfw ekfwVar = new ekfw();
                for (int i = 0; i < length; i++) {
                    long j = jArrDC[i];
                    if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                        hashSet.add(Long.valueOf(jArrDC[i]));
                        String[] strArr4 = buei.a;
                        budo budoVar = new budo();
                        budoVar.aF();
                        budoVar.aD();
                        long j2 = jArrDC[i];
                        if (strArr != null) {
                            budoVar.d(strArr[i]);
                        }
                        if (strArr2 != null) {
                            budoVar.b(strArr2[i]);
                        }
                        if (strArr3 != null) {
                            budoVar.c(strArr3[i]);
                        }
                        ekfwVar.h(budoVar.a());
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
