package defpackage;

import android.database.Cursor;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bmof extends dqqf implements bmob {
    @Deprecated
    public bmof(dqsy dqsyVar, Cursor cursor, String[] strArr, dqxe[] dqxeVarArr, dqwj dqwjVar, dqtm dqtmVar, bmol bmolVar) {
        super(dqsyVar, cursor, strArr, dqxeVarArr, bmop.a, dqwjVar, dqtmVar, bmolVar);
    }

    @Override // defpackage.dqqf
    protected final /* synthetic */ dqpd b() {
        return new bmnq();
    }

    @Override // defpackage.bmob
    public final String c() {
        return getString(cO(2, bmop.a));
    }

    public final long e() {
        return getLong(cO(0, bmop.a));
    }

    public final String f() {
        return getString(cO(1, bmop.a));
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
        long[] jArrC = zDj ? z ? dqru.C(null, dt(getString(cO(0, bmop.a)))) : new long[]{e()} : null;
        dqqf.dz(length, jArrC, new ejxr() { // from class: bmoc
            @Override // defpackage.ejxr
            public final Object get() {
                return "_id:".concat(String.valueOf(this.a.getString(0)));
            }
        });
        String[] strArr = dj(1) ? z ? (String[]) dqru.D(null, du(getString(cO(1, bmop.a))), new String[0]) : new String[]{f()} : null;
        dqqf.dA(length, strArr, new ejxr() { // from class: bmod
            @Override // defpackage.ejxr
            public final Object get() {
                return "message_id:".concat(String.valueOf(this.a.getString(1)));
            }
        });
        String[] strArr2 = dj(2) ? z ? (String[]) dqru.D(null, du(getString(cO(2, bmop.a))), new String[0]) : new String[]{c()} : null;
        dqqf.dA(length, strArr2, new ejxr() { // from class: bmoe
            @Override // defpackage.ejxr
            public final Object get() {
                return "blob_id:".concat(String.valueOf(this.a.getString(2)));
            }
        });
        ekfw ekfwVar = new ekfw();
        for (int i2 = 0; i2 < length; i2++) {
            long j = jArrDC[i2];
            if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                hashSet.add(Long.valueOf(jArrDC[i2]));
                String[] strArr3 = bmop.a;
                bmns bmnsVar = new bmns();
                bmnsVar.aF();
                bmnsVar.aD();
                long j2 = jArrDC[i2];
                if (jArrC != null) {
                    long j3 = jArrC[i2];
                    bmnsVar.aE(0);
                    bmnsVar.a = j3;
                }
                if (strArr != null) {
                    String str = strArr[i2];
                    bmnsVar.aE(1);
                    bmnsVar.b = str;
                }
                if (strArr2 != null) {
                    String str2 = strArr2[i2];
                    bmnsVar.aE(2);
                    bmnsVar.c = str2;
                }
                bmnq bmnqVar = new bmnq();
                bmnqVar.aD(bmnsVar.aB());
                bmnqVar.a = bmnsVar.a;
                bmnqVar.b = bmnsVar.b;
                bmnqVar.c = bmnsVar.c;
                bmnqVar.cM = bmnsVar.aC();
                ekfwVar.h(bmnqVar);
            }
        }
        return ekfwVar.g();
    }

    @Override // defpackage.dqqj
    public final Cursor a() {
        return this;
    }
}
