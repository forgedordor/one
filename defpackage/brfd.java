package defpackage;

import android.database.Cursor;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class brfd extends dqqf implements brew {
    @Deprecated
    public brfd(dqsy dqsyVar, Cursor cursor, String[] strArr, dqxe[] dqxeVarArr, dqwj dqwjVar, dqtm dqtmVar, brfi brfiVar) {
        super(dqsyVar, cursor, strArr, dqxeVarArr, brfk.a, dqwjVar, dqtmVar, brfiVar);
    }

    @Override // defpackage.dqqf
    protected final /* synthetic */ dqpd b() {
        return new bref();
    }

    public final long c() {
        return getLong(cO(1, brfk.a));
    }

    public final long e() {
        return getLong(cO(0, brfk.a));
    }

    public final long f() {
        return getLong(cO(2, brfk.a));
    }

    @Override // defpackage.dqqf
    public final ekgb fI(dqth dqthVar) {
        HashSet hashSet;
        long[] jArr;
        char c;
        dqwl dqwlVar = dqthVar.a;
        int i = 1;
        long[] jArrDC = dC(getString(dqthVar.h + 1));
        int length = jArrDC.length;
        if (length != 0) {
            int i2 = 0;
            if (length != 1 || jArrDC[0] != -1) {
                HashSet hashSet2 = new HashSet();
                dqtm dqtmVar = this.d;
                boolean zDj = dj(0);
                boolean z = dqtmVar.b;
                long[] jArrC = zDj ? z ? dqru.C(null, dt(getString(cO(0, brfk.a)))) : new long[]{e()} : null;
                dqqf.dz(length, jArrC, new ejxr() { // from class: brex
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "_id:".concat(String.valueOf(this.a.getString(0)));
                    }
                });
                long[] jArrC2 = dj(1) ? z ? dqru.C(null, dt(getString(cO(1, brfk.a)))) : new long[]{c()} : null;
                dqqf.dz(length, jArrC2, new ejxr() { // from class: brey
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "am_version_code:".concat(String.valueOf(this.a.getString(1)));
                    }
                });
                long[] jArrC3 = dj(2) ? z ? dqru.C(null, dt(getString(cO(2, brfk.a)))) : new long[]{f()} : null;
                dqqf.dz(length, jArrC3, new ejxr() { // from class: brez
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "stack_trace_hash:".concat(String.valueOf(this.a.getString(2)));
                    }
                });
                char c2 = 3;
                String[] strArr = dj(3) ? z ? (String[]) dqru.D(null, du(getString(cO(3, brfk.a))), new String[0]) : new String[]{g()} : null;
                dqqf.dA(length, strArr, new ejxr() { // from class: brfa
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "source:".concat(String.valueOf(this.a.getString(3)));
                    }
                });
                String[] strArr2 = dj(4) ? z ? (String[]) dqru.D(null, du(getString(cO(4, brfk.a))), new String[0]) : new String[]{i()} : null;
                dqqf.dA(length, strArr2, new ejxr() { // from class: brfb
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "tiktok_trace:".concat(String.valueOf(this.a.getString(4)));
                    }
                });
                String[] strArr3 = dj(5) ? z ? (String[]) dqru.D(null, du(getString(cO(5, brfk.a))), new String[0]) : new String[]{h()} : null;
                dqqf.dA(length, strArr3, new ejxr() { // from class: brfc
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "stack_trace:".concat(String.valueOf(this.a.getString(5)));
                    }
                });
                ekfw ekfwVar = new ekfw();
                int i3 = 0;
                while (i3 < length) {
                    long j = jArrDC[i3];
                    if (j <= 0) {
                        hashSet = hashSet2;
                        jArr = jArrC3;
                        c = c2;
                    } else if (hashSet2.contains(Long.valueOf(j))) {
                        hashSet = hashSet2;
                        jArr = jArrC3;
                        c = 3;
                    } else {
                        hashSet2.add(Long.valueOf(jArrDC[i3]));
                        String[] strArr4 = brfk.a;
                        breh brehVar = new breh();
                        brehVar.aF();
                        brehVar.aD();
                        long j2 = jArrDC[i3];
                        jArr = jArrC3;
                        if (jArrC != null) {
                            long j3 = jArrC[i3];
                            brehVar.aE(i2);
                            brehVar.a = j3;
                        }
                        if (jArrC2 != null) {
                            long j4 = jArrC2[i3];
                            brehVar.aE(i);
                            brehVar.b = j4;
                        }
                        if (jArr != null) {
                            long j5 = jArr[i3];
                            brehVar.aE(2);
                            brehVar.c = j5;
                        }
                        if (strArr != null) {
                            String str = strArr[i3];
                            c = 3;
                            brehVar.aE(3);
                            brehVar.d = str;
                        } else {
                            c = 3;
                        }
                        if (strArr2 != null) {
                            String str2 = strArr2[i3];
                            brehVar.aE(4);
                            brehVar.e = str2;
                        }
                        if (strArr3 != null) {
                            String str3 = strArr3[i3];
                            brehVar.aE(5);
                            brehVar.f = str3;
                        }
                        bref brefVar = new bref();
                        brefVar.aD(brehVar.aB());
                        hashSet = hashSet2;
                        brefVar.a = brehVar.a;
                        brefVar.b = brehVar.b;
                        brefVar.c = brehVar.c;
                        brefVar.d = brehVar.d;
                        brefVar.e = brehVar.e;
                        brefVar.f = brehVar.f;
                        brefVar.cM = brehVar.aC();
                        ekfwVar.h(brefVar);
                    }
                    i3++;
                    c2 = c;
                    jArrC3 = jArr;
                    hashSet2 = hashSet;
                    i = 1;
                    i2 = 0;
                }
                return ekfwVar.g();
            }
        }
        int i4 = ekgb.d;
        return ekoe.a;
    }

    public final String g() {
        return getString(cO(3, brfk.a));
    }

    public final String h() {
        return getString(cO(5, brfk.a));
    }

    public final String i() {
        return getString(cO(4, brfk.a));
    }

    @Override // defpackage.dqqj
    public final Cursor a() {
        return this;
    }
}
