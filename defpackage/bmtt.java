package defpackage;

import android.database.Cursor;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bmtt extends dqqf implements bmtl {
    @Deprecated
    public bmtt(dqsy dqsyVar, Cursor cursor, String[] strArr, dqxe[] dqxeVarArr, dqwj dqwjVar, dqtm dqtmVar, bmty bmtyVar) {
        super(dqsyVar, cursor, strArr, dqxeVarArr, bmua.a, dqwjVar, dqtmVar, bmtyVar);
    }

    @Override // defpackage.dqqf
    protected final /* synthetic */ dqpd b() {
        return new bmss();
    }

    public final long c() {
        return getLong(cO(4, bmua.a));
    }

    public final long e() {
        return getLong(cO(5, bmua.a));
    }

    public final long f() {
        return getLong(cO(0, bmua.a));
    }

    @Override // defpackage.dqqf
    public final ekgb fI(dqth dqthVar) {
        long[] jArr;
        int i;
        dqwl dqwlVar = dqthVar.a;
        long[] jArrDC = dC(getString(dqthVar.h + 1));
        int length = jArrDC.length;
        if (length != 0) {
            int i2 = 0;
            if (length != 1 || jArrDC[0] != -1) {
                HashSet hashSet = new HashSet();
                dqtm dqtmVar = this.d;
                boolean zDj = dj(0);
                boolean z = dqtmVar.b;
                long[] jArrC = zDj ? z ? dqru.C(null, dt(getString(cO(0, bmua.a)))) : new long[]{f()} : null;
                dqqf.dz(length, jArrC, new ejxr() { // from class: bmtm
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "_id:".concat(String.valueOf(this.a.getString(0)));
                    }
                });
                long[] jArrC2 = dj(1) ? z ? dqru.C(null, dt(getString(cO(1, bmua.a)))) : new long[]{i()} : null;
                dqqf.dz(length, jArrC2, new ejxr() { // from class: bmtn
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "table_type:".concat(String.valueOf(this.a.getString(1)));
                    }
                });
                long[] jArrC3 = dj(2) ? z ? dqru.C(null, dt(getString(cO(2, bmua.a)))) : new long[]{h()} : null;
                dqqf.dz(length, jArrC3, new ejxr() { // from class: bmto
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "operation:".concat(String.valueOf(this.a.getString(2)));
                    }
                });
                String[] strArr = dj(3) ? z ? (String[]) dqru.D(null, du(getString(cO(3, bmua.a))), new String[0]) : new String[]{j()} : null;
                dqqf.dA(length, strArr, new ejxr() { // from class: bmtp
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "bugle_id:".concat(String.valueOf(this.a.getString(3)));
                    }
                });
                long[] jArrC4 = dj(4) ? z ? dqru.C(null, dt(getString(cO(4, bmua.a)))) : new long[]{c()} : null;
                dqqf.dz(length, jArrC4, new ejxr() { // from class: bmtq
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "attempt_count:".concat(String.valueOf(this.a.getString(4)));
                    }
                });
                long[] jArrC5 = dj(5) ? z ? dqru.C(null, dt(getString(cO(5, bmua.a)))) : new long[]{e()} : null;
                dqqf.dz(length, jArrC5, new ejxr() { // from class: bmtr
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "create_timestamp:".concat(String.valueOf(this.a.getString(5)));
                    }
                });
                long[] jArrC6 = dj(6) ? z ? dqru.C(null, dt(getString(cO(6, bmua.a)))) : new long[]{g()} : null;
                dqqf.dz(length, jArrC6, new ejxr() { // from class: bmts
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "last_attempt_timestamp:".concat(String.valueOf(this.a.getString(6)));
                    }
                });
                ekfw ekfwVar = new ekfw();
                int i3 = 0;
                while (i3 < length) {
                    long j = jArrDC[i3];
                    if (j <= 0 || hashSet.contains(Long.valueOf(j))) {
                        jArr = jArrDC;
                        i = length;
                    } else {
                        hashSet.add(Long.valueOf(jArrDC[i3]));
                        String[] strArr2 = bmua.a;
                        bmsu bmsuVar = new bmsu();
                        bmsuVar.aF();
                        bmsuVar.aD();
                        long j2 = jArrDC[i3];
                        i = length;
                        if (jArrC != null) {
                            long j3 = jArrC[i3];
                            bmsuVar.aE(i2);
                            bmsuVar.a = j3;
                        }
                        if (jArrC2 != null) {
                            long j4 = jArrC2[i3];
                            bmsuVar.aE(1);
                            bmsuVar.b = j4;
                        }
                        if (jArrC3 != null) {
                            long j5 = jArrC3[i3];
                            bmsuVar.aE(2);
                            bmsuVar.c = j5;
                        }
                        if (strArr != null) {
                            String str = strArr[i3];
                            bmsuVar.aE(3);
                            bmsuVar.d = str;
                        }
                        if (jArrC4 != null) {
                            long j6 = jArrC4[i3];
                            bmsuVar.aE(4);
                            bmsuVar.e = j6;
                        }
                        if (jArrC5 != null) {
                            long j7 = jArrC5[i3];
                            bmsuVar.aE(5);
                            bmsuVar.f = j7;
                        }
                        if (jArrC6 != null) {
                            long j8 = jArrC6[i3];
                            bmsuVar.aE(6);
                            bmsuVar.g = j8;
                        }
                        bmss bmssVar = new bmss();
                        bmssVar.aD(bmsuVar.aB());
                        jArr = jArrDC;
                        bmssVar.a = bmsuVar.a;
                        bmssVar.b = bmsuVar.b;
                        bmssVar.c = bmsuVar.c;
                        bmssVar.d = bmsuVar.d;
                        bmssVar.e = bmsuVar.e;
                        bmssVar.f = bmsuVar.f;
                        bmssVar.g = bmsuVar.g;
                        bmssVar.cM = bmsuVar.aC();
                        ekfwVar.h(bmssVar);
                    }
                    i3++;
                    jArrDC = jArr;
                    length = i;
                    i2 = 0;
                }
                return ekfwVar.g();
            }
        }
        int i4 = ekgb.d;
        return ekoe.a;
    }

    public final long g() {
        return getLong(cO(6, bmua.a));
    }

    public final long h() {
        return getLong(cO(2, bmua.a));
    }

    public final long i() {
        return getLong(cO(1, bmua.a));
    }

    public final String j() {
        return getString(cO(3, bmua.a));
    }

    @Override // defpackage.dqqj
    public final Cursor a() {
        return this;
    }
}
