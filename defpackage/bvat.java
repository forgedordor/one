package defpackage;

import android.database.Cursor;
import android.net.Uri;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bvat extends dqqf implements bval {
    @Deprecated
    public bvat(dqsy dqsyVar, Cursor cursor, String[] strArr, dqxe[] dqxeVarArr, dqwj dqwjVar, dqtm dqtmVar, bvax bvaxVar) {
        super(dqsyVar, cursor, strArr, dqxeVarArr, bvaz.a, dqwjVar, dqtmVar, bvaxVar);
    }

    @Override // defpackage.dqqf
    protected final /* synthetic */ dqpd b() {
        return new buzs();
    }

    public final long c() {
        return getLong(cO(0, bvaz.a));
    }

    public final Uri e() {
        String string = getString(cO(5, bvaz.a));
        if (string == null) {
            return null;
        }
        return Uri.parse(string);
    }

    public final String f() {
        return getString(cO(1, bvaz.a));
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
                long[] jArrC = zDj ? z ? dqru.C(null, dt(getString(cO(0, bvaz.a)))) : new long[]{c()} : null;
                dqqf.dz(length, jArrC, new ejxr() { // from class: bvam
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "_id:".concat(String.valueOf(this.a.getString(0)));
                    }
                });
                String[] strArr = dj(1) ? z ? (String[]) dqru.D(null, du(getString(cO(1, bvaz.a))), new String[0]) : new String[]{f()} : null;
                dqqf.dA(length, strArr, new ejxr() { // from class: bvan
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "brand_id:".concat(String.valueOf(this.a.getString(1)));
                    }
                });
                String[] strArr2 = dj(2) ? z ? (String[]) dqru.D(null, du(getString(cO(2, bvaz.a))), new String[0]) : new String[]{i()} : null;
                dqqf.dA(length, strArr2, new ejxr() { // from class: bvao
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "name:".concat(String.valueOf(this.a.getString(2)));
                    }
                });
                String[] strArr3 = dj(3) ? z ? (String[]) dqru.D(null, du(getString(cO(3, bvaz.a))), new String[0]) : new String[]{g()} : null;
                dqqf.dA(length, strArr3, new ejxr() { // from class: bvap
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "description:".concat(String.valueOf(this.a.getString(3)));
                    }
                });
                String[] strArr4 = dj(4) ? z ? (String[]) dqru.D(null, du(getString(cO(4, bvaz.a))), new String[0]) : new String[]{h()} : null;
                dqqf.dA(length, strArr4, new ejxr() { // from class: bvaq
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "logo_url:".concat(String.valueOf(this.a.getString(4)));
                    }
                });
                if (!dj(5)) {
                    uriArr = null;
                } else if (z) {
                    String[] strArrDu = du(getString(cO(5, bvaz.a)));
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
                    uriArr = new Uri[]{e()};
                }
                dqqf.dA(length, uriArr, new ejxr() { // from class: bvar
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "logo_uri:".concat(String.valueOf(this.a.getString(5)));
                    }
                });
                String[] strArr5 = dj(6) ? z ? (String[]) dqru.D(null, du(getString(cO(6, bvaz.a))), new String[0]) : new String[]{j()} : null;
                dqqf.dA(length, strArr5, new ejxr() { // from class: bvas
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "version_token:".concat(String.valueOf(this.a.getString(6)));
                    }
                });
                ekfw ekfwVar = new ekfw();
                for (int i4 = 0; i4 < length; i4++) {
                    long j = jArrDC[i4];
                    if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                        hashSet.add(Long.valueOf(jArrDC[i4]));
                        buzt buztVarA = bvaz.a();
                        buztVarA.aD();
                        long j2 = jArrDC[i4];
                        if (jArrC != null) {
                            buztVarA.d(jArrC[i4]);
                        }
                        if (strArr != null) {
                            buztVarA.b(strArr[i4]);
                        }
                        if (strArr2 != null) {
                            buztVarA.g(strArr2[i4]);
                        }
                        if (strArr3 != null) {
                            buztVarA.c(strArr3[i4]);
                        }
                        if (strArr4 != null) {
                            buztVarA.f(strArr4[i4]);
                        }
                        if (uriArr != null) {
                            buztVarA.e(uriArr[i4]);
                        }
                        if (strArr5 != null) {
                            buztVarA.h(strArr5[i4]);
                        }
                        ekfwVar.h(buztVarA.a());
                    }
                }
                return ekfwVar.g();
            }
        }
        int i5 = ekgb.d;
        return ekoe.a;
    }

    public final String g() {
        return getString(cO(3, bvaz.a));
    }

    public final String h() {
        return getString(cO(4, bvaz.a));
    }

    public final String i() {
        return getString(cO(2, bvaz.a));
    }

    public final String j() {
        return getString(cO(6, bvaz.a));
    }

    @Override // defpackage.dqqj
    public final Cursor a() {
        return this;
    }
}
