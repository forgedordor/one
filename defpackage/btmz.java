package defpackage;

import android.database.Cursor;
import j$.time.Instant;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class btmz extends dqqf implements btmv {
    @Deprecated
    public btmz(dqsy dqsyVar, Cursor cursor, String[] strArr, dqxe[] dqxeVarArr, dqwj dqwjVar, dqtm dqtmVar, btnd btndVar) {
        super(dqsyVar, cursor, strArr, dqxeVarArr, btnj.a, dqwjVar, dqtmVar, btndVar);
    }

    @Override // defpackage.dqqf
    protected final /* synthetic */ dqpd b() {
        return new btmk();
    }

    public final Instant c() {
        return bart.b(getLong(cO(2, btnj.a)));
    }

    public final Instant e() {
        return bart.b(getLong(cO(1, btnj.a)));
    }

    public final String f() {
        return getString(cO(0, btnj.a));
    }

    @Override // defpackage.dqqf
    public final ekgb fI(dqth dqthVar) {
        Instant[] instantArr;
        dqwl dqwlVar = dqthVar.a;
        long[] jArrDC = dC(getString(dqthVar.h + 1));
        int length = jArrDC.length;
        if (length != 0) {
            if (length != 1 || jArrDC[0] != -1) {
                HashSet hashSet = new HashSet();
                dqtm dqtmVar = this.d;
                boolean zDj = dj(0);
                boolean z = dqtmVar.b;
                Instant[] instantArr2 = null;
                String[] strArr = zDj ? z ? (String[]) dqru.D(null, du(getString(cO(0, btnj.a))), new String[0]) : new String[]{f()} : null;
                dqqf.dA(length, strArr, new ejxr() { // from class: btmw
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "remote_user_id:".concat(String.valueOf(this.a.getString(0)));
                    }
                });
                if (!dj(1)) {
                    instantArr = null;
                } else if (z) {
                    long[] jArrDt = dt(getString(cO(1, btnj.a)));
                    int length2 = jArrDt.length;
                    Instant[] instantArr3 = new Instant[length2];
                    for (int i = 0; i < length2; i++) {
                        instantArr3[i] = bart.b(jArrDt[i]);
                    }
                    instantArr = (Instant[]) dqru.D(null, instantArr3, new Instant[0]);
                } else {
                    instantArr = new Instant[]{e()};
                }
                dqqf.dA(length, instantArr, new ejxr() { // from class: btmx
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "last_modified_timestamp:".concat(String.valueOf(this.a.getString(1)));
                    }
                });
                if (dj(2)) {
                    if (z) {
                        long[] jArrDt2 = dt(getString(cO(2, btnj.a)));
                        int length3 = jArrDt2.length;
                        Instant[] instantArr4 = new Instant[length3];
                        for (int i2 = 0; i2 < length3; i2++) {
                            instantArr4[i2] = bart.b(jArrDt2[i2]);
                        }
                        instantArr2 = (Instant[]) dqru.D(null, instantArr4, new Instant[0]);
                    } else {
                        instantArr2 = new Instant[]{c()};
                    }
                }
                dqqf.dA(length, instantArr2, new ejxr() { // from class: btmy
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "guaranteed_fresh_as_of_timestamp:".concat(String.valueOf(this.a.getString(2)));
                    }
                });
                ekfw ekfwVar = new ekfw();
                for (int i3 = 0; i3 < length; i3++) {
                    long j = jArrDC[i3];
                    if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                        hashSet.add(Long.valueOf(jArrDC[i3]));
                        String[] strArr2 = btnj.a;
                        btmm btmmVar = new btmm();
                        btmmVar.aF();
                        btmmVar.aD();
                        long j2 = jArrDC[i3];
                        if (strArr != null) {
                            btmmVar.d(strArr[i3]);
                        }
                        if (instantArr != null) {
                            btmmVar.c(instantArr[i3]);
                        }
                        if (instantArr2 != null) {
                            btmmVar.b(instantArr2[i3]);
                        }
                        ekfwVar.h(btmmVar.a());
                    }
                }
                return ekfwVar.g();
            }
        }
        int i4 = ekgb.d;
        return ekoe.a;
    }

    @Override // defpackage.dqqj
    public final Cursor a() {
        return this;
    }
}
