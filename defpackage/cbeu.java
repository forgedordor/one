package defpackage;

import android.database.Cursor;
import j$.util.Optional;
import java.util.Date;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cbeu extends dqqf implements cbei {
    @Deprecated
    public cbeu(dqsy dqsyVar, Cursor cursor, String[] strArr, dqxe[] dqxeVarArr, dqwj dqwjVar, dqtm dqtmVar, cbfb cbfbVar) {
        super(dqsyVar, cursor, strArr, dqxeVarArr, cbfi.a, dqwjVar, dqtmVar, cbfbVar);
    }

    @Override // defpackage.dqqf
    protected final /* synthetic */ dqpd b() {
        return new cbdh();
    }

    @Override // defpackage.cbei
    public final long c() {
        return getLong(cO(4, cbfi.a));
    }

    @Override // defpackage.cbei
    public final String e() {
        String[] strArr = cbfi.a;
        if (isNull(cO(5, strArr))) {
            throw new IllegalStateException("found null in cursor for column queue");
        }
        return getString(cO(5, strArr));
    }

    @Override // defpackage.cbei
    public final String f() {
        return getString(cO(1, cbfi.a));
    }

    @Override // defpackage.dqqf
    public final ekgb fI(dqth dqthVar) {
        String[] strArr;
        int i;
        boolean[] zArrE;
        long[] jArr;
        Optional[] optionalArr;
        Date[] dateArr;
        Date[] dateArr2;
        int i2;
        boolean[] zArr;
        HashSet hashSet;
        dqwl dqwlVar = dqthVar.a;
        long[] jArrDC = dC(getString(dqthVar.h + 1));
        int length = jArrDC.length;
        if (length == 0 || (length == 1 && jArrDC[0] == -1)) {
            int i3 = ekgb.d;
            return ekoe.a;
        }
        HashSet hashSet2 = new HashSet();
        dqtm dqtmVar = this.d;
        boolean zDj = dj(0);
        boolean z = dqtmVar.b;
        long[] jArrC = zDj ? z ? dqru.C(null, dt(getString(cO(0, cbfi.a)))) : new long[]{i()} : null;
        dqqf.dz(length, jArrC, new ejxr() { // from class: cbej
            @Override // defpackage.ejxr
            public final Object get() {
                return "_id:".concat(String.valueOf(this.a.getString(0)));
            }
        });
        String[] strArr2 = dj(1) ? z ? (String[]) dqru.D(null, du(getString(cO(1, cbfi.a))), new String[0]) : new String[]{f()} : null;
        dqqf.dA(length, strArr2, new ejxr() { // from class: cbem
            @Override // defpackage.ejxr
            public final Object get() {
                return "type:".concat(String.valueOf(this.a.getString(1)));
            }
        });
        byte[][] bArrF = dj(2) ? z ? dqru.F(null, dD(getString(cO(2, cbfi.a)))) : new byte[][]{n()} : null;
        dqqf.dA(length, bArrF, new ejxr() { // from class: cben
            @Override // defpackage.ejxr
            public final Object get() {
                return "rawdata:".concat(String.valueOf(this.a.getString(2)));
            }
        });
        int[] iArrA = dj(3) ? z ? dqru.A(null, ds(getString(cO(3, cbfi.a)))) : new int[]{h()} : null;
        dqqf.dy(length, iArrA, new ejxr() { // from class: cbeo
            @Override // defpackage.ejxr
            public final Object get() {
                return "attempts:".concat(String.valueOf(this.a.getString(3)));
            }
        });
        long[] jArrC2 = dj(4) ? z ? dqru.C(null, dt(getString(cO(4, cbfi.a)))) : new long[]{c()} : null;
        dqqf.dz(length, jArrC2, new ejxr() { // from class: cbep
            @Override // defpackage.ejxr
            public final Object get() {
                return "timestamp:".concat(String.valueOf(this.a.getString(4)));
            }
        });
        if (!dj(5)) {
            strArr = null;
        } else if (z) {
            String[] strArr3 = cbfi.a;
            if (isNull(cO(5, strArr3))) {
                throw new IllegalStateException("found null in cursor for column queue");
            }
            strArr = (String[]) dqru.D(null, du(getString(cO(5, strArr3))), new String[0]);
        } else {
            strArr = new String[]{e()};
        }
        dqqf.dA(length, strArr, new ejxr() { // from class: cbeq
            @Override // defpackage.ejxr
            public final Object get() {
                return "queue:".concat(String.valueOf(this.a.getString(5)));
            }
        });
        String[] strArr4 = dj(6) ? z ? (String[]) dqru.D(null, du(getString(cO(6, cbfi.a))), new String[0]) : new String[]{l()} : null;
        dqqf.dA(length, strArr4, new ejxr() { // from class: cber
            @Override // defpackage.ejxr
            public final Object get() {
                return "deduplication_tag:".concat(String.valueOf(this.a.getString(6)));
            }
        });
        if (!dj(7)) {
            i = 0;
            zArrE = null;
        } else if (z) {
            i = 0;
            zArrE = dqru.E(null, dv(getString(cO(7, cbfi.a))));
        } else {
            i = 0;
            zArrE = new boolean[]{m()};
        }
        dqqf.dB(length, zArrE, new ejxr() { // from class: cbes
            @Override // defpackage.ejxr
            public final Object get() {
                return "scheduled_in_workmanager:".concat(String.valueOf(this.a.getString(7)));
            }
        });
        if (!dj(8)) {
            jArr = jArrDC;
            optionalArr = null;
        } else if (z) {
            String[] strArrDu = du(getString(cO(8, cbfi.a)));
            int length2 = strArrDu.length;
            Optional[] optionalArr2 = new Optional[length2];
            jArr = jArrDC;
            for (int i4 = i; i4 < length2; i4++) {
                optionalArr2[i4] = basg.a(strArrDu[i4]);
            }
            optionalArr = (Optional[]) dqru.D(null, optionalArr2, new Optional[i]);
        } else {
            jArr = jArrDC;
            Optional[] optionalArr3 = new Optional[1];
            optionalArr3[i] = j();
            optionalArr = optionalArr3;
        }
        dqqf.dA(length, optionalArr, new ejxr() { // from class: cbet
            @Override // defpackage.ejxr
            public final Object get() {
                return "workmanager_id:".concat(String.valueOf(this.a.getString(8)));
            }
        });
        if (!dj(9)) {
            dateArr = null;
        } else if (z) {
            long[] jArrDt = dt(getString(cO(9, cbfi.a)));
            int length3 = jArrDt.length;
            Date[] dateArr3 = new Date[length3];
            for (int i5 = 0; i5 < length3; i5++) {
                dateArr3[i5] = barp.b(jArrDt[i5]);
            }
            dateArr = (Date[]) dqru.D(null, dateArr3, new Date[0]);
        } else {
            dateArr = new Date[]{g()};
        }
        dqqf.dA(length, dateArr, new ejxr() { // from class: cbek
            @Override // defpackage.ejxr
            public final Object get() {
                return "minimum_start_time:".concat(String.valueOf(this.a.getString(9)));
            }
        });
        String[] strArr5 = dj(10) ? z ? (String[]) dqru.D(null, du(getString(cO(10, cbfi.a))), new String[0]) : new String[]{k()} : null;
        dqqf.dA(length, strArr5, new ejxr() { // from class: cbel
            @Override // defpackage.ejxr
            public final Object get() {
                return "cancellation_tag:".concat(String.valueOf(this.a.getString(10)));
            }
        });
        ekfw ekfwVar = new ekfw();
        int i6 = 0;
        while (i6 < length) {
            long j = jArr[i6];
            if (j <= 0 || hashSet2.contains(Long.valueOf(j))) {
                dateArr2 = dateArr;
                i2 = length;
                zArr = zArrE;
                hashSet = hashSet2;
            } else {
                hashSet2.add(Long.valueOf(jArr[i6]));
                String[] strArr6 = cbfi.a;
                cbdj cbdjVar = new cbdj();
                cbdjVar.aF();
                cbdjVar.aD();
                long j2 = jArr[i6];
                if (jArrC != null) {
                    i2 = length;
                    zArr = zArrE;
                    long j3 = jArrC[i6];
                    dateArr2 = dateArr;
                    cbdjVar.aE(0);
                    cbdjVar.a = j3;
                } else {
                    dateArr2 = dateArr;
                    i2 = length;
                    zArr = zArrE;
                }
                if (strArr2 != null) {
                    cbdjVar.h(strArr2[i6]);
                }
                if (bArrF != null) {
                    cbdjVar.f(bArrF[i6]);
                }
                if (iArrA != null) {
                    int i7 = iArrA[i6];
                    cbdjVar.aE(3);
                    cbdjVar.d = i7;
                }
                hashSet = hashSet2;
                if (jArrC2 != null) {
                    cbdjVar.g(jArrC2[i6]);
                }
                if (strArr != null) {
                    cbdjVar.e(strArr[i6]);
                }
                if (strArr4 != null) {
                    cbdjVar.c(strArr4[i6]);
                }
                if (zArr != null) {
                    boolean z2 = zArr[i6];
                    int i8 = cbdjVar.aB;
                    if (i8 < 45030) {
                        dqru.x("scheduled_in_workmanager", i8);
                    }
                    cbdjVar.aE(7);
                    cbdjVar.h = z2;
                }
                if (optionalArr != null) {
                    Optional optional = optionalArr[i6];
                    int i9 = cbdjVar.aB;
                    if (i9 < 46060) {
                        dqru.x("workmanager_id", i9);
                    }
                    cbdjVar.aE(8);
                    cbdjVar.i = optional;
                }
                if (dateArr2 != null) {
                    cbdjVar.d(dateArr2[i6]);
                }
                if (strArr5 != null) {
                    cbdjVar.b(strArr5[i6]);
                }
                ekfwVar.h(cbdjVar.a());
            }
            i6++;
            hashSet2 = hashSet;
            length = i2;
            zArrE = zArr;
            dateArr = dateArr2;
        }
        return ekfwVar.g();
    }

    @Override // defpackage.cbei
    public final Date g() {
        return barp.b(getLong(cO(9, cbfi.a)));
    }

    public final int h() {
        return getInt(cO(3, cbfi.a));
    }

    public final long i() {
        return getLong(cO(0, cbfi.a));
    }

    public final Optional j() {
        return basg.a(getString(cO(8, cbfi.a)));
    }

    public final String k() {
        return getString(cO(10, cbfi.a));
    }

    public final String l() {
        return getString(cO(6, cbfi.a));
    }

    public final boolean m() {
        return getInt(cO(7, cbfi.a)) == 1;
    }

    public final byte[] n() {
        return getBlob(cO(2, cbfi.a));
    }

    @Override // defpackage.dqqj
    public final Cursor a() {
        return this;
    }
}
