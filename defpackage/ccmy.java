package defpackage;

import android.database.Cursor;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ccmy extends dqqf implements ccmu {
    @Deprecated
    public ccmy(dqsy dqsyVar, Cursor cursor, String[] strArr, dqxe[] dqxeVarArr, dqwj dqwjVar, dqtm dqtmVar, ccne ccneVar) {
        super(dqsyVar, cursor, strArr, dqxeVarArr, ccni.a, dqwjVar, dqtmVar, ccneVar);
    }

    @Override // defpackage.dqqf
    protected final /* synthetic */ dqpd b() {
        return new ccmj();
    }

    public final String c() {
        return getString(cO(1, ccni.a));
    }

    public final String e() {
        return getString(cO(0, ccni.a));
    }

    public final byte[] f() {
        return getBlob(cO(2, ccni.a));
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
                String[] strArr = zDj ? z ? (String[]) dqru.D(null, du(getString(cO(0, ccni.a))), new String[0]) : new String[]{e()} : null;
                dqqf.dA(length, strArr, new ejxr() { // from class: ccmv
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "identity_id:".concat(String.valueOf(this.a.getString(0)));
                    }
                });
                String[] strArr2 = dj(1) ? z ? (String[]) dqru.D(null, du(getString(cO(1, ccni.a))), new String[0]) : new String[]{c()} : null;
                dqqf.dA(length, strArr2, new ejxr() { // from class: ccmw
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "group_id:".concat(String.valueOf(this.a.getString(1)));
                    }
                });
                byte[][] bArrF = dj(2) ? z ? dqru.F(null, dD(getString(cO(2, ccni.a)))) : new byte[][]{f()} : null;
                dqqf.dA(length, bArrF, new ejxr() { // from class: ccmx
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "zinnia_state:".concat(String.valueOf(this.a.getString(2)));
                    }
                });
                ekfw ekfwVar = new ekfw();
                for (int i = 0; i < length; i++) {
                    long j = jArrDC[i];
                    if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                        hashSet.add(Long.valueOf(jArrDC[i]));
                        String[] strArr3 = ccni.a;
                        ccml ccmlVar = new ccml();
                        ccmlVar.aF();
                        ccmlVar.aD();
                        long j2 = jArrDC[i];
                        if (strArr != null) {
                            ccmlVar.c(strArr[i]);
                        }
                        if (strArr2 != null) {
                            ccmlVar.b(strArr2[i]);
                        }
                        if (bArrF != null) {
                            ccmlVar.d(bArrF[i]);
                        }
                        ekfwVar.h(ccmlVar.a());
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
