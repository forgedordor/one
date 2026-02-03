package defpackage;

import android.database.Cursor;
import java.util.HashSet;
import java.util.UUID;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bqdo extends dqqf implements bqdj {
    @Deprecated
    public bqdo(dqsy dqsyVar, Cursor cursor, String[] strArr, dqxe[] dqxeVarArr, dqwj dqwjVar, dqtm dqtmVar, bqds bqdsVar) {
        super(dqsyVar, cursor, strArr, dqxeVarArr, bqdw.a, dqwjVar, dqtmVar, bqdsVar);
    }

    @Override // defpackage.dqqf
    protected final /* synthetic */ dqpd b() {
        return new bqct();
    }

    public final long c() {
        return getLong(cO(0, bqdw.a));
    }

    public final bvds e() {
        bvds[] bvdsVarArrValues = bvds.values();
        int i = getInt(cO(2, bqdw.a));
        if (i < bvdsVarArrValues.length) {
            return bvdsVarArrValues[i];
        }
        throw new IllegalArgumentException();
    }

    public final String f() {
        return getString(cO(3, bqdw.a));
    }

    @Override // defpackage.dqqf
    public final ekgb fI(dqth dqthVar) {
        UUID[] uuidArr;
        bvds[] bvdsVarArr;
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
        long[] jArrC = zDj ? z ? dqru.C(null, dt(getString(cO(0, bqdw.a)))) : new long[]{c()} : null;
        dqqf.dz(length, jArrC, new ejxr() { // from class: bqdk
            @Override // defpackage.ejxr
            public final Object get() {
                return "_id:".concat(String.valueOf(this.a.getString(0)));
            }
        });
        if (!dj(1)) {
            uuidArr = null;
        } else if (z) {
            String[] strArrDu = du(getString(cO(1, bqdw.a)));
            int length2 = strArrDu.length;
            UUID[] uuidArr2 = new UUID[length2];
            for (int i2 = 0; i2 < length2; i2++) {
                uuidArr2[i2] = UUID.fromString(strArrDu[i2]);
            }
            uuidArr = (UUID[]) dqru.D(null, uuidArr2, new UUID[0]);
        } else {
            uuidArr = new UUID[]{g()};
        }
        dqqf.dA(length, uuidArr, new ejxr() { // from class: bqdl
            @Override // defpackage.ejxr
            public final Object get() {
                return "message_send_receive_attempt_id:".concat(String.valueOf(this.a.getString(1)));
            }
        });
        if (!dj(2)) {
            bvdsVarArr = null;
        } else if (z) {
            int[] iArrDs = ds(getString(cO(2, bqdw.a)));
            bvds[] bvdsVarArrValues = bvds.values();
            int length3 = bvdsVarArrValues.length;
            bvds[] bvdsVarArr2 = new bvds[iArrDs.length];
            for (int i3 = 0; i3 < iArrDs.length; i3++) {
                int i4 = iArrDs[i3];
                if (i4 >= length3) {
                    throw new IllegalStateException();
                }
                bvdsVarArr2[i3] = bvdsVarArrValues[i4];
            }
            bvdsVarArr = (bvds[]) dqru.D(null, bvdsVarArr2, new bvds[0]);
        } else {
            bvdsVarArr = new bvds[]{e()};
        }
        dqqf.dA(length, bvdsVarArr, new ejxr() { // from class: bqdm
            @Override // defpackage.ejxr
            public final Object get() {
                return "message_destination_type:".concat(String.valueOf(this.a.getString(2)));
            }
        });
        String[] strArr = dj(3) ? z ? (String[]) dqru.D(null, du(getString(cO(3, bqdw.a))), new String[0]) : new String[]{f()} : null;
        dqqf.dA(length, strArr, new ejxr() { // from class: bqdn
            @Override // defpackage.ejxr
            public final Object get() {
                return "message_destination_raw:".concat(String.valueOf(this.a.getString(3)));
            }
        });
        ekfw ekfwVar = new ekfw();
        for (int i5 = 0; i5 < length; i5++) {
            long j = jArrDC[i5];
            if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                hashSet.add(Long.valueOf(jArrDC[i5]));
                String[] strArr2 = bqdw.a;
                bqcx bqcxVar = new bqcx();
                bqcxVar.aF();
                bqcxVar.aD();
                long j2 = jArrDC[i5];
                if (jArrC != null) {
                    long j3 = jArrC[i5];
                    bqcxVar.aE(0);
                    bqcxVar.a = j3;
                }
                if (uuidArr != null) {
                    bqcxVar.d(uuidArr[i5]);
                }
                if (bvdsVarArr != null) {
                    bqcxVar.c(bvdsVarArr[i5]);
                }
                if (strArr != null) {
                    bqcxVar.b(strArr[i5]);
                }
                ekfwVar.h(bqcxVar.a(new Supplier() { // from class: bqcu
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        return new bqct();
                    }
                }));
            }
        }
        return ekfwVar.g();
    }

    public final UUID g() {
        return UUID.fromString(getString(cO(1, bqdw.a)));
    }

    @Override // defpackage.dqqj
    public final Cursor a() {
        return this;
    }
}
