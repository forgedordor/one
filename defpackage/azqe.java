package defpackage;

import android.database.Cursor;
import j$.time.Instant;
import java.util.HashSet;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class azqe extends dqqf implements azqa {
    @Deprecated
    public azqe(dqsy dqsyVar, Cursor cursor, String[] strArr, dqxe[] dqxeVarArr, dqwj dqwjVar, dqtm dqtmVar, azqk azqkVar) {
        super(dqsyVar, cursor, strArr, dqxeVarArr, azqo.a, dqwjVar, dqtmVar, azqkVar);
    }

    @Override // defpackage.dqqf
    protected final /* synthetic */ dqpd b() {
        return new azpn();
    }

    public final int c() {
        return getInt(cO(1, azqo.a));
    }

    public final Instant e() {
        return bart.b(getLong(cO(0, azqo.a)));
    }

    public final String f() {
        return getString(cO(2, azqo.a));
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
                if (!zDj) {
                    instantArr = null;
                } else if (z) {
                    long[] jArrDt = dt(getString(cO(0, azqo.a)));
                    int length2 = jArrDt.length;
                    Instant[] instantArr2 = new Instant[length2];
                    for (int i = 0; i < length2; i++) {
                        instantArr2[i] = bart.b(jArrDt[i]);
                    }
                    instantArr = (Instant[]) dqru.D(null, instantArr2, new Instant[0]);
                } else {
                    instantArr = new Instant[]{e()};
                }
                dqqf.dA(length, instantArr, new ejxr() { // from class: azqb
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "created_timestamp:".concat(String.valueOf(this.a.getString(0)));
                    }
                });
                int[] iArrA = dj(1) ? z ? dqru.A(null, ds(getString(cO(1, azqo.a)))) : new int[]{c()} : null;
                dqqf.dy(length, iArrA, new ejxr() { // from class: azqc
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "schema_version:".concat(String.valueOf(this.a.getString(1)));
                    }
                });
                String[] strArr = dj(2) ? z ? (String[]) dqru.D(null, du(getString(cO(2, azqo.a))), new String[0]) : new String[]{f()} : null;
                dqqf.dA(length, strArr, new ejxr() { // from class: azqd
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "backup_id:".concat(String.valueOf(this.a.getString(2)));
                    }
                });
                ekfw ekfwVar = new ekfw();
                for (int i2 = 0; i2 < length; i2++) {
                    long j = jArrDC[i2];
                    if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                        hashSet.add(Long.valueOf(jArrDC[i2]));
                        String[] strArr2 = azqo.a;
                        azpr azprVar = new azpr();
                        azprVar.aF();
                        azprVar.aD();
                        long j2 = jArrDC[i2];
                        if (instantArr != null) {
                            azprVar.c(instantArr[i2]);
                        }
                        if (iArrA != null) {
                            azprVar.d(iArrA[i2]);
                        }
                        if (strArr != null) {
                            azprVar.b(strArr[i2]);
                        }
                        ekfwVar.h(azprVar.a(new Supplier() { // from class: azpo
                            @Override // java.util.function.Supplier
                            public final Object get() {
                                return new azpn();
                            }
                        }));
                    }
                }
                return ekfwVar.g();
            }
        }
        int i3 = ekgb.d;
        return ekoe.a;
    }

    @Override // defpackage.dqqj
    public final Cursor a() {
        return this;
    }
}
