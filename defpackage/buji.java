package defpackage;

import android.database.Cursor;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class buji extends dqqf implements buja {
    @Deprecated
    public buji(dqsy dqsyVar, Cursor cursor, String[] strArr, dqxe[] dqxeVarArr, dqwj dqwjVar, dqtm dqtmVar, bujl bujlVar) {
        super(dqsyVar, cursor, strArr, dqxeVarArr, bujn.a, dqwjVar, dqtmVar, bujlVar);
    }

    @Override // defpackage.dqqf
    protected final /* synthetic */ dqpd b() {
        return new buig();
    }

    public final int c() {
        return getInt(cO(6, bujn.a));
    }

    public final long e() {
        return getLong(cO(0, bujn.a));
    }

    public final String f() {
        return getString(cO(5, bujn.a));
    }

    @Override // defpackage.dqqf
    public final ekgb fI(dqth dqthVar) {
        int i;
        HashSet hashSet;
        dqwl dqwlVar = dqthVar.a;
        long[] jArrDC = dC(getString(dqthVar.h + 1));
        int length = jArrDC.length;
        if (length != 0) {
            int i2 = 0;
            if (length != 1 || jArrDC[0] != -1) {
                HashSet hashSet2 = new HashSet();
                dqtm dqtmVar = this.d;
                boolean zDj = dj(0);
                boolean z = dqtmVar.b;
                long[] jArrC = zDj ? z ? dqru.C(null, dt(getString(cO(0, bujn.a)))) : new long[]{e()} : null;
                dqqf.dz(length, jArrC, new ejxr() { // from class: bujb
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "_id:".concat(String.valueOf(this.a.getString(0)));
                    }
                });
                String[] strArr = dj(1) ? z ? (String[]) dqru.D(null, du(getString(cO(1, bujn.a))), new String[0]) : new String[]{j()} : null;
                dqqf.dA(length, strArr, new ejxr() { // from class: bujc
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "sticker_set_id:".concat(String.valueOf(this.a.getString(1)));
                    }
                });
                String[] strArr2 = dj(2) ? z ? (String[]) dqru.D(null, du(getString(cO(2, bujn.a))), new String[0]) : new String[]{i()} : null;
                dqqf.dA(length, strArr2, new ejxr() { // from class: bujd
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "sticker_id:".concat(String.valueOf(this.a.getString(2)));
                    }
                });
                String[] strArr3 = dj(3) ? z ? (String[]) dqru.D(null, du(getString(cO(3, bujn.a))), new String[0]) : new String[]{h()} : null;
                dqqf.dA(length, strArr3, new ejxr() { // from class: buje
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "icon_uri_static:".concat(String.valueOf(this.a.getString(3)));
                    }
                });
                String[] strArr4 = dj(4) ? z ? (String[]) dqru.D(null, du(getString(cO(4, bujn.a))), new String[0]) : new String[]{g()} : null;
                dqqf.dA(length, strArr4, new ejxr() { // from class: bujf
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "icon_uri_animated:".concat(String.valueOf(this.a.getString(4)));
                    }
                });
                String[] strArr5 = dj(5) ? z ? (String[]) dqru.D(null, du(getString(cO(5, bujn.a))), new String[0]) : new String[]{f()} : null;
                dqqf.dA(length, strArr5, new ejxr() { // from class: bujg
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "display_name:".concat(String.valueOf(this.a.getString(5)));
                    }
                });
                int[] iArrA = dj(6) ? z ? dqru.A(null, ds(getString(cO(6, bujn.a)))) : new int[]{c()} : null;
                dqqf.dy(length, iArrA, new ejxr() { // from class: bujh
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "display_order:".concat(String.valueOf(this.a.getString(6)));
                    }
                });
                ekfw ekfwVar = new ekfw();
                int i3 = 0;
                while (i3 < length) {
                    long j = jArrDC[i3];
                    if (j <= 0 || hashSet2.contains(Long.valueOf(j))) {
                        i = length;
                        hashSet = hashSet2;
                    } else {
                        hashSet2.add(Long.valueOf(jArrDC[i3]));
                        String[] strArr6 = bujn.a;
                        buii buiiVar = new buii();
                        buiiVar.aF();
                        buiiVar.aD();
                        long j2 = jArrDC[i3];
                        i = length;
                        if (jArrC != null) {
                            long j3 = jArrC[i3];
                            buiiVar.aE(i2);
                            buiiVar.a = j3;
                        }
                        if (strArr != null) {
                            String str = strArr[i3];
                            buiiVar.aE(1);
                            buiiVar.b = str;
                        }
                        if (strArr2 != null) {
                            String str2 = strArr2[i3];
                            buiiVar.aE(2);
                            buiiVar.c = str2;
                        }
                        if (strArr3 != null) {
                            String str3 = strArr3[i3];
                            buiiVar.aE(3);
                            buiiVar.d = str3;
                        }
                        if (strArr4 != null) {
                            String str4 = strArr4[i3];
                            buiiVar.aE(4);
                            buiiVar.e = str4;
                        }
                        if (strArr5 != null) {
                            String str5 = strArr5[i3];
                            buiiVar.aE(5);
                            buiiVar.f = str5;
                        }
                        if (iArrA != null) {
                            int i4 = iArrA[i3];
                            buiiVar.aE(6);
                            buiiVar.g = i4;
                        }
                        buig buigVar = new buig();
                        buigVar.aD(buiiVar.aB());
                        hashSet = hashSet2;
                        buigVar.a = buiiVar.a;
                        buigVar.b = buiiVar.b;
                        buigVar.c = buiiVar.c;
                        buigVar.d = buiiVar.d;
                        buigVar.e = buiiVar.e;
                        buigVar.f = buiiVar.f;
                        buigVar.g = buiiVar.g;
                        buigVar.cM = buiiVar.aC();
                        ekfwVar.h(buigVar);
                    }
                    i3++;
                    length = i;
                    hashSet2 = hashSet;
                    i2 = 0;
                }
                return ekfwVar.g();
            }
        }
        int i5 = ekgb.d;
        return ekoe.a;
    }

    public final String g() {
        return getString(cO(4, bujn.a));
    }

    public final String h() {
        return getString(cO(3, bujn.a));
    }

    public final String i() {
        return getString(cO(2, bujn.a));
    }

    public final String j() {
        return getString(cO(1, bujn.a));
    }

    @Override // defpackage.dqqj
    public final Cursor a() {
        return this;
    }
}
