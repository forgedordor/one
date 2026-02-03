package defpackage;

import android.database.Cursor;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class btuk extends dqqf implements btug {
    @Deprecated
    public btuk(dqsy dqsyVar, Cursor cursor, String[] strArr, dqxe[] dqxeVarArr, dqwj dqwjVar, dqtm dqtmVar, btuq btuqVar) {
        super(dqsyVar, cursor, strArr, dqxeVarArr, btuu.a, dqwjVar, dqtmVar, btuqVar);
    }

    @Override // defpackage.dqqf
    protected final /* synthetic */ dqpd b() {
        return new bttv();
    }

    public final bvde c() {
        bvde[] bvdeVarArrValues = bvde.values();
        int i = getInt(cO(0, btuu.a));
        if (i < bvdeVarArrValues.length) {
            return bvdeVarArrValues[i];
        }
        throw new IllegalArgumentException();
    }

    public final String e() {
        return getString(cO(2, btuu.a));
    }

    public final String f() {
        return getString(cO(1, btuu.a));
    }

    @Override // defpackage.dqqf
    public final ekgb fI(dqth dqthVar) {
        bvde[] bvdeVarArr;
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
        if (!zDj) {
            bvdeVarArr = null;
        } else if (z) {
            int[] iArrDs = ds(getString(cO(0, btuu.a)));
            bvde[] bvdeVarArrValues = bvde.values();
            int length2 = bvdeVarArrValues.length;
            bvde[] bvdeVarArr2 = new bvde[iArrDs.length];
            for (int i2 = 0; i2 < iArrDs.length; i2++) {
                int i3 = iArrDs[i2];
                if (i3 >= length2) {
                    throw new IllegalStateException();
                }
                bvdeVarArr2[i2] = bvdeVarArrValues[i3];
            }
            bvdeVarArr = (bvde[]) dqru.D(null, bvdeVarArr2, new bvde[0]);
        } else {
            bvdeVarArr = new bvde[]{c()};
        }
        dqqf.dA(length, bvdeVarArr, new ejxr() { // from class: btuh
            @Override // defpackage.ejxr
            public final Object get() {
                return "which_database:".concat(String.valueOf(this.a.getString(0)));
            }
        });
        String[] strArr = dj(1) ? z ? (String[]) dqru.D(null, du(getString(cO(1, btuu.a))), new String[0]) : new String[]{f()} : null;
        dqqf.dA(length, strArr, new ejxr() { // from class: btui
            @Override // defpackage.ejxr
            public final Object get() {
                return "participant_id:".concat(String.valueOf(this.a.getString(1)));
            }
        });
        String[] strArr2 = dj(2) ? z ? (String[]) dqru.D(null, du(getString(cO(2, btuu.a))), new String[0]) : new String[]{e()} : null;
        dqqf.dA(length, strArr2, new ejxr() { // from class: btuj
            @Override // defpackage.ejxr
            public final Object get() {
                return "destination_suffix:".concat(String.valueOf(this.a.getString(2)));
            }
        });
        ekfw ekfwVar = new ekfw();
        for (int i4 = 0; i4 < length; i4++) {
            long j = jArrDC[i4];
            if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                hashSet.add(Long.valueOf(jArrDC[i4]));
                String[] strArr3 = btuu.a;
                bttx bttxVar = new bttx();
                bttxVar.aF();
                bttxVar.aD();
                long j2 = jArrDC[i4];
                if (bvdeVarArr != null) {
                    bvde bvdeVar = bvdeVarArr[i4];
                    bttxVar.aE(0);
                    bttxVar.a = bvdeVar;
                }
                if (strArr != null) {
                    String str = strArr[i4];
                    bttxVar.aE(1);
                    bttxVar.b = str;
                }
                if (strArr2 != null) {
                    String str2 = strArr2[i4];
                    bttxVar.aE(2);
                    bttxVar.c = str2;
                }
                bttv bttvVar = new bttv();
                bttvVar.aD(bttxVar.aB());
                bttvVar.a = bttxVar.a;
                bttvVar.b = bttxVar.b;
                bttvVar.c = bttxVar.c;
                bttvVar.cM = bttxVar.aC();
                ekfwVar.h(bttvVar);
            }
        }
        return ekfwVar.g();
    }

    @Override // defpackage.dqqj
    public final Cursor a() {
        return this;
    }
}
