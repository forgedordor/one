package defpackage;

import android.database.Cursor;
import java.util.HashSet;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bpjn extends dqqf implements bpji {
    @Deprecated
    public bpjn(dqsy dqsyVar, Cursor cursor, String[] strArr, dqxe[] dqxeVarArr, dqwj dqwjVar, dqtm dqtmVar, bpju bpjuVar) {
        super(dqsyVar, cursor, strArr, dqxeVarArr, bpjz.a, dqwjVar, dqtmVar, bpjuVar);
    }

    @Override // defpackage.dqqf
    protected final /* synthetic */ dqpd b() {
        return new bpit();
    }

    @Override // defpackage.bpji
    public final long c() {
        return getLong(cO(1, bpjz.a));
    }

    @Override // defpackage.bpji
    public final aiwp e() {
        return aiwp.b(getInt(cO(2, bpjz.a)));
    }

    @Override // defpackage.bpji
    public final String f() {
        return getString(cO(3, bpjz.a));
    }

    @Override // defpackage.dqqf
    public final ekgb fI(dqth dqthVar) {
        aiwp[] aiwpVarArr;
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
        long[] jArrC = zDj ? z ? dqru.C(null, dt(getString(cO(0, bpjz.a)))) : new long[]{g()} : null;
        dqqf.dz(length, jArrC, new ejxr() { // from class: bpjj
            @Override // defpackage.ejxr
            public final Object get() {
                return "_id:".concat(String.valueOf(this.a.getString(0)));
            }
        });
        long[] jArrC2 = dj(1) ? z ? dqru.C(null, dt(getString(cO(1, bpjz.a)))) : new long[]{c()} : null;
        dqqf.dz(length, jArrC2, new ejxr() { // from class: bpjk
            @Override // defpackage.ejxr
            public final Object get() {
                return "timestamp:".concat(String.valueOf(this.a.getString(1)));
            }
        });
        if (!dj(2)) {
            aiwpVarArr = null;
        } else if (z) {
            int[] iArrDs = ds(getString(cO(2, bpjz.a)));
            aiwp[] aiwpVarArr2 = new aiwp[iArrDs.length];
            for (int i2 = 0; i2 < iArrDs.length; i2++) {
                aiwp aiwpVarB = aiwp.b(iArrDs[i2]);
                if (aiwpVarB == null) {
                    throw new IllegalStateException();
                }
                aiwpVarArr2[i2] = aiwpVarB;
            }
            aiwpVarArr = (aiwp[]) dqru.D(null, aiwpVarArr2, new aiwp[0]);
        } else {
            aiwpVarArr = new aiwp[]{e()};
        }
        dqqf.dA(length, aiwpVarArr, new ejxr() { // from class: bpjl
            @Override // defpackage.ejxr
            public final Object get() {
                return "event:".concat(String.valueOf(this.a.getString(2)));
            }
        });
        String[] strArr = dj(3) ? z ? (String[]) dqru.D(null, du(getString(cO(3, bpjz.a))), new String[0]) : new String[]{f()} : null;
        dqqf.dA(length, strArr, new ejxr() { // from class: bpjm
            @Override // defpackage.ejxr
            public final Object get() {
                return "data:".concat(String.valueOf(this.a.getString(3)));
            }
        });
        ekfw ekfwVar = new ekfw();
        for (int i3 = 0; i3 < length; i3++) {
            long j = jArrDC[i3];
            if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                hashSet.add(Long.valueOf(jArrDC[i3]));
                String[] strArr2 = bpjz.a;
                bpix bpixVar = new bpix();
                bpixVar.aF();
                bpixVar.aD();
                long j2 = jArrDC[i3];
                if (jArrC != null) {
                    long j3 = jArrC[i3];
                    bpixVar.aE(0);
                    bpixVar.a = j3;
                }
                if (jArrC2 != null) {
                    bpixVar.d(jArrC2[i3]);
                }
                if (aiwpVarArr != null) {
                    bpixVar.c(aiwpVarArr[i3]);
                }
                if (strArr != null) {
                    bpixVar.b(strArr[i3]);
                }
                ekfwVar.h(bpixVar.a(new Supplier() { // from class: bpiv
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        return new bpit();
                    }
                }));
            }
        }
        return ekfwVar.g();
    }

    public final long g() {
        return getLong(cO(0, bpjz.a));
    }

    @Override // defpackage.dqqj
    public final Cursor a() {
        return this;
    }
}
