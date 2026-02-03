package defpackage;

import android.database.Cursor;
import java.util.HashSet;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bmsc extends dqqf implements bmrw {
    @Deprecated
    public bmsc(dqsy dqsyVar, Cursor cursor, String[] strArr, dqxe[] dqxeVarArr, dqwj dqwjVar, dqtm dqtmVar, bmsj bmsjVar) {
        super(dqsyVar, cursor, strArr, dqxeVarArr, bmso.a, dqwjVar, dqtmVar, bmsjVar);
    }

    @Override // defpackage.dqqf
    protected final /* synthetic */ dqpd b() {
        return new bmrf();
    }

    @Override // defpackage.bmrw
    public final ekgb c() {
        ekfw ekfwVar = new ekfw();
        while (moveToNext()) {
            g();
            ekfwVar.h(Long.valueOf(g()));
        }
        return ekfwVar.g();
    }

    public final long e() {
        return getLong(cO(2, bmso.a));
    }

    public final long f() {
        return getLong(cO(4, bmso.a));
    }

    @Override // defpackage.dqqf
    public final ekgb fI(dqth dqthVar) {
        bmsp[] bmspVarArr;
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
        long[] jArrC = zDj ? z ? dqru.C(null, dt(getString(cO(0, bmso.a)))) : new long[]{g()} : null;
        dqqf.dz(length, jArrC, new ejxr() { // from class: bmrx
            @Override // defpackage.ejxr
            public final Object get() {
                return "_id:".concat(String.valueOf(this.a.getString(0)));
            }
        });
        long[] jArrC2 = dj(1) ? z ? dqru.C(null, dt(getString(cO(1, bmso.a)))) : new long[]{h()} : null;
        dqqf.dz(length, jArrC2, new ejxr() { // from class: bmry
            @Override // defpackage.ejxr
            public final Object get() {
                return "message_id:".concat(String.valueOf(this.a.getString(1)));
            }
        });
        long[] jArrC3 = dj(2) ? z ? dqru.C(null, dt(getString(cO(2, bmso.a)))) : new long[]{e()} : null;
        dqqf.dz(length, jArrC3, new ejxr() { // from class: bmrz
            @Override // defpackage.ejxr
            public final Object get() {
                return "conversation_id:".concat(String.valueOf(this.a.getString(2)));
            }
        });
        if (!dj(3)) {
            bmspVarArr = null;
        } else if (z) {
            int[] iArrDs = ds(getString(cO(3, bmso.a)));
            bmsp[] bmspVarArrValues = bmsp.values();
            int length2 = bmspVarArrValues.length;
            bmsp[] bmspVarArr2 = new bmsp[iArrDs.length];
            for (int i2 = 0; i2 < iArrDs.length; i2++) {
                int i3 = iArrDs[i2];
                if (i3 >= length2) {
                    throw new IllegalStateException();
                }
                bmspVarArr2[i2] = bmspVarArrValues[i3];
            }
            bmspVarArr = (bmsp[]) dqru.D(null, bmspVarArr2, new bmsp[0]);
        } else {
            bmspVarArr = new bmsp[]{i()};
        }
        dqqf.dA(length, bmspVarArr, new ejxr() { // from class: bmsa
            @Override // defpackage.ejxr
            public final Object get() {
                return "message_deletion_reason:".concat(String.valueOf(this.a.getString(3)));
            }
        });
        long[] jArrC4 = dj(4) ? z ? dqru.C(null, dt(getString(cO(4, bmso.a)))) : new long[]{f()} : null;
        dqqf.dz(length, jArrC4, new ejxr() { // from class: bmsb
            @Override // defpackage.ejxr
            public final Object get() {
                return "deletion_timestamp:".concat(String.valueOf(this.a.getString(4)));
            }
        });
        ekfw ekfwVar = new ekfw();
        for (int i4 = 0; i4 < length; i4++) {
            long j = jArrDC[i4];
            if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                hashSet.add(Long.valueOf(jArrDC[i4]));
                String[] strArr = bmso.a;
                bmrj bmrjVar = new bmrj();
                bmrjVar.aF();
                bmrjVar.aD();
                long j2 = jArrDC[i4];
                if (jArrC != null) {
                    long j3 = jArrC[i4];
                    bmrjVar.aE(0);
                    bmrjVar.a = j3;
                }
                if (jArrC2 != null) {
                    bmrjVar.d(jArrC2[i4]);
                }
                if (jArrC3 != null) {
                    long j4 = jArrC3[i4];
                    bmrjVar.aE(2);
                    bmrjVar.c = j4;
                }
                if (bmspVarArr != null) {
                    bmrjVar.c(bmspVarArr[i4]);
                }
                if (jArrC4 != null) {
                    bmrjVar.b(jArrC4[i4]);
                }
                ekfwVar.h(bmrjVar.a(new Supplier() { // from class: bmrh
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        return new bmrf();
                    }
                }));
            }
        }
        return ekfwVar.g();
    }

    public final long g() {
        return getLong(cO(0, bmso.a));
    }

    public final long h() {
        return getLong(cO(1, bmso.a));
    }

    public final bmsp i() {
        bmsp[] bmspVarArrValues = bmsp.values();
        int i = getInt(cO(3, bmso.a));
        if (i < bmspVarArrValues.length) {
            return bmspVarArrValues[i];
        }
        throw new IllegalArgumentException();
    }

    @Override // defpackage.dqqj
    public final Cursor a() {
        return this;
    }
}
