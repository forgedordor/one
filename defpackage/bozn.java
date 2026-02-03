package defpackage;

import android.database.Cursor;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bozn extends dqqf implements boyp {
    @Deprecated
    public bozn(dqsy dqsyVar, Cursor cursor, String[] strArr, dqxe[] dqxeVarArr, dqwj dqwjVar, dqtm dqtmVar, bozu bozuVar) {
        super(dqsyVar, cursor, strArr, dqxeVarArr, bpab.a, dqwjVar, dqtmVar, bozuVar);
    }

    public final byte[] A() {
        return getBlob(cO(19, bpab.a));
    }

    @Override // defpackage.dqqf
    protected final /* synthetic */ dqpd b() {
        return new bowq();
    }

    @Override // defpackage.boyp
    public final long c() {
        return getLong(cO(22, bpab.a));
    }

    @Override // defpackage.boyp
    public final long e() {
        return getLong(cO(2, bpab.a));
    }

    @Override // defpackage.boyp
    public final long f() {
        return getLong(cO(3, bpab.a));
    }

    @Override // defpackage.dqqf
    public final ekgb fI(dqth dqthVar) {
        int i;
        byte[][] bArrF;
        long[] jArr;
        String[] strArr;
        String[] strArr2;
        String[] strArr3;
        String[] strArr4;
        byte[][] bArrF2;
        byte[][] bArr;
        int[] iArr;
        byte[][] bArr2;
        boolean z;
        long[] jArr2;
        bveb[] bvebVarArr;
        bveb[] bvebVarArr2;
        boolean[] zArr;
        String[] strArr5;
        boolean[] zArr2;
        bvdm[] bvdmVarArr;
        bvdm[] bvdmVarArr2;
        bvdu[] bvduVarArr;
        int i2;
        byte[][] bArr3;
        bvdu[] bvduVarArr2;
        int i3;
        String[] strArr6;
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
        boolean z2 = dqtmVar.b;
        long[] jArrC = zDj ? z2 ? dqru.C(null, dt(getString(cO(0, bpab.a)))) : new long[]{q()} : null;
        dqqf.dz(length, jArrC, new ejxr() { // from class: boyq
            @Override // defpackage.ejxr
            public final Object get() {
                return "_id:".concat(String.valueOf(this.a.getString(0)));
            }
        });
        String[] strArr7 = dj(1) ? z2 ? (String[]) dqru.D(null, du(getString(cO(1, bpab.a))), new String[0]) : new String[]{i()} : null;
        dqqf.dA(length, strArr7, new ejxr() { // from class: boys
            @Override // defpackage.ejxr
            public final Object get() {
                return "desktop_id:".concat(String.valueOf(this.a.getString(1)));
            }
        });
        long[] jArrC2 = dj(2) ? z2 ? dqru.C(null, dt(getString(cO(2, bpab.a)))) : new long[]{e()} : null;
        dqqf.dz(length, jArrC2, new ejxr() { // from class: boyw
            @Override // defpackage.ejxr
            public final Object get() {
                return "last_connection_time:".concat(String.valueOf(this.a.getString(2)));
            }
        });
        long[] jArrC3 = dj(3) ? z2 ? dqru.C(null, dt(getString(cO(3, bpab.a)))) : new long[]{f()} : null;
        dqqf.dz(length, jArrC3, new ejxr() { // from class: boyx
            @Override // defpackage.ejxr
            public final Object get() {
                return "last_wakeup_time:".concat(String.valueOf(this.a.getString(3)));
            }
        });
        long[] jArrC4 = dj(4) ? z2 ? dqru.C(null, dt(getString(cO(4, bpab.a)))) : new long[]{r()} : null;
        dqqf.dz(length, jArrC4, new ejxr() { // from class: boyy
            @Override // defpackage.ejxr
            public final Object get() {
                return "wakeup_attempts_count:".concat(String.valueOf(this.a.getString(4)));
            }
        });
        String[] strArr8 = dj(5) ? z2 ? (String[]) dqru.D(null, du(getString(cO(5, bpab.a))), new String[0]) : new String[]{u()} : null;
        dqqf.dA(length, strArr8, new ejxr() { // from class: boyz
            @Override // defpackage.ejxr
            public final Object get() {
                return "fingerprint:".concat(String.valueOf(this.a.getString(5)));
            }
        });
        boolean[] zArrE = dj(6) ? z2 ? dqru.E(null, dv(getString(cO(6, bpab.a)))) : new boolean[]{x()} : null;
        dqqf.dB(length, zArrE, new ejxr() { // from class: boza
            @Override // defpackage.ejxr
            public final Object get() {
                return "force_refresh:".concat(String.valueOf(this.a.getString(6)));
            }
        });
        if (!dj(7)) {
            i = 0;
            bArrF = null;
        } else if (z2) {
            i = 0;
            bArrF = dqru.F(null, dD(getString(cO(7, bpab.a))));
        } else {
            i = 0;
            bArrF = new byte[][]{z()};
        }
        dqqf.dA(length, bArrF, new ejxr() { // from class: bozc
            @Override // defpackage.ejxr
            public final Object get() {
                return "client_info:".concat(String.valueOf(this.a.getString(7)));
            }
        });
        if (!dj(8)) {
            jArr = jArrDC;
            strArr = null;
        } else if (z2) {
            jArr = jArrDC;
            strArr = (String[]) dqru.D(null, du(getString(cO(8, bpab.a))), new String[i]);
        } else {
            jArr = jArrDC;
            String[] strArr9 = new String[1];
            strArr9[i] = v();
            strArr = strArr9;
        }
        dqqf.dA(length, strArr, new ejxr() { // from class: bozd
            @Override // defpackage.ejxr
            public final Object get() {
                return "operating_system:".concat(String.valueOf(this.a.getString(8)));
            }
        });
        if (!dj(9)) {
            strArr2 = strArr;
            strArr3 = null;
        } else if (z2) {
            strArr2 = strArr;
            strArr3 = (String[]) dqru.D(null, du(getString(cO(9, bpab.a))), new String[0]);
        } else {
            strArr2 = strArr;
            strArr3 = new String[]{w()};
        }
        dqqf.dA(length, strArr3, new ejxr() { // from class: boze
            @Override // defpackage.ejxr
            public final Object get() {
                return "operating_system_version:".concat(String.valueOf(this.a.getString(9)));
            }
        });
        int[] iArrA = dj(10) ? z2 ? dqru.A(null, ds(getString(cO(10, bpab.a)))) : new int[]{o()} : null;
        dqqf.dy(length, iArrA, new ejxr() { // from class: bozb
            @Override // defpackage.ejxr
            public final Object get() {
                return "browser_type:".concat(String.valueOf(this.a.getString(10)));
            }
        });
        byte[][] bArrF3 = dj(11) ? z2 ? dqru.F(null, dD(getString(cO(11, bpab.a)))) : new byte[][]{m()} : null;
        dqqf.dA(length, bArrF3, new ejxr() { // from class: bozf
            @Override // defpackage.ejxr
            public final Object get() {
                return "encryption_key:".concat(String.valueOf(this.a.getString(11)));
            }
        });
        if (!dj(12)) {
            strArr4 = strArr3;
            bArrF2 = null;
        } else if (z2) {
            strArr4 = strArr3;
            bArrF2 = dqru.F(null, dD(getString(cO(12, bpab.a))));
        } else {
            strArr4 = strArr3;
            bArrF2 = new byte[][]{n()};
        }
        dqqf.dA(length, bArrF2, new ejxr() { // from class: bozg
            @Override // defpackage.ejxr
            public final Object get() {
                return "hmac_key:".concat(String.valueOf(this.a.getString(12)));
            }
        });
        if (!dj(13)) {
            bArr = bArrF2;
            iArr = iArrA;
            bArr2 = bArrF;
            z = z2;
            jArr2 = jArrC;
            bvebVarArr = null;
        } else if (z2) {
            bArr = bArrF2;
            int[] iArrDs = ds(getString(cO(13, bpab.a)));
            bveb[] bvebVarArrValues = bveb.values();
            iArr = iArrA;
            int length2 = bvebVarArrValues.length;
            bArr2 = bArrF;
            bveb[] bvebVarArr3 = new bveb[iArrDs.length];
            z = z2;
            jArr2 = jArrC;
            for (int i5 = 0; i5 < iArrDs.length; i5++) {
                int i6 = iArrDs[i5];
                if (i6 >= length2) {
                    throw new IllegalStateException();
                }
                bvebVarArr3[i5] = bvebVarArrValues[i6];
            }
            bvebVarArr = (bveb[]) dqru.D(null, bvebVarArr3, new bveb[0]);
        } else {
            bArr = bArrF2;
            iArr = iArrA;
            bArr2 = bArrF;
            z = z2;
            jArr2 = jArrC;
            bvebVarArr = new bveb[]{t()};
        }
        dqqf.dA(length, bvebVarArr, new ejxr() { // from class: bozh
            @Override // defpackage.ejxr
            public final Object get() {
                return "backend_type:".concat(String.valueOf(this.a.getString(13)));
            }
        });
        boolean[] zArrE2 = dj(14) ? z ? dqru.E(null, dv(getString(cO(14, bpab.a)))) : new boolean[]{y()} : null;
        dqqf.dB(length, zArrE2, new ejxr() { // from class: bozi
            @Override // defpackage.ejxr
            public final Object get() {
                return "is_active:".concat(String.valueOf(this.a.getString(14)));
            }
        });
        String[] strArr10 = dj(15) ? z ? (String[]) dqru.D(null, du(getString(cO(15, bpab.a))), new String[0]) : new String[]{k()} : null;
        dqqf.dA(length, strArr10, new ejxr() { // from class: bozj
            @Override // defpackage.ejxr
            public final Object get() {
                return "request_id:".concat(String.valueOf(this.a.getString(15)));
            }
        });
        boolean[] zArrE3 = dj(16) ? z ? dqru.E(null, dv(getString(cO(16, bpab.a)))) : new boolean[]{l()} : null;
        dqqf.dB(length, zArrE3, new ejxr() { // from class: bozk
            @Override // defpackage.ejxr
            public final Object get() {
                return "is_persistent:".concat(String.valueOf(this.a.getString(16)));
            }
        });
        if (!dj(17)) {
            bvebVarArr2 = bvebVarArr;
            zArr = zArrE2;
            strArr5 = strArr10;
            zArr2 = zArrE3;
            bvdmVarArr = null;
        } else if (z) {
            int[] iArrDs2 = ds(getString(cO(17, bpab.a)));
            bvdm[] bvdmVarArrValues = bvdm.values();
            bvebVarArr2 = bvebVarArr;
            int length3 = bvdmVarArrValues.length;
            zArr = zArrE2;
            bvdm[] bvdmVarArr3 = new bvdm[iArrDs2.length];
            strArr5 = strArr10;
            zArr2 = zArrE3;
            for (int i7 = 0; i7 < iArrDs2.length; i7++) {
                int i8 = iArrDs2[i7];
                if (i8 >= length3) {
                    throw new IllegalStateException();
                }
                bvdmVarArr3[i7] = bvdmVarArrValues[i8];
            }
            bvdmVarArr = (bvdm[]) dqru.D(null, bvdmVarArr3, new bvdm[0]);
        } else {
            bvebVarArr2 = bvebVarArr;
            zArr = zArrE2;
            strArr5 = strArr10;
            zArr2 = zArrE3;
            bvdmVarArr = new bvdm[]{g()};
        }
        dqqf.dA(length, bvdmVarArr, new ejxr() { // from class: bozl
            @Override // defpackage.ejxr
            public final Object get() {
                return "desktop_type:".concat(String.valueOf(this.a.getString(17)));
            }
        });
        if (!dj(18)) {
            bvdmVarArr2 = bvdmVarArr;
            bvduVarArr = null;
        } else if (z) {
            int[] iArrDs3 = ds(getString(cO(18, bpab.a)));
            bvdu[] bvduVarArrValues = bvdu.values();
            int length4 = bvduVarArrValues.length;
            bvdu[] bvduVarArr3 = new bvdu[iArrDs3.length];
            bvdmVarArr2 = bvdmVarArr;
            for (int i9 = 0; i9 < iArrDs3.length; i9++) {
                int i10 = iArrDs3[i9];
                if (i10 >= length4) {
                    throw new IllegalStateException();
                }
                bvduVarArr3[i9] = bvduVarArrValues[i10];
            }
            bvduVarArr = (bvdu[]) dqru.D(null, bvduVarArr3, new bvdu[0]);
        } else {
            bvdmVarArr2 = bvdmVarArr;
            bvduVarArr = new bvdu[]{s()};
        }
        dqqf.dA(length, bvduVarArr, new ejxr() { // from class: bozm
            @Override // defpackage.ejxr
            public final Object get() {
                return "pairing_type:".concat(String.valueOf(this.a.getString(18)));
            }
        });
        byte[][] bArrF4 = dj(19) ? z ? dqru.F(null, dD(getString(cO(19, bpab.a)))) : new byte[][]{A()} : null;
        dqqf.dA(length, bArrF4, new ejxr() { // from class: boyr
            @Override // defpackage.ejxr
            public final Object get() {
                return "destination_registration_id:".concat(String.valueOf(this.a.getString(19)));
            }
        });
        String[] strArr11 = dj(20) ? z ? (String[]) dqru.D(null, du(getString(cO(20, bpab.a))), new String[0]) : new String[]{j()} : null;
        dqqf.dA(length, strArr11, new ejxr() { // from class: boyt
            @Override // defpackage.ejxr
            public final Object get() {
                return "gaia_email:".concat(String.valueOf(this.a.getString(20)));
            }
        });
        long[] jArrC5 = dj(21) ? z ? dqru.C(null, dt(getString(cO(21, bpab.a)))) : new long[]{p()} : null;
        dqqf.dz(length, jArrC5, new ejxr() { // from class: boyu
            @Override // defpackage.ejxr
            public final Object get() {
                return "creation_time:".concat(String.valueOf(this.a.getString(21)));
            }
        });
        long[] jArrC6 = dj(22) ? z ? dqru.C(null, dt(getString(cO(22, bpab.a)))) : new long[]{c()} : null;
        dqqf.dz(length, jArrC6, new ejxr() { // from class: boyv
            @Override // defpackage.ejxr
            public final Object get() {
                return "get_updates_request_time_millis:".concat(String.valueOf(this.a.getString(22)));
            }
        });
        ekfw ekfwVar = new ekfw();
        int i11 = 0;
        while (i11 < length) {
            long j = jArr[i11];
            if (j > 0) {
                i2 = i11;
                if (!hashSet.contains(Long.valueOf(j))) {
                    hashSet.add(Long.valueOf(jArr[i2]));
                    String[] strArr12 = bpab.a;
                    bows bowsVar = new bows();
                    bowsVar.aF();
                    bowsVar.aD();
                    long j2 = jArr[i2];
                    bArr3 = bArrF4;
                    bvduVarArr2 = bvduVarArr;
                    if (jArr2 != null) {
                        long j3 = jArr2[i2];
                        i3 = length;
                        bowsVar.aE(0);
                        bowsVar.a = j3;
                    } else {
                        i3 = length;
                    }
                    if (strArr7 != null) {
                        bowsVar.e(strArr7[i2]);
                    }
                    if (jArrC2 != null) {
                        long j4 = jArrC2[i2];
                        bowsVar.aE(2);
                        bowsVar.c = j4;
                    }
                    if (jArrC3 != null) {
                        long j5 = jArrC3[i2];
                        bowsVar.aE(3);
                        bowsVar.d = j5;
                    }
                    if (jArrC4 != null) {
                        long j6 = jArrC4[i2];
                        bowsVar.aE(4);
                        bowsVar.e = j6;
                    }
                    if (strArr8 != null) {
                        String str = strArr8[i2];
                        bowsVar.aE(5);
                        bowsVar.f = str;
                    }
                    if (zArrE != null) {
                        boolean z3 = zArrE[i2];
                        bowsVar.aE(6);
                        bowsVar.g = z3;
                    }
                    if (bArr2 != null) {
                        bowsVar.c(bArr2[i2]);
                    }
                    if (strArr2 != null) {
                        bowsVar.l(strArr2[i2]);
                    }
                    if (strArr4 != null) {
                        bowsVar.m(strArr4[i2]);
                    }
                    if (iArr != null) {
                        bowsVar.b(iArr[i2]);
                    }
                    if (bArrF3 != null) {
                        bowsVar.h(bArrF3[i2]);
                    }
                    if (bArr != null) {
                        bowsVar.j(bArr[i2]);
                    }
                    if (bvebVarArr2 != null) {
                        bveb bvebVar = bvebVarArr2[i2];
                        int i12 = bowsVar.aB;
                        if (i12 < 41010) {
                            dqru.x("backend_type", i12);
                        }
                        bowsVar.aE(13);
                        bowsVar.n = bvebVar;
                    }
                    if (zArr != null) {
                        boolean z4 = zArr[i2];
                        int i13 = bowsVar.aB;
                        if (i13 < 58010) {
                            dqru.x("is_active", i13);
                        }
                        bowsVar.aE(14);
                        bowsVar.o = z4;
                    }
                    if (strArr5 != null) {
                        String str2 = strArr5[i2];
                        int i14 = bowsVar.aB;
                        if (i14 < 58010) {
                            dqru.x("request_id", i14);
                        }
                        bowsVar.aE(15);
                        bowsVar.p = str2;
                    }
                    if (zArr2 != null) {
                        bowsVar.k(zArr2[i2]);
                    }
                    if (bvdmVarArr2 != null) {
                        bowsVar.f(bvdmVarArr2[i2]);
                    }
                    if (bvduVarArr2 != null) {
                        bowsVar.n(bvduVarArr2[i2]);
                    }
                    if (bArr3 != null) {
                        bowsVar.g(bArr3[i2]);
                    }
                    if (strArr11 != null) {
                        bowsVar.i(strArr11[i2]);
                    }
                    if (jArrC5 != null) {
                        bowsVar.d(jArrC5[i2]);
                    }
                    if (jArrC6 != null) {
                        long j7 = jArrC6[i2];
                        int i15 = bowsVar.aB;
                        strArr6 = strArr11;
                        if (i15 < 60540) {
                            dqru.x("get_updates_request_time_millis", i15);
                        }
                        bowsVar.aE(22);
                        bowsVar.w = j7;
                    } else {
                        strArr6 = strArr11;
                    }
                    ekfwVar.h(bowsVar.a());
                }
                i11 = i2 + 1;
                bvduVarArr = bvduVarArr2;
                bArrF4 = bArr3;
                length = i3;
                strArr11 = strArr6;
            } else {
                i2 = i11;
            }
            bArr3 = bArrF4;
            bvduVarArr2 = bvduVarArr;
            i3 = length;
            strArr6 = strArr11;
            i11 = i2 + 1;
            bvduVarArr = bvduVarArr2;
            bArrF4 = bArr3;
            length = i3;
            strArr11 = strArr6;
        }
        return ekfwVar.g();
    }

    @Override // defpackage.boyp
    public final bvdm g() {
        bvdm[] bvdmVarArrValues = bvdm.values();
        int i = getInt(cO(17, bpab.a));
        if (i < bvdmVarArrValues.length) {
            return bvdmVarArrValues[i];
        }
        throw new IllegalArgumentException();
    }

    @Override // defpackage.boyp
    public final ekgb h() {
        ekfw ekfwVar = new ekfw();
        while (moveToNext()) {
            if (i() != null) {
                ekfwVar.h(i());
            }
        }
        return ekfwVar.g();
    }

    @Override // defpackage.boyp
    public final String i() {
        return getString(cO(1, bpab.a));
    }

    @Override // defpackage.boyp
    public final String j() {
        return getString(cO(20, bpab.a));
    }

    @Override // defpackage.boyp
    public final String k() {
        return getString(cO(15, bpab.a));
    }

    @Override // defpackage.boyp
    public final boolean l() {
        return getInt(cO(16, bpab.a)) == 1;
    }

    @Override // defpackage.boyp
    public final byte[] m() {
        return getBlob(cO(11, bpab.a));
    }

    @Override // defpackage.boyp
    public final byte[] n() {
        return getBlob(cO(12, bpab.a));
    }

    public final int o() {
        return getInt(cO(10, bpab.a));
    }

    public final long p() {
        return getLong(cO(21, bpab.a));
    }

    public final long q() {
        return getLong(cO(0, bpab.a));
    }

    public final long r() {
        return getLong(cO(4, bpab.a));
    }

    public final bvdu s() {
        bvdu[] bvduVarArrValues = bvdu.values();
        int i = getInt(cO(18, bpab.a));
        if (i < bvduVarArrValues.length) {
            return bvduVarArrValues[i];
        }
        throw new IllegalArgumentException();
    }

    public final bveb t() {
        bveb[] bvebVarArrValues = bveb.values();
        int i = getInt(cO(13, bpab.a));
        if (i < bvebVarArrValues.length) {
            return bvebVarArrValues[i];
        }
        throw new IllegalArgumentException();
    }

    public final String u() {
        return getString(cO(5, bpab.a));
    }

    public final String v() {
        return getString(cO(8, bpab.a));
    }

    public final String w() {
        return getString(cO(9, bpab.a));
    }

    public final boolean x() {
        return getInt(cO(6, bpab.a)) == 1;
    }

    public final boolean y() {
        return getInt(cO(14, bpab.a)) == 1;
    }

    public final byte[] z() {
        return getBlob(cO(7, bpab.a));
    }

    @Override // defpackage.dqqj
    public final Cursor a() {
        return this;
    }
}
