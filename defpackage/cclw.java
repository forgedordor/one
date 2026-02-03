package defpackage;

import android.database.Cursor;
import j$.time.Instant;
import java.util.HashSet;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cclw extends dqqf implements cclp {
    @Deprecated
    public cclw(dqsy dqsyVar, Cursor cursor, String[] strArr, dqxe[] dqxeVarArr, dqwj dqwjVar, dqtm dqtmVar, ccmb ccmbVar) {
        super(dqsyVar, cursor, strArr, dqxeVarArr, ccmf.a, dqwjVar, dqtmVar, ccmbVar);
    }

    @Override // defpackage.dqqf
    protected final /* synthetic */ dqpd b() {
        return new cckw();
    }

    @Override // defpackage.cclp
    public final ekgb c() {
        ekfw ekfwVar = new ekfw();
        while (moveToNext()) {
            if (j() != null) {
                ekfwVar.h(j());
            }
        }
        return ekfwVar.g();
    }

    public final basd e() {
        return basd.a(getString(cO(1, ccmf.a)));
    }

    public final ccnk f() {
        ccnk[] ccnkVarArrValues = ccnk.values();
        int i = getInt(cO(4, ccmf.a));
        if (i < ccnkVarArrValues.length) {
            return ccnkVarArrValues[i];
        }
        throw new IllegalArgumentException();
    }

    @Override // defpackage.dqqf
    public final ekgb fI(dqth dqthVar) {
        basd[] basdVarArr;
        ccnk[] ccnkVarArr;
        Instant[] instantArr;
        dqwl dqwlVar = dqthVar.a;
        long[] jArrDC = dC(getString(dqthVar.h + 1));
        int length = jArrDC.length;
        if (length != 0) {
            if (length != 1 || jArrDC[0] != -1) {
                HashSet hashSet = new HashSet();
                dqtm dqtmVar = this.d;
                boolean zDj = dj(0);
                boolean z = dqtmVar.b;
                String[] strArr = zDj ? z ? (String[]) dqru.D(null, du(getString(cO(0, ccmf.a))), new String[0]) : new String[]{i()} : null;
                dqqf.dA(length, strArr, new ejxr() { // from class: cclq
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "self_identity:".concat(String.valueOf(this.a.getString(0)));
                    }
                });
                if (!dj(1)) {
                    basdVarArr = null;
                } else if (z) {
                    String[] strArrDu = du(getString(cO(1, ccmf.a)));
                    int length2 = strArrDu.length;
                    basd[] basdVarArr2 = new basd[length2];
                    for (int i = 0; i < length2; i++) {
                        basdVarArr2[i] = basd.a(strArrDu[i]);
                    }
                    basdVarArr = (basd[]) dqru.D(null, basdVarArr2, new basd[0]);
                } else {
                    basdVarArr = new basd[]{e()};
                }
                dqqf.dA(length, basdVarArr, new ejxr() { // from class: cclr
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "rcs_message_id:".concat(String.valueOf(this.a.getString(1)));
                    }
                });
                String[] strArr2 = dj(2) ? z ? (String[]) dqru.D(null, du(getString(cO(2, ccmf.a))), new String[0]) : new String[]{h()} : null;
                dqqf.dA(length, strArr2, new ejxr() { // from class: ccls
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "remote_user_id:".concat(String.valueOf(this.a.getString(2)));
                    }
                });
                byte[][] bArrF = dj(3) ? z ? dqru.F(null, dD(getString(cO(3, ccmf.a)))) : new byte[][]{j()} : null;
                dqqf.dA(length, bArrF, new ejxr() { // from class: cclt
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "raw_content:".concat(String.valueOf(this.a.getString(3)));
                    }
                });
                if (!dj(4)) {
                    ccnkVarArr = null;
                } else if (z) {
                    int[] iArrDs = ds(getString(cO(4, ccmf.a)));
                    ccnk[] ccnkVarArrValues = ccnk.values();
                    int length3 = ccnkVarArrValues.length;
                    ccnk[] ccnkVarArr2 = new ccnk[iArrDs.length];
                    for (int i2 = 0; i2 < iArrDs.length; i2++) {
                        int i3 = iArrDs[i2];
                        if (i3 >= length3) {
                            throw new IllegalStateException();
                        }
                        ccnkVarArr2[i2] = ccnkVarArrValues[i3];
                    }
                    ccnkVarArr = (ccnk[]) dqru.D(null, ccnkVarArr2, new ccnk[0]);
                } else {
                    ccnkVarArr = new ccnk[]{f()};
                }
                dqqf.dA(length, ccnkVarArr, new ejxr() { // from class: cclu
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "stage:".concat(String.valueOf(this.a.getString(4)));
                    }
                });
                if (!dj(5)) {
                    instantArr = null;
                } else if (z) {
                    long[] jArrDt = dt(getString(cO(5, ccmf.a)));
                    int length4 = jArrDt.length;
                    Instant[] instantArr2 = new Instant[length4];
                    for (int i4 = 0; i4 < length4; i4++) {
                        instantArr2[i4] = bart.b(jArrDt[i4]);
                    }
                    instantArr = (Instant[]) dqru.D(null, instantArr2, new Instant[0]);
                } else {
                    instantArr = new Instant[]{g()};
                }
                dqqf.dA(length, instantArr, new ejxr() { // from class: cclv
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "sort_timestamp:".concat(String.valueOf(this.a.getString(5)));
                    }
                });
                ekfw ekfwVar = new ekfw();
                for (int i5 = 0; i5 < length; i5++) {
                    long j = jArrDC[i5];
                    if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                        hashSet.add(Long.valueOf(jArrDC[i5]));
                        String[] strArr3 = ccmf.a;
                        ccla cclaVar = new ccla();
                        cclaVar.aF();
                        cclaVar.aD();
                        long j2 = jArrDC[i5];
                        if (strArr != null) {
                            cclaVar.e(strArr[i5]);
                        }
                        if (basdVarArr != null) {
                            cclaVar.c(basdVarArr[i5]);
                        }
                        if (strArr2 != null) {
                            cclaVar.d(strArr2[i5]);
                        }
                        if (bArrF != null) {
                            cclaVar.b(bArrF[i5]);
                        }
                        if (ccnkVarArr != null) {
                            cclaVar.g(ccnkVarArr[i5]);
                        }
                        if (instantArr != null) {
                            cclaVar.f(instantArr[i5]);
                        }
                        ekfwVar.h(cclaVar.a(new Supplier() { // from class: ccky
                            @Override // java.util.function.Supplier
                            public final Object get() {
                                return new cckw();
                            }
                        }));
                    }
                }
                return ekfwVar.g();
            }
        }
        int i6 = ekgb.d;
        return ekoe.a;
    }

    public final Instant g() {
        return bart.b(getLong(cO(5, ccmf.a)));
    }

    public final String h() {
        return getString(cO(2, ccmf.a));
    }

    public final String i() {
        return getString(cO(0, ccmf.a));
    }

    public final byte[] j() {
        return getBlob(cO(3, ccmf.a));
    }

    @Override // defpackage.dqqj
    public final Cursor a() {
        return this;
    }
}
