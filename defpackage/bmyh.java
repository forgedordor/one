package defpackage;

import android.database.Cursor;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bmyh extends dqqf implements bmxz {
    @Deprecated
    public bmyh(dqsy dqsyVar, Cursor cursor, String[] strArr, dqxe[] dqxeVarArr, dqwj dqwjVar, dqtm dqtmVar, bmyn bmynVar) {
        super(dqsyVar, cursor, strArr, dqxeVarArr, bmyr.a, dqwjVar, dqtmVar, bmynVar);
    }

    @Override // defpackage.dqqf
    protected final /* synthetic */ dqpd b() {
        return new bmxg();
    }

    public final long c() {
        return getLong(cO(1, bmyr.a));
    }

    public final long e() {
        return getLong(cO(0, bmyr.a));
    }

    public final long f() {
        return getLong(cO(6, bmyr.a));
    }

    @Override // defpackage.dqqf
    public final ekgb fI(dqth dqthVar) {
        epjl[] epjlVarArr;
        long[] jArr;
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
        long[] jArrC = zDj ? z ? dqru.C(null, dt(getString(cO(0, bmyr.a)))) : new long[]{e()} : null;
        dqqf.dz(length, jArrC, new ejxr() { // from class: bmya
            @Override // defpackage.ejxr
            public final Object get() {
                return "_id:".concat(String.valueOf(this.a.getString(0)));
            }
        });
        long[] jArrC2 = dj(1) ? z ? dqru.C(null, dt(getString(cO(1, bmyr.a)))) : new long[]{c()} : null;
        dqqf.dz(length, jArrC2, new ejxr() { // from class: bmyb
            @Override // defpackage.ejxr
            public final Object get() {
                return "dependent_id:".concat(String.valueOf(this.a.getString(1)));
            }
        });
        String[] strArr = dj(2) ? z ? (String[]) dqru.D(null, du(getString(cO(2, bmyr.a))), new String[0]) : new String[]{i()} : null;
        dqqf.dA(length, strArr, new ejxr() { // from class: bmyc
            @Override // defpackage.ejxr
            public final Object get() {
                return "dependent_cms_id:".concat(String.valueOf(this.a.getString(2)));
            }
        });
        String[] strArr2 = dj(3) ? z ? (String[]) dqru.D(null, du(getString(cO(3, bmyr.a))), new String[0]) : new String[]{h()} : null;
        dqqf.dA(length, strArr2, new ejxr() { // from class: bmyd
            @Override // defpackage.ejxr
            public final Object get() {
                return "dependency_cms_id:".concat(String.valueOf(this.a.getString(3)));
            }
        });
        if (!dj(4)) {
            epjlVarArr = null;
        } else if (z) {
            int[] iArrDs = ds(getString(cO(4, bmyr.a)));
            epjl[] epjlVarArr2 = new epjl[iArrDs.length];
            for (int i2 = 0; i2 < iArrDs.length; i2++) {
                epjl epjlVarB = epjl.b(iArrDs[i2]);
                if (epjlVarB == null) {
                    throw new IllegalStateException();
                }
                epjlVarArr2[i2] = epjlVarB;
            }
            epjlVarArr = (epjl[]) dqru.D(null, epjlVarArr2, new epjl[0]);
        } else {
            epjlVarArr = new epjl[]{g()};
        }
        dqqf.dA(length, epjlVarArr, new ejxr() { // from class: bmye
            @Override // defpackage.ejxr
            public final Object get() {
                return "cms_data_provider_type:".concat(String.valueOf(this.a.getString(4)));
            }
        });
        byte[][] bArrF = dj(5) ? z ? dqru.F(null, dD(getString(cO(5, bmyr.a)))) : new byte[][]{j()} : null;
        dqqf.dA(length, bArrF, new ejxr() { // from class: bmyf
            @Override // defpackage.ejxr
            public final Object get() {
                return "payload:".concat(String.valueOf(this.a.getString(5)));
            }
        });
        long[] jArrC3 = dj(6) ? z ? dqru.C(null, dt(getString(cO(6, bmyr.a)))) : new long[]{f()} : null;
        dqqf.dz(length, jArrC3, new ejxr() { // from class: bmyg
            @Override // defpackage.ejxr
            public final Object get() {
                return "inserted_at_timestamp:".concat(String.valueOf(this.a.getString(6)));
            }
        });
        ekfw ekfwVar = new ekfw();
        int i3 = 0;
        while (i3 < length) {
            long j = jArrDC[i3];
            if (j <= 0 || hashSet.contains(Long.valueOf(j))) {
                jArr = jArrDC;
            } else {
                hashSet.add(Long.valueOf(jArrDC[i3]));
                String[] strArr3 = bmyr.a;
                bmxi bmxiVar = new bmxi();
                bmxiVar.aF();
                bmxiVar.aD();
                long j2 = jArrDC[i3];
                jArr = jArrDC;
                if (jArrC != null) {
                    long j3 = jArrC[i3];
                    bmxiVar.aE(0);
                    bmxiVar.a = j3;
                }
                if (jArrC2 != null) {
                    bmxiVar.e(jArrC2[i3]);
                }
                if (strArr != null) {
                    bmxiVar.d(strArr[i3]);
                }
                if (strArr2 != null) {
                    bmxiVar.c(strArr2[i3]);
                }
                if (epjlVarArr != null) {
                    bmxiVar.b(epjlVarArr[i3]);
                }
                if (bArrF != null) {
                    bmxiVar.g(bArrF[i3]);
                }
                if (jArrC3 != null) {
                    bmxiVar.f(jArrC3[i3]);
                }
                ekfwVar.h(bmxiVar.a());
            }
            i3++;
            jArrDC = jArr;
        }
        return ekfwVar.g();
    }

    public final epjl g() {
        return epjl.b(getInt(cO(4, bmyr.a)));
    }

    public final String h() {
        return getString(cO(3, bmyr.a));
    }

    public final String i() {
        return getString(cO(2, bmyr.a));
    }

    public final byte[] j() {
        return getBlob(cO(5, bmyr.a));
    }

    @Override // defpackage.dqqj
    public final Cursor a() {
        return this;
    }
}
