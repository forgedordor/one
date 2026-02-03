package defpackage;

import android.database.Cursor;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class btsb extends dqqf implements btrv {
    @Deprecated
    public btsb(dqsy dqsyVar, Cursor cursor, String[] strArr, dqxe[] dqxeVarArr, dqwj dqwjVar, dqtm dqtmVar, btsh btshVar) {
        super(dqsyVar, cursor, strArr, dqxeVarArr, btsn.a, dqwjVar, dqtmVar, btshVar);
    }

    @Override // defpackage.dqqf
    protected final /* synthetic */ dqpd b() {
        return new btrd();
    }

    public final long c() {
        return getLong(cO(0, btsn.a));
    }

    public final long e() {
        return getLong(cO(1, btsn.a));
    }

    public final aiad f() {
        byte[] blob = getBlob(cO(2, btsn.a));
        if (blob == null) {
            return null;
        }
        try {
            return (aiad) evsn.parseFrom(aiad.a, blob, evrr.a());
        } catch (Throwable unused) {
            return aiad.a;
        }
    }

    @Override // defpackage.dqqf
    public final ekgb fI(dqth dqthVar) {
        aiad[] aiadVarArr;
        btsp[] btspVarArr;
        aiad aiadVar;
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
        btso[] btsoVarArr = null;
        long[] jArrC = zDj ? z ? dqru.C(null, dt(getString(cO(0, btsn.a)))) : new long[]{c()} : null;
        dqqf.dz(length, jArrC, new ejxr() { // from class: btrw
            @Override // defpackage.ejxr
            public final Object get() {
                return "_id:".concat(String.valueOf(this.a.getString(0)));
            }
        });
        long[] jArrC2 = dj(1) ? z ? dqru.C(null, dt(getString(cO(1, btsn.a)))) : new long[]{e()} : null;
        dqqf.dz(length, jArrC2, new ejxr() { // from class: btrx
            @Override // defpackage.ejxr
            public final Object get() {
                return "workflow_execution_id:".concat(String.valueOf(this.a.getString(1)));
            }
        });
        if (!dj(2)) {
            aiadVarArr = null;
        } else if (z) {
            List listDf = df(getString(cO(2, btsn.a)));
            aiad[] aiadVarArr2 = new aiad[listDf.size()];
            Iterator it = listDf.iterator();
            int i2 = 0;
            while (it.hasNext()) {
                try {
                    byte[] bArrZ = dqru.z((String) it.next());
                    int i3 = i2 + 1;
                    if (bArrZ == null) {
                        aiadVar = null;
                    } else {
                        try {
                            aiadVar = (aiad) evsn.parseFrom(aiad.a, bArrZ);
                        } catch (Throwable unused) {
                            i2 = i3;
                            aiadVarArr2[i2] = null;
                            i2++;
                        }
                    }
                    aiadVarArr2[i2] = aiadVar;
                    i2 = i3;
                } catch (Throwable unused2) {
                }
            }
            aiadVarArr = (aiad[]) dqru.D(null, aiadVarArr2, new aiad[0]);
        } else {
            aiadVarArr = new aiad[]{f()};
        }
        dqqf.dA(length, aiadVarArr, new ejxr() { // from class: btry
            @Override // defpackage.ejxr
            public final Object get() {
                return "backup_file:".concat(String.valueOf(this.a.getString(2)));
            }
        });
        if (!dj(3)) {
            btspVarArr = null;
        } else if (z) {
            int[] iArrDs = ds(getString(cO(3, btsn.a)));
            btsp[] btspVarArrValues = btsp.values();
            int length2 = btspVarArrValues.length;
            btsp[] btspVarArr2 = new btsp[iArrDs.length];
            for (int i4 = 0; i4 < iArrDs.length; i4++) {
                int i5 = iArrDs[i4];
                if (i5 >= length2) {
                    throw new IllegalStateException();
                }
                btspVarArr2[i4] = btspVarArrValues[i5];
            }
            btspVarArr = (btsp[]) dqru.D(null, btspVarArr2, new btsp[0]);
        } else {
            btspVarArr = new btsp[]{h()};
        }
        dqqf.dA(length, btspVarArr, new ejxr() { // from class: btrz
            @Override // defpackage.ejxr
            public final Object get() {
                return "file_type:".concat(String.valueOf(this.a.getString(3)));
            }
        });
        if (dj(4)) {
            if (z) {
                int[] iArrDs2 = ds(getString(cO(4, btsn.a)));
                btso[] btsoVarArrValues = btso.values();
                int length3 = btsoVarArrValues.length;
                btso[] btsoVarArr2 = new btso[iArrDs2.length];
                for (int i6 = 0; i6 < iArrDs2.length; i6++) {
                    int i7 = iArrDs2[i6];
                    if (i7 >= length3) {
                        throw new IllegalStateException();
                    }
                    btsoVarArr2[i6] = btsoVarArrValues[i7];
                }
                btsoVarArr = (btso[]) dqru.D(null, btsoVarArr2, new btso[0]);
            } else {
                btsoVarArr = new btso[]{g()};
            }
        }
        dqqf.dA(length, btsoVarArr, new ejxr() { // from class: btsa
            @Override // defpackage.ejxr
            public final Object get() {
                return "status:".concat(String.valueOf(this.a.getString(4)));
            }
        });
        ekfw ekfwVar = new ekfw();
        for (int i8 = 0; i8 < length; i8++) {
            long j = jArrDC[i8];
            if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                hashSet.add(Long.valueOf(jArrDC[i8]));
                String[] strArr = btsn.a;
                btrh btrhVar = new btrh();
                btrhVar.aF();
                btrhVar.aD();
                long j2 = jArrDC[i8];
                if (jArrC != null) {
                    long j3 = jArrC[i8];
                    btrhVar.aE(0);
                    btrhVar.a = j3;
                }
                if (jArrC2 != null) {
                    btrhVar.f(jArrC2[i8]);
                }
                if (aiadVarArr != null) {
                    btrhVar.c(aiadVarArr[i8]);
                }
                if (btspVarArr != null) {
                    btrhVar.d(btspVarArr[i8]);
                }
                if (btsoVarArr != null) {
                    btrhVar.e(btsoVarArr[i8]);
                }
                ekfwVar.h(btrhVar.a(new Supplier() { // from class: btrf
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        return new btrd();
                    }
                }));
            }
        }
        return ekfwVar.g();
    }

    public final btso g() {
        btso[] btsoVarArrValues = btso.values();
        int i = getInt(cO(4, btsn.a));
        if (i < btsoVarArrValues.length) {
            return btsoVarArrValues[i];
        }
        throw new IllegalArgumentException();
    }

    public final btsp h() {
        btsp[] btspVarArrValues = btsp.values();
        int i = getInt(cO(3, btsn.a));
        if (i < btspVarArrValues.length) {
            return btspVarArrValues[i];
        }
        throw new IllegalArgumentException();
    }

    @Override // defpackage.dqqj
    public final Cursor a() {
        return this;
    }
}
