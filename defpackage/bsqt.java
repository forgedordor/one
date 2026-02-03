package defpackage;

import android.database.Cursor;
import j$.time.Instant;
import java.util.HashSet;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bsqt extends dqqf implements bsqj {
    @Deprecated
    public bsqt(dqsy dqsyVar, Cursor cursor, String[] strArr, dqxe[] dqxeVarArr, dqwj dqwjVar, dqtm dqtmVar, bsqz bsqzVar) {
        super(dqsyVar, cursor, strArr, dqxeVarArr, bsrg.a, dqwjVar, dqtmVar, bsqzVar);
    }

    @Override // defpackage.dqqf
    protected final /* synthetic */ dqpd b() {
        return new bspk();
    }

    public final long c() {
        return getLong(cO(4, bsrg.a));
    }

    public final cgxy e() {
        return chaj.b(getLong(cO(1, bsrg.a)));
    }

    public final cgzv f() {
        cgzv[] cgzvVarArrValues = cgzv.values();
        int i = getInt(cO(5, bsrg.a));
        if (i < cgzvVarArrValues.length) {
            return cgzvVarArrValues[i];
        }
        throw new IllegalArgumentException();
    }

    @Override // defpackage.dqqf
    public final ekgb fI(dqth dqthVar) {
        cgzx[] cgzxVarArr;
        cgxy[] cgxyVarArr;
        Instant[] instantArr;
        cgzv[] cgzvVarArr;
        Instant[] instantArr2;
        int i;
        long[] jArr;
        dqwl dqwlVar = dqthVar.a;
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
            cgzxVarArr = null;
        } else if (z) {
            String[] strArrDu = du(getString(cO(0, bsrg.a)));
            int length2 = strArrDu.length;
            cgzx[] cgzxVarArr2 = new cgzx[length2];
            for (int i3 = 0; i3 < length2; i3++) {
                cgzxVarArr2[i3] = chbt.a(strArrDu[i3]);
            }
            cgzxVarArr = (cgzx[]) dqru.D(null, cgzxVarArr2, new cgzx[0]);
        } else {
            cgzxVarArr = new cgzx[]{g()};
        }
        dqqf.dA(length, cgzxVarArr, new ejxr() { // from class: bsqk
            @Override // defpackage.ejxr
            public final Object get() {
                return "work_id:".concat(String.valueOf(this.a.getString(0)));
            }
        });
        if (!dj(1)) {
            cgxyVarArr = null;
        } else if (z) {
            long[] jArrDt = dt(getString(cO(1, bsrg.a)));
            int length3 = jArrDt.length;
            cgxy[] cgxyVarArr2 = new cgxy[length3];
            for (int i4 = 0; i4 < length3; i4++) {
                cgxyVarArr2[i4] = chaj.b(jArrDt[i4]);
            }
            cgxyVarArr = (cgxy[]) dqru.D(null, cgxyVarArr2, new cgxy[0]);
        } else {
            cgxyVarArr = new cgxy[]{e()};
        }
        dqqf.dA(length, cgxyVarArr, new ejxr() { // from class: bsql
            @Override // defpackage.ejxr
            public final Object get() {
                return "pipeline_type:".concat(String.valueOf(this.a.getString(1)));
            }
        });
        String[] strArr = dj(2) ? z ? (String[]) dqru.D(null, du(getString(cO(2, bsrg.a))), new String[0]) : new String[]{k()} : null;
        dqqf.dA(length, strArr, new ejxr() { // from class: bsqm
            @Override // defpackage.ejxr
            public final Object get() {
                return "sequencing_key:".concat(String.valueOf(this.a.getString(2)));
            }
        });
        if (!dj(3)) {
            instantArr = null;
        } else if (z) {
            long[] jArrDt2 = dt(getString(cO(3, bsrg.a)));
            int length4 = jArrDt2.length;
            Instant[] instantArr3 = new Instant[length4];
            for (int i5 = 0; i5 < length4; i5++) {
                instantArr3[i5] = bart.b(jArrDt2[i5]);
            }
            instantArr = (Instant[]) dqru.D(null, instantArr3, new Instant[0]);
        } else {
            instantArr = new Instant[]{i()};
        }
        dqqf.dA(length, instantArr, new ejxr() { // from class: bsqn
            @Override // defpackage.ejxr
            public final Object get() {
                return "insertion_timestamp:".concat(String.valueOf(this.a.getString(3)));
            }
        });
        long[] jArrC = dj(4) ? z ? dqru.C(null, dt(getString(cO(4, bsrg.a)))) : new long[]{c()} : null;
        dqqf.dz(length, jArrC, new ejxr() { // from class: bsqo
            @Override // defpackage.ejxr
            public final Object get() {
                return "execution_attempt_count:".concat(String.valueOf(this.a.getString(4)));
            }
        });
        if (!dj(5)) {
            cgzvVarArr = null;
        } else if (z) {
            int[] iArrDs = ds(getString(cO(5, bsrg.a)));
            cgzv[] cgzvVarArrValues = cgzv.values();
            int length5 = cgzvVarArrValues.length;
            cgzv[] cgzvVarArr2 = new cgzv[iArrDs.length];
            for (int i6 = 0; i6 < iArrDs.length; i6++) {
                int i7 = iArrDs[i6];
                if (i7 >= length5) {
                    throw new IllegalStateException();
                }
                cgzvVarArr2[i6] = cgzvVarArrValues[i7];
            }
            cgzvVarArr = (cgzv[]) dqru.D(null, cgzvVarArr2, new cgzv[0]);
        } else {
            cgzvVarArr = new cgzv[]{f()};
        }
        dqqf.dA(length, cgzvVarArr, new ejxr() { // from class: bsqp
            @Override // defpackage.ejxr
            public final Object get() {
                return "execution_state:".concat(String.valueOf(this.a.getString(5)));
            }
        });
        String[] strArr2 = dj(6) ? z ? (String[]) dqru.D(null, du(getString(cO(6, bsrg.a))), new String[0]) : new String[]{j()} : null;
        dqqf.dA(length, strArr2, new ejxr() { // from class: bsqq
            @Override // defpackage.ejxr
            public final Object get() {
                return "client_supplied_id:".concat(String.valueOf(this.a.getString(6)));
            }
        });
        byte[][] bArrF = dj(7) ? z ? dqru.F(null, dD(getString(cO(7, bsrg.a)))) : new byte[][]{l()} : null;
        dqqf.dA(length, bArrF, new ejxr() { // from class: bsqr
            @Override // defpackage.ejxr
            public final Object get() {
                return "payload:".concat(String.valueOf(this.a.getString(7)));
            }
        });
        if (!dj(8)) {
            instantArr2 = null;
            i = 0;
        } else if (z) {
            long[] jArrDt3 = dt(getString(cO(8, bsrg.a)));
            int length6 = jArrDt3.length;
            Instant[] instantArr4 = new Instant[length6];
            for (int i8 = 0; i8 < length6; i8++) {
                instantArr4[i8] = bart.b(jArrDt3[i8]);
            }
            i = 0;
            instantArr2 = (Instant[]) dqru.D(null, instantArr4, new Instant[0]);
        } else {
            i = 0;
            instantArr2 = new Instant[]{h()};
        }
        dqqf.dA(length, instantArr2, new ejxr() { // from class: bsqs
            @Override // defpackage.ejxr
            public final Object get() {
                return "execute_after_timestamp:".concat(String.valueOf(this.a.getString(8)));
            }
        });
        ekfw ekfwVar = new ekfw();
        while (i < length) {
            long j = jArrDC[i];
            if (j <= 0 || hashSet.contains(Long.valueOf(j))) {
                jArr = jArrDC;
            } else {
                hashSet.add(Long.valueOf(jArrDC[i]));
                String[] strArr3 = bsrg.a;
                bspo bspoVar = new bspo();
                bspoVar.aF();
                bspoVar.aD();
                long j2 = jArrDC[i];
                if (cgzxVarArr != null) {
                    bspoVar.j(cgzxVarArr[i]);
                }
                if (cgxyVarArr != null) {
                    bspoVar.h(cgxyVarArr[i]);
                }
                if (strArr != null) {
                    bspoVar.i(strArr[i]);
                }
                if (instantArr != null) {
                    bspoVar.f(instantArr[i]);
                }
                jArr = jArrDC;
                if (jArrC != null) {
                    bspoVar.d(jArrC[i]);
                }
                if (cgzvVarArr != null) {
                    bspoVar.e(cgzvVarArr[i]);
                }
                if (strArr2 != null) {
                    bspoVar.b(strArr2[i]);
                }
                if (bArrF != null) {
                    bspoVar.g(bArrF[i]);
                }
                if (instantArr2 != null) {
                    bspoVar.c(instantArr2[i]);
                }
                ekfwVar.h(bspoVar.a(new Supplier() { // from class: bspm
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        return new bspk();
                    }
                }));
            }
            i++;
            jArrDC = jArr;
        }
        return ekfwVar.g();
    }

    public final cgzx g() {
        return chbt.a(getString(cO(0, bsrg.a)));
    }

    public final Instant h() {
        return bart.b(getLong(cO(8, bsrg.a)));
    }

    public final Instant i() {
        return bart.b(getLong(cO(3, bsrg.a)));
    }

    public final String j() {
        return getString(cO(6, bsrg.a));
    }

    public final String k() {
        return getString(cO(2, bsrg.a));
    }

    public final byte[] l() {
        return getBlob(cO(7, bsrg.a));
    }

    @Override // defpackage.dqqj
    public final Cursor a() {
        return this;
    }
}
