package defpackage;

import android.database.Cursor;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class btth extends dqqf implements bttd {
    @Deprecated
    public btth(dqsy dqsyVar, Cursor cursor, String[] strArr, dqxe[] dqxeVarArr, dqwj dqwjVar, dqtm dqtmVar, bttn bttnVar) {
        super(dqsyVar, cursor, strArr, dqxeVarArr, bttr.a, dqwjVar, dqtmVar, bttnVar);
    }

    @Override // defpackage.dqqf
    protected final /* synthetic */ dqpd b() {
        return new btss();
    }

    public final btts c() {
        btts[] bttsVarArrValues = btts.values();
        int i = getInt(cO(0, bttr.a));
        if (i < bttsVarArrValues.length) {
            return bttsVarArrValues[i];
        }
        throw new IllegalArgumentException();
    }

    public final String e() {
        return getString(cO(1, bttr.a));
    }

    public final String f() {
        return getString(cO(2, bttr.a));
    }

    @Override // defpackage.dqqf
    public final ekgb fI(dqth dqthVar) {
        btts[] bttsVarArr;
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
            bttsVarArr = null;
        } else if (z) {
            int[] iArrDs = ds(getString(cO(0, bttr.a)));
            btts[] bttsVarArrValues = btts.values();
            int length2 = bttsVarArrValues.length;
            btts[] bttsVarArr2 = new btts[iArrDs.length];
            for (int i2 = 0; i2 < iArrDs.length; i2++) {
                int i3 = iArrDs[i2];
                if (i3 >= length2) {
                    throw new IllegalStateException();
                }
                bttsVarArr2[i2] = bttsVarArrValues[i3];
            }
            bttsVarArr = (btts[]) dqru.D(null, bttsVarArr2, new btts[0]);
        } else {
            bttsVarArr = new btts[]{c()};
        }
        dqqf.dA(length, bttsVarArr, new ejxr() { // from class: btte
            @Override // defpackage.ejxr
            public final Object get() {
                return "key:".concat(String.valueOf(this.a.getString(0)));
            }
        });
        String[] strArr = dj(1) ? z ? (String[]) dqru.D(null, du(getString(cO(1, bttr.a))), new String[0]) : new String[]{e()} : null;
        dqqf.dA(length, strArr, new ejxr() { // from class: bttf
            @Override // defpackage.ejxr
            public final Object get() {
                return "backup_id:".concat(String.valueOf(this.a.getString(1)));
            }
        });
        String[] strArr2 = dj(2) ? z ? (String[]) dqru.D(null, du(getString(cO(2, bttr.a))), new String[0]) : new String[]{f()} : null;
        dqqf.dA(length, strArr2, new ejxr() { // from class: bttg
            @Override // defpackage.ejxr
            public final Object get() {
                return "bugle_id:".concat(String.valueOf(this.a.getString(2)));
            }
        });
        ekfw ekfwVar = new ekfw();
        for (int i4 = 0; i4 < length; i4++) {
            long j = jArrDC[i4];
            if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                hashSet.add(Long.valueOf(jArrDC[i4]));
                String[] strArr3 = bttr.a;
                btsu btsuVar = new btsu();
                btsuVar.aF();
                btsuVar.aD();
                long j2 = jArrDC[i4];
                if (bttsVarArr != null) {
                    btts bttsVar = bttsVarArr[i4];
                    btsuVar.aE(0);
                    btsuVar.a = bttsVar;
                }
                if (strArr != null) {
                    String str = strArr[i4];
                    btsuVar.aE(1);
                    btsuVar.b = str;
                }
                if (strArr2 != null) {
                    String str2 = strArr2[i4];
                    btsuVar.aE(2);
                    btsuVar.c = str2;
                }
                btss btssVar = new btss();
                btssVar.aD(btsuVar.aB());
                btssVar.a = btsuVar.a;
                btssVar.b = btsuVar.b;
                btssVar.c = btsuVar.c;
                btssVar.cM = btsuVar.aC();
                ekfwVar.h(btssVar);
            }
        }
        return ekfwVar.g();
    }

    @Override // defpackage.dqqj
    public final Cursor a() {
        return this;
    }
}
