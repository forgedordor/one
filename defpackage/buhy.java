package defpackage;

import android.database.Cursor;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class buhy extends dqqf implements buhs {
    @Deprecated
    public buhy(dqsy dqsyVar, Cursor cursor, String[] strArr, dqxe[] dqxeVarArr, dqwj dqwjVar, dqtm dqtmVar, buib buibVar) {
        super(dqsyVar, cursor, strArr, dqxeVarArr, buid.a, dqwjVar, dqtmVar, buibVar);
    }

    @Override // defpackage.dqqf
    protected final /* synthetic */ dqpd b() {
        return new buhb();
    }

    public final long c() {
        return getLong(cO(4, buid.a));
    }

    public final String e() {
        return getString(cO(3, buid.a));
    }

    public final String f() {
        return getString(cO(2, buid.a));
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
                String[] strArr = zDj ? z ? (String[]) dqru.D(null, du(getString(cO(0, buid.a))), new String[0]) : new String[]{h()} : null;
                dqqf.dA(length, strArr, new ejxr() { // from class: buht
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "sticker_set_id:".concat(String.valueOf(this.a.getString(0)));
                    }
                });
                String[] strArr2 = dj(1) ? z ? (String[]) dqru.D(null, du(getString(cO(1, buid.a))), new String[0]) : new String[]{g()} : null;
                dqqf.dA(length, strArr2, new ejxr() { // from class: buhu
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "sticker_id:".concat(String.valueOf(this.a.getString(1)));
                    }
                });
                String[] strArr3 = dj(2) ? z ? (String[]) dqru.D(null, du(getString(cO(2, buid.a))), new String[0]) : new String[]{f()} : null;
                dqqf.dA(length, strArr3, new ejxr() { // from class: buhv
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "locale:".concat(String.valueOf(this.a.getString(2)));
                    }
                });
                String[] strArr4 = dj(3) ? z ? (String[]) dqru.D(null, du(getString(cO(3, buid.a))), new String[0]) : new String[]{e()} : null;
                dqqf.dA(length, strArr4, new ejxr() { // from class: buhw
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "display_name:".concat(String.valueOf(this.a.getString(3)));
                    }
                });
                long[] jArrC = dj(4) ? z ? dqru.C(null, dt(getString(cO(4, buid.a)))) : new long[]{c()} : null;
                dqqf.dz(length, jArrC, new ejxr() { // from class: buhx
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "sticker_local_id:".concat(String.valueOf(this.a.getString(4)));
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
                        String[] strArr5 = buid.a;
                        buhd buhdVar = new buhd();
                        buhdVar.aF();
                        buhdVar.aD();
                        long j2 = jArrDC[i4];
                        if (strArr != null) {
                            String str = strArr[i4];
                            buhdVar.aE(i3);
                            buhdVar.a = str;
                        }
                        if (strArr2 != null) {
                            String str2 = strArr2[i4];
                            buhdVar.aE(i2);
                            buhdVar.b = str2;
                        }
                        if (strArr3 != null) {
                            String str3 = strArr3[i4];
                            buhdVar.aE(2);
                            buhdVar.c = str3;
                        }
                        if (strArr4 != null) {
                            String str4 = strArr4[i4];
                            buhdVar.aE(3);
                            buhdVar.d = str4;
                        }
                        i = length;
                        if (jArrC != null) {
                            long j3 = jArrC[i4];
                            buhdVar.aE(4);
                            buhdVar.e = j3;
                        }
                        buhb buhbVar = new buhb();
                        buhbVar.aD(buhdVar.aB());
                        buhbVar.a = buhdVar.a;
                        buhbVar.b = buhdVar.b;
                        buhbVar.c = buhdVar.c;
                        buhbVar.d = buhdVar.d;
                        hashSet = hashSet2;
                        buhbVar.e = buhdVar.e;
                        buhbVar.cM = buhdVar.aC();
                        ekfwVar.h(buhbVar);
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
        return getString(cO(1, buid.a));
    }

    public final String h() {
        return getString(cO(0, buid.a));
    }

    @Override // defpackage.dqqj
    public final Cursor a() {
        return this;
    }
}
