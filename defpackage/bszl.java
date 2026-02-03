package defpackage;

import android.database.Cursor;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bszl extends dqqf implements bszg {
    @Deprecated
    public bszl(dqsy dqsyVar, Cursor cursor, String[] strArr, dqxe[] dqxeVarArr, dqwj dqwjVar, dqtm dqtmVar, bszr bszrVar) {
        super(dqsyVar, cursor, strArr, dqxeVarArr, bszx.a, dqwjVar, dqtmVar, bszrVar);
    }

    @Override // defpackage.dqqf
    protected final /* synthetic */ dqpd b() {
        return new bsyt();
    }

    public final String c() {
        return getString(cO(0, bszx.a));
    }

    public final String e() {
        return getString(cO(3, bszx.a));
    }

    public final String f() {
        return getString(cO(2, bszx.a));
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
                String[] strArr = zDj ? z ? (String[]) dqru.D(null, du(getString(cO(0, bszx.a))), new String[0]) : new String[]{c()} : null;
                dqqf.dA(length, strArr, new ejxr() { // from class: bszh
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "verifier_id:".concat(String.valueOf(this.a.getString(0)));
                    }
                });
                String[] strArr2 = dj(1) ? z ? (String[]) dqru.D(null, du(getString(cO(1, bszx.a))), new String[0]) : new String[]{g()} : null;
                dqqf.dA(length, strArr2, new ejxr() { // from class: bszi
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "verifier_name:".concat(String.valueOf(this.a.getString(1)));
                    }
                });
                String[] strArr3 = dj(2) ? z ? (String[]) dqru.D(null, du(getString(cO(2, bszx.a))), new String[0]) : new String[]{f()} : null;
                dqqf.dA(length, strArr3, new ejxr() { // from class: bszj
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "verifier_logo_image_remote_url:".concat(String.valueOf(this.a.getString(2)));
                    }
                });
                String[] strArr4 = dj(3) ? z ? (String[]) dqru.D(null, du(getString(cO(3, bszx.a))), new String[0]) : new String[]{e()} : null;
                dqqf.dA(length, strArr4, new ejxr() { // from class: bszk
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "verifier_logo_image_local_uri:".concat(String.valueOf(this.a.getString(3)));
                    }
                });
                ekfw ekfwVar = new ekfw();
                for (int i = 0; i < length; i++) {
                    long j = jArrDC[i];
                    if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                        hashSet.add(Long.valueOf(jArrDC[i]));
                        String[] strArr5 = bszx.a;
                        bsyv bsyvVar = new bsyv();
                        bsyvVar.aF();
                        bsyvVar.aD();
                        long j2 = jArrDC[i];
                        if (strArr != null) {
                            bsyvVar.b(strArr[i]);
                        }
                        if (strArr2 != null) {
                            bsyvVar.e(strArr2[i]);
                        }
                        if (strArr3 != null) {
                            bsyvVar.d(strArr3[i]);
                        }
                        if (strArr4 != null) {
                            bsyvVar.c(strArr4[i]);
                        }
                        ekfwVar.h(bsyvVar.a());
                    }
                }
                return ekfwVar.g();
            }
        }
        int i2 = ekgb.d;
        return ekoe.a;
    }

    public final String g() {
        return getString(cO(1, bszx.a));
    }

    @Override // defpackage.dqqj
    public final Cursor a() {
        return this;
    }
}
