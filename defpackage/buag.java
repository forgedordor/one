package defpackage;

import android.database.Cursor;
import android.net.Uri;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class buag extends dqqf implements btzy {
    @Deprecated
    public buag(dqsy dqsyVar, Cursor cursor, String[] strArr, dqxe[] dqxeVarArr, dqwj dqwjVar, dqtm dqtmVar, buan buanVar) {
        super(dqsyVar, cursor, strArr, dqxeVarArr, buat.a, dqwjVar, dqtmVar, buanVar);
    }

    @Override // defpackage.dqqf
    protected final /* synthetic */ dqpd b() {
        return new btze();
    }

    public final long c() {
        return getLong(cO(0, buat.a));
    }

    public final long e() {
        return getLong(cO(6, buat.a));
    }

    public final Uri f() {
        String string = getString(cO(3, buat.a));
        if (string == null) {
            return null;
        }
        return Uri.parse(string);
    }

    @Override // defpackage.dqqf
    public final ekgb fI(dqth dqthVar) {
        axcm[] axcmVarArr;
        Uri[] uriArr;
        long[] jArr;
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
        long[] jArrC = zDj ? z ? dqru.C(null, dt(getString(cO(0, buat.a)))) : new long[]{c()} : null;
        dqqf.dz(length, jArrC, new ejxr() { // from class: btzz
            @Override // defpackage.ejxr
            public final Object get() {
                return "_id:".concat(String.valueOf(this.a.getString(0)));
            }
        });
        if (!dj(1)) {
            axcmVarArr = null;
        } else if (z) {
            String[] strArrDu = du(getString(cO(1, buat.a)));
            int length2 = strArrDu.length;
            axcm[] axcmVarArr2 = new axcm[length2];
            for (int i2 = 0; i2 < length2; i2++) {
                axcmVarArr2[i2] = axcn.a(strArrDu[i2]);
            }
            axcmVarArr = (axcm[]) dqru.D(null, axcmVarArr2, new axcm[0]);
        } else {
            axcmVarArr = new axcm[]{g()};
        }
        dqqf.dA(length, axcmVarArr, new ejxr() { // from class: buaa
            @Override // defpackage.ejxr
            public final Object get() {
                return "my_identity_token:".concat(String.valueOf(this.a.getString(1)));
            }
        });
        String[] strArr = dj(2) ? z ? (String[]) dqru.D(null, du(getString(cO(2, buat.a))), new String[0]) : new String[]{h()} : null;
        dqqf.dA(length, strArr, new ejxr() { // from class: buab
            @Override // defpackage.ejxr
            public final Object get() {
                return "limited_profile_display_name:".concat(String.valueOf(this.a.getString(2)));
            }
        });
        if (!dj(3)) {
            uriArr = null;
        } else if (z) {
            String[] strArrDu2 = du(getString(cO(3, buat.a)));
            int length3 = strArrDu2.length;
            Uri[] uriArr2 = new Uri[length3];
            int i3 = 0;
            int i4 = 0;
            while (i3 < length3) {
                String str = strArrDu2[i3];
                int i5 = i4 + 1;
                uriArr2[i4] = (str == null || str.length() == 0) ? null : Uri.parse(str);
                i3++;
                i4 = i5;
            }
            uriArr = (Uri[]) dqru.D(null, uriArr2, new Uri[0]);
        } else {
            uriArr = new Uri[]{f()};
        }
        dqqf.dA(length, uriArr, new ejxr() { // from class: buac
            @Override // defpackage.ejxr
            public final Object get() {
                return "photo_uri:".concat(String.valueOf(this.a.getString(3)));
            }
        });
        boolean[] zArrE = dj(4) ? z ? dqru.E(null, dv(getString(cO(4, buat.a)))) : new boolean[]{j()} : null;
        dqqf.dB(length, zArrE, new ejxr() { // from class: buad
            @Override // defpackage.ejxr
            public final Object get() {
                return "is_self_profile_shareable:".concat(String.valueOf(this.a.getString(4)));
            }
        });
        boolean[] zArrE2 = dj(5) ? z ? dqru.E(null, dv(getString(cO(5, buat.a)))) : new boolean[]{i()} : null;
        dqqf.dB(length, zArrE2, new ejxr() { // from class: buae
            @Override // defpackage.ejxr
            public final Object get() {
                return "belongs_to_self_gaia:".concat(String.valueOf(this.a.getString(5)));
            }
        });
        long[] jArrC2 = dj(6) ? z ? dqru.C(null, dt(getString(cO(6, buat.a)))) : new long[]{e()} : null;
        dqqf.dz(length, jArrC2, new ejxr() { // from class: buaf
            @Override // defpackage.ejxr
            public final Object get() {
                return "update_timestamp:".concat(String.valueOf(this.a.getString(6)));
            }
        });
        ekfw ekfwVar = new ekfw();
        int i6 = 0;
        while (i6 < length) {
            long j = jArrDC[i6];
            if (j <= 0 || hashSet.contains(Long.valueOf(j))) {
                jArr = jArrDC;
            } else {
                hashSet.add(Long.valueOf(jArrDC[i6]));
                String[] strArr2 = buat.a;
                btzg btzgVar = new btzg();
                btzgVar.aF();
                btzgVar.aD();
                long j2 = jArrDC[i6];
                jArr = jArrDC;
                if (jArrC != null) {
                    long j3 = jArrC[i6];
                    btzgVar.aE(0);
                    btzgVar.a = j3;
                }
                if (axcmVarArr != null) {
                    btzgVar.e(axcmVarArr[i6]);
                }
                if (strArr != null) {
                    btzgVar.d(strArr[i6]);
                }
                if (uriArr != null) {
                    btzgVar.f(uriArr[i6]);
                }
                if (zArrE != null) {
                    btzgVar.c(zArrE[i6]);
                }
                if (zArrE2 != null) {
                    btzgVar.b(zArrE2[i6]);
                }
                if (jArrC2 != null) {
                    btzgVar.g(jArrC2[i6]);
                }
                ekfwVar.h(btzgVar.a());
            }
            i6++;
            jArrDC = jArr;
        }
        return ekfwVar.g();
    }

    public final axcm g() {
        return axcn.a(getString(cO(1, buat.a)));
    }

    public final String h() {
        return getString(cO(2, buat.a));
    }

    public final boolean i() {
        return getInt(cO(5, buat.a)) == 1;
    }

    public final boolean j() {
        return getInt(cO(4, buat.a)) == 1;
    }

    @Override // defpackage.dqqj
    public final Cursor a() {
        return this;
    }
}
