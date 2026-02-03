package defpackage;

import android.database.Cursor;
import android.net.Uri;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class btfk extends dqqf implements btfc {
    @Deprecated
    public btfk(dqsy dqsyVar, Cursor cursor, String[] strArr, dqxe[] dqxeVarArr, dqwj dqwjVar, dqtm dqtmVar, btfr btfrVar) {
        super(dqsyVar, cursor, strArr, dqxeVarArr, btfy.a, dqwjVar, dqtmVar, btfrVar);
    }

    @Override // defpackage.dqqf
    protected final /* synthetic */ dqpd b() {
        return new btej();
    }

    public final int c() {
        return getInt(cO(5, btfy.a));
    }

    public final int e() {
        return getInt(cO(4, btfy.a));
    }

    public final long f() {
        return getLong(cO(6, btfy.a));
    }

    @Override // defpackage.dqqf
    public final ekgb fI(dqth dqthVar) {
        Uri[] uriArr;
        Uri[] uriArr2;
        long[] jArr;
        dqwl dqwlVar = dqthVar.a;
        long[] jArrDC = dC(getString(dqthVar.h + 1));
        int length = jArrDC.length;
        if (length != 0) {
            int i = 0;
            if (length != 1 || jArrDC[0] != -1) {
                HashSet hashSet = new HashSet();
                dqtm dqtmVar = this.d;
                boolean zDj = dj(0);
                boolean z = dqtmVar.b;
                if (!zDj) {
                    uriArr = null;
                } else if (z) {
                    String[] strArrDu = du(getString(cO(0, btfy.a)));
                    int length2 = strArrDu.length;
                    Uri[] uriArr3 = new Uri[length2];
                    int i2 = 0;
                    int i3 = 0;
                    while (i2 < length2) {
                        String str = strArrDu[i2];
                        int i4 = i3 + 1;
                        uriArr3[i3] = (str == null || str.length() == 0) ? null : Uri.parse(str);
                        i2++;
                        i3 = i4;
                    }
                    uriArr = (Uri[]) dqru.D(null, uriArr3, new Uri[0]);
                } else {
                    uriArr = new Uri[]{h()};
                }
                dqqf.dA(length, uriArr, new ejxr() { // from class: btfd
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "original_image_url:".concat(String.valueOf(this.a.getString(0)));
                    }
                });
                if (!dj(1)) {
                    uriArr2 = null;
                } else if (z) {
                    String[] strArrDu2 = du(getString(cO(1, btfy.a)));
                    int length3 = strArrDu2.length;
                    Uri[] uriArr4 = new Uri[length3];
                    int i5 = 0;
                    int i6 = 0;
                    while (i5 < length3) {
                        String str2 = strArrDu2[i5];
                        int i7 = i6 + 1;
                        uriArr4[i6] = (str2 == null || str2.length() == 0) ? null : Uri.parse(str2);
                        i5++;
                        i6 = i7;
                    }
                    uriArr2 = (Uri[]) dqru.D(null, uriArr4, new Uri[0]);
                } else {
                    uriArr2 = new Uri[]{g()};
                }
                dqqf.dA(length, uriArr2, new ejxr() { // from class: btfe
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "content_uri:".concat(String.valueOf(this.a.getString(1)));
                    }
                });
                String[] strArr = dj(2) ? z ? (String[]) dqru.D(null, du(getString(cO(2, btfy.a))), new String[0]) : new String[]{i()} : null;
                dqqf.dA(length, strArr, new ejxr() { // from class: btff
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "domain:".concat(String.valueOf(this.a.getString(2)));
                    }
                });
                String[] strArr2 = dj(3) ? z ? (String[]) dqru.D(null, du(getString(cO(3, btfy.a))), new String[0]) : new String[]{j()} : null;
                dqqf.dA(length, strArr2, new ejxr() { // from class: btfg
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "image_search_url:".concat(String.valueOf(this.a.getString(3)));
                    }
                });
                int[] iArrA = dj(4) ? z ? dqru.A(null, ds(getString(cO(4, btfy.a)))) : new int[]{e()} : null;
                dqqf.dy(length, iArrA, new ejxr() { // from class: btfh
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "width:".concat(String.valueOf(this.a.getString(4)));
                    }
                });
                int[] iArrA2 = dj(5) ? z ? dqru.A(null, ds(getString(cO(5, btfy.a)))) : new int[]{c()} : null;
                dqqf.dy(length, iArrA2, new ejxr() { // from class: btfi
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "height:".concat(String.valueOf(this.a.getString(5)));
                    }
                });
                long[] jArrC = dj(6) ? z ? dqru.C(null, dt(getString(cO(6, btfy.a)))) : new long[]{f()} : null;
                dqqf.dz(length, jArrC, new ejxr() { // from class: btfj
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "last_used_timestamp:".concat(String.valueOf(this.a.getString(6)));
                    }
                });
                ekfw ekfwVar = new ekfw();
                while (i < length) {
                    long j = jArrDC[i];
                    if (j <= 0 || hashSet.contains(Long.valueOf(j))) {
                        jArr = jArrDC;
                    } else {
                        hashSet.add(Long.valueOf(jArrDC[i]));
                        String[] strArr3 = btfy.a;
                        btel btelVar = new btel();
                        btelVar.aF();
                        btelVar.aD();
                        long j2 = jArrDC[i];
                        if (uriArr != null) {
                            btelVar.f(uriArr[i]);
                        }
                        if (uriArr2 != null) {
                            btelVar.b(uriArr2[i]);
                        }
                        if (strArr != null) {
                            btelVar.c(strArr[i]);
                        }
                        if (strArr2 != null) {
                            btelVar.e(strArr2[i]);
                        }
                        if (iArrA != null) {
                            btelVar.g(iArrA[i]);
                        }
                        if (iArrA2 != null) {
                            btelVar.d(iArrA2[i]);
                        }
                        jArr = jArrDC;
                        if (jArrC != null) {
                            long j3 = jArrC[i];
                            btelVar.aE(6);
                            btelVar.g = j3;
                        }
                        ekfwVar.h(btelVar.a());
                    }
                    i++;
                    jArrDC = jArr;
                }
                return ekfwVar.g();
            }
        }
        int i8 = ekgb.d;
        return ekoe.a;
    }

    public final Uri g() {
        String string = getString(cO(1, btfy.a));
        if (string == null) {
            return null;
        }
        return Uri.parse(string);
    }

    public final Uri h() {
        String string = getString(cO(0, btfy.a));
        if (string == null) {
            return null;
        }
        return Uri.parse(string);
    }

    public final String i() {
        return getString(cO(2, btfy.a));
    }

    public final String j() {
        return getString(cO(3, btfy.a));
    }

    @Override // defpackage.dqqj
    public final Cursor a() {
        return this;
    }
}
