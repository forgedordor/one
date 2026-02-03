package defpackage;

import android.database.Cursor;
import j$.time.Instant;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class btlv extends dqqf implements btll {
    @Deprecated
    public btlv(dqsy dqsyVar, Cursor cursor, String[] strArr, dqxe[] dqxeVarArr, dqwj dqwjVar, dqtm dqtmVar, btlz btlzVar) {
        super(dqsyVar, cursor, strArr, dqxeVarArr, btmf.a, dqwjVar, dqtmVar, btlzVar);
    }

    @Override // defpackage.dqqf
    protected final /* synthetic */ dqpd b() {
        return new btko();
    }

    public final long c() {
        return getLong(cO(6, btmf.a));
    }

    public final basa e() {
        return new basa(getLong(cO(3, btmf.a)));
    }

    public final Instant f() {
        return bart.b(getLong(cO(7, btmf.a)));
    }

    @Override // defpackage.dqqf
    public final ekgb fI(dqth dqthVar) {
        int i;
        basa[] basaVarArr;
        Instant[] instantArr;
        Instant[] instantArr2;
        int i2;
        boolean[] zArrE;
        long[] jArr;
        dqwl dqwlVar = dqthVar.a;
        long[] jArrDC = dC(getString(dqthVar.h + 1));
        int length = jArrDC.length;
        if (length != 0) {
            if (length != 1 || jArrDC[0] != -1) {
                HashSet hashSet = new HashSet();
                dqtm dqtmVar = this.d;
                boolean zDj = dj(0);
                boolean z = dqtmVar.b;
                String[] strArr = zDj ? z ? (String[]) dqru.D(null, du(getString(cO(0, btmf.a))), new String[0]) : new String[]{h()} : null;
                dqqf.dA(length, strArr, new ejxr() { // from class: btlm
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "tachyon_registration_id:".concat(String.valueOf(this.a.getString(0)));
                    }
                });
                boolean[] zArrE2 = dj(1) ? z ? dqru.E(null, dv(getString(cO(1, btmf.a)))) : new boolean[]{i()} : null;
                dqqf.dB(length, zArrE2, new ejxr() { // from class: btln
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "etouffee:".concat(String.valueOf(this.a.getString(1)));
                    }
                });
                boolean[] zArrE3 = dj(2) ? z ? dqru.E(null, dv(getString(cO(2, btmf.a)))) : new boolean[]{j()} : null;
                dqqf.dB(length, zArrE3, new ejxr() { // from class: btlo
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "better_etouffee:".concat(String.valueOf(this.a.getString(2)));
                    }
                });
                if (!dj(3)) {
                    i = length;
                    basaVarArr = null;
                } else if (z) {
                    long[] jArrDt = dt(getString(cO(3, btmf.a)));
                    int length2 = jArrDt.length;
                    basa[] basaVarArr2 = new basa[length2];
                    int i3 = 0;
                    while (i3 < length2) {
                        basaVarArr2[i3] = new basa(jArrDt[i3]);
                        i3++;
                        length = length;
                    }
                    i = length;
                    basaVarArr = (basa[]) dqru.D(null, basaVarArr2, new basa[0]);
                } else {
                    i = length;
                    basaVarArr = new basa[]{e()};
                }
                dqqf.dA(i, basaVarArr, new ejxr() { // from class: btlp
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "messages_feature_hash:".concat(String.valueOf(this.a.getString(3)));
                    }
                });
                if (!dj(4)) {
                    instantArr = null;
                } else if (z) {
                    long[] jArrDt2 = dt(getString(cO(4, btmf.a)));
                    int length3 = jArrDt2.length;
                    Instant[] instantArr3 = new Instant[length3];
                    for (int i4 = 0; i4 < length3; i4++) {
                        instantArr3[i4] = bart.b(jArrDt2[i4]);
                    }
                    instantArr = (Instant[]) dqru.D(null, instantArr3, new Instant[0]);
                } else {
                    instantArr = new Instant[]{g()};
                }
                dqqf.dA(i, instantArr, new ejxr() { // from class: btlq
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "last_modified_timestamp:".concat(String.valueOf(this.a.getString(4)));
                    }
                });
                byte[][] bArrF = dj(5) ? z ? dqru.F(null, dD(getString(cO(5, btmf.a)))) : new byte[][]{l()} : null;
                dqqf.dA(i, bArrF, new ejxr() { // from class: btlr
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "identity_key:".concat(String.valueOf(this.a.getString(5)));
                    }
                });
                long[] jArrC = dj(6) ? z ? dqru.C(null, dt(getString(cO(6, btmf.a)))) : new long[]{c()} : null;
                dqqf.dz(i, jArrC, new ejxr() { // from class: btls
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "updated_at_hash:".concat(String.valueOf(this.a.getString(6)));
                    }
                });
                if (!dj(7)) {
                    instantArr2 = null;
                } else if (z) {
                    long[] jArrDt3 = dt(getString(cO(7, btmf.a)));
                    int length4 = jArrDt3.length;
                    Instant[] instantArr4 = new Instant[length4];
                    for (int i5 = 0; i5 < length4; i5++) {
                        instantArr4[i5] = bart.b(jArrDt3[i5]);
                    }
                    instantArr2 = (Instant[]) dqru.D(null, instantArr4, new Instant[0]);
                } else {
                    instantArr2 = new Instant[]{f()};
                }
                dqqf.dA(i, instantArr2, new ejxr() { // from class: btlt
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "guaranteed_fresh_as_of_timestamp:".concat(String.valueOf(this.a.getString(7)));
                    }
                });
                if (!dj(8)) {
                    i2 = 0;
                    zArrE = null;
                } else if (z) {
                    zArrE = dqru.E(null, dv(getString(cO(8, btmf.a))));
                    i2 = 0;
                } else {
                    i2 = 0;
                    zArrE = new boolean[]{k()};
                }
                dqqf.dB(i, zArrE, new ejxr() { // from class: btlu
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "is_updated_at_hash_valid:".concat(String.valueOf(this.a.getString(8)));
                    }
                });
                ekfw ekfwVar = new ekfw();
                int i6 = i2;
                while (i6 < i) {
                    long j = jArrDC[i6];
                    if (j <= 0 || hashSet.contains(Long.valueOf(j))) {
                        jArr = jArrDC;
                    } else {
                        hashSet.add(Long.valueOf(jArrDC[i6]));
                        String[] strArr2 = btmf.a;
                        btkq btkqVar = new btkq();
                        btkqVar.aF();
                        btkqVar.aD();
                        long j2 = jArrDC[i6];
                        if (strArr != null) {
                            btkqVar.i(strArr[i6]);
                        }
                        if (zArrE2 != null) {
                            btkqVar.c(zArrE2[i6]);
                        }
                        if (zArrE3 != null) {
                            btkqVar.d(zArrE3[i6]);
                        }
                        if (basaVarArr != null) {
                            btkqVar.h(basaVarArr[i6]);
                        }
                        if (instantArr != null) {
                            btkqVar.g(instantArr[i6]);
                        }
                        if (bArrF != null) {
                            btkqVar.e(bArrF[i6]);
                        }
                        jArr = jArrDC;
                        if (jArrC != null) {
                            btkqVar.j(jArrC[i6]);
                        }
                        if (instantArr2 != null) {
                            btkqVar.b(instantArr2[i6]);
                        }
                        if (zArrE != null) {
                            btkqVar.f(zArrE[i6]);
                        }
                        ekfwVar.h(btkqVar.a());
                    }
                    i6++;
                    jArrDC = jArr;
                }
                return ekfwVar.g();
            }
        }
        int i7 = ekgb.d;
        return ekoe.a;
    }

    public final Instant g() {
        return bart.b(getLong(cO(4, btmf.a)));
    }

    public final String h() {
        return getString(cO(0, btmf.a));
    }

    public final boolean i() {
        return getInt(cO(1, btmf.a)) == 1;
    }

    public final boolean j() {
        return getInt(cO(2, btmf.a)) == 1;
    }

    public final boolean k() {
        return getInt(cO(8, btmf.a)) == 1;
    }

    public final byte[] l() {
        return getBlob(cO(5, btmf.a));
    }

    @Override // defpackage.dqqj
    public final Cursor a() {
        return this;
    }
}
