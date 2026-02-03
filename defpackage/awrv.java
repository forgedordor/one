package defpackage;

import android.database.Cursor;
import android.net.Uri;
import j$.time.Instant;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class awrv extends dqqf implements awrj {
    @Deprecated
    public awrv(dqsy dqsyVar, Cursor cursor, String[] strArr, dqxe[] dqxeVarArr, dqwj dqwjVar, dqtm dqtmVar, awsa awsaVar) {
        super(dqsyVar, cursor, strArr, dqxeVarArr, awse.a, dqwjVar, dqtmVar, awsaVar);
    }

    @Override // defpackage.dqqf
    protected final /* synthetic */ dqpd b() {
        return new awqf();
    }

    public final Uri c() {
        String string = getString(cO(4, awse.a));
        if (string == null) {
            return null;
        }
        return Uri.parse(string);
    }

    public final Uri e() {
        String string = getString(cO(10, awse.a));
        if (string == null) {
            return null;
        }
        return Uri.parse(string);
    }

    public final awjl f() {
        return awjm.a(getString(cO(0, awse.a)));
    }

    @Override // defpackage.dqqf
    public final ekgb fI(dqth dqthVar) {
        awjl[] awjlVarArr;
        awpy[] awpyVarArr;
        Uri[] uriArr;
        awmu[] awmuVarArr;
        long[] jArr;
        byte[][] bArr;
        cigb[] cigbVarArr;
        Instant[] instantArr;
        Instant[] instantArr2;
        Uri[] uriArr2;
        int i;
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
            awjlVarArr = null;
        } else if (z) {
            String[] strArrDu = du(getString(cO(0, awse.a)));
            int length2 = strArrDu.length;
            awjl[] awjlVarArr2 = new awjl[length2];
            for (int i3 = 0; i3 < length2; i3++) {
                awjlVarArr2[i3] = awjm.a(strArrDu[i3]);
            }
            awjlVarArr = (awjl[]) dqru.D(null, awjlVarArr2, new awjl[0]);
        } else {
            awjlVarArr = new awjl[]{f()};
        }
        dqqf.dA(length, awjlVarArr, new ejxr() { // from class: awrk
            @Override // defpackage.ejxr
            public final Object get() {
                return "token:".concat(String.valueOf(this.a.getString(0)));
            }
        });
        if (!dj(1)) {
            awpyVarArr = null;
        } else if (z) {
            int[] iArrDs = ds(getString(cO(1, awse.a)));
            awpy[] awpyVarArrValues = awpy.values();
            int length3 = awpyVarArrValues.length;
            awpy[] awpyVarArr2 = new awpy[iArrDs.length];
            for (int i4 = 0; i4 < iArrDs.length; i4++) {
                int i5 = iArrDs[i4];
                if (i5 >= length3) {
                    throw new IllegalStateException();
                }
                awpyVarArr2[i4] = awpyVarArrValues[i5];
            }
            awpyVarArr = (awpy[]) dqru.D(null, awpyVarArr2, new awpy[0]);
        } else {
            awpyVarArr = new awpy[]{h()};
        }
        dqqf.dA(length, awpyVarArr, new ejxr() { // from class: awrn
            @Override // defpackage.ejxr
            public final Object get() {
                return "group_type:".concat(String.valueOf(this.a.getString(1)));
            }
        });
        String[] strArr = dj(2) ? z ? (String[]) dqru.D(null, du(getString(cO(2, awse.a))), new String[0]) : new String[]{m()} : null;
        dqqf.dA(length, strArr, new ejxr() { // from class: awro
            @Override // defpackage.ejxr
            public final Object get() {
                return "rcs_conference_uri:".concat(String.valueOf(this.a.getString(2)));
            }
        });
        String[] strArr2 = dj(3) ? z ? (String[]) dqru.D(null, du(getString(cO(3, awse.a))), new String[0]) : new String[]{l()} : null;
        dqqf.dA(length, strArr2, new ejxr() { // from class: awrp
            @Override // defpackage.ejxr
            public final Object get() {
                return "name:".concat(String.valueOf(this.a.getString(3)));
            }
        });
        if (!dj(4)) {
            uriArr = null;
        } else if (z) {
            String[] strArrDu2 = du(getString(cO(4, awse.a)));
            int length4 = strArrDu2.length;
            Uri[] uriArr3 = new Uri[length4];
            int i6 = 0;
            int i7 = 0;
            while (i6 < length4) {
                String str = strArrDu2[i6];
                int i8 = i7 + 1;
                uriArr3[i7] = (str == null || str.length() == 0) ? null : Uri.parse(str);
                i6++;
                i7 = i8;
            }
            uriArr = (Uri[]) dqru.D(null, uriArr3, new Uri[0]);
        } else {
            uriArr = new Uri[]{c()};
        }
        dqqf.dA(length, uriArr, new ejxr() { // from class: awrq
            @Override // defpackage.ejxr
            public final Object get() {
                return "rcs_icon_url:".concat(String.valueOf(this.a.getString(4)));
            }
        });
        if (!dj(5)) {
            awmuVarArr = null;
        } else if (z) {
            int[] iArrDs2 = ds(getString(cO(5, awse.a)));
            awmu[] awmuVarArrValues = awmu.values();
            int length5 = awmuVarArrValues.length;
            awmu[] awmuVarArr2 = new awmu[iArrDs2.length];
            for (int i9 = 0; i9 < iArrDs2.length; i9++) {
                int i10 = iArrDs2[i9];
                if (i10 >= length5) {
                    throw new IllegalStateException();
                }
                awmuVarArr2[i9] = awmuVarArrValues[i10];
            }
            awmuVarArr = (awmu[]) dqru.D(null, awmuVarArr2, new awmu[0]);
        } else {
            awmuVarArr = new awmu[]{g()};
        }
        dqqf.dA(length, awmuVarArr, new ejxr() { // from class: awrr
            @Override // defpackage.ejxr
            public final Object get() {
                return "rcs_group_state:".concat(String.valueOf(this.a.getString(5)));
            }
        });
        byte[][] bArrF = dj(6) ? z ? dqru.F(null, dD(getString(cO(6, awse.a)))) : new byte[][]{n()} : null;
        dqqf.dA(length, bArrF, new ejxr() { // from class: awrs
            @Override // defpackage.ejxr
            public final Object get() {
                return "tachygram_group_routing_token:".concat(String.valueOf(this.a.getString(6)));
            }
        });
        if (!dj(7)) {
            jArr = jArrDC;
            bArr = bArrF;
            cigbVarArr = null;
        } else if (z) {
            long[] jArrDt = dt(getString(cO(7, awse.a)));
            int length6 = jArrDt.length;
            cigb[] cigbVarArr2 = new cigb[length6];
            int i11 = 0;
            while (i11 < length6) {
                cigbVarArr2[i11] = new cigb(jArrDt[i11]);
                i11++;
                jArrDC = jArrDC;
                bArrF = bArrF;
                jArrDt = jArrDt;
            }
            jArr = jArrDC;
            bArr = bArrF;
            cigbVarArr = (cigb[]) dqru.D(null, cigbVarArr2, new cigb[0]);
        } else {
            jArr = jArrDC;
            bArr = bArrF;
            cigbVarArr = new cigb[]{i()};
        }
        dqqf.dA(length, cigbVarArr, new ejxr() { // from class: awrt
            @Override // defpackage.ejxr
            public final Object get() {
                return "rcs_group_capabilities:".concat(String.valueOf(this.a.getString(7)));
            }
        });
        if (!dj(8)) {
            instantArr = null;
        } else if (z) {
            long[] jArrDt2 = dt(getString(cO(8, awse.a)));
            int length7 = jArrDt2.length;
            Instant[] instantArr3 = new Instant[length7];
            for (int i12 = 0; i12 < length7; i12++) {
                instantArr3[i12] = bart.b(jArrDt2[i12]);
            }
            instantArr = (Instant[]) dqru.D(null, instantArr3, new Instant[0]);
        } else {
            instantArr = new Instant[]{j()};
        }
        dqqf.dA(length, instantArr, new ejxr() { // from class: awru
            @Override // defpackage.ejxr
            public final Object get() {
                return "rcs_group_last_sync_timestamp:".concat(String.valueOf(this.a.getString(8)));
            }
        });
        if (!dj(9)) {
            instantArr2 = null;
        } else if (z) {
            long[] jArrDt3 = dt(getString(cO(9, awse.a)));
            int length8 = jArrDt3.length;
            Instant[] instantArr4 = new Instant[length8];
            for (int i13 = 0; i13 < length8; i13++) {
                instantArr4[i13] = bart.b(jArrDt3[i13]);
            }
            instantArr2 = (Instant[]) dqru.D(null, instantArr4, new Instant[0]);
        } else {
            instantArr2 = new Instant[]{k()};
        }
        dqqf.dA(length, instantArr2, new ejxr() { // from class: awrl
            @Override // defpackage.ejxr
            public final Object get() {
                return "rcs_name_last_change_timestamp:".concat(String.valueOf(this.a.getString(9)));
            }
        });
        if (!dj(10)) {
            uriArr2 = null;
            i = 0;
        } else if (z) {
            String[] strArrDu3 = du(getString(cO(10, awse.a)));
            int length9 = strArrDu3.length;
            Uri[] uriArr4 = new Uri[length9];
            int i14 = 0;
            int i15 = 0;
            while (i14 < length9) {
                String str2 = strArrDu3[i14];
                int i16 = i15 + 1;
                uriArr4[i15] = (str2 == null || str2.length() == 0) ? null : Uri.parse(str2);
                i14++;
                i15 = i16;
            }
            i = 0;
            uriArr2 = (Uri[]) dqru.D(null, uriArr4, new Uri[0]);
        } else {
            i = 0;
            uriArr2 = new Uri[]{e()};
        }
        dqqf.dA(length, uriArr2, new ejxr() { // from class: awrm
            @Override // defpackage.ejxr
            public final Object get() {
                return "rcs_join_link_url:".concat(String.valueOf(this.a.getString(10)));
            }
        });
        ekfw ekfwVar = new ekfw();
        while (i < length) {
            long j = jArr[i];
            if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                hashSet.add(Long.valueOf(jArr[i]));
                String[] strArr3 = awse.a;
                awqj awqjVar = new awqj();
                awqjVar.aF();
                awqjVar.aD();
                long j2 = jArr[i];
                if (awjlVarArr != null) {
                    awqjVar.m(awjlVarArr[i]);
                }
                if (awpyVarArr != null) {
                    awqjVar.c(awpyVarArr[i]);
                }
                if (strArr != null) {
                    awqjVar.e(strArr[i]);
                }
                if (strArr2 != null) {
                    awqjVar.d(strArr2[i]);
                }
                if (uriArr != null) {
                    awqjVar.i(uriArr[i]);
                }
                if (awmuVarArr != null) {
                    awqjVar.h(awmuVarArr[i]);
                }
                if (bArr != null) {
                    awqjVar.l(bArr[i]);
                }
                if (cigbVarArr != null) {
                    awqjVar.f(cigbVarArr[i]);
                }
                if (instantArr != null) {
                    awqjVar.g(instantArr[i]);
                }
                if (instantArr2 != null) {
                    awqjVar.k(instantArr2[i]);
                }
                if (uriArr2 != null) {
                    awqjVar.j(uriArr2[i]);
                }
                ekfwVar.h(awqjVar.a());
            }
            i++;
        }
        return ekfwVar.g();
    }

    public final awmu g() {
        awmu[] awmuVarArrValues = awmu.values();
        int i = getInt(cO(5, awse.a));
        if (i < awmuVarArrValues.length) {
            return awmuVarArrValues[i];
        }
        throw new IllegalArgumentException();
    }

    public final awpy h() {
        awpy[] awpyVarArrValues = awpy.values();
        int i = getInt(cO(1, awse.a));
        if (i < awpyVarArrValues.length) {
            return awpyVarArrValues[i];
        }
        throw new IllegalArgumentException();
    }

    public final cigb i() {
        return new cigb(getLong(cO(7, awse.a)));
    }

    public final Instant j() {
        return bart.b(getLong(cO(8, awse.a)));
    }

    public final Instant k() {
        return bart.b(getLong(cO(9, awse.a)));
    }

    public final String l() {
        return getString(cO(3, awse.a));
    }

    public final String m() {
        return getString(cO(2, awse.a));
    }

    public final byte[] n() {
        return getBlob(cO(6, awse.a));
    }

    @Override // defpackage.dqqj
    public final Cursor a() {
        return this;
    }
}
