package defpackage;

import android.database.Cursor;
import android.net.Uri;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class btds extends dqqf implements btdl {
    @Deprecated
    public btds(dqsy dqsyVar, Cursor cursor, String[] strArr, dqxe[] dqxeVarArr, dqwj dqwjVar, dqtm dqtmVar, btdz btdzVar) {
        super(dqsyVar, cursor, strArr, dqxeVarArr, btee.a, dqwjVar, dqtmVar, btdzVar);
    }

    @Override // defpackage.dqqf
    protected final /* synthetic */ dqpd b() {
        return new btcu();
    }

    public final int c() {
        return getInt(cO(4, btee.a));
    }

    public final int e() {
        return getInt(cO(3, btee.a));
    }

    public final long f() {
        return getLong(cO(5, btee.a));
    }

    @Override // defpackage.dqqf
    public final ekgb fI(dqth dqthVar) {
        Uri[] uriArr;
        dqwl dqwlVar = dqthVar.a;
        long[] jArrDC = dC(getString(dqthVar.h + 1));
        int length = jArrDC.length;
        if (length != 0) {
            if (length != 1 || jArrDC[0] != -1) {
                HashSet hashSet = new HashSet();
                dqtm dqtmVar = this.d;
                boolean zDj = dj(0);
                boolean z = dqtmVar.b;
                String[] strArr = zDj ? z ? (String[]) dqru.D(null, du(getString(cO(0, btee.a))), new String[0]) : new String[]{i()} : null;
                dqqf.dA(length, strArr, new ejxr() { // from class: btdm
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "name:".concat(String.valueOf(this.a.getString(0)));
                    }
                });
                if (!dj(1)) {
                    uriArr = null;
                } else if (z) {
                    String[] strArrDu = du(getString(cO(1, btee.a)));
                    int length2 = strArrDu.length;
                    Uri[] uriArr2 = new Uri[length2];
                    int i = 0;
                    int i2 = 0;
                    while (i < length2) {
                        String str = strArrDu[i];
                        int i3 = i2 + 1;
                        uriArr2[i2] = (str == null || str.length() == 0) ? null : Uri.parse(str);
                        i++;
                        i2 = i3;
                    }
                    uriArr = (Uri[]) dqru.D(null, uriArr2, new Uri[0]);
                } else {
                    uriArr = new Uri[]{g()};
                }
                dqqf.dA(length, uriArr, new ejxr() { // from class: btdn
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "content_uri:".concat(String.valueOf(this.a.getString(1)));
                    }
                });
                String[] strArr2 = dj(2) ? z ? (String[]) dqru.D(null, du(getString(cO(2, btee.a))), new String[0]) : new String[]{h()} : null;
                dqqf.dA(length, strArr2, new ejxr() { // from class: btdo
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "content_type:".concat(String.valueOf(this.a.getString(2)));
                    }
                });
                int[] iArrA = dj(3) ? z ? dqru.A(null, ds(getString(cO(3, btee.a)))) : new int[]{e()} : null;
                dqqf.dy(length, iArrA, new ejxr() { // from class: btdp
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "width:".concat(String.valueOf(this.a.getString(3)));
                    }
                });
                int[] iArrA2 = dj(4) ? z ? dqru.A(null, ds(getString(cO(4, btee.a)))) : new int[]{c()} : null;
                dqqf.dy(length, iArrA2, new ejxr() { // from class: btdq
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "height:".concat(String.valueOf(this.a.getString(4)));
                    }
                });
                long[] jArrC = dj(5) ? z ? dqru.C(null, dt(getString(cO(5, btee.a)))) : new long[]{f()} : null;
                dqqf.dz(length, jArrC, new ejxr() { // from class: btdr
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "last_used_timestamp:".concat(String.valueOf(this.a.getString(5)));
                    }
                });
                ekfw ekfwVar = new ekfw();
                for (int i4 = 0; i4 < length; i4++) {
                    long j = jArrDC[i4];
                    if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                        hashSet.add(Long.valueOf(jArrDC[i4]));
                        String[] strArr3 = btee.a;
                        btcw btcwVar = new btcw();
                        btcwVar.aF();
                        btcwVar.aD();
                        long j2 = jArrDC[i4];
                        if (strArr != null) {
                            btcwVar.f(strArr[i4]);
                        }
                        if (uriArr != null) {
                            btcwVar.c(uriArr[i4]);
                        }
                        if (strArr2 != null) {
                            btcwVar.b(strArr2[i4]);
                        }
                        if (iArrA != null) {
                            btcwVar.g(iArrA[i4]);
                        }
                        if (iArrA2 != null) {
                            btcwVar.d(iArrA2[i4]);
                        }
                        if (jArrC != null) {
                            btcwVar.e(jArrC[i4]);
                        }
                        ekfwVar.h(btcwVar.a());
                    }
                }
                return ekfwVar.g();
            }
        }
        int i5 = ekgb.d;
        return ekoe.a;
    }

    public final Uri g() {
        String string = getString(cO(1, btee.a));
        if (string == null) {
            return null;
        }
        return Uri.parse(string);
    }

    public final String h() {
        return getString(cO(2, btee.a));
    }

    public final String i() {
        return getString(cO(0, btee.a));
    }

    @Override // defpackage.dqqj
    public final Cursor a() {
        return this;
    }
}
