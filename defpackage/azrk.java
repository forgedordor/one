package defpackage;

import android.database.Cursor;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class azrk extends dqqf implements azrf {
    @Deprecated
    public azrk(dqsy dqsyVar, Cursor cursor, String[] strArr, dqxe[] dqxeVarArr, dqwj dqwjVar, dqtm dqtmVar, azrq azrqVar) {
        super(dqsyVar, cursor, strArr, dqxeVarArr, azru.a, dqwjVar, dqtmVar, azrqVar);
    }

    @Override // defpackage.dqqf
    protected final /* synthetic */ dqpd b() {
        return new azqs();
    }

    public final awxl c() {
        awxl[] awxlVarArrValues = awxl.values();
        int i = getInt(cO(1, azru.a));
        if (i < awxlVarArrValues.length) {
            return awxlVarArrValues[i];
        }
        throw new IllegalArgumentException();
    }

    public final axcm e() {
        return axcn.a(getString(cO(0, azru.a)));
    }

    public final String f() {
        return getString(cO(2, azru.a));
    }

    @Override // defpackage.dqqf
    public final ekgb fI(dqth dqthVar) {
        axcm[] axcmVarArr;
        awxl[] awxlVarArr;
        dqwl dqwlVar = dqthVar.a;
        int i = 1;
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
        if (!zDj) {
            axcmVarArr = null;
        } else if (z) {
            String[] strArrDu = du(getString(cO(0, azru.a)));
            int length2 = strArrDu.length;
            axcm[] axcmVarArr2 = new axcm[length2];
            for (int i3 = 0; i3 < length2; i3++) {
                axcmVarArr2[i3] = axcn.a(strArrDu[i3]);
            }
            axcmVarArr = (axcm[]) dqru.D(null, axcmVarArr2, new axcm[0]);
        } else {
            axcmVarArr = new axcm[]{e()};
        }
        dqqf.dA(length, axcmVarArr, new ejxr() { // from class: azrg
            @Override // defpackage.ejxr
            public final Object get() {
                return "token:".concat(String.valueOf(this.a.getString(0)));
            }
        });
        if (!dj(1)) {
            awxlVarArr = null;
        } else if (z) {
            int[] iArrDs = ds(getString(cO(1, azru.a)));
            awxl[] awxlVarArrValues = awxl.values();
            int length3 = awxlVarArrValues.length;
            awxl[] awxlVarArr2 = new awxl[iArrDs.length];
            for (int i4 = 0; i4 < iArrDs.length; i4++) {
                int i5 = iArrDs[i4];
                if (i5 >= length3) {
                    throw new IllegalStateException();
                }
                awxlVarArr2[i4] = awxlVarArrValues[i5];
            }
            awxlVarArr = (awxl[]) dqru.D(null, awxlVarArr2, new awxl[0]);
        } else {
            awxlVarArr = new awxl[]{c()};
        }
        dqqf.dA(length, awxlVarArr, new ejxr() { // from class: azrh
            @Override // defpackage.ejxr
            public final Object get() {
                return "address_type:".concat(String.valueOf(this.a.getString(1)));
            }
        });
        String[] strArr = dj(2) ? z ? (String[]) dqru.D(null, du(getString(cO(2, azru.a))), new String[0]) : new String[]{f()} : null;
        dqqf.dA(length, strArr, new ejxr() { // from class: azri
            @Override // defpackage.ejxr
            public final Object get() {
                return "phone_number:".concat(String.valueOf(this.a.getString(2)));
            }
        });
        String[] strArr2 = dj(3) ? z ? (String[]) dqru.D(null, du(getString(cO(3, azru.a))), new String[0]) : new String[]{g()} : null;
        dqqf.dA(length, strArr2, new ejxr() { // from class: azrj
            @Override // defpackage.ejxr
            public final Object get() {
                return "display_name:".concat(String.valueOf(this.a.getString(3)));
            }
        });
        ekfw ekfwVar = new ekfw();
        int i6 = 0;
        while (i6 < length) {
            long j = jArrDC[i6];
            if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                hashSet.add(Long.valueOf(jArrDC[i6]));
                String[] strArr3 = azru.a;
                azqu azquVar = new azqu();
                azquVar.aF();
                azquVar.aD();
                long j2 = jArrDC[i6];
                if (axcmVarArr != null) {
                    axcm axcmVar = axcmVarArr[i6];
                    azquVar.aE(0);
                    azquVar.a = axcmVar;
                }
                if (awxlVarArr != null) {
                    awxl awxlVar = awxlVarArr[i6];
                    azquVar.aE(i);
                    azquVar.b = awxlVar;
                }
                if (strArr != null) {
                    String str = strArr[i6];
                    azquVar.aE(2);
                    azquVar.c = str;
                }
                if (strArr2 != null) {
                    String str2 = strArr2[i6];
                    azquVar.aE(3);
                    azquVar.d = str2;
                }
                azqs azqsVar = new azqs();
                azqsVar.aD(azquVar.aB());
                azqsVar.a = azquVar.a;
                azqsVar.b = azquVar.b;
                azqsVar.c = azquVar.c;
                azqsVar.d = azquVar.d;
                azqsVar.cM = azquVar.aC();
                ekfwVar.h(azqsVar);
            }
            i6++;
            i = 1;
        }
        return ekfwVar.g();
    }

    public final String g() {
        return getString(cO(3, azru.a));
    }

    @Override // defpackage.dqqj
    public final Cursor a() {
        return this;
    }
}
