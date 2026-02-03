package defpackage;

import android.database.Cursor;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bpqr extends dqqf implements bpqf {
    @Deprecated
    public bpqr(dqsy dqsyVar, Cursor cursor, String[] strArr, dqxe[] dqxeVarArr, dqwj dqwjVar, dqtm dqtmVar, bpqy bpqyVar) {
        super(dqsyVar, cursor, strArr, dqxeVarArr, bprf.a, dqwjVar, dqtmVar, bpqyVar);
    }

    @Override // defpackage.dqqf
    protected final /* synthetic */ dqpd b() {
        return new bppe();
    }

    @Override // defpackage.bpqf
    public final int c() {
        return getInt(cO(1, bprf.a));
    }

    public final int e() {
        return getInt(cO(4, bprf.a));
    }

    public final int f() {
        return getInt(cO(7, bprf.a));
    }

    @Override // defpackage.dqqf
    public final ekgb fI(dqth dqthVar) {
        int i;
        int[] iArrA;
        long[] jArrC;
        long[] jArr;
        String[] strArr;
        int i2;
        long[] jArr2;
        int i3;
        int[] iArr;
        dqwl dqwlVar = dqthVar.a;
        long[] jArrDC = dC(getString(dqthVar.h + 1));
        int length = jArrDC.length;
        if (length == 0 || (length == 1 && jArrDC[0] == -1)) {
            int i4 = ekgb.d;
            return ekoe.a;
        }
        HashSet hashSet = new HashSet();
        dqtm dqtmVar = this.d;
        boolean zDj = dj(0);
        boolean z = dqtmVar.b;
        String[] strArr2 = zDj ? z ? (String[]) dqru.D(null, du(getString(cO(0, bprf.a))), new String[0]) : new String[]{k()} : null;
        dqqf.dA(length, strArr2, new ejxr() { // from class: bpqg
            @Override // defpackage.ejxr
            public final Object get() {
                return "_id:".concat(String.valueOf(this.a.getString(0)));
            }
        });
        int[] iArrA2 = dj(1) ? z ? dqru.A(null, ds(getString(cO(1, bprf.a)))) : new int[]{c()} : null;
        dqqf.dy(length, iArrA2, new ejxr() { // from class: bpqj
            @Override // defpackage.ejxr
            public final Object get() {
                return "worker_type:".concat(String.valueOf(this.a.getString(1)));
            }
        });
        int[] iArrA3 = dj(2) ? z ? dqru.A(null, ds(getString(cO(2, bprf.a)))) : new int[]{g()} : null;
        dqqf.dy(length, iArrA3, new ejxr() { // from class: bpqk
            @Override // defpackage.ejxr
            public final Object get() {
                return "item_table_type:".concat(String.valueOf(this.a.getString(2)));
            }
        });
        String[] strArr3 = dj(3) ? z ? (String[]) dqru.D(null, du(getString(cO(3, bprf.a))), new String[0]) : new String[]{l()} : null;
        dqqf.dA(length, strArr3, new ejxr() { // from class: bpql
            @Override // defpackage.ejxr
            public final Object get() {
                return "item_id:".concat(String.valueOf(this.a.getString(3)));
            }
        });
        int[] iArrA4 = dj(4) ? z ? dqru.A(null, ds(getString(cO(4, bprf.a)))) : new int[]{e()} : null;
        dqqf.dy(length, iArrA4, new ejxr() { // from class: bpqm
            @Override // defpackage.ejxr
            public final Object get() {
                return "account_id:".concat(String.valueOf(this.a.getString(4)));
            }
        });
        boolean[] zArrE = dj(5) ? z ? dqru.E(null, dv(getString(cO(5, bprf.a)))) : new boolean[]{n()} : null;
        dqqf.dB(length, zArrE, new ejxr() { // from class: bpqn
            @Override // defpackage.ejxr
            public final Object get() {
                return "in_flight:".concat(String.valueOf(this.a.getString(5)));
            }
        });
        int[] iArrA5 = dj(6) ? z ? dqru.A(null, ds(getString(cO(6, bprf.a)))) : new int[]{h()} : null;
        dqqf.dy(length, iArrA5, new ejxr() { // from class: bpqo
            @Override // defpackage.ejxr
            public final Object get() {
                return "retry_count:".concat(String.valueOf(this.a.getString(6)));
            }
        });
        if (!dj(7)) {
            i = 0;
            iArrA = null;
        } else if (z) {
            i = 0;
            iArrA = dqru.A(null, ds(getString(cO(7, bprf.a))));
        } else {
            i = 0;
            iArrA = new int[]{f()};
        }
        dqqf.dy(length, iArrA, new ejxr() { // from class: bpqp
            @Override // defpackage.ejxr
            public final Object get() {
                return "flags:".concat(String.valueOf(this.a.getString(7)));
            }
        });
        if (!dj(8)) {
            jArrC = null;
        } else if (z) {
            jArrC = dqru.C(null, dt(getString(cO(8, bprf.a))));
        } else {
            long[] jArr3 = new long[1];
            jArr3[i] = j();
            jArrC = jArr3;
        }
        dqqf.dz(length, jArrC, new ejxr() { // from class: bpqq
            @Override // defpackage.ejxr
            public final Object get() {
                return "next_execute_timestamp:".concat(String.valueOf(this.a.getString(8)));
            }
        });
        if (!dj(9)) {
            jArr = jArrDC;
            strArr = null;
        } else if (z) {
            jArr = jArrDC;
            strArr = (String[]) dqru.D(null, du(getString(cO(9, bprf.a))), new String[i]);
        } else {
            jArr = jArrDC;
            strArr = new String[1];
            strArr[i] = m();
        }
        dqqf.dA(length, strArr, new ejxr() { // from class: bpqh
            @Override // defpackage.ejxr
            public final Object get() {
                return "trigger_name:".concat(String.valueOf(this.a.getString(9)));
            }
        });
        long[] jArrC2 = dj(10) ? z ? dqru.C(null, dt(getString(cO(10, bprf.a)))) : new long[]{i()} : null;
        dqqf.dz(length, jArrC2, new ejxr() { // from class: bpqi
            @Override // defpackage.ejxr
            public final Object get() {
                return "enqueued_timestamp:".concat(String.valueOf(this.a.getString(10)));
            }
        });
        ekfw ekfwVar = new ekfw();
        int i5 = 0;
        while (i5 < length) {
            long j = jArr[i5];
            if (j <= 0 || hashSet.contains(Long.valueOf(j))) {
                i2 = i5;
                jArr2 = jArrC;
                i3 = length;
                iArr = iArrA;
            } else {
                hashSet.add(Long.valueOf(jArr[i5]));
                String[] strArr4 = bprf.a;
                bppg bppgVar = new bppg();
                bppgVar.aF();
                bppgVar.aD();
                long j2 = jArr[i5];
                i2 = i5;
                if (strArr2 != null) {
                    String str = strArr2[i2];
                    jArr2 = jArrC;
                    bppgVar.aE(0);
                    bppgVar.a = str;
                } else {
                    jArr2 = jArrC;
                }
                if (iArrA2 != null) {
                    bppgVar.d(iArrA2[i2]);
                }
                if (iArrA3 != null) {
                    bppgVar.c(iArrA3[i2]);
                }
                if (strArr3 != null) {
                    bppgVar.b(strArr3[i2]);
                }
                if (iArrA4 != null) {
                    int i6 = iArrA4[i2];
                    int i7 = bppgVar.aB;
                    i3 = length;
                    if (i7 < 39020) {
                        dqru.x("account_id", i7);
                    }
                    bppgVar.aE(4);
                    bppgVar.e = i6;
                } else {
                    i3 = length;
                }
                if (zArrE != null) {
                    boolean z2 = zArrE[i2];
                    bppgVar.aE(5);
                    bppgVar.f = z2;
                }
                if (iArrA5 != null) {
                    int i8 = iArrA5[i2];
                    bppgVar.aE(6);
                    bppgVar.g = i8;
                }
                if (iArrA != null) {
                    int i9 = iArrA[i2];
                    int i10 = bppgVar.aB;
                    if (i10 < 32000) {
                        dqru.x("flags", i10);
                    }
                    bppgVar.aE(7);
                    bppgVar.h = i9;
                }
                if (jArr2 != null) {
                    long j3 = jArr2[i2];
                    int i11 = bppgVar.aB;
                    iArr = iArrA;
                    if (i11 < 34000) {
                        dqru.x("next_execute_timestamp", i11);
                    }
                    bppgVar.aE(8);
                    bppgVar.i = j3;
                } else {
                    iArr = iArrA;
                }
                if (strArr != null) {
                    String str2 = strArr[i2];
                    int i12 = bppgVar.aB;
                    if (i12 < 59700) {
                        dqru.x("trigger_name", i12);
                    }
                    bppgVar.aE(9);
                    bppgVar.j = str2;
                }
                if (jArrC2 != null) {
                    long j4 = jArrC2[i2];
                    int i13 = bppgVar.aB;
                    if (i13 < 59970) {
                        dqru.x("enqueued_timestamp", i13);
                    }
                    bppgVar.aE(10);
                    bppgVar.k = j4;
                }
                ekfwVar.h(bppgVar.a());
            }
            i5 = i2 + 1;
            jArrC = jArr2;
            length = i3;
            iArrA = iArr;
        }
        return ekfwVar.g();
    }

    public final int g() {
        return getInt(cO(2, bprf.a));
    }

    public final int h() {
        return getInt(cO(6, bprf.a));
    }

    public final long i() {
        return getLong(cO(10, bprf.a));
    }

    public final long j() {
        return getLong(cO(8, bprf.a));
    }

    public final String k() {
        return getString(cO(0, bprf.a));
    }

    public final String l() {
        return getString(cO(3, bprf.a));
    }

    public final String m() {
        return getString(cO(9, bprf.a));
    }

    public final boolean n() {
        return getInt(cO(5, bprf.a)) == 1;
    }

    @Override // defpackage.dqqj
    public final Cursor a() {
        return this;
    }
}
