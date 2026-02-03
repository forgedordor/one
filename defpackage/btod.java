package defpackage;

import android.database.Cursor;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class btod extends dqqf implements btoa {
    @Deprecated
    public btod(dqsy dqsyVar, Cursor cursor, String[] strArr, dqxe[] dqxeVarArr, dqwj dqwjVar, dqtm dqtmVar, btoj btojVar) {
        super(dqsyVar, cursor, strArr, dqxeVarArr, bton.a, dqwjVar, dqtmVar, btojVar);
    }

    @Override // defpackage.dqqf
    protected final /* synthetic */ dqpd b() {
        return new btnq();
    }

    @Override // defpackage.btoa
    public final String c() {
        return getString(cO(0, bton.a));
    }

    public final String e() {
        return getString(cO(1, bton.a));
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
                String[] strArr = zDj ? z ? (String[]) dqru.D(null, du(getString(cO(0, bton.a))), new String[0]) : new String[]{c()} : null;
                dqqf.dA(length, strArr, new ejxr() { // from class: btob
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "remote_user_id:".concat(String.valueOf(this.a.getString(0)));
                    }
                });
                String[] strArr2 = dj(1) ? z ? (String[]) dqru.D(null, du(getString(cO(1, bton.a))), new String[0]) : new String[]{e()} : null;
                dqqf.dA(length, strArr2, new ejxr() { // from class: btoc
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "tachyon_registration_id:".concat(String.valueOf(this.a.getString(1)));
                    }
                });
                ekfw ekfwVar = new ekfw();
                for (int i = 0; i < length; i++) {
                    long j = jArrDC[i];
                    if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                        hashSet.add(Long.valueOf(jArrDC[i]));
                        String[] strArr3 = bton.a;
                        btns btnsVar = new btns();
                        btnsVar.aF();
                        btnsVar.aD();
                        long j2 = jArrDC[i];
                        if (strArr != null) {
                            btnsVar.b(strArr[i]);
                        }
                        if (strArr2 != null) {
                            btnsVar.c(strArr2[i]);
                        }
                        ekfwVar.h(btnsVar.a());
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
