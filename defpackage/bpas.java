package defpackage;

import android.database.Cursor;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bpas extends dqqf implements bpap {
    @Deprecated
    public bpas(dqsy dqsyVar, Cursor cursor, String[] strArr, dqxe[] dqxeVarArr, dqwj dqwjVar, dqtm dqtmVar, bpay bpayVar) {
        super(dqsyVar, cursor, strArr, dqxeVarArr, bpbc.a, dqwjVar, dqtmVar, bpayVar);
    }

    @Override // defpackage.dqqf
    protected final /* synthetic */ dqpd b() {
        return new bpag();
    }

    public final String c() {
        return getString(cO(0, bpbc.a));
    }

    public final String e() {
        return getString(cO(1, bpbc.a));
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
                String[] strArr = zDj ? z ? (String[]) dqru.D(null, du(getString(cO(0, bpbc.a))), new String[0]) : new String[]{c()} : null;
                dqqf.dA(length, strArr, new ejxr() { // from class: bpaq
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "lookup_key:".concat(String.valueOf(this.a.getString(0)));
                    }
                });
                String[] strArr2 = dj(1) ? z ? (String[]) dqru.D(null, du(getString(cO(1, bpbc.a))), new String[0]) : new String[]{e()} : null;
                dqqf.dA(length, strArr2, new ejxr() { // from class: bpar
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "normalized_destination:".concat(String.valueOf(this.a.getString(1)));
                    }
                });
                ekfw ekfwVar = new ekfw();
                for (int i = 0; i < length; i++) {
                    long j = jArrDC[i];
                    if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                        hashSet.add(Long.valueOf(jArrDC[i]));
                        String[] strArr3 = bpbc.a;
                        bpai bpaiVar = new bpai();
                        bpaiVar.aF();
                        bpaiVar.aD();
                        long j2 = jArrDC[i];
                        if (strArr != null) {
                            bpaiVar.b(strArr[i]);
                        }
                        if (strArr2 != null) {
                            bpaiVar.c(strArr2[i]);
                        }
                        ekfwVar.h(bpaiVar.a());
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
