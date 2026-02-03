package defpackage;

import android.database.Cursor;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bmkb extends dqqf implements bmjv {
    @Deprecated
    public bmkb(dqsy dqsyVar, Cursor cursor, String[] strArr, dqxe[] dqxeVarArr, dqwj dqwjVar, dqtm dqtmVar, bmkh bmkhVar) {
        super(dqsyVar, cursor, strArr, dqxeVarArr, bmkn.a, dqwjVar, dqtmVar, bmkhVar);
    }

    @Override // defpackage.dqqf
    protected final /* synthetic */ dqpd b() {
        return new bmjg();
    }

    public final long c() {
        return getLong(cO(2, bmkn.a));
    }

    public final long e() {
        return getLong(cO(3, bmkn.a));
    }

    public final long f() {
        return getLong(cO(0, bmkn.a));
    }

    @Override // defpackage.dqqf
    public final ekgb fI(dqth dqthVar) {
        long[] jArr;
        int i;
        dqwl dqwlVar = dqthVar.a;
        int i2 = 1;
        long[] jArrDC = dC(getString(dqthVar.h + 1));
        int length = jArrDC.length;
        if (length == 0 || (length == 1 && jArrDC[0] == -1)) {
            int i3 = ekgb.d;
            return ekoe.a;
        }
        HashSet hashSet = new HashSet();
        dqtm dqtmVar = this.d;
        boolean zDj = dj(0);
        boolean z = dqtmVar.b;
        long[] jArrC = zDj ? z ? dqru.C(null, dt(getString(cO(0, bmkn.a)))) : new long[]{f()} : null;
        dqqf.dz(length, jArrC, new ejxr() { // from class: bmjw
            @Override // defpackage.ejxr
            public final Object get() {
                return "_id:".concat(String.valueOf(this.a.getString(0)));
            }
        });
        String[] strArr = dj(1) ? z ? (String[]) dqru.D(null, du(getString(cO(1, bmkn.a))), new String[0]) : new String[]{h()} : null;
        dqqf.dA(length, strArr, new ejxr() { // from class: bmjx
            @Override // defpackage.ejxr
            public final Object get() {
                return "table_name:".concat(String.valueOf(this.a.getString(1)));
            }
        });
        long[] jArrC2 = dj(2) ? z ? dqru.C(null, dt(getString(cO(2, bmkn.a)))) : new long[]{c()} : null;
        dqqf.dz(length, jArrC2, new ejxr() { // from class: bmjy
            @Override // defpackage.ejxr
            public final Object get() {
                return "backup_id:".concat(String.valueOf(this.a.getString(2)));
            }
        });
        long[] jArrC3 = dj(3) ? z ? dqru.C(null, dt(getString(cO(3, bmkn.a)))) : new long[]{e()} : null;
        dqqf.dz(length, jArrC3, new ejxr() { // from class: bmjz
            @Override // defpackage.ejxr
            public final Object get() {
                return "bugle_id:".concat(String.valueOf(this.a.getString(3)));
            }
        });
        long[] jArrC4 = dj(4) ? z ? dqru.C(null, dt(getString(cO(4, bmkn.a)))) : new long[]{g()} : null;
        dqqf.dz(length, jArrC4, new ejxr() { // from class: bmka
            @Override // defpackage.ejxr
            public final Object get() {
                return "status:".concat(String.valueOf(this.a.getString(4)));
            }
        });
        ekfw ekfwVar = new ekfw();
        int i4 = 0;
        while (i4 < length) {
            long j = jArrDC[i4];
            if (j <= 0 || hashSet.contains(Long.valueOf(j))) {
                jArr = jArrC3;
                i = length;
            } else {
                hashSet.add(Long.valueOf(jArrDC[i4]));
                String[] strArr2 = bmkn.a;
                bmji bmjiVar = new bmji();
                bmjiVar.aF();
                bmjiVar.aD();
                long j2 = jArrDC[i4];
                jArr = jArrC3;
                if (jArrC != null) {
                    long j3 = jArrC[i4];
                    bmjiVar.aE(0);
                    bmjiVar.a = j3;
                }
                if (strArr != null) {
                    String str = strArr[i4];
                    bmjiVar.aE(i2);
                    bmjiVar.b = str;
                }
                if (jArrC2 != null) {
                    long j4 = jArrC2[i4];
                    bmjiVar.aE(2);
                    bmjiVar.c = j4;
                }
                if (jArr != null) {
                    long j5 = jArr[i4];
                    bmjiVar.aE(3);
                    bmjiVar.d = j5;
                }
                if (jArrC4 != null) {
                    long j6 = jArrC4[i4];
                    bmjiVar.aE(4);
                    bmjiVar.e = j6;
                }
                bmjg bmjgVar = new bmjg();
                bmjgVar.aD(bmjiVar.aB());
                i = length;
                bmjgVar.a = bmjiVar.a;
                bmjgVar.b = bmjiVar.b;
                bmjgVar.c = bmjiVar.c;
                bmjgVar.d = bmjiVar.d;
                bmjgVar.e = bmjiVar.e;
                bmjgVar.cM = bmjiVar.aC();
                ekfwVar.h(bmjgVar);
            }
            i4++;
            length = i;
            jArrC3 = jArr;
            i2 = 1;
        }
        return ekfwVar.g();
    }

    public final long g() {
        return getLong(cO(4, bmkn.a));
    }

    public final String h() {
        return getString(cO(1, bmkn.a));
    }

    @Override // defpackage.dqqj
    public final Cursor a() {
        return this;
    }
}
