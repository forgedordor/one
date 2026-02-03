package defpackage;

import android.database.Cursor;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class budd extends dqqf implements bucx {
    @Deprecated
    public budd(dqsy dqsyVar, Cursor cursor, String[] strArr, dqxe[] dqxeVarArr, dqwj dqwjVar, dqtm dqtmVar, bude budeVar) {
        super(dqsyVar, cursor, strArr, dqxeVarArr, budi.a, dqwjVar, dqtmVar, budeVar);
    }

    @Override // defpackage.dqqf
    protected final /* synthetic */ dqpd b() {
        return new buci();
    }

    public final long c() {
        return getLong(cO(3, budi.a));
    }

    public final String e() {
        return getString(cO(1, budi.a));
    }

    public final String f() {
        return getString(cO(4, budi.a));
    }

    @Override // defpackage.dqqf
    public final ekgb fI(dqth dqthVar) {
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
                String[] strArr = zDj ? z ? (String[]) dqru.D(null, du(getString(cO(0, budi.a))), new String[0]) : new String[]{h()} : null;
                dqqf.dA(length, strArr, new ejxr() { // from class: bucy
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "type:".concat(String.valueOf(this.a.getString(0)));
                    }
                });
                String[] strArr2 = dj(1) ? z ? (String[]) dqru.D(null, du(getString(cO(1, budi.a))), new String[0]) : new String[]{e()} : null;
                dqqf.dA(length, strArr2, new ejxr() { // from class: bucz
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "name:".concat(String.valueOf(this.a.getString(1)));
                    }
                });
                String[] strArr3 = dj(2) ? z ? (String[]) dqru.D(null, du(getString(cO(2, budi.a))), new String[0]) : new String[]{g()} : null;
                dqqf.dA(length, strArr3, new ejxr() { // from class: buda
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "tbl_name:".concat(String.valueOf(this.a.getString(2)));
                    }
                });
                long[] jArrC = dj(3) ? z ? dqru.C(null, dt(getString(cO(3, budi.a)))) : new long[]{c()} : null;
                dqqf.dz(length, jArrC, new ejxr() { // from class: budb
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "rootpage:".concat(String.valueOf(this.a.getString(3)));
                    }
                });
                String[] strArr4 = dj(4) ? z ? (String[]) dqru.D(null, du(getString(cO(4, budi.a))), new String[0]) : new String[]{f()} : null;
                dqqf.dA(length, strArr4, new ejxr() { // from class: budc
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "sql:".concat(String.valueOf(this.a.getString(4)));
                    }
                });
                ekfw ekfwVar = new ekfw();
                int i4 = 0;
                while (i4 < length) {
                    long j = jArrDC[i4];
                    if (j <= 0 || hashSet2.contains(Long.valueOf(j))) {
                        i = length;
                        hashSet = hashSet2;
                    } else {
                        hashSet2.add(Long.valueOf(jArrDC[i4]));
                        String[] strArr5 = budi.a;
                        buck buckVar = new buck();
                        buckVar.aF();
                        buckVar.aD();
                        long j2 = jArrDC[i4];
                        if (strArr != null) {
                            String str = strArr[i4];
                            buckVar.aE(i3);
                            buckVar.a = str;
                        }
                        if (strArr2 != null) {
                            String str2 = strArr2[i4];
                            buckVar.aE(i2);
                            buckVar.b = str2;
                        }
                        if (strArr3 != null) {
                            String str3 = strArr3[i4];
                            buckVar.aE(2);
                            buckVar.c = str3;
                        }
                        i = length;
                        if (jArrC != null) {
                            long j3 = jArrC[i4];
                            buckVar.aE(3);
                            buckVar.d = j3;
                        }
                        if (strArr4 != null) {
                            String str4 = strArr4[i4];
                            buckVar.aE(4);
                            buckVar.e = str4;
                        }
                        buci buciVar = new buci();
                        buciVar.aD(buckVar.aB());
                        buciVar.a = buckVar.a;
                        buciVar.b = buckVar.b;
                        buciVar.c = buckVar.c;
                        hashSet = hashSet2;
                        buciVar.d = buckVar.d;
                        buciVar.e = buckVar.e;
                        buciVar.cM = buckVar.aC();
                        ekfwVar.h(buciVar);
                    }
                    i4++;
                    hashSet2 = hashSet;
                    length = i;
                    i2 = 1;
                    i3 = 0;
                }
                return ekfwVar.g();
            }
        }
        int i5 = ekgb.d;
        return ekoe.a;
    }

    public final String g() {
        return getString(cO(2, budi.a));
    }

    public final String h() {
        return getString(cO(0, budi.a));
    }

    @Override // defpackage.dqqj
    public final Cursor a() {
        return this;
    }
}
