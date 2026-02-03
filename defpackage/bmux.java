package defpackage;

import android.database.Cursor;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bmux extends dqqf implements bmus {
    @Deprecated
    public bmux(dqsy dqsyVar, Cursor cursor, String[] strArr, dqxe[] dqxeVarArr, dqwj dqwjVar, dqtm dqtmVar, bmvd bmvdVar) {
        super(dqsyVar, cursor, strArr, dqxeVarArr, bmvh.a, dqwjVar, dqtmVar, bmvdVar);
    }

    @Override // defpackage.dqqf
    protected final /* synthetic */ dqpd b() {
        return new bmuf();
    }

    @Override // defpackage.bmus
    public final cpya c() {
        cpya[] cpyaVarArrValues = cpya.values();
        int i = getInt(cO(3, bmvh.a));
        if (i < cpyaVarArrValues.length) {
            return cpyaVarArrValues[i];
        }
        throw new IllegalArgumentException();
    }

    @Override // defpackage.bmus
    public final String e() {
        return getString(cO(2, bmvh.a));
    }

    public final long f() {
        return getLong(cO(0, bmvh.a));
    }

    @Override // defpackage.dqqf
    public final ekgb fI(dqth dqthVar) {
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
        cpya[] cpyaVarArr = null;
        long[] jArrC = zDj ? z ? dqru.C(null, dt(getString(cO(0, bmvh.a)))) : new long[]{f()} : null;
        dqqf.dz(length, jArrC, new ejxr() { // from class: bmut
            @Override // defpackage.ejxr
            public final Object get() {
                return "_id:".concat(String.valueOf(this.a.getString(0)));
            }
        });
        String[] strArr = dj(1) ? z ? (String[]) dqru.D(null, du(getString(cO(1, bmvh.a))), new String[0]) : new String[]{g()} : null;
        dqqf.dA(length, strArr, new ejxr() { // from class: bmuu
            @Override // defpackage.ejxr
            public final Object get() {
                return "message_cms_id:".concat(String.valueOf(this.a.getString(1)));
            }
        });
        String[] strArr2 = dj(2) ? z ? (String[]) dqru.D(null, du(getString(cO(2, bmvh.a))), new String[0]) : new String[]{e()} : null;
        dqqf.dA(length, strArr2, new ejxr() { // from class: bmuv
            @Override // defpackage.ejxr
            public final Object get() {
                return "blob_id:".concat(String.valueOf(this.a.getString(2)));
            }
        });
        if (dj(3)) {
            if (z) {
                int[] iArrDs = ds(getString(cO(3, bmvh.a)));
                cpya[] cpyaVarArrValues = cpya.values();
                int length2 = cpyaVarArrValues.length;
                cpya[] cpyaVarArr2 = new cpya[iArrDs.length];
                for (int i2 = 0; i2 < iArrDs.length; i2++) {
                    int i3 = iArrDs[i2];
                    if (i3 >= length2) {
                        throw new IllegalStateException();
                    }
                    cpyaVarArr2[i2] = cpyaVarArrValues[i3];
                }
                cpyaVarArr = (cpya[]) dqru.D(null, cpyaVarArr2, new cpya[0]);
            } else {
                cpyaVarArr = new cpya[]{c()};
            }
        }
        dqqf.dA(length, cpyaVarArr, new ejxr() { // from class: bmuw
            @Override // defpackage.ejxr
            public final Object get() {
                return "blob_type:".concat(String.valueOf(this.a.getString(3)));
            }
        });
        ekfw ekfwVar = new ekfw();
        for (int i4 = 0; i4 < length; i4++) {
            long j = jArrDC[i4];
            if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                hashSet.add(Long.valueOf(jArrDC[i4]));
                String[] strArr3 = bmvh.a;
                bmuh bmuhVar = new bmuh();
                bmuhVar.aF();
                bmuhVar.aD();
                long j2 = jArrDC[i4];
                if (jArrC != null) {
                    long j3 = jArrC[i4];
                    bmuhVar.aE(0);
                    bmuhVar.a = j3;
                }
                if (strArr != null) {
                    bmuhVar.d(strArr[i4]);
                }
                if (strArr2 != null) {
                    bmuhVar.b(strArr2[i4]);
                }
                if (cpyaVarArr != null) {
                    bmuhVar.c(cpyaVarArr[i4]);
                }
                ekfwVar.h(bmuhVar.a());
            }
        }
        return ekfwVar.g();
    }

    public final String g() {
        return getString(cO(1, bmvh.a));
    }

    @Override // defpackage.dqqj
    public final Cursor a() {
        return this;
    }
}
