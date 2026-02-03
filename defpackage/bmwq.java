package defpackage;

import android.database.Cursor;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bmwq extends dqqf implements bmwh {
    @Deprecated
    public bmwq(dqsy dqsyVar, Cursor cursor, String[] strArr, dqxe[] dqxeVarArr, dqwj dqwjVar, dqtm dqtmVar, bmww bmwwVar) {
        super(dqsyVar, cursor, strArr, dqxeVarArr, bmxa.a, dqwjVar, dqtmVar, bmwwVar);
    }

    @Override // defpackage.dqqf
    protected final /* synthetic */ dqpd b() {
        return new bmvm();
    }

    @Override // defpackage.bmwh
    public final long c() {
        return getLong(cO(1, bmxa.a));
    }

    @Override // defpackage.bmwh
    public final long e() {
        return getLong(cO(7, bmxa.a));
    }

    @Override // defpackage.bmwh
    public final String f() {
        return getString(cO(0, bmxa.a));
    }

    @Override // defpackage.dqqf
    public final ekgb fI(dqth dqthVar) {
        long[] jArr;
        dqwl dqwlVar = dqthVar.a;
        long[] jArrDC = dC(getString(dqthVar.h + 1));
        int length = jArrDC.length;
        if (length != 0) {
            int i = 0;
            if (length != 1 || jArrDC[0] != -1) {
                HashSet hashSet = new HashSet();
                dqtm dqtmVar = this.d;
                boolean zDj = dj(0);
                boolean z = dqtmVar.b;
                String[] strArr = zDj ? z ? (String[]) dqru.D(null, du(getString(cO(0, bmxa.a))), new String[0]) : new String[]{f()} : null;
                dqqf.dA(length, strArr, new ejxr() { // from class: bmwi
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "cms_id:".concat(String.valueOf(this.a.getString(0)));
                    }
                });
                long[] jArrC = dj(1) ? z ? dqru.C(null, dt(getString(cO(1, bmxa.a)))) : new long[]{c()} : null;
                dqqf.dz(length, jArrC, new ejxr() { // from class: bmwj
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "cms_last_mod_seq:".concat(String.valueOf(this.a.getString(1)));
                    }
                });
                String[] strArr2 = dj(2) ? z ? (String[]) dqru.D(null, du(getString(cO(2, bmxa.a))), new String[0]) : new String[]{h()} : null;
                dqqf.dA(length, strArr2, new ejxr() { // from class: bmwk
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "cms_correlation_id:".concat(String.valueOf(this.a.getString(2)));
                    }
                });
                String[] strArr3 = dj(3) ? z ? (String[]) dqru.D(null, du(getString(cO(3, bmxa.a))), new String[0]) : new String[]{j()} : null;
                dqqf.dA(length, strArr3, new ejxr() { // from class: bmwl
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "from_address:".concat(String.valueOf(this.a.getString(3)));
                    }
                });
                String[] strArr4 = dj(4) ? z ? (String[]) dqru.D(null, du(getString(cO(4, bmxa.a))), new String[0]) : new String[]{k()} : null;
                dqqf.dA(length, strArr4, new ejxr() { // from class: bmwm
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "to_address:".concat(String.valueOf(this.a.getString(4)));
                    }
                });
                String[] strArr5 = dj(5) ? z ? (String[]) dqru.D(null, du(getString(cO(5, bmxa.a))), new String[0]) : new String[]{i()} : null;
                dqqf.dA(length, strArr5, new ejxr() { // from class: bmwn
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "correlation_text:".concat(String.valueOf(this.a.getString(5)));
                    }
                });
                long[] jArrC2 = dj(6) ? z ? dqru.C(null, dt(getString(cO(6, bmxa.a)))) : new long[]{g()} : null;
                dqqf.dz(length, jArrC2, new ejxr() { // from class: bmwo
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "modified_at_timestamp:".concat(String.valueOf(this.a.getString(6)));
                    }
                });
                long[] jArrC3 = dj(7) ? z ? dqru.C(null, dt(getString(cO(7, bmxa.a)))) : new long[]{e()} : null;
                dqqf.dz(length, jArrC3, new ejxr() { // from class: bmwp
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "message_received_timestamp:".concat(String.valueOf(this.a.getString(7)));
                    }
                });
                ekfw ekfwVar = new ekfw();
                while (i < length) {
                    long j = jArrDC[i];
                    if (j <= 0 || hashSet.contains(Long.valueOf(j))) {
                        jArr = jArrDC;
                    } else {
                        hashSet.add(Long.valueOf(jArrDC[i]));
                        String[] strArr6 = bmxa.a;
                        bmvo bmvoVar = new bmvo();
                        bmvoVar.aF();
                        bmvoVar.aD();
                        long j2 = jArrDC[i];
                        if (strArr != null) {
                            bmvoVar.c(strArr[i]);
                        }
                        jArr = jArrDC;
                        if (jArrC != null) {
                            bmvoVar.d(jArrC[i]);
                        }
                        if (strArr2 != null) {
                            bmvoVar.b(strArr2[i]);
                        }
                        if (strArr3 != null) {
                            bmvoVar.f(strArr3[i]);
                        }
                        if (strArr4 != null) {
                            bmvoVar.i(strArr4[i]);
                        }
                        if (strArr5 != null) {
                            bmvoVar.e(strArr5[i]);
                        }
                        if (jArrC2 != null) {
                            bmvoVar.h(jArrC2[i]);
                        }
                        if (jArrC3 != null) {
                            bmvoVar.g(jArrC3[i]);
                        }
                        ekfwVar.h(bmvoVar.a());
                    }
                    i++;
                    jArrDC = jArr;
                }
                return ekfwVar.g();
            }
        }
        int i2 = ekgb.d;
        return ekoe.a;
    }

    public final long g() {
        return getLong(cO(6, bmxa.a));
    }

    public final String h() {
        return getString(cO(2, bmxa.a));
    }

    public final String i() {
        return getString(cO(5, bmxa.a));
    }

    public final String j() {
        return getString(cO(3, bmxa.a));
    }

    public final String k() {
        return getString(cO(4, bmxa.a));
    }

    @Override // defpackage.dqqj
    public final Cursor a() {
        return this;
    }
}
