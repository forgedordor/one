package defpackage;

import android.database.Cursor;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class btvp extends dqqf implements btvk {
    @Deprecated
    public btvp(dqsy dqsyVar, Cursor cursor, String[] strArr, dqxe[] dqxeVarArr, dqwj dqwjVar, dqtm dqtmVar, btvv btvvVar) {
        super(dqsyVar, cursor, strArr, dqxeVarArr, btvz.a, dqwjVar, dqtmVar, btvvVar);
    }

    @Override // defpackage.dqqf
    protected final /* synthetic */ dqpd b() {
        return new btux();
    }

    public final long c() {
        return getLong(cO(2, btvz.a));
    }

    public final long e() {
        return getLong(cO(3, btvz.a));
    }

    public final bvde f() {
        bvde[] bvdeVarArrValues = bvde.values();
        int i = getInt(cO(0, btvz.a));
        if (i < bvdeVarArrValues.length) {
            return bvdeVarArrValues[i];
        }
        throw new IllegalArgumentException();
    }

    @Override // defpackage.dqqf
    public final ekgb fI(dqth dqthVar) {
        bvde[] bvdeVarArr;
        int i;
        HashSet hashSet;
        dqwl dqwlVar = dqthVar.a;
        int i2 = 1;
        long[] jArrDC = dC(getString(dqthVar.h + 1));
        int length = jArrDC.length;
        if (length != 0) {
            int i3 = 0;
            if (length != 1 || jArrDC[0] != -1) {
                HashSet hashSet2 = new HashSet();
                dqtm dqtmVar = this.d;
                boolean zDj = dj(0);
                boolean z = dqtmVar.b;
                if (!zDj) {
                    bvdeVarArr = null;
                } else if (z) {
                    int[] iArrDs = ds(getString(cO(0, btvz.a)));
                    bvde[] bvdeVarArrValues = bvde.values();
                    int length2 = bvdeVarArrValues.length;
                    bvde[] bvdeVarArr2 = new bvde[iArrDs.length];
                    for (int i4 = 0; i4 < iArrDs.length; i4++) {
                        int i5 = iArrDs[i4];
                        if (i5 >= length2) {
                            throw new IllegalStateException();
                        }
                        bvdeVarArr2[i4] = bvdeVarArrValues[i5];
                    }
                    bvdeVarArr = (bvde[]) dqru.D(null, bvdeVarArr2, new bvde[0]);
                } else {
                    bvdeVarArr = new bvde[]{f()};
                }
                dqqf.dA(length, bvdeVarArr, new ejxr() { // from class: btvl
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "which_database:".concat(String.valueOf(this.a.getString(0)));
                    }
                });
                String[] strArr = dj(1) ? z ? (String[]) dqru.D(null, du(getString(cO(1, btvz.a))), new String[0]) : new String[]{g()} : null;
                dqqf.dA(length, strArr, new ejxr() { // from class: btvm
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "message_id:".concat(String.valueOf(this.a.getString(1)));
                    }
                });
                long[] jArrC = dj(2) ? z ? dqru.C(null, dt(getString(cO(2, btvz.a)))) : new long[]{c()} : null;
                dqqf.dz(length, jArrC, new ejxr() { // from class: btvn
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "timestamp_in_seconds:".concat(String.valueOf(this.a.getString(2)));
                    }
                });
                long[] jArrC2 = dj(3) ? z ? dqru.C(null, dt(getString(cO(3, btvz.a)))) : new long[]{e()} : null;
                dqqf.dz(length, jArrC2, new ejxr() { // from class: btvo
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "timestamp_mod_1000:".concat(String.valueOf(this.a.getString(3)));
                    }
                });
                ekfw ekfwVar = new ekfw();
                int i6 = 0;
                while (i6 < length) {
                    long j = jArrDC[i6];
                    if (j <= 0 || hashSet2.contains(Long.valueOf(j))) {
                        i = length;
                        hashSet = hashSet2;
                    } else {
                        hashSet2.add(Long.valueOf(jArrDC[i6]));
                        String[] strArr2 = btvz.a;
                        btuz btuzVar = new btuz();
                        btuzVar.aF();
                        btuzVar.aD();
                        long j2 = jArrDC[i6];
                        if (bvdeVarArr != null) {
                            bvde bvdeVar = bvdeVarArr[i6];
                            btuzVar.aE(i3);
                            btuzVar.a = bvdeVar;
                        }
                        if (strArr != null) {
                            String str = strArr[i6];
                            btuzVar.aE(i2);
                            btuzVar.b = str;
                        }
                        i = length;
                        if (jArrC != null) {
                            long j3 = jArrC[i6];
                            btuzVar.aE(2);
                            btuzVar.c = j3;
                        }
                        if (jArrC2 != null) {
                            long j4 = jArrC2[i6];
                            btuzVar.aE(3);
                            btuzVar.d = j4;
                        }
                        btux btuxVar = new btux();
                        btuxVar.aD(btuzVar.aB());
                        btuxVar.a = btuzVar.a;
                        btuxVar.b = btuzVar.b;
                        hashSet = hashSet2;
                        btuxVar.c = btuzVar.c;
                        btuxVar.d = btuzVar.d;
                        btuxVar.cM = btuzVar.aC();
                        ekfwVar.h(btuxVar);
                    }
                    i6++;
                    length = i;
                    hashSet2 = hashSet;
                    i2 = 1;
                    i3 = 0;
                }
                return ekfwVar.g();
            }
        }
        int i7 = ekgb.d;
        return ekoe.a;
    }

    public final String g() {
        return getString(cO(1, btvz.a));
    }

    @Override // defpackage.dqqj
    public final Cursor a() {
        return this;
    }
}
