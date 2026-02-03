package defpackage;

import android.database.Cursor;
import j$.util.Optional;
import java.util.Date;
import java.util.HashSet;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cbjd extends dqqf implements cbit {
    @Deprecated
    public cbjd(dqsy dqsyVar, Cursor cursor, String[] strArr, dqxe[] dqxeVarArr, dqwj dqwjVar, dqtm dqtmVar, cbjk cbjkVar) {
        super(dqsyVar, cursor, strArr, dqxeVarArr, cbjq.a, dqwjVar, dqtmVar, cbjkVar);
    }

    @Override // defpackage.dqqf
    protected final /* synthetic */ dqpd b() {
        return new cbhu();
    }

    public final int c() {
        return getInt(cO(4, cbjq.a));
    }

    public final Optional e() {
        return basg.a(getString(cO(1, cbjq.a)));
    }

    public final String f() {
        return getString(cO(0, cbjq.a));
    }

    @Override // defpackage.dqqf
    public final ekgb fI(dqth dqthVar) {
        Optional[] optionalArr;
        Date[] dateArr;
        Date[] dateArr2;
        int i;
        boolean[] zArrE;
        dqwl dqwlVar = dqthVar.a;
        long[] jArrDC = dC(getString(dqthVar.h + 1));
        int length = jArrDC.length;
        if (length == 0 || (length == 1 && jArrDC[0] == -1)) {
            int i2 = ekgb.d;
            return ekoe.a;
        }
        HashSet hashSet = new HashSet();
        dqtm dqtmVar = this.d;
        boolean zDj = dj(0);
        boolean z = dqtmVar.b;
        boolean[] zArrE2 = null;
        String[] strArr = zDj ? z ? (String[]) dqru.D(null, du(getString(cO(0, cbjq.a))), new String[0]) : new String[]{f()} : null;
        dqqf.dA(length, strArr, new ejxr() { // from class: cbiu
            @Override // defpackage.ejxr
            public final Object get() {
                return "queue:".concat(String.valueOf(this.a.getString(0)));
            }
        });
        if (!dj(1)) {
            optionalArr = null;
        } else if (z) {
            String[] strArrDu = du(getString(cO(1, cbjq.a)));
            int length2 = strArrDu.length;
            Optional[] optionalArr2 = new Optional[length2];
            for (int i3 = 0; i3 < length2; i3++) {
                optionalArr2[i3] = basg.a(strArrDu[i3]);
            }
            optionalArr = (Optional[]) dqru.D(null, optionalArr2, new Optional[0]);
        } else {
            optionalArr = new Optional[]{e()};
        }
        dqqf.dA(length, optionalArr, new ejxr() { // from class: cbiv
            @Override // defpackage.ejxr
            public final Object get() {
                return "workmanager_id:".concat(String.valueOf(this.a.getString(1)));
            }
        });
        if (!dj(2)) {
            dateArr = null;
        } else if (z) {
            long[] jArrDt = dt(getString(cO(2, cbjq.a)));
            int length3 = jArrDt.length;
            Date[] dateArr3 = new Date[length3];
            for (int i4 = 0; i4 < length3; i4++) {
                dateArr3[i4] = barp.b(jArrDt[i4]);
            }
            dateArr = (Date[]) dqru.D(null, dateArr3, new Date[0]);
        } else {
            dateArr = new Date[]{h()};
        }
        dqqf.dA(length, dateArr, new ejxr() { // from class: cbiw
            @Override // defpackage.ejxr
            public final Object get() {
                return "scheduled_at_time:".concat(String.valueOf(this.a.getString(2)));
            }
        });
        if (!dj(3)) {
            dateArr2 = null;
        } else if (z) {
            long[] jArrDt2 = dt(getString(cO(3, cbjq.a)));
            int length4 = jArrDt2.length;
            Date[] dateArr4 = new Date[length4];
            for (int i5 = 0; i5 < length4; i5++) {
                dateArr4[i5] = barp.b(jArrDt2[i5]);
            }
            dateArr2 = (Date[]) dqru.D(null, dateArr4, new Date[0]);
        } else {
            dateArr2 = new Date[]{g()};
        }
        dqqf.dA(length, dateArr2, new ejxr() { // from class: cbix
            @Override // defpackage.ejxr
            public final Object get() {
                return "minimum_start_time:".concat(String.valueOf(this.a.getString(3)));
            }
        });
        int[] iArrA = dj(4) ? z ? dqru.A(null, ds(getString(cO(4, cbjq.a)))) : new int[]{c()} : null;
        dqqf.dy(length, iArrA, new ejxr() { // from class: cbiy
            @Override // defpackage.ejxr
            public final Object get() {
                return "requires_network_type:".concat(String.valueOf(this.a.getString(4)));
            }
        });
        boolean[] zArrE3 = dj(5) ? z ? dqru.E(null, dv(getString(cO(5, cbjq.a)))) : new boolean[]{j()} : null;
        dqqf.dB(length, zArrE3, new ejxr() { // from class: cbiz
            @Override // defpackage.ejxr
            public final Object get() {
                return "requires_charging:".concat(String.valueOf(this.a.getString(5)));
            }
        });
        boolean[] zArrE4 = dj(6) ? z ? dqru.E(null, dv(getString(cO(6, cbjq.a)))) : new boolean[]{k()} : null;
        dqqf.dB(length, zArrE4, new ejxr() { // from class: cbja
            @Override // defpackage.ejxr
            public final Object get() {
                return "requires_device_idle:".concat(String.valueOf(this.a.getString(6)));
            }
        });
        if (!dj(7)) {
            i = 0;
            zArrE = null;
        } else if (z) {
            i = 0;
            zArrE = dqru.E(null, dv(getString(cO(7, cbjq.a))));
        } else {
            i = 0;
            zArrE = new boolean[]{i()};
        }
        dqqf.dB(length, zArrE, new ejxr() { // from class: cbjb
            @Override // defpackage.ejxr
            public final Object get() {
                return "requires_battery_not_low:".concat(String.valueOf(this.a.getString(7)));
            }
        });
        if (dj(8)) {
            if (z) {
                zArrE2 = dqru.E(null, dv(getString(cO(8, cbjq.a))));
            } else {
                zArrE2 = new boolean[1];
                zArrE2[i] = l();
            }
        }
        dqqf.dB(length, zArrE2, new ejxr() { // from class: cbjc
            @Override // defpackage.ejxr
            public final Object get() {
                return "requires_storage_not_low:".concat(String.valueOf(this.a.getString(8)));
            }
        });
        ekfw ekfwVar = new ekfw();
        for (int i6 = i; i6 < length; i6++) {
            long j = jArrDC[i6];
            if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                hashSet.add(Long.valueOf(jArrDC[i6]));
                String[] strArr2 = cbjq.a;
                cbhy cbhyVar = new cbhy();
                cbhyVar.aF();
                cbhyVar.aD();
                long j2 = jArrDC[i6];
                if (strArr != null) {
                    cbhyVar.c(strArr[i6]);
                }
                if (optionalArr != null) {
                    cbhyVar.j(optionalArr[i6]);
                }
                if (dateArr != null) {
                    cbhyVar.i(dateArr[i6]);
                }
                if (dateArr2 != null) {
                    cbhyVar.b(dateArr2[i6]);
                }
                if (iArrA != null) {
                    cbhyVar.g(iArrA[i6]);
                }
                if (zArrE3 != null) {
                    cbhyVar.e(zArrE3[i6]);
                }
                if (zArrE4 != null) {
                    cbhyVar.f(zArrE4[i6]);
                }
                if (zArrE != null) {
                    cbhyVar.d(zArrE[i6]);
                }
                if (zArrE2 != null) {
                    cbhyVar.h(zArrE2[i6]);
                }
                ekfwVar.h(cbhyVar.a(new Supplier() { // from class: cbhv
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        return new cbhu();
                    }
                }));
            }
        }
        return ekfwVar.g();
    }

    public final Date g() {
        return barp.b(getLong(cO(3, cbjq.a)));
    }

    public final Date h() {
        return barp.b(getLong(cO(2, cbjq.a)));
    }

    public final boolean i() {
        return getInt(cO(7, cbjq.a)) == 1;
    }

    public final boolean j() {
        return getInt(cO(5, cbjq.a)) == 1;
    }

    public final boolean k() {
        return getInt(cO(6, cbjq.a)) == 1;
    }

    public final boolean l() {
        return getInt(cO(8, cbjq.a)) == 1;
    }

    @Override // defpackage.dqqj
    public final Cursor a() {
        return this;
    }
}
