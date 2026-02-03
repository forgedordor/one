package defpackage;

import android.database.Cursor;
import java.util.HashSet;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bqtr extends dqqf implements bqtk {
    @Deprecated
    public bqtr(dqsy dqsyVar, Cursor cursor, String[] strArr, dqxe[] dqxeVarArr, dqwj dqwjVar, dqtm dqtmVar, bqtx bqtxVar) {
        super(dqsyVar, cursor, strArr, dqxeVarArr, bqub.a, dqwjVar, dqtmVar, bqtxVar);
    }

    @Override // defpackage.dqqf
    protected final /* synthetic */ dqpd b() {
        return new bqsr();
    }

    @Override // defpackage.bqtk
    public final int c() {
        return getInt(cO(3, bqub.a));
    }

    @Override // defpackage.bqtk
    public final long e() {
        return getLong(cO(2, bqub.a));
    }

    @Override // defpackage.bqtk
    public final aiwt f() {
        aiwt[] aiwtVarArrValues = aiwt.values();
        int i = getInt(cO(4, bqub.a));
        if (i < aiwtVarArrValues.length) {
            return aiwtVarArrValues[i];
        }
        throw new IllegalArgumentException();
    }

    @Override // defpackage.dqqf
    public final ekgb fI(dqth dqthVar) {
        aiwt[] aiwtVarArr;
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
        long[] jArrC = zDj ? z ? dqru.C(null, dt(getString(cO(0, bqub.a)))) : new long[]{i()} : null;
        dqqf.dz(length, jArrC, new ejxr() { // from class: bqtl
            @Override // defpackage.ejxr
            public final Object get() {
                return "_id:".concat(String.valueOf(this.a.getString(0)));
            }
        });
        String[] strArr = dj(1) ? z ? (String[]) dqru.D(null, du(getString(cO(1, bqub.a))), new String[0]) : new String[]{h()} : null;
        dqqf.dA(length, strArr, new ejxr() { // from class: bqtm
            @Override // defpackage.ejxr
            public final Object get() {
                return "message_id:".concat(String.valueOf(this.a.getString(1)));
            }
        });
        long[] jArrC2 = dj(2) ? z ? dqru.C(null, dt(getString(cO(2, bqub.a)))) : new long[]{e()} : null;
        dqqf.dz(length, jArrC2, new ejxr() { // from class: bqtn
            @Override // defpackage.ejxr
            public final Object get() {
                return "timestamp:".concat(String.valueOf(this.a.getString(2)));
            }
        });
        int[] iArrA = dj(3) ? z ? dqru.A(null, ds(getString(cO(3, bqub.a)))) : new int[]{c()} : null;
        dqqf.dy(length, iArrA, new ejxr() { // from class: bqto
            @Override // defpackage.ejxr
            public final Object get() {
                return "status:".concat(String.valueOf(this.a.getString(3)));
            }
        });
        if (!dj(4)) {
            aiwtVarArr = null;
        } else if (z) {
            int[] iArrDs = ds(getString(cO(4, bqub.a)));
            aiwt[] aiwtVarArrValues = aiwt.values();
            int length2 = aiwtVarArrValues.length;
            aiwt[] aiwtVarArr2 = new aiwt[iArrDs.length];
            for (int i2 = 0; i2 < iArrDs.length; i2++) {
                int i3 = iArrDs[i2];
                if (i3 >= length2) {
                    throw new IllegalStateException();
                }
                aiwtVarArr2[i2] = aiwtVarArrValues[i3];
            }
            aiwtVarArr = (aiwt[]) dqru.D(null, aiwtVarArr2, new aiwt[0]);
        } else {
            aiwtVarArr = new aiwt[]{f()};
        }
        dqqf.dA(length, aiwtVarArr, new ejxr() { // from class: bqtp
            @Override // defpackage.ejxr
            public final Object get() {
                return "custom_status:".concat(String.valueOf(this.a.getString(4)));
            }
        });
        String[] strArr2 = dj(5) ? z ? (String[]) dqru.D(null, du(getString(cO(5, bqub.a))), new String[0]) : new String[]{g()} : null;
        dqqf.dA(length, strArr2, new ejxr() { // from class: bqtq
            @Override // defpackage.ejxr
            public final Object get() {
                return "data:".concat(String.valueOf(this.a.getString(5)));
            }
        });
        ekfw ekfwVar = new ekfw();
        for (int i4 = 0; i4 < length; i4++) {
            long j = jArrDC[i4];
            if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                hashSet.add(Long.valueOf(jArrDC[i4]));
                String[] strArr3 = bqub.a;
                bqsv bqsvVar = new bqsv();
                bqsvVar.aF();
                bqsvVar.aD();
                long j2 = jArrDC[i4];
                if (jArrC != null) {
                    long j3 = jArrC[i4];
                    bqsvVar.aE(0);
                    bqsvVar.a = j3;
                }
                if (strArr != null) {
                    bqsvVar.e(strArr[i4]);
                }
                if (jArrC2 != null) {
                    bqsvVar.g(jArrC2[i4]);
                }
                if (iArrA != null) {
                    bqsvVar.f(iArrA[i4]);
                }
                if (aiwtVarArr != null) {
                    bqsvVar.c(aiwtVarArr[i4]);
                }
                if (strArr2 != null) {
                    bqsvVar.d(strArr2[i4]);
                }
                ekfwVar.h(bqsvVar.a(new Supplier() { // from class: bqss
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        return new bqsr();
                    }
                }));
            }
        }
        return ekfwVar.g();
    }

    @Override // defpackage.bqtk
    public final String g() {
        return getString(cO(5, bqub.a));
    }

    @Override // defpackage.bqtk
    public final String h() {
        return getString(cO(1, bqub.a));
    }

    public final long i() {
        return getLong(cO(0, bqub.a));
    }

    @Override // defpackage.dqqj
    public final Cursor a() {
        return this;
    }
}
